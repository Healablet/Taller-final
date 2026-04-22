package proyecto.com.bookstoreapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int bookId;

    @Column
    public int price;
    @Column
    public int stock;
    @Column
    public int ISBN;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="authorId")
    public Author author;
}
