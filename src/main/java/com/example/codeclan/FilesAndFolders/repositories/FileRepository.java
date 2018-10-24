package com.example.codeclan.FilesAndFolders.repositories;

import com.example.codeclan.FilesAndFolders.Models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FileRepository extends JpaRepository<File, Long> {

}


