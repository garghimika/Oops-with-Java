// class Demo1{
//     private int r;

//     public int getR() {
//         return r;
//     }

//     public void setR(int r) {
//         this.r = r;
//     }
// }
// public class Get {
//     public static void main(String[] args) {
//         Demo1 D = new Demo1();
//         D.setR(20);
//         int res = D.getR();
//         System.out.println(res);
//     }
    
// }

class Demo2{
    private int r;
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Get{
    public static void main(String[] args) {
        Demo2 D = new Demo2();
        D.setR(20);
        D.setName("himika");
        int res1 = D.getR();
        String res2 = D.getName();
        System.out.println(res1);
        System.out.println(res2);
    }
}