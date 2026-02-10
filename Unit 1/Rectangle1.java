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
    
