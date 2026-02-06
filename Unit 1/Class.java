public class Class {
    int r;
    String name;
    void getdata(){
        r = 1;
        name = "ABC";
    }
    void display(){
        System.out.println(r);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Class s1 = new Class(); 
        s1.getdata();
        s1.display();
    }
    
}
