package proyecto.com.bookstoreapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyecto.com.bookstoreapi.dto.request.RegisterRequest;
import proyecto.com.bookstoreapi.dto.response.LoginRequest;
import proyecto.com.bookstoreapi.service.LoginService;
import proyecto.com.bookstoreapi.service.RegisterService;

import java.util.Map;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final LoginService loginService;
    private final RegisterService registerService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
        registerService.register(request);
        return ResponseEntity.ok("Usuario registrado");
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        String token = loginService.login(request);
        return ResponseEntity.ok(Map.of("token", token));
    }

}
