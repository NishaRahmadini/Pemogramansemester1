package Tugas6;

import java.io.File;
import static java.lang.System.out;
import java.util.Scanner;
public class DeleteEvidencetxt {
    public static void main(String erer[]){
        File evidence = new File("bukumasakan.txt");
        if (evidence.exists()){
            Scanner keyboard = new Scanner(System.in);
            char reply;

            do{
                out.print("Delete evidence? (y/n)");
                reply =
                        keyboard.findWithinHorizon(".",0).charAt(0);
            } while (reply != 'y' && reply != 'n');

            if (reply == 'y'){
                out.println("Okay, here goes...");
                evidence.delete();
                out.println("The evidence has been deleted.");
            } else {
                out.println("Sorry... i'm, just asking.");
            }

            keyboard.close();
        }
    }
}
