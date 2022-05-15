package FifnySklad.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Zamowienie")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    private Date creationDate;

    @OneToOne
    private Client client;

    @OneToOne
    private Product product;


}