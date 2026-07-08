package org.cat.user_clean_architecture.infrestructure.adapters.input;


import org.cat.user_clean_architecture.application.ports.input.IUserUseCase;
import org.cat.user_clean_architecture.infrestructure.adapters.input.dto.UserRequest;
import org.cat.user_clean_architecture.infrestructure.adapters.input.dto.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/users")
public class UserController {
    private final IUserUseCase userUseCase;

    public UserController(IUserUseCase userUseCase){
        this.userUseCase= userUseCase;
    }

    @PostMapping
    public ResponseEntity<UserResponse> create(@RequestBody UserRequest request){
    }
}
