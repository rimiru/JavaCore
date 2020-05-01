package Java.Core.Chapter4_OOP;

public class Student {

    // Variable

    private String name;
    private String mssv;
    private String birthday;
    private String gender;
    private float gpa;

    public Student() {

    }

    public Student(String name, String mssv, String birthday, String gender, float gpa) {
        this.name = name;
        this.mssv = mssv;
        this.birthday = birthday;
        this.gender = gender;
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return this.name = "hello " + this.name + "!!!";
    }

    public String getMssv() {
        return mssv;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "\nname='" + name + '\'' +
                ", mssv='" + mssv + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
