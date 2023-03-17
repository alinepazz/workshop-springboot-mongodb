package com.alinepaz.workshopmongo.dataprovider;

import com.alinepaz.workshopmongo.core.dataprovider.FindPostById;
import com.alinepaz.workshopmongo.core.domain.Post;
import com.alinepaz.workshopmongo.dataprovider.repository.PostRepository;
import com.alinepaz.workshopmongo.dataprovider.repository.mapper.PostEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindPostByIdImpl implements FindPostById {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private PostEntityMapper postEntityMapper;

    @Override
    public Optional<Post> findById(String id) {

        var postEntity = postRepository.findById(id);

        return postEntity.map(entity -> postEntityMapper.toPostById(entity));
    }
}
