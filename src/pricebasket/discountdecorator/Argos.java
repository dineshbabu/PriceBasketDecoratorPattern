package pricebasket.discountdecorator;

import java.util.HashSet;
import java.util.Set;

public class Argos {

    public static void main(String[] args){
//        String s = "aaabbbb";
//        System.out.println(is_Palindrome(s));

//        String s = "abcde";
//        System.out.println(frequent(s, 2,3,4));

        System.out.println(numberOfPairs(new int[]{1, 2, 4, 3, 3}, 6L));

    }

    private static int numberOfPairs(int[] a, long k) {

        Set<String> pairFound = new HashSet<>();

        for (int i = 0; i < a.length; i++) {

            int num = a[i];

            for (int j = 0; j < a.length; j++) {

                if (j == i)
                    continue;

                if (num + a[j] == k) {
                    String key = "";

                    if (num > a[j]) {
                        key = num + "" + a[j];
                        if (j > i)
                            key += j + "" + i;
                        else
                            key += i + "" + j;
                    }
                    else {
                        key = a[j] + "" + num;
                        if (j > i)
                            key += j + "" + i;
                        else
                            key += i + "" + j;
                    }

                    pairFound.add(key);
                }
            }
        }

        return pairFound.size();
    }



//    static int frequent(String s, int k, int l, int m) {
//        String subString = "";
//        List<String> subStringList = new ArrayList<>();
//        for (int i = 0 ; i <= s.length() ; i++){
//            subString = s.substring(i);
//            if( subString.length() >= k && subString.length() <= l){
//
//            }
//        }
//    }

    static String is_Palindrome(String s) {

        if(s.length() / 2 == 0 ){
            return "NO";
        }
        int half = (s.length() - 1) / 2;
        for (int i = 0; i < half - 1; i++){
            if(Character.isUpperCase(s.charAt(i))){
                return "NO";
            }

            if(s.charAt(i) != s.charAt(s.length() -(1 + i))){
                return "NO";
            }

        }
        return "YES";
    }
}
