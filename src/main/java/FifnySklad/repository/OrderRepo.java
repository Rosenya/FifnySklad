package FifnySklad.repository;

import FifnySklad.model.Order;
import FifnySklad.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Long> {
}
