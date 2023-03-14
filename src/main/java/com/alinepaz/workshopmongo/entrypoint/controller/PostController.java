package com.alinepaz.workshopmongo.entrypoint.controller;


import com.alinepaz.workshopmongo.core.usecase.FindUserByIdUseCase;
import com.alinepaz.workshopmongo.core.usecase.InsertPostUseCase;
import com.alinepaz.workshopmongo.entrypoint.controller.mapper.PostMapper;
import com.alinepaz.workshopmongo.entrypoint.controller.request.PostRequest;
import com.alinepaz.workshopmongo.entrypoint.controller.request.UserRequest;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
@RestController
@RequestMapping("/api/posts/v1")
public class PostController {

    @Autowired
    private PostMapper postMapper;

    @Autowired
    private InsertPostUseCase insertPostUseCase;

    @Autowired
    private FindUserByIdUseCase findUserByIdUseCase;

    @PostMapping("/{id}")
    public ResponseEntity<Void>insertPost(@PathVariable String id, @RequestBody PostRequest postRequest){
        findUserByIdUseCase.findById(id);
        var post = postMapper.toPost(postRequest);
        insertPostUseCase.insert(id, post);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(post.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

}
