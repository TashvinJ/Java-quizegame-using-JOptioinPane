import javax.swing.JOptionPane;
import java.lang.Integer;
import java.lang.System;
import java.lang.String;

public class quizegame {
    public static void main(String[] args){
        System.out.println("Welcome");

        JOptionPane.showMessageDialog(null, "Weclome to quizegame", "Gretings", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Lets get started", "Message", JOptionPane.PLAIN_MESSAGE);

        String firstname = JOptionPane.showInputDialog(null, "What is your firstname?", "Name", JOptionPane.PLAIN_MESSAGE);
        String lastname = JOptionPane.showInputDialog(null, "What is your lastname?", "Name", JOptionPane.PLAIN_MESSAGE);
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your age", "Age", JOptionPane.PLAIN_MESSAGE));
        String country = JOptionPane.showInputDialog(null, "In which contry do you live in?", "Country", JOptionPane.PLAIN_MESSAGE);
        String fullname = firstname + " " + lastname;
        
        JOptionPane.showMessageDialog(null, "Hello " + fullname, "Greetings", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "You are " + age + " years old", "Greetings", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Tou live in " + country + " country", "Greetings", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Here are some rules that you need to follow", "Rules", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is a computer and coding related quizegame", "Rules", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "You should type the options", "Rules", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "You should type the options in captial letters", "Rules",  JOptionPane.PLAIN_MESSAGE);
        while (true) {
            String understandrules = JOptionPane.showInputDialog(null, "Did You undersand the rules? (y for yes, n for no)", "Rules", JOptionPane.PLAIN_MESSAGE).toLowerCase();
            if (understandrules == "yes"){
                JOptionPane.showMessageDialog(null, "Ok lets start the game", "Rules", JOptionPane.PLAIN_MESSAGE);
                break;
            }

            else {
                JOptionPane.showMessageDialog(null, "This is a computer related quizegame and coding related quizegame", "Rules", JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null, "You should type the options", "Rules", JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null, "You should type the options in captial letters", "Rules", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
}