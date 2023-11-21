package Tugas2;

import static java.lang.System.out;
import java.util.Scanner;

public class username1 {

    public static void main(String arf[]){
        Scanner keyboard = new Scanner(System.in);

        out.print("Username: ");
        String username = keyboard.next();

        if(username.equals("Sharra")){
            out.print("password: ");
            String password = keyboard.next();

            if (password.equals("letssleep")){
                out.println("You're in.");
            } else {
                out.println("Incorrect password");
            }
        } else {
            out.println("Unknown user");
        }

        keyboard.close();
    }
}
