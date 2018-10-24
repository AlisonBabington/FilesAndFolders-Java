package com.example.codeclan.FilesAndFolders.projections;

import com.example.codeclan.FilesAndFolders.Models.File;
import com.example.codeclan.FilesAndFolders.Models.Folder;
import org.springframework.data.rest.core.config.Projection;

public interface FileEmbed {

    @Projection(name = "fileEmbed", types = File.class)
    public interface EmbedFolderForFile {
        public String getName();
        public String getExtension();
        public int getSize();
        public Folder getFolder();

    }
}
