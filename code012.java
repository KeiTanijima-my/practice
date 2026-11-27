import java.util.Scanner;

/**
 * code012
 */
public class code012 {

    public static void main(String[] args) {

        //入力値をcode上で使用可能なように調整
        Scanner sc = new Scanner(System.in);
        String tmp[] = sc.nextLine().split(" ");
        int playTimes = Integer.parseInt(tmp[0]);
        int errorPlay = Integer.parseInt(tmp[1]);

        int[] plays = new int[playTimes];

        for (int i = 0; i < playTimes; i++) {
            plays[i] = sc.nextInt();
        }

        int errorPlayTimes =0;

        for(var val: plays){
            if (val == errorPlay) {
                errorPlayTimes++;
            }
        }

        System.out.println("バグ原因操作回数は" + errorPlayTimes + "回です。");

    }
}