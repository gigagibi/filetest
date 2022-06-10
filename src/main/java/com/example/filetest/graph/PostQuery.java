package com.example.filetest.graph;

import com.example.filetest.models.entities.Post;
import com.example.filetest.services.PostService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostQuery implements GraphQLQueryResolver {
    @Autowired
    private PostService postService;

    public List<Post> getPosts() {
        return postService.getPosts();
    }

    public Post getPost(long id) {
        return postService.getPost(id);
    }
}
