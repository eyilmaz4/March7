package javareview;
import java.util.Scanner;
public class doubleID {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter ID");
        boolean ID=x.nextBoolean();


        if(ID){
            System.out.println("welcome to building");
            System.out.println("enter ITID");
            boolean ITID=x.nextBoolean();

            if(ITID){
                System.out.println("you can enter to IT room");
            }
            else{
                System.out.println("you can not enter IT Room");
            }
        }
        else
        {
            System.out.println("yo dont have access");
        }

    }
}
