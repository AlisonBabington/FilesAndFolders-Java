package com.example.codeclan.FilesAndFolders.repositories;


import com.example.codeclan.FilesAndFolders.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
