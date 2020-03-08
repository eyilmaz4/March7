package javareview;
import java.util.Scanner;
public class countries {
    public static void main(String[] args) {
        String country=" ";
        String gate=" ";
        Scanner x=new Scanner(System.in);
        System.out.println("which country you are traveling?");
        String travel=x.nextLine();
        if(travel.equals("Europa")){
            System.out.println("Gate A");}
else if(travel.equals("Africa")){
            System.out.println("Gate B");
            }
else if(travel.equals("Asia")){
            System.out.println("Gate C");
        }
else if(travel.equals("America")){
            System.out.println("Gate D");
        }
else{
            System.out.println("invalid entery");
        }
    }
}
