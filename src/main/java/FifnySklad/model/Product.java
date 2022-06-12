package FifnySklad.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Produkt")
//@ToString(exclude = "Klient")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String name;
    @Column(length = 10)
    private Double price;
    @Column(length = 250)
    private String description;
    @Column (length = 10)
    private Long quantity;
    @Column (length = 20)
    private String SKU;


    @ManyToOne
    @JoinColumn(name = "id_Klient")
    private Client Klient;


}

//    @OneToMany(cascade = CascadeType.REFRESH, mappedBy = "id")
//    private Set<Order> order = new HashSet<>();



//    @ManyToOne
//    @JoinColumn(name = "category_id")
//     private Category category;



//    @ManyToMany
////    @JoinTable(
////            name = "id",
////            joinColumns = @JoinColumn(name = "student_id"),
////            inverseJoinColumns = @JoinColumn(name = "course_id"))
//    Set<Order> orderSet = new HashSet<>();


