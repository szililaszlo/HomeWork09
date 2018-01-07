package com.company;

import java.io.*;

public class FileOperation {

    //1
    public static void printDirsInDirectory(String directory) {
        // a kapott mappa elérést és nevéből File típust hozok létre
        File folder = new File(directory);
        //File típusú tömb mely a mappában lévő elemeket tárolja
        File[] listOfFiles = folder.listFiles();

        try {
            //végigmegyek a tömbön
            for (File file : listOfFiles) {
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
    public static void printFilesInDirectory(String directory) {
        // a kapott mappa elérést és nevéből File típust hozok létre
        File folder = new File(directory);
        //File típusú tömb mely a mappában lévő elemeket tárolja
        File[] listOfFiles = folder.listFiles();

        try {
            //végigmegyek a tömbön
            for (File file : listOfFiles) {
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

    //3
    public static void printAllInDirectory(String directory) {
        // a kapott mappa elérést és nevéből File típust hozok létre
        File folder = new File(directory);
        //File típusú tömb mely a mappában lévő elemeket tárolja
        File[] listOfFiles = folder.listFiles();

        try {
            //végigmegyek a tömbön
            for (File file : listOfFiles) {
                //a sorban következő elem kiírásra kerül
                System.out.println("name: " + file.getName());
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

    //4
     /*   public static String searchFile(String fileName) {
            // a kapott fájl névből File típust hozok létre
            String rootDir = "E:\\";
            File root = new File(rootDir);
            File[] listOfFiles = root.listFiles();

            try {
                //végigmegyek a tömbön
                for(File file : listOfFiles){
                    //ha egy elem fájl akkor kiíratásra kerül
                    if (file.isFile()) {
                        if(file.getName() == fileName ) {
                            return file.getAbsolutePath();
                        }
                    }
                    if(file.isDirectory()) {

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
            return "Nincs ilyen file a filerendszeren";
        }*/

    //5
    public static boolean isFilesEquals(String firstFile, String secondFile) {
        try {
            // fájl hely megadás
            BufferedReader reader1 = new BufferedReader(new FileReader(firstFile));
            BufferedReader reader2 = new BufferedReader(new FileReader(secondFile));
            // azelső sorok beolvaása string típusba
            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
            // areEqual jelzi hogy egyformák-e
            boolean areEqual = true;

            // beolvaásá amíg a következő sor nem null, azaz nem ér el a végére
            while (line1 != null || line2 != null) {

                //ha az a két sor nem egyezik az érték false legyen és lépjen ki a ciklusból
             if (!line1.equals(line2)) {
                    areEqual = false;
                    break;
                }
                //következő sorok beolvasása
                line1 = reader1.readLine();
                line2 = reader2.readLine();
            }

            //ha egyformák visszatér true-val
            if (areEqual) {
                return true;
            }

            // kapcsolatok bezárása
            reader1.close();
            reader2.close();


        }

        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        //ha nem egyforma false-al tér vissza
        return false;
    }

}
