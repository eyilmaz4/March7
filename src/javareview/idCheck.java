package javareview;
import java.util.Scanner;
public class idCheck {
    public static void main(String[] args) {
       int pass=1234;
        String user="enter";
        System.out.println("please enter user name");
        Scanner x=new Scanner(System.in);
        String userName=x.nextLine();
        System.out.println("please enter your password");
        int password=x.nextInt();
if(userName.equalsIgnoreCase(user) && password==pass){
    System.out.println("you can enter");
}
else if(!userName.equalsIgnoreCase(user)){
    System.out.println("invalid user name ");
}
else if(password!=pass){
    System.out.println("invalid password ");
}
else {
    System.out.println("invalid user name and password ");
}
    }

//    boolean ID=true;
//    if(ID){
//        System.out.println("ok");
//    }
//    else{
//        System.out.println("no");
//    }
}
