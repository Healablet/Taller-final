package proyecto.com.bookstoreapi.entity;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int userId;

    @Column
    private Role role;
}
