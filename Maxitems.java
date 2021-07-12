import java.util.*;

public class Maxitems {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String SandQ[] = input.nextLine().split(" "); // taking the input for spaced elements as an Array but the element will be stored are Strings

        String givenString = SandQ[0];
        int givenQuery = Integer.valueOf((SandQ[1]));

        
        for (int i = 1; i<=givenQuery; i++){
            String aChar = input.nextLine();
            int count = 0;
            for(int j = 0; j<givenString.length(); j++){
                if(aChar.equals(givenString.charAt(j))){   // .charAt(index) gives us the char at the given index
                    count++;
                }
            }
            System.out.println(count);
        }
        input.close();  // don't forget to close the Scanner
    }
}