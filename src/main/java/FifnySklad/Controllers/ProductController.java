package FifnySklad.controller;

import FifnySklad.model.Client;
import FifnySklad.model.Product;
import FifnySklad.service.ClientService;
import FifnySklad.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class ProductController {
    private final ProductService productService;
//    private final ClientService clientService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/zamowienieProduktow")
    public String getProducts(Model model) {
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);
        return "zamowienieProduktow";
    }

    @GetMapping("/addProduct")
    public String addProduct() {
        return "products/addNewProduct";
    }

//    @PostMapping("/nowyProdukt")
//    public String addProduct() {
//        return "nowyProdukt";
//    }

    @GetMapping("/editProduct/{id}")
    public String getEditProduct(@PathVariable("id") Long id, Model model) {
        Product product = productService.getProduct(id);
        model.addAttribute("product", product);
        return "edycjaProduktu";
    }

    @PostMapping("/editProduct/{id}")
    public RedirectView postEditproduct(@ModelAttribute Product newProduct, @PathVariable("id") Long id) {
        productService.editProduct(newProduct);
        return new RedirectView("/editProduct/{id}");
    }

//    @PostMapping("/nowyProdukt/{id}")
//    public RedirectView postEditProduct(@ModelAttribute Product newProduct, @PathVariable("id") Long id) {
//        productService.editProduct(newProduct);
//        return new RedirectView("/editProduct/{id}");
//    }




    @PostMapping("/deleteProduct/{id}")
    public RedirectView deleteProduct(@PathVariable("id") Long id) {
        productService.deleteByIdProduct(id);
        return new RedirectView("zamowienieProduktu");
    }

    @GetMapping("/editProduct")
    public String geteditProduct() {

        return "editProduct";
    }

    @GetMapping("/produkt1")
    public String getProdukt1() {

        return "produkt1";
    }

    @PostMapping("/produkt1")
    public RedirectView postAddProduct(@ModelAttribute Product newProduct) {
        productService.addProduct(newProduct);
        return new RedirectView("/");
    }

    @GetMapping("/products")
    public String getProduct(Model model) {
        List<Product> product = productService.getProducts();
        model.addAttribute("product", product);
        return "produkt2";
    }

    @PostMapping("/products")
    public RedirectView postAddProducts(@ModelAttribute Product newProduct) {
        productService.addProduct(newProduct);
        return new RedirectView("/");

    }

    @GetMapping("/nowyProdukt")
    public String getnowyProdukt() {

        return "nowyProdukt";
    }
    @PostMapping("/nowyProdukt")
    public RedirectView postEditProduct (@ModelAttribute Product newProduct){
        productService.addProduct(newProduct);
        return new RedirectView("/zamowienieProduktow");
    }
}