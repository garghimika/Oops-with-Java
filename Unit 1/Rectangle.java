class Rectangle1{
    int length;
    int width;
    void getdata(int width,int length){   //local variable
        this.length = length;         //instance variable
        this.width = width;
    }
    int area(){
        int a = length * width;
        return(a);
    }
}
    
    public class Rectangle{
        public static void main(String[] args) {
        Rectangle1 R1 = new Rectangle1();
        R1.getdata(3,5);
        int res = R1.area();
        System.out.println("the area is: "+res);
    }

 }
