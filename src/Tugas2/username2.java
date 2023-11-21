package Tugas2;

import javax.swing.JOptionPane;
public class username2 {
    public static void main(String asd[]){
        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");
        if ( username != null && password != null
                &&(
                (username.equals("Sharra") && password.equals("letssleep"))||
                        (username.equals("Rreen") && password.equals("foooood"))
        )
        )
        {
            JOptionPane.showMessageDialog(null, "You're in.");
        } else {
            JOptionPane.showMessageDialog(null, "You're suspicious.");
        }
    }
}
