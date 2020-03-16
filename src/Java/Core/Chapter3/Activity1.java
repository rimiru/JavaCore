package Java.Core.Chapter3;

public class Activity1 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        Activity1 ac = new Activity1();
        ac.testInt(a);
        System.out.println(a[1]);

        String str = "Hello World!!";
        int size = str.length();
        char character = str.charAt(6);
        System.out.println(character);
    }

    public void testInt(int[] b) {
        b[1] = 10;
        System.out.println(b[1]);
    }
}
