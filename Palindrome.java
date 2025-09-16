import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {

        String[] tests = {"level", "Hello", "А роза упала на лапу Азора"};

        for(String test : tests) {
            System.out.println(test + " -> " + Answer(test));
        }

    }

    public static boolean Answer(String s){

        s = s.toLowerCase(Locale.ROOT).replace(" ", "");

        int left = 0;
        int right = s.length() - 1;
        
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
