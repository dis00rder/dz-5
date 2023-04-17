import java.util.Set;
import java.util.TreeSet;

public class Alexx {
    public static void main(String[] args) {
        String s = "Alexx9800";
        printUniq(s);

    }

    public static void printUniq(String mystring){


        Set<Character> chars = new TreeSet<>();
        for( char c : mystring.toCharArray() ) {
            chars.add(c);
        }

        System.out.println( chars );

    }
}
