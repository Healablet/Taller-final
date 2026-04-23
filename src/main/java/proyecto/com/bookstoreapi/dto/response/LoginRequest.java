package proyecto.com.bookstoreapi.dto.response;

import lombok.Getter;
import lombok.Setter;
import proyecto.com.bookstoreapi.entity.Role;

@Getter
@Setter
public class LoginRequest {
    private String username;
    private String password;
}
