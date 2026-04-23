package proyecto.com.bookstoreapi.mapper;

import org.mapstruct.Mapper;
import proyecto.com.bookstoreapi.dto.response.LoginRequest;
import proyecto.com.bookstoreapi.entity.User;

@Mapper(componentModel = "spring")
public interface LoginMapper {
    LoginRequest toDTO(User user);
    User toEntity(LoginRequest loginRequest);
}
