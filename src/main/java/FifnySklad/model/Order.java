package FifnySklad.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Zamówienie")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    @CreationTimestamp
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

//    @ManyToMany
//    @JoinTable(
//            name = "orderSet",
//            joinColumns = @JoinColumn(name = "produkt_id"),
//            inverseJoinColumns = @JoinColumn(name = "zamowienie_id"))
//    private Set <Product> productSet;

}
