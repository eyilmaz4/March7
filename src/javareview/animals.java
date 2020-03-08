package javareview;
import java.util.Scanner;
public class animals {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Air?true/false");
        boolean air=x.nextBoolean();
        System.out.println("Egg?true/false");
        boolean egg=x.nextBoolean();
//        boolean air=true;
//        boolean egg=true;

        if(air){
            if(egg){
                System.out.println("bird");
            }
            else{
                System.out.println("mammal");
            }
        }else{
            System.out.println("fish");
        }
    }
}
