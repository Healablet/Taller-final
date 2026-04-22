package proyecto.com.bookstoreapi.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int authorId;

    @Column
    public String name;
    @Column
    public String biography;
    @Column
    public String contact;
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    )
    private List<Book>books;
}
