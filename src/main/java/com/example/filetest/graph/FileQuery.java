package com.example.filetest.graph;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.filetest.models.entities.File;
import com.example.filetest.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FileQuery implements GraphQLQueryResolver {
    @Autowired
    private FileService fileService;

    public List<File> getFiles() {
        return fileService.getAllFiles().collect(Collectors.toList());
    }

    public File getFile(long id) {
        return fileService.getFile(id);
    }
}
