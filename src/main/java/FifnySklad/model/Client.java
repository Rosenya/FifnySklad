package FifnySklad.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Klient")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String firstname;
    @Column(length = 30)
    private String secondName;
    @Column(length = 60)
    private String adress;
    @Column(length = 20)
    private String email;
    @Column(length = 10)
    private String phoneNumber;

//    @OneToMany(cascade = CascadeType.REFRESH, mappedBy = "id")
//    private Set<Order> order = new HashSet<>();

    @OneToMany(mappedBy = "id")
    private List<Product> produkt;

}
