package oddsandevens;
import java.util.*;

/**
 *
 * @author Sean
 */
public class OddsAndEvens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        System.out.println("Let's play a game called \"Odds And Evens\"");
        System.out.print("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        String output; 
        String result;
        int sum = 0;
        
        System.out.printf("Hi %s, which do you choose? (O)dds or (E)vens? ",inputName);
        String inputChar = scanner.next();
      
        if (inputChar.equals("O")){
            System.out.printf("%s has picked odds! The computer will be evens.\n", inputName);
        }else if (inputChar.equals("E")){
            System.out.printf("%s has picked evens! The computer will be odds.\n", inputName);
        }else{
            System.out.println("Bad input.");
        }
        System.out.println("-------------------------------------------------");
        
        System.out.print("How many “fingers” do you put out?(0-5) ");
        int fingers = scanner.nextInt();
        
        Random rand = new Random();
        int computer = rand.nextInt(6);
        
        System.out.printf("The computer plays %d \"fingers\".\n", computer);
        System.out.println("-------------------------------------------------");
        sum = fingers + computer;
        System.out.printf("%d + %d = %d\n", fingers, computer, sum);
        if(sum%2 == 0){
            System.out.printf("%d is ...even!\n", sum);
            result = "E";
        }else{
            System.out.printf("%d is ...odd!\n", sum);
            result = "O";
        }
        if(result.equals(inputChar)){
            System.out.printf("%s wins!\n", inputName);
        }else{
            System.out.printf("%s loses.\n", inputName);
        }
           
                
        System.out.println("-------------------------------------------------");
        
    }
    
}
