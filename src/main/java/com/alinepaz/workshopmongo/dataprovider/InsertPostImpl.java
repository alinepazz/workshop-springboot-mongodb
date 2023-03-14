package com.alinepaz.workshopmongo.dataprovider;

import com.alinepaz.workshopmongo.core.dataprovider.InsertPost;
import com.alinepaz.workshopmongo.core.domain.Post;
import com.alinepaz.workshopmongo.dataprovider.repository.PostRepository;
import com.alinepaz.workshopmongo.dataprovider.repository.UserRepository;
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
        postEntity.setAuthor(userEntity.get());
        postEntity.setDate(Instant.now().truncatedTo(ChronoUnit.HOURS));
        postRepository.save(postEntity);
    }
}
