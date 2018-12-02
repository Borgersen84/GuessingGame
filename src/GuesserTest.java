public class GuesserTest {

    public static void main(String[] args) {
        String s = null;

        if("Barcelona".equals(s)){
            System.out.println("Ay, caramba");
        }

        try{
            if (s.equals("Barcelona")){
                System.out.println("Ay, caramba");
            }
        }catch (NullPointerException npe){
            System.out.println("This did not work");
        }

    }
}
