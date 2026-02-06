class Demo{
    int r;
    String name;   //instance variable
    void getdata(int x,String y){
        r = x;
        name = y;
    }
    void display(){
        System.out.println(r);
        System.out.println(name);
    }
}
public class Student {
    public static void main(String[] args) {
        Demo D1 = new Demo();
        D1.getdata(1,"Himika");
        D1.display();
    }
    
}
