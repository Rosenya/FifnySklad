package FifnySklad.service;

import FifnySklad.model.Product;
import FifnySklad.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

//    public Product getProduct(Long id){
//        return OrderRepository.findById(id).orElse(null);
//    }
}

