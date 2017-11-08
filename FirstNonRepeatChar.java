import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;
import java.text.*;
import java.security.SecureRandom;
import java.util.function.*;
import java.util.concurrent.*;

public class FirstNonRepeatChar {

    char firstNonRepeatingCharacter(String s){
        HashMap<Character,Integer> charBank = new HashMap<Character,Integer>();
        char output = ' ';
        char ch = ' ';

        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(charBank.containsKey(ch)){
                charBank.put(ch, charBank.get(ch)+1);
            }
            else{
                charBank.put(ch, 1);
            }
        }
        for (int j = 0; j < s.length(); j++){
            ch = s.charAt(j);
            if(charBank.get(ch) == 1){
                System.out.println("First Non Repeated Char " + ch);
                break;
            }
            else{
                ch = '_';
                output = ch;
            }
        }
        return output;
    }

    public static void main(String[] args){

    }
}
