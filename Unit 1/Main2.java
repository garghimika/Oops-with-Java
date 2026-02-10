class Student{
    int r = 10;
    static String name = "himika";
    void display(){
        System.out.println(r);
        System.out.println(name);
    }
    static void show(){
        // System.out.println(r);    //error
        System.out.println(name);

    }
}
public class Main2 {
    public static void main(String[] args) {
        Student S = new Student();
        S.display();
        Student.show();
        // S.show();    //it is not recommended
    
    }
}
