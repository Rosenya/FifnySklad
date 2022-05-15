package FifnySklad.repository;

import FifnySklad.model.Category;
import FifnySklad.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {
}
