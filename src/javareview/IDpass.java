package javareview;
import java.util.Scanner;
public class IDpass {
    public static void main(String[] args) {
       Scanner x=new Scanner(System.in);
       String userName="user";
       String password="password";
        System.out.println("user name");
        String user=x.nextLine();
        System.out.println("password");
        String pass=x.nextLine();
        if (user.equals(userName)&& password.equals(pass)){
            System.out.println("welcome");
        }
        else{
            System.out.println("user name or password is wrong");
        }
    }
}
