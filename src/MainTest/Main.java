package MainTest;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * [编程题]电话号码
 *
 * 上图是一个电话的九宫格，如你所见一个数字对应一些字母，
 * 因此在国外企业喜欢把电话号码设计成与自己公司名字相对应。
 * 例如公司的Help Desk号码是4357，因为4对应H、3对应E、5对应L、7对应P，因此4357就是HELP。
 * 、同理，TUT-GLOP就代表888-4567、310-GINO代表310-4466。
 * NowCoder刚进入外企，并不习惯这样的命名方式，现在给你一串电话号码列表，
 * 请你帮他转换成数字形式的号码，并去除重复的部分。
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //char[] symbol={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};
        String[] symbol={"ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890","222333444555666777788899991234567890"};

        while (sc.hasNext()){
            int n = sc.nextInt();
            Set<String > set = new TreeSet<>();
            StringBuffer sb = new StringBuffer();
            //char[] symbols = symbol.toCharArray();
            //char[] numbers = number.toCharArray();
            for (int i = 0; i < n; i++) {
                String str = sc.next();

                char[] ch = str.replace("-","").toCharArray();

                for (int j = 0; j <ch.length; j++) {
                    if (j == 3){
                        sb.append("-");
                    }
//                    for (int k = 0; k < symbols.length; k++) {
//                        if (symbols[k] == ch[j]){
//                            sb.append(numbers[k]);
//                     }
//                    }
                    if (Character.isLetter(ch[j])){
                        sb.append(symbol[1].charAt(symbol[0].indexOf(ch[j])));
                    }else {
                        sb.append(ch[j]);
                    }
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
