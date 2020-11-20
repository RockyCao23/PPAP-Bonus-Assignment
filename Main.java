import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void daimaou(String x, String y){

        String w = "";
        String a = "";
        String a2 = "";

        w = y;
        w = y.substring(0,1).toUpperCase() + y.substring(1,y.length());
        if (x.substring(0,1).contains("a")||x.substring(0,1).contains("e")||x.substring(0,1).contains("i")||x.substring(0,1).contains("o")||x.substring(0,1).contains("u")||x.substring(0,1).contains("A")||x.substring(0,1).contains("E")||x.substring(0,1).contains("I")||x.substring(0,1).contains("O")||x.substring(0,1).contains("U")){
            a = "an";
        }else a = "a";
        if (y.substring(0,1).contains("a")||y.substring(0,1).contains("e")||y.substring(0,1).contains("i")||y.substring(0,1).contains("o")||y.substring(0,1).contains("u")||y.substring(0,1).contains("A")||y.substring(0,1).contains("E")||y.substring(0,1).contains("I")||y.substring(0,1).contains("O")||y.substring(0,1).contains("U")){
            a2 = "an";
        }else a2 = "a";
        System.out.println("I have " + a + " " + x + ", I have " + a2 + " " + y + "\nUh! " + w + " " + x);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first object you have!");
        String x = scan.next();
        System.out.println("Enter the second object you have!");
        String y = scan.next();
        daimaou(x,y);


    }
}
