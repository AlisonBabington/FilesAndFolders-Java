package com.example.codeclan.FilesAndFolders.repositories;

import com.codeclan.example.FilesAndFolders.projections.FolderEmbed;
import com.example.codeclan.FilesAndFolders.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@Repository
@RepositoryRestResource(excerptProjection = FolderEmbed.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
