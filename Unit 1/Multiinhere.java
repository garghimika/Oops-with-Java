class A{
    void display(){
        System.out.println("i m in display() of grandparent class");
    }
}
class B extends A{
    void show(){
        System.out.println("i m in show() of parent class");
    }
}
class C extends B{
    void display1(){
        System.out.println("i m in display1() of child class");
    }
}
public class Multiinhere {
    public static void main(String[] args) {
        C c1 = new C();
        c1.display1();
        c1.show();
        c1.display();
        
    }
}
