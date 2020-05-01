package Java.Core.ExceptionHandling;

public class Activity71 {
    public static void main(String[] args) {

        try {
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Đoạn code 1 sai chỉ số, nằm ngoài kích thước mảng");
        } catch (Exception e) {
            System.out.println(e);
        }


        try {
            int zero = 0;
            int average = 10 / zero;
            System.out.println("Average = " + average);
        } catch (ArithmeticException e) {
            System.out.println("Đoạn code 2 lỗi số học, không có số nào có thể chia được cho 0");
        } catch (Exception e) {
            System.out.println(e);
        }


        try {
            String obj = null;
            System.out.println(obj.length());
        } catch (NullPointerException e) {
            System.out.println("Đoạn code 3 lỗi do obj null không có giá trị");
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Finished!");
    }
}
