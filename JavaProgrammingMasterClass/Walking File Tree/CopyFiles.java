package com.company;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFiles extends SimpleFileVisitor<Path> {
    private Path SourceLocation;
    private Path TargetLocation;

    public CopyFiles(Path sourceLocation, Path targetLocation) {
        SourceLocation = sourceLocation;
        TargetLocation = targetLocation;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path relativePath = SourceLocation.relativize(dir); // relativize Method is used to give that particular path that is related with the given path  and the dir path.
        System.out.println(relativePath);
        Path copyPath = TargetLocation.resolve(relativePath);
        System.out.println(copyPath);
        try{
            Files.copy(dir,copyPath);
        } catch(IOException e){
            e.printStackTrace();
            return FileVisitResult.SKIP_SUBTREE;
        }
           return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path relativePath = SourceLocation.relativize(file); // relativize Method is used to give that particular path that is related with the given path  and the dir path.
        System.out.println(relativePath);
        Path copyPath = TargetLocation.resolve(relativePath);
        System.out.println(copyPath);
        try{
            Files.copy(file,copyPath);
        } catch(IOException e){
            e.printStackTrace();
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error Copying the File " + file.toAbsolutePath() + "Error: " + exc.getMessage());
        return FileVisitResult.CONTINUE;
    }
}
