package com.example.filetest.repositories;

import com.example.filetest.models.entities.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
