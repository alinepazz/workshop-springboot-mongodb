package com.alinepaz.workshopmongo.entrypoint.controller;

import com.alinepaz.workshopmongo.core.usecase.InsertUserUseCase;
import com.alinepaz.workshopmongo.entrypoint.controller.mapper.UserMapper;
import com.alinepaz.workshopmongo.entrypoint.controller.request.UserRequest;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users/v1")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private InsertUserUseCase insertUserUseCase;

    @PostMapping
    ResponseEntity<Void>insertUser(@RequestBody UserRequest userRequest){
        var user = userMapper.toUser(userRequest);
        insertUserUseCase.insert(user);
        return ResponseEntity.ok().build();
    }
}
