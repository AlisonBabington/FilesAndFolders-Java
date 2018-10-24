package com.example.codeclan.FilesAndFolders.projections;

import com.example.codeclan.FilesAndFolders.Models.Folder;
import com.example.codeclan.FilesAndFolders.Models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

public interface UserEmbed {

    @Projection(name = "fileEmbed", types = User.class)
    public interface FileEmbed {
        public String getName();
        List<Folder> getFolders();
    }
}
