package proyecto.com.bookstoreapi.dto.request;

import lombok.Getter;
import lombok.Setter;
import proyecto.com.bookstoreapi.entity.Role;

@Getter
@Setter
public class RegisterRequest {
    private int userId;
    private String username;
    private String password;
    private Role role;
}
