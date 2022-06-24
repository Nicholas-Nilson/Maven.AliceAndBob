/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Please enter your name");

        String name = nameInput.nextLine();
        int tries = 0;
        while ((name.trim().equals(null) || name.trim().equals(""))){
            System.out.println("Really, please enter a name");
            name = nameInput.nextLine();
            tries++;
            if(tries == 5){
                System.out.println("NEXT");
                return;
            }
        }
        
        if(name.toLowerCase().equals("Alice") || name.toLowerCase().equals("bob")) {
            System.out.println("Hello there, " + name);
        } else {
            System.out.println("We're looking for someone named after a certain Mott the Hoople song... or Bob");
        }


    }
}
