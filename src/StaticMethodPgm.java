package src;
class Student1 {
    int rollno;
    String name;
    static String collegename = "IIT";

    static void change() {
        collegename = "BBIT";

    }
    Student1(int r,String n)
    {
        rollno=r;
        name=n;
    }

    void display()
    {
        System.out.println(name+" "+rollno+" "+collegename);
    }


}


public class StaticMethodPgm {
    public static void main(String[] args) {
        Student1.change();

        Student1 s1=new Student1(11,"Nanu");
        Student1 s2=new Student1(22,"meenu");

        s1.display();
        s2.display();
    }
}
