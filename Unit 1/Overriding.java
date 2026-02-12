class Scooter{
    void run(){        //overridden
        System.out.println("Grrrr");

    }
}
class Bike extends Scooter{
    void run(){            //overriding
        super.run();
        System.out.println("Furrr");
    }
}
public class Overriding {
    public static void main(String[] args) {
        // Scooter S = new Scooter();
        // S.run();
        Bike B = new Bike();
        B.run();
    }
}
