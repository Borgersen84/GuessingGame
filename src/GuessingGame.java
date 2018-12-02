public class GuessingGame {

    public static void main(String[] args) {

        int low = Integer.parseInt(args[0]);
        int high = Integer.parseInt(args[1]);

        Guesser a = new Guesser(low,high);
        a.start();
    }
}
