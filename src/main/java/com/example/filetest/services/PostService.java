package com.example.filetest.services;

import com.example.filetest.models.entities.Post;
import com.example.filetest.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post getPost(long id) {
        return postRepository.getReferenceById(id);
    }

    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    public List<Post> createPost(Post post) {
        postRepository.save(post);
        return postRepository.findAll();
    }

}
