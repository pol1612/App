package io;

import java.io.File;

public class App {
    public static void main(String[] args){
        var file1=new File("src/main/resources/file1.txt");
        System.out.println("Exists:"+file1.exists());
        System.out.println("Full path:"+file1.getAbsolutePath());
        System.out.println("Is File:"+file1.isFile());
        var file2=new File("src/main/resources");
        if (file2.exists() || !file2.isFile()){
            System.out.println("It's a file");
        }
        //String filename= null;
        //var file0=new File(filename);
        for(var child : file2.listFiles()){
            System.out.println("Child name: "+child.getName());
        }
    }
}
