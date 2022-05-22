package FifnySklad.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Produkt")
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


    @ManyToOne
    @JoinColumn(name = "category_id")
     private Category category;

//    @ManyToMany
////    @JoinTable(
////            name = "id",
////            joinColumns = @JoinColumn(name = "student_id"),
////            inverseJoinColumns = @JoinColumn(name = "course_id"))
//    Set<Order> orderSet = new HashSet<>();

}
