package FifnySklad.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String getIndex() {

        return "index";
    }

    @GetMapping("/onas")
    public String getOnas() {

        return "onas";
    }

    @GetMapping("/produkt1")
    public String getProdukt1() {

        return "produkt1";


    }
}