package FifnySklad.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
     private Category category;



}
