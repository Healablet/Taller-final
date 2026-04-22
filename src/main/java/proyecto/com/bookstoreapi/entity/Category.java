package proyecto.com.bookstoreapi.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int categoryId;

    public String genre;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "category_book",
            joinColumns = @JoinColumn(name = "categoryId"),
            inverseJoinColumns = @JoinColumn(name = "bookId")
    )
    private List<Book> books;
}
