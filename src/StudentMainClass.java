import ClassObjects.Student;
import java.util.Date;
    public class StudentMainClass {
        public static void main(String[] args){
//object creation
             Student s1=new Student();
             //using setters
    s1.setId(21);
    s1.setName("Pavan");
    s1.setClasss("Ece");
    s1.setDob("24-10-2000");
             System.out.println(s1);
             //parameterized Constructotrs
             Student s2= new Student(2, "Pavan","24-10-2000","A","ECE",21);
             System.out.println(s2);
             //getters to print data

             System.out.println(s2.getName("PAVVAN"));
            System.out.println(s2.getId());
            System.out.println(s2.getClasss());
            //using static print data
            System.out.println(Student.abc);




        }

    }
