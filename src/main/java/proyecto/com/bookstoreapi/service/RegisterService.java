package proyecto.com.bookstoreapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import proyecto.com.bookstoreapi.dto.request.RegisterRequest;
import proyecto.com.bookstoreapi.entity.Role;
import proyecto.com.bookstoreapi.entity.User;
import proyecto.com.bookstoreapi.exception.custom.DuplicateResourceException;
import proyecto.com.bookstoreapi.repository.UserRepository;
@Service
@RequiredArgsConstructor
public class RegisterService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void register(RegisterRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(request.getRole() != null ? request.getRole() : Role.USER);
        userRepository.save(user);

        if (userRepository.existsByUsername(request.getUsername())) {
            throw new DuplicateResourceException("El email ya está registrado");
        }

        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        userRepository.save(user);
    }
}
