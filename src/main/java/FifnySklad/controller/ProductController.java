package FifnySklad.controller;

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

    @GetMapping("/products")
    public String getProducts (Model model){
        List<Product> product = productService.getProducts();
        model.addAttribute("product", product);
        return "products/produkt2";
    }

    @GetMapping("/addProduct")
    public String addClient(){
        return "products/addNewProduct";

    }
    @GetMapping("/editProduct/{id}")
    public String getEditProduct(@PathVariable("id") Long id, Model model){
        Product product = productService.getProduct(id);
        model.addAttribute("product", product);
        return "product/editProduct";
    }
    @PostMapping("/addProduct/{id}")
    public RedirectView postEditProduct (@ModelAttribute Product newProduct, @PathVariable("id") Long id){
        productService.editProduct(newProduct);
        return new RedirectView("/editProduct/{id}");
    }
    @PostMapping("/editProduct/{id}")
    public RedirectView deleteProduct(@PathVariable("id") Long id){
        productService.deleteByIdProduct(id);
        return new RedirectView("products");
    }



}
