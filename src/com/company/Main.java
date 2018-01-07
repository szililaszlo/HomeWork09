package com.company;

public class Main {

    public static void main(String[] args) {
	//1
      //  FileOperation.printDirsInDirectory("E:\\Torrent");
    //2
      //  FileOperation.printFilesInDirectory("E:\\Torrent");
    //3
     //   FileOperation.printAllInDirectory("E:\\Torrent");
    //4
     //     FileOperation.searchFile("alma.txt","E:\\");
        //5
       if( FileOperation.isFilesEquals("E:\\Torrent\\dio.txt","E:\\Torrent\\alma.txt")) {
           System.out.println("A két fájl megegyezik");
        }
        else {
           System.out.println("A két fájl nem egyezik");
       }
    }
}
