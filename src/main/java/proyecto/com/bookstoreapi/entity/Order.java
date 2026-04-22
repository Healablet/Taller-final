package proyecto.com.bookstoreapi.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int orderId;

    public boolean state;
    public int totalCalc;

    @OneToMany(fetch = FetchType.LAZY)
    private List<OrderItem> orderItems;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userId")
    public User user;
}
