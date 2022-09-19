public class App {
    public static void main(String[] args) throws Exception {

        // Conditional Structure
        boolean suspended = false;
        boolean holiday = true;

        if (suspended) {
            System.out.println("Playing online games");
        }
        else if (holiday) {
            System.out.println("Spend quality time");
        } else {
            // Step 1
            rideJeep();

            // Step 2
            rideLRT();

            // Step 3
            rideLRT2();

            // Step 4
            walk();
        
        }

    }

    static void rideJeep() {
        System.out.println("Ride jeep from Tambo");
        System.out.println("Exit jeep to Baclaran");
    }

    static void rideLRT() {
        System.out.println("Ride at Baclaran Station");
        System.out.println("Exit at Doroteo jose");
    }

    static void rideLRT2() {
        System.out.println("Ride at Recto station");
        System.out.println("Exit at Legarda station");
    }

    static void walk() {
        System.out.println("Walk for 8 mins");
    }
}
