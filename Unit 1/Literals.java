public class Literals {
    public static void main(String[] args) {
        int a = 123;  //decimal
        int b = 0146; //octal
        int c = 0x73b; //heaxadecimal
        int d = 0b1101; //binary
        System.out.println("Integral literal:"+a);
        System.out.println("Integral literal:"+b);
        System.out.println("Integral literal:"+c);
        System.out.println("Integral literal:"+d);
    }
}


// octal can't be calculated in floating point literals
// public class Literals {
//     public static void main(String[] args) {
//         float a = 101.230f;
//         float b = 0123.222f;
//         double c = 0x1.8p3;           //p or P = 2
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//     }
// }

// public class Literals {
//     public static void main(String[] args) {
//         char ch = 'a';
//         //char b = 0789;   //error
//         char c = '\u0061';
//         System.out.println(ch);
//         //System.out.println(b);
//         System.out.println(c);
//         System.out.println("'\' is a symbol");
//     }
// }

// public class Literals {
//     public static void main(String[] args) {
//         String s = "Hello";
//         //String s1 = "hello"    //error
//         System.out.println(s);
//         //System.out.println(s1);
//     }
// }

// public class Literals {
//     public static void main(String[] args) {
//         boolean b = true;
//         boolean c = false;
//         System.out.println(b);
//         System.out.println(c);
//     }
// }


