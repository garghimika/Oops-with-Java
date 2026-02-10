// class Default{
//     Default(){
//         System.out.println("i am default constructor");
//     }
// }
// public class Main5 {
//     public static void main(String[] args) {
//         Default D = new Default();
//     }
    
// }

class Student{
    int r;
    String name;
    Student(){
        r = 0;
        name = null;
    }
    //parameterized constructor
    Student(int r,String name){
        this.r = r;
        this.name = name;
    }
    void display(){
        System.out.println("Roll No: " + r);
        System.out.println("Name: " + name);

    }
    void show(Student S){
        this.r = S.r;
        this.name = S.name;
    }
}
public class Main5{
    public static void main(String[] args) {
        Student S = new Student();
        S.display();
        Student S1 = new Student(2,"himika");
        S1.show(S);
        S1.display();
    }
}