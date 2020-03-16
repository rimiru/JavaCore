package Java.Core.Chapter5_OOP;

public class Tests {
    public static void main(String[] args) {
        Student st = new Student();

        st.setName("Nguyen Van A");
        st.setAge(22);

        System.out.println(st.getName());
        System.out.println(st.getAge());
    }
}
