package com.codeclan.example.FilesAndFolders.projections;

import com.example.codeclan.FilesAndFolders.Models.File;
import com.example.codeclan.FilesAndFolders.Models.Folder;
import com.example.codeclan.FilesAndFolders.Models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "FolderEmbed", types = Folder.class)
public interface FolderEmbed {
    public String getTitle();

    public User getUser();

    public List<File> getFiles();
}
