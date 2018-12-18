public class GuesserTest {

    public static void main(String[] args) {

        Guesser guesser;
        //Testing the constructor for exception
        try {
            guesser = new Guesser(1000, 10);
            System.err.println("Test failed. No exception thrown");
        }catch (IllegalArgumentException iae){
            System.err.println(iae);
            System.out.println("Test succeeded!");
        }

        // Testing the constructor with equal value on both parameters
        try {
            guesser = new Guesser(100,100);
            System.err.println("Test failed. No exception thrown");
        }catch (IllegalArgumentException iae){
            System.err.println(iae);
            System.out.println("Test succeeded!");
        }

        // Testing the constructor with correct data
        try {
            guesser = new Guesser(1,100);
            System.out.println("This is correct!");
        }catch (IllegalArgumentException iae){
            System.err.println("Test failed. Constructor is not working properly");
        }





    }
}
