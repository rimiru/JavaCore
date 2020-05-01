package Java.Core.Chapter4_OOP;

import java.util.Scanner;

public class JavaOOP {
    public static void main(String[] args) {

        /*Student sinhVienA = new Student();

        sinhVienA.name = "Nguyen Van A";

        String name = sinhVienA.getName();

        System.out.println(name);*/

        Student[] studentArray = new Student[2];

        Scanner scanner = new Scanner(System.in);

        studentArray[0] = new Student("Nguyen Van A", "20150041", "22/08/1997", "nam", 3.1f);

        studentArray[1] = new Student("Nguyen Van B", "20154444", "22/06/1997", "nam", 3.9f);

        System.out.println("Nhap vao MSSV can tim: ");
        String mssv = scanner.nextLine();
        for (Student st : studentArray) {
            if (st.getMssv().equals(mssv)) {
                System.out.println(st.toString());
                break;
            }
        }
    }
}
