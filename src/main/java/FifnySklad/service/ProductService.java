package FifnySklad.service;

import FifnySklad.model.Product;
import FifnySklad.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //dodawanie produktu
    public void addProduct(Product product){
        productRepository.save(product);
        log.info("Dodano produkt o id: " + product.getId());

    }
    //edycja produktu
    public void editProduct(Product product){
        productRepository.save(product);
    }
    //usuwanie produktu
    public void deleteByIdProduct(Long id){
        productRepository.deleteById(id);
        log.info("Usunięto produkt o id: " + id);
    }
    //lista wszystkich prodyktów
    public List <Product> getProducts(){
        return productRepository.findAll();
    }
    //pokazanie produktu po id
    public Product getProduct(Long id){
        return productRepository.findById(id).orElse(null);
    }
}
