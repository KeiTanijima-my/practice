import java.util.Scanner;

/**
 * code012_20261127
 */
public class code012_20261127 {

    public static void main(String[] args) {

        //入力値をcode上で使用可能なように調整
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();


        /*
        辺の長さがsizeとなる正方形配列を展開
        正方形配列に整数を格納していく。
        配列の[i][i]と[i][n-i]にある整数を足していく。
        */

        //辺長sizeの正方形2次元配列を定義。入力値を格納。
        int[][] square = new int[size][size];

        for (int i = 0; i < size; i++) {
            sc.nextLine();
            for(int j = 0; j < size; j++){
                square[i][j] = sc.nextInt();
            }
        }

        int result =0;

        for (int i = 0; i < size; i++) {
            result += square[i][i];
            result += square[i][size-1-i];
            if (i == size -1-i) {
                result -= square[i][i];
            }

        }

        /*
        
        for (int[] elements: square){
            for(int element: elements){
                result += elements[element] + elements[elements.length - element];
                if (elements[element] == elements[elements.length - element]) {
                    result -= elements[element];
                }
            }
        }
        */

        System.out.println(result);
    }
}