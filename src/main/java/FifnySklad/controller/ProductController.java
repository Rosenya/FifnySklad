package FifnySklad.controller;

import FifnySklad.model.Product;
import FifnySklad.service.ClientService;
import FifnySklad.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    private final ProductService productService;
    private final ClientService clientService;

    public ProductController(ProductService productService, ClientService clientService) {
        this.productService = productService;
        this.clientService = clientService;
    }

    @GetMapping("/products")
    public String getProducts (Model model){
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);
        return "products/products";
    }
}
