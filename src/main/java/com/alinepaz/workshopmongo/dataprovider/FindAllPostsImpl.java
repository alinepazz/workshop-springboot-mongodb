package com.alinepaz.workshopmongo.dataprovider;

import com.alinepaz.workshopmongo.core.dataprovider.FindAllPosts;
import com.alinepaz.workshopmongo.core.domain.Post;
import com.alinepaz.workshopmongo.dataprovider.repository.PostRepository;
import com.alinepaz.workshopmongo.dataprovider.repository.UserRepository;
import com.alinepaz.workshopmongo.dataprovider.repository.mapper.PostEntityMapper;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindAllPostsImpl implements FindAllPosts {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostEntityMapper postEntityMapper;

    @Override
    public List<Post> findAll(String id) {
        var user = userRepository.findById(id);

        var posts = user.get().getPosts();

        return postEntityMapper.toPost(posts);
    }
}
