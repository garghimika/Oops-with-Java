abstract class Shape1{
    public abstract void area();
    void display(){
        System.out.println("Class Shape1");
    }                                              //method overriding = parameter same
}                                                  //method overloading = 
class Rectangle extends Shape1{
    public void area(){
        System.out.println("Rectangle");
    }
}
class Circle extends Shape1{
    public void area(){
        System.out.println("Circle");
    }
}
class AbstractMethod{
    public static void main(String[] args) {
        Shape1 r = new Rectangle();
        r.area();
        r.display();
        Shape1 c = new Circle();
        c.area();
        c.display();
    }
}