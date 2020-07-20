package MainTest;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //char[] symbol={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};
        //String[] symbol={"ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890","222333444555666777788899991234567890"};
        String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number = "222333444555666777788899991234567890";
        while (sc.hasNext()){
            int n = sc.nextInt();
            Set<String > set = new TreeSet<>();
            StringBuffer sb = new StringBuffer();
            char[] symbols = symbol.toCharArray();
            char[] numbers = number.toCharArray();
            for (int i = 0; i < n; i++) {
                String str = sc.next();

                char[] ch = str.replace("-","").toCharArray();

                for (int j = 0; j <ch.length; j++) {
                    if (j == 3){
                        sb.append("-");
                    }
                    for (int k = 0; k < symbols.length; k++) {
                        if (symbols[k] == ch[j]){
                            sb.append(numbers[k]);
                     }
                    }
//                    if (Character.isLetter(ch[j])){
//                        sb.append(symbol[1].charAt(symbol[0].indexOf(ch[j])));
//                    }else {
//                        sb.append(ch[j]);
//                    }
                }
                set.add(sb.toString());
                sb.delete(0,sb.length());
            }
            for (String s: set) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
}
