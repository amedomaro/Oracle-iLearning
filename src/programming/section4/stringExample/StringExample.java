package programming.section4.stringExample;

import java.util.Arrays;


public class StringExample {
    private String str = "Sample String";
    private String strBackwards = "";

    protected void displayString(String str) {
        for (int index = 0; index < str.length(); index++) {
            System.out.println(str.charAt(index));
        }
    }

    protected void displayStringBackward(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            strBackwards += str.substring(i, i + 1);
        }
        System.out.println(strBackwards);
    }

    protected void searchString(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.printf("The character %c appears in the text %d times.\n", ch, count);
    }

        public static void main (String[]args){
            StringExample se = new StringExample();

            se.displayString(se.str);
            se.displayStringBackward(se.str);
            se.searchString(se.str, 'S');

            String[] arr = se.str.split(" ");
            System.out.println(Arrays.toString(arr));
        }
    }
