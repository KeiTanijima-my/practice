import java.util.*;
/**
 * code015
 */
public class code015 {

    public static void main(String[] args) {
        
        /*
        期限配列を重複ないように要素の個数を求めるだけ。
        HashSetに要素をaddし続ける。
        最後にsizeを出せば終わり。
        */

        //入力値をcode上で使用可能なように調整
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();

        Set<Integer> rimitTime = new HashSet<>();
        for (int i = 0; i < size; i++) {
            rimitTime.add(sc.nextInt());
        }

        System.out.println(rimitTime.size());

    }
}