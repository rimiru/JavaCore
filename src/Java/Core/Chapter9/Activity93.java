package Java.Core.Chapter9;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Activity93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input path: ");
        String pathName = scanner.nextLine();
//        String pathName = "src\\bai_tap_ve_nha\\lesson_09";

        ArrayList<File> files = new ArrayList<>(Arrays.asList(Objects.requireNonNull(new File(pathName).listFiles())));
        System.out.println("Path: " + pathName);
        System.out.println("Input file or folder name: (Ex: file 'Activity91.java' or folder 'activity_92')");
        String fileName = scanner.nextLine();
        boolean exist = false;

        for (File file : files) {
            if (fileName.equals(file.getName())) {
                exist = true;
                break;
            }
        }

        if (exist) {
            System.out.println(fileName + " exists in path: " + pathName);
        } else {
            System.out.println(fileName + " don't exists in path: " + pathName);
        }
    }
}
