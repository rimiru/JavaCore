package Java.Core.Chapter9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Activity94 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input path to file (Ex: 'src\\bai_tap_ve_nha\\lesson_09\\activity_95\\file.txt'): ");

//        String pathName = "src\\bai_tap_ve_nha\\lesson_09\\activity_95\\file.txt";
        String pathName = scanner.nextLine();

        try (FileInputStream fileInputStream = new FileInputStream(pathName)) {
            int i;
            do {
                i = fileInputStream.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (true);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException);
        }
    }
}
