package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {

        DirectoryStream.Filter<Path> filter=new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {
                return Files.isRegularFile(entry);
            }
        };
        Path directory=FileSystems.getDefault().getPath("."+ File.separator + "Dir3");
        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory,filter)){  // do to the Iterable interface we can iterate through All the Files
            for (Path content : contents) {
                System.out.println(content.getFileName());
            }

        }catch (IOException | DirectoryIteratorException e){
            e.printStackTrace();
        }
        String separator=FileSystems.getDefault().getSeparator();
        System.out.println(separator);
        separator= File.separator;
        System.out.println(separator);

        Iterable<FileStore> files=FileSystems.getDefault().getFileStores();
        for(FileStore file:files) {
            System.out.println(file);
            System.out.println(file.name());
            try {
                System.out.println(file.getTotalSpace());
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        System.out.println("*********************************************************************");
        System.out.println();
        System.out.println();

        Iterable<Path> rootPath= FileSystems.getDefault().getRootDirectories();
        for(Path root:rootPath){
            System.out.println(root);
        }

        System.out.println("--------------------------WALKING FILE TREE---------------");

        Path dir2Path=FileSystems.getDefault().getPath("."+ File.separator + "Dir3"); // No of level of the traverse.

        try{
            Files.walkFileTree(dir2Path,new FileTree());

        } catch(IOException e){
            e.printStackTrace();
        }

        Path Copypath= FileSystems.getDefault().getPath("." + File.separator + "Dir3" + File.separator+ "Dir3Copy");
        try{
       Files.walkFileTree(dir2Path,new CopyFiles(dir2Path,Copypath));

        } catch(IOException e){
            e.printStackTrace();
        }

    }
//        Path path= FileSystems.getDefault().getPath("PathDirectory","Subdirectory.txt");
//        printfile(path);
//        Path path3= FileSystems.getDefault().getPath("ThisFileDoesntExist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path Dirtocreate=FileSystems.getDefault().getPath("Dir3\\Dir4\\dir5\\dir6\\dir7");
//
//
//        Path path4= FileSystems.getDefault().getPath("FileCopy1");
//        try {
//            Files.createDirectories(Dirtocreate);
//        }catch(IOException  e){
//            e.printStackTrace();
//        }
//    }

    public static void printfile(Path path){
        try(BufferedReader bufferedReader= Files.newBufferedReader(path)){
         String line;

         while((line=bufferedReader.readLine())!=null){
             System.out.println(line);
         }

        }catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
