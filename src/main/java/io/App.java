package io;

import java.io.File;

public class App {
    public static void main(String[] args){
        var file1=new File("src/main/resources/file1.txt");
        System.out.println("Exists:"+file1.exists());
        System.out.println("Full path:"+file1.getAbsolutePath());
        System.out.println("Is File:"+file1.isFile());

    }
}
