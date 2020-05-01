package Java.Core.Chapter9;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Activity91 {
    public static void main(String[] args) {
        ArrayList<String> listFiles = new ArrayList<>();
        ArrayList<String> listFolders = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input path: ");
        String pathName = scanner.nextLine();

        ArrayList<File> files = new ArrayList<>(Arrays.asList(Objects.requireNonNull(new File(pathName).listFiles())));

        for (File file : files) {
            if (file.isDirectory()) {
                listFolders.add(file.getName());
            } else if (file.isFile()) {
                listFiles.add(file.getName());
            }
        }

        System.out.println("List folders: " + listFolders);
        System.out.println("List files: " + listFiles);

    }
}
