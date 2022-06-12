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

//    @GetMapping("/produkt1")
//    public String getProdukt1() {
//
//        return "produkt1";
//
//
//    }

    //    @GetMapping("/formularz")
//    public String getFormularz() {
//
//        return "formularz";
//
//    }
    @GetMapping("/podsumowanie")
    public String getPodsumowanie() {

        return "podsumowanie";

    }

    @GetMapping("/koszyk")
    public String getKoszyk() {

        return "koszyk";

    }
    @GetMapping("/adminpanel")
    public String getAdmin() {

        return "adminPanel";
    }



}