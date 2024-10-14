
import java.awt.datatransfer.SystemFlavorMap;
import java.sql.SQLOutput;
import java.util.*;

public class ReversString {
    // input: s = "abc"
    //output: s = "cba"
    // input: s = "This is Code"
    //output: s = "edoc si siht"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String nstr = "";
        char ch;

        System.out.println("Original String: " + str);

        // loop for Reverse String
        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            nstr = ch+nstr;
        }
        System.out.println("Reverse String: "+ nstr);

    }
}
