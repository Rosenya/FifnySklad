package FifnySklad.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("test").password(passwordEncoder().encode("test")).roles("USER")
                .and()
                .withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/adminpanel")//mają dostęp wszyscy użytkownicy ROLE_ADMIN
                .hasRole("ADMIN")
                .and()
                .csrf().disable() // wyłączamy zabezpieczenie CSRF w celu użycia np Postmana
                .headers().frameOptions().disable()
                .and()
                .formLogin()//wskazuje, że teraz będę konfigurował formularz autoryzacji
                .loginPage("/login") //wskazuje enpoint w którym będzie odbywać się autoryzacja
                .usernameParameter("username") // nadajemy nazwę jaka będzie jako name w inpucie loginu w formularzu
                .passwordParameter("password") // // nadajemy nazwę jaka będzie jako name w inpucie hasła w formularzu
                .loginProcessingUrl("/login")
                .failureForwardUrl("/login?error") // co się stanie kiedy wpiszesz zły login lub hasło
                .defaultSuccessUrl("/") // co się stanie w momenice prawidłowego wpisania loginu i hasła
                .and()
                .logout() // mówimy springowi że przechodzimy do obsłużenia logout
                .logoutSuccessUrl("/login");
    }
}