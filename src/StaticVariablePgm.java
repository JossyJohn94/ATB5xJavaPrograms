package src;

class Student {
    int rollno;
    String name;
     static String collegename = "ITS";
Student(int r,String n)
{
    rollno=r;
    name=n;
}
    void display() {
        System.out.println(rollno + " "+name + " " + collegename);
    }
}
public class StaticVariablePgm {
    public static void main(String[] args) {
        Student s1=new Student(111,"Anu");
        Student s2=new Student(222,"Manu");
        Student.collegename="BBT";
        s1.display();
        s2.display();
    }

}
