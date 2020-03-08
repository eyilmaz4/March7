package javareview;
import java.util.Scanner;
public class road {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Is road tested?True/false");
        boolean roadTested=x.nextBoolean();
        if(roadTested){
            System.out.println("Milage? low/high");
            String milage=x.nextLine();
            x.nextLine();
            if(milage.equals("low")){
                System.out.println("buy");
                           }
            else {
                System.out.println("Age? old/recent");
                String age=x.nextLine();
                if(age.equals("recent")){
                    System.out.println("buy");
                }
                else{
                    System.out.println("dont buy");
                }
            }
        }
        else {
            System.out.println("dont buy");
        }
    }
}
