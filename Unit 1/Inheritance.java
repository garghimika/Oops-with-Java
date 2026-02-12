class Parent{
    void display(){
        // privatemethod();
        System.out.println("i m in display() of parent class");
    }
    protected void protectedmethod(){
        System.out.println("i m in protected method() of parent class");

    }
}
class Child extends Parent{
    void show(){
        System.out.println("i m in show() of child class");
    }

}
public class Inheritance {
    public static void main(String[] args) {
        // Parent P = new Parent();
        // P.display();
        Child C = new Child();
        C.show();
        C.display();
        C.protectedmethod();
    }
    
}
