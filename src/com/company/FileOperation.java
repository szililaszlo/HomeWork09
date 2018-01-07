package com.company;

import java.io.File;

public class FileOperation {

    //1
        public static void printDirsInDirectory (String directory) {
            // a kapott mappa elérést és nevéből File típust hozok létre
             File folder = new File(directory);
             //File típusú tömb mely a mappában lévő elemeket tárolja
             File[] listOfFiles = folder.listFiles();

             try {
                 //végigmegyek a tömbön
                 for(File file : listOfFiles){
                     //ha egy elem mappa akkor kiíratásra kerül
                     if (file.isDirectory()) {
                         System.out.println("name: " + file.getName());
                     }
                 }
             }
             // NullPointer elkapás
             catch (NullPointerException e) {
                 e.printStackTrace();
             }
             //álltalános hiba elkapás
             catch (Exception e) {
                 e.printStackTrace();
             }

        }

        //2
        public static void printFilesInDirectory (String directory) {
            // a kapott mappa elérést és nevéből File típust hozok létre
            File folder = new File(directory);
            //File típusú tömb mely a mappában lévő elemeket tárolja
            File[] listOfFiles = folder.listFiles();

            try {
                //végigmegyek a tömbön
                for(File file : listOfFiles){
                    //ha egy elem fájl akkor kiíratásra kerül
                    if (file.isFile()) {
                        System.out.println("name: " + file.getName());
                    }
                }
            }
            // NullPointer elkapás
            catch (NullPointerException e) {
                e.printStackTrace();
            }
            //álltalános hiba elkapás
            catch (Exception e) {
                e.printStackTrace();
            }
        }
}
