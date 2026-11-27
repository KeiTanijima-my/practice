import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * code013
 */
public class code013 {

    public static void main(String[] args) {
        
        //入力値をcode上で使用可能なように調整
        Scanner sc = new Scanner(System.in);
        String tmp[] = sc.nextLine().split(" ");
        int itemValue = Integer.parseInt(tmp[0]);
        int customer = Integer.parseInt(tmp[1]);

        /*
        商品価格一覧配列
        お客さん予算配列
        商品価格一覧配列は値段順にsort

        先頭から値段と予算比較して買わせる
        買ったら値段予算比較ループ処理を抜ける
        売上総計は足し上げる
        */

        //商品価格一覧配列
        //sc.nextLine();
        List<Integer> eachItemValue = new ArrayList<>();
        for (int i = 0; i < itemValue; i++) {
            eachItemValue.add(sc.nextInt());
        };

        //お客さん予算配列と降順sort
        sc.nextLine();
        List<Integer> eachCustomer = new ArrayList<>();
        for (int i = 0; i < customer; i++) {
            eachCustomer.add(sc.nextInt());
        };

        List<Integer> sortedEachItemValue = eachItemValue.
                                            stream().
                                            sorted(Comparator.reverseOrder()).
                                            toList();

        int totalSales =0;
        for (int i = 0; i < eachCustomer.size(); i++) {
            for (int j = 0; j < sortedEachItemValue.size(); j++) {
                boolean canBuy = eachCustomer.get(i) >= sortedEachItemValue.get(j);
                if (canBuy) {
                    totalSales += sortedEachItemValue.get(j);
                    break;
                }
            }
        }

        System.out.println(totalSales);
    }
}