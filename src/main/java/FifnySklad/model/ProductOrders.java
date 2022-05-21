package FifnySklad.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class ProductOrders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produkt_id")
    private Long productId;
    @Column(name = "zamowienie_id")
    private Long orderId;

}
