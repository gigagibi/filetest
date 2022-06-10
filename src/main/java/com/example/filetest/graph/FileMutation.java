package com.example.filetest.graph;

import com.example.filetest.models.entities.File;
import com.example.filetest.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FileMutation {
    @Autowired
    private FileService fileService;

    public List<File> createFile(String name, String data, byte) {
        return fileService.store(file);
    }
}
