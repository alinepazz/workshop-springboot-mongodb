package com.alinepaz.workshopmongo.entrypoint.controller;


import com.alinepaz.workshopmongo.core.usecase.FindPostByIdUseCase;
import com.alinepaz.workshopmongo.core.usecase.FindUserByIdUseCase;
import com.alinepaz.workshopmongo.core.usecase.InsertPostUseCase;
import com.alinepaz.workshopmongo.entrypoint.controller.mapper.PostMapper;
import com.alinepaz.workshopmongo.entrypoint.controller.request.PostRequest;
import com.alinepaz.workshopmongo.entrypoint.controller.response.PostResponse;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
@RestController
@RequestMapping("/api/posts/v1")
public class PostController {

    @Autowired
    private PostMapper postMapper;

    @Autowired
    private InsertPostUseCase insertPostUseCase;

    @Autowired
    private FindPostByIdUseCase findPostByIdUseCase;

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


    @GetMapping("/{id}")
    public ResponseEntity<PostResponse>findById(@PathVariable String id){
        var post = findPostByIdUseCase.findById(id);
        var postResponse = postMapper.toPostResponseById(post);
        return ResponseEntity.status(HttpStatus.OK).body(postResponse);
    }

}
