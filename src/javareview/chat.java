package javareview;
import java.util.Scanner;
public class chat {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("enter your sentence");
        String input=x.nextLine();


while(!input.equals("you won")){
    System.out.println("you said"+input);

    System.out.println("enter your sentence");
    input=x.nextLine();
   

    }
        System.out.println("I knew I will win");

}}
