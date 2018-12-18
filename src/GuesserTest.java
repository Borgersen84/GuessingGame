public class GuesserTest {

    public static void main(String[] args) {

        //Testing the constructor for exception
        try {
            Guesser guesser = new Guesser(1000, 10);
            System.err.println("Test failed. No exception thrown");
        }catch (IllegalArgumentException iae){
            System.err.println(iae);
            System.out.println("Test lyckades!");
        }

    }
}
