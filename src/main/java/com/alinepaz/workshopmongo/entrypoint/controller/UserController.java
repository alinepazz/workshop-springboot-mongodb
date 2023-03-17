package com.alinepaz.workshopmongo.entrypoint.controller;

import com.alinepaz.workshopmongo.core.usecase.*;
import com.alinepaz.workshopmongo.entrypoint.controller.mapper.PostMapper;
import com.alinepaz.workshopmongo.entrypoint.controller.mapper.UserMapper;
import com.alinepaz.workshopmongo.entrypoint.controller.request.UserRequest;
import com.alinepaz.workshopmongo.entrypoint.controller.response.PostResponse;
import com.alinepaz.workshopmongo.entrypoint.controller.response.UserResponse;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/users/v1")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PostMapper postMapper;

    @Autowired
    private InsertUserUseCase insertUserUseCase;

    @Autowired
    private FindAllUsersUseCase findAllUsersUseCase;

    @Autowired
    private FindUserByIdUseCase findUserByIdUseCase;

    @Autowired
    private UpdateUserUseCase updateUserUseCase;

    @Autowired
    private DeleteUserUseCase deleteUserUseCase;

    @PostMapping
    public ResponseEntity<Void>insertUser(@Valid @RequestBody UserRequest userRequest){
        var user = userMapper.toUser(userRequest);
        insertUserUseCase.insert(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    public ResponseEntity<List<UserResponse>>findAll(){
        var users = findAllUsersUseCase.findAll();
        var usersResponse = userMapper.toUserResponse(users);
        return ResponseEntity.status(HttpStatus.OK).body(usersResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse>findById(@PathVariable String id){
        var user = findUserByIdUseCase.findById(id);
        var userResponse = userMapper.toUserResponseById(user);
        return ResponseEntity.status(HttpStatus.OK).body(userResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void>update(@Valid @PathVariable String id, @RequestBody UserRequest userRequest){

        var user = userMapper.toUser(userRequest);
        findUserByIdUseCase.findById(id);
        updateUserUseCase.update(id, user);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>delete(@PathVariable String id){
        findUserByIdUseCase.findById(id);
        deleteUserUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}/posts")
    public ResponseEntity<List<PostResponse>>findPosts(@PathVariable String id){
        var user = findUserByIdUseCase.findById(id);
        var postResponse = postMapper.toPostResponse(user.getPosts());
        return ResponseEntity.ok().body(postResponse);
    }
}
