package ClassObjects;

import java.util.Date;

public class Student {
    //properties or Attributes
    int Id;
    String name;
    String dob;
    //Static variables can be access only classes,withoout objects
    public static int  abc=123;
public Student(){

}
    public Student(int id, String name, String dob, String section, String classs, int age) {
        Id = id;
        this.name = name;
        this.dob = dob;
        this.section = section;
        this.classs = classs;
        this.age = age;

    }

    String section;
    String classs;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName(String pavan) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", section='" + section + '\'' +
                ", classs='" + classs + '\'' +
                ", age=" + age +
                ", dateofbirth=" + dateofbirth +
                '}';
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    int age;
    Date dateofbirth;

    public void age(int i) {
    }


}