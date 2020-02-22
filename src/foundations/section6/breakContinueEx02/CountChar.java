package foundations.section6.breakContinueEx02;

public class CountChar {

    public static void main(String[] args) {

//        String str = "www.oracle.com";
//        int max = str.length();
//        int count = 0;
//
////            if (str.charAt(i) != 'w')
////                continue;
//        count++;
//
//        System.out.println("Counting w : " + count );

        String str = "www.oracle.com";
        int count = 0;

        for(char ch: str.toCharArray()){
            if(ch == 'w'){
                count++;
            }
        }

        System.out.printf("Counting w : %d", count);
    }

}
