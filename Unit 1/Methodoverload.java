class overload{
    // int add(int a,int b){
    //     return(a+b);
    // }
    int add(int a,int b,int c){
        return(a+b+c);
    }
    void add(int a,long b){
        System.out.println(a);
        System.out.println(b);
    }
}
public class Methodoverload {
    public static void main(String[] args) {
        overload O1 = new overload();
        O1.add(10,20);
        // int r = O1.add(10,20,30);
        // double r = O1.add(2,2.3);
        // System.out.println(r);
    }
    
}
