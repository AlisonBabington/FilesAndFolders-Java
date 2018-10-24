package com.example.codeclan.FilesAndFolders.components;


import com.example.codeclan.FilesAndFolders.Models.File;
import com.example.codeclan.FilesAndFolders.Models.Folder;
import com.example.codeclan.FilesAndFolders.Models.User;
import com.example.codeclan.FilesAndFolders.repositories.FileRepository;
import com.example.codeclan.FilesAndFolders.repositories.FolderRepository;
import com.example.codeclan.FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User abs = new User("Alison");
        userRepository.save(abs);

        Folder folder = new Folder("One", abs);
        folderRepository.save(folder);

        Folder folder2 = new Folder("Two", abs);
        folderRepository.save(folder2);

        File rubyFile = new File("ruby", "rb", 2, folder);
        fileRepository.save(rubyFile);

        File jsFile = new File("js", "js", 3, folder);
        fileRepository.save(jsFile);

        File jFile = new File("j", "java", 4, folder);
        fileRepository.save(jFile);


    }
}




