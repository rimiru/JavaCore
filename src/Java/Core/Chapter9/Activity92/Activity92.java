package Java.Core.Chapter9.Activity92;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Activity92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathName = "src\\Java\\Core\\Chapter9\\activity_92";
        ArrayList<String> listFiles = new ArrayList<>(Arrays.asList(Objects.requireNonNull(new File(pathName).list())));

        System.out.print("Input file extensions (png/txt/...): ");
        String extensions = scanner.nextLine();

        for (String listFile : listFiles) {
            if (listFile.contains(extensions)) {
                System.out.println(listFile);
            }
        }
    }
}
