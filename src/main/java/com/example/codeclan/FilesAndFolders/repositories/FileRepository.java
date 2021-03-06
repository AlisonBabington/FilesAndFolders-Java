package com.example.codeclan.FilesAndFolders.repositories;

import com.example.codeclan.FilesAndFolders.Models.File;
import com.example.codeclan.FilesAndFolders.projections.FileEmbed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(excerptProjection = FileEmbed.class)
public interface FileRepository extends JpaRepository<File, Long> {

}


