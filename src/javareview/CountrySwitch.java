package javareview;
import java.util.Scanner;
public class CountrySwitch {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Destination?");
        String destination=x.nextLine();
        switch(destination){
            case "America":
                System.out.println("Gate D");
                break;
            case "Europe":
                System.out.println("Gate B");
                break;
            case "Asia":
                System.out.println("Gate C");
                break;
            case "Africa":
                System.out.println("Gate A");
                break;
            default://else yerine
                System.out.println("not a destination");
        }
    }
}
