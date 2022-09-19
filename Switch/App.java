public class App {
    public static void main(String[] args) throws Exception {

        String today = "friday";

        switch (today) {
            case "monday":
                System.out.println("face to face classes!");
                break;
            case "tuesday":
                System.out.println("Just a normal day!");
                break;
            case "wednesday":
                System.out.println("Im playing online games!");
                break;
            case "thursday":
                System.out.println("having fun with my cat!");
                break;
            case "friday":
                System.out.println("Eating some snacks and also watching documentaries!");
                break;
            case "Saturday":
                System.out.println("I go to the gym every saturday!");
                break;
            case "Sunday":
                System.out.println("Its my rest day!");
                break;
            default:
                System.out.println("Incorrect day!");
                break;
        }

    }
}
