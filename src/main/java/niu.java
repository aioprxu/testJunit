/**
 * Created by Administrator on 2018/3/29.
 */

import java.lang.reflect.Array;
import java.util.*;

public class niu {
}



class Mai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char ch[] = s.toCharArray();
        TreeMap<Character,Integer> map = new TreeMap<>();
        for(char c:ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        int max=map.get(ch[1]);
        StringBuilder string = new StringBuilder();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()!=max) {
                System.out.println("false");
                return;
            }
            else string.append(entry.getKey());
        }
        System.out.println(string.toString());
        return;
    }
}



class Main {
    public static List<String>generate(int n){
        List<String> result = new ArrayList<>();
        if(n==0){
            result.add("");
            return result;
        }
        if(n==1){
            result.add("()");
            return result;
        }
        for(int i=1;i<=n;i++){
            List<String>left=generate(i-1);
            List<String>right=generate(n-i);
            for(int j=0;j<left.size();j++){
                for(int k=0;k<right.size();k++){
                    result.add("("+left.get(j)+")"+right.get(k));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> list = generate(n);
        Collections.reverse(list);
        Iterator it1 = list.iterator();
        for(int i = 0;i < list.size(); i ++){
            System.out.print(list.get(i));
            if(i!=list.size()-1)
                System.out.print(",");
        }
    }
}

//    Scanner in = new Scanner(System.in);
//    int n = in.nextInt();
//    List<String> list = new ArrayList<>();
//        for(int k = 0;k<n;k++) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for(int i = k;i<n;i++){
//            stringBuilder.append("(");
//        }
//        for(int i = k;i<n;i++){
//            stringBuilder.append(")");
//        }
//        for(int i = 0;i<k;i++){
//            stringBuilder.append("()");
//        }
//        if(k!=n-1)
//            stringBuilder.append(",");
//        list.add(stringBuilder.toString());
//    }
//    StringBuilder stringBuilder = new StringBuilder();
//        for(String s :list){
//        stringBuilder.append(s);
//    }
//        System.out.println(stringBuilder);
//        return;
//}
class ain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n!=0) {
            if (n % 3 == 0) {   //考虑被3整除的情况
                System.out.println(Math.pow(3, n / 3));
                continue;
            }
            int flag[] = new int [100] ;
            int i = 0;
            while (n != 2 && n != 4) {
                //如果不能被3整除，那么除3必余1或者2，而余1和4是同样的情况，这里取4是因为这种情况下最后是两个2，
                //取4就可以直接把4分解为2+2
                flag[i++] = 3;
                n -= 3;
            }
            while (n!=0) {  //余2和1的情况，余2就是1个2，余1就是2个2，所以前面才会判断是否等于4，这样就可以化为2个2
                flag[i++] = 2;
                n -= 2;
            }
            int result = 1;
            for (int j = 0; j < i; j++) {
                result *= flag[j];
            }
            System.out.println(result);
        }//while
        return;
    }
}

