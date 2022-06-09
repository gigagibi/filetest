package com.example.filetest.services;

import com.example.filetest.models.File;
import com.example.filetest.repositories.FileRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class FileService {
    private FileRepository fileRepository;

    public File store(MultipartFile multipartFile) throws IOException {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        File file = new File(fileName, multipartFile.getContentType(), multipartFile.getBytes());
        return fileRepository.save(file);
    }
    public File getFile(long id) {
        return fileRepository.findById(id).get();
    }

    public Stream<File> getAllFiles() {
        return fileRepository.findAll().stream();
    }
}
