package com.alinepaz.workshopmongo.dataprovider;

import com.alinepaz.workshopmongo.core.dataprovider.InsertPost;
import com.alinepaz.workshopmongo.core.domain.Author;
import com.alinepaz.workshopmongo.core.domain.Post;
import com.alinepaz.workshopmongo.dataprovider.repository.PostRepository;
import com.alinepaz.workshopmongo.dataprovider.repository.UserRepository;
import com.alinepaz.workshopmongo.dataprovider.repository.entity.AuthorEntity;
import com.alinepaz.workshopmongo.dataprovider.repository.entity.UserEntity;
import com.alinepaz.workshopmongo.dataprovider.repository.mapper.PostEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Component
public class InsertPostImpl implements InsertPost {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostEntityMapper postEntityMapper;

    @Override
    public void insert(String id, Post post) {
        var userEntity = userRepository.findById(id);
        var postEntity = postEntityMapper.toPostEntity(post);
        postEntity.setAuthor(
                AuthorEntity.builder()
                        .id(userEntity.get().getId())
                        .name(userEntity.get().getName())
                        .build()
        );
        postEntity.setDate(Instant.now().truncatedTo(ChronoUnit.HOURS));
        postRepository.save(postEntity);
        userEntity.get().getPosts().add(postEntity);
        userRepository.save(userEntity.get());
    }
}
