class Parent{
    int a,b;
    void show(){
        System.out.println(a+" and "+b);
    }
}
class Child extends Parent{
    int c;
    void display(){
        System.out.println(c);
    }
    void getsum(){
        System.out.println(a+b+c);
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        // Parent P = new Parent();
        // P.a = 10;
        // P.b = 20;
        // P.show();
        Child C = new Child();
        C.a = 10;
        C.b = 20;
        C.c = 30;
        C.show();
        C.display();
        C.getsum();
    }
}
