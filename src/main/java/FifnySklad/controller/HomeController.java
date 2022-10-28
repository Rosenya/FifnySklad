package FifnySklad.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getIndex() {

        return "index";
    }

    @GetMapping("/onas")
    public String getOnas() {

        return "onas";
    }

    @GetMapping("/adminpanel")
    public String getAdmin() {

        return "adminPanel";
    }

    @GetMapping("/koszyk")
    public String getCart() {

        return "koszyk";
    }


    @GetMapping("/produkt1")
    public String getProdukt1() {

        return "produkt1";


    }

    @GetMapping("/formularz")
    public String getFormularz() {

        return "formularz";

    }
    @GetMapping("/podsumowanie")
    public String getPodsumowanie() {

        return "podsumowanie";

    }

    @GetMapping("/swiece")
    public String getSwiece() {

        return "products/categories/swiece";
    }

    @GetMapping("/dekoracje")
    public String getDekoracje() {

        return "products/categories/dekoracje";
    }

    @GetMapping("/pachnidla")
    public String getPachnidla() {

        return "products/categories/pachnidla";
    }

    @GetMapping("/zestawy")
    public String getZestawy() {

        return "products/categories/zestawy";
    }


}