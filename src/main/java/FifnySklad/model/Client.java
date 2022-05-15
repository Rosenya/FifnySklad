package FifnySklad.model;


import javax.persistence.*;

@Entity
@Table(name = "Klienci")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String secondName;
    private String adress;
    private String email;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private Order order;


}
