package com.example.filetest.graph;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.filetest.models.entities.Post;
import com.example.filetest.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostMutation implements GraphQLMutationResolver {
    @Autowired
    private PostService postService;

    public List<Post> createPost(String name, String desc, String content) {
        return postService.createPost(new Post(name, desc, content));
    }
}
