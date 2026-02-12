class P1{
    void display(){
        System.out.println("Normal display of P1 class");
    }
    static void show(){
        System.out.println("Static display of P1 class");
    }
}
class C1 extends P1{
    void display(){
        System.out.println("Normal display of C1 class");
    }
    static void show(){
        System.out.println("Static display of C1 class");
    }
}
public class Staticoverriding {
    public static void main(String[] args) {
        C1 C = new C1();
        C.display();
        C1.show();
        P1.show();
        
    }
}




   


        
