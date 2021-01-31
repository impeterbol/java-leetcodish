import java.util.Scanner;

public class task11{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter characters/numbers your want to repeat > ");
        String userInput = keyboard.next();
        System.out.println("Please enter how many times do you want to repeat? > ");
        int userRepeat = keyboard.nextInt();

        int rowNum, columnNum; 
        for (rowNum = 1; rowNum <= 1; rowNum++) {
            for (columnNum = 1; columnNum <= userRepeat; columnNum++)
                System.out.print("|        |" );
            System.out.println();    
            for (columnNum = 1; columnNum<=userRepeat; columnNum++)
                System.out.print(userInput); 
            System.out.println();  
        }
        
    }
}