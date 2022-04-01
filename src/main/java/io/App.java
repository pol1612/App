package io;

import java.io.File;

public class App {
    public static void main(String[] args){
        var file1=new File("src/main/resources/file1.txt");
        System.out.println(""+file1.exists());
    }
}
