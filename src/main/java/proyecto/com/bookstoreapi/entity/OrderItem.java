package proyecto.com.bookstoreapi.entity;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int orderId;

    @Column
    public int amount;
    @Column
    public int subtotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="bookId")
    public Book ordBook;
}
