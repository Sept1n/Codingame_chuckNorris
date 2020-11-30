import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        int count = 0, number = 0;
        StringBuilder strbuilder = new StringBuilder();
        StringBuilder converse = new StringBuilder();
        for (int i = 0; i < MESSAGE.length(); i++) {
            String str = Character.toString(MESSAGE.charAt(i));
            String string = new BigInteger(str.getBytes()).toString(2);
            if(string.length() == 8) {
                int x = Integer.parseInt(string);
                int y = x << 1;
                strbuilder.append(y);
            }
            else {
                strbuilder.append(string);
            }
        }
        char c = strbuilder.charAt(0);
        number = Character.getNumericValue(c);
        for (int i = 0; i < strbuilder.length(); i++) {
            if(number != Character.getNumericValue(strbuilder.charAt(i))) {
                if(number == 1) {
                    converse.append("0 ");
                }
                else {
                    converse.append("00 ");
                }
                for(int j = 0; j < count; j++) {
                    converse.append("0");
                }
                number = Character.getNumericValue(strbuilder.charAt(i));
                count = 0;
                converse.append(" ");
                count++;
            }
            else {
                count++;
            }
        }
        if(number == 1) {
            converse.append("0 ");
        }
        else {
            converse.append("00 ");
        }
        for(int j = 0; j < count; j++) {
            converse.append("0");
        }
        System.err.println(number);
        System.err.println(count);
        System.out.println(converse);
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

    }
}