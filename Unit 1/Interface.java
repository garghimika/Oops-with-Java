interface A {
    public abstract void show();       //abstract method
    // static void display(){
    // }
} 
public class Interface implements A{
    public void show(){
        System.out.println("Hello");
    }
    public void print(){
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        A t1 = new Interface();
        t1.show();
        Interface t2 = new Interface();
        t2.print();
    }
    
}
