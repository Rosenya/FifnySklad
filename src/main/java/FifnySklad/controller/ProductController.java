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

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //getAllProduct, potrzebujemy widoku widoku
    @GetMapping("/products")
    public String getProductList(Model model){
        List<Product> productList = productService.getProducts();
        model.addAttribute("product", productList);
        return "index";
    }
    //widok dla nowego klienta
    @GetMapping("/addProduct")
    public String addProduct(){
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

//    @PostMapping("/editProduct/{id}")
//    public RedirectView deleteProduct(@PathVariable("id") Long id){
//        productService.deleteProductById(id);
//        return new RedirectView("product");
//    }


}

