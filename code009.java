/**
 * code009
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class code009 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String tmp[] = sc.nextLine().split(" ");
        int player = Integer.parseInt(tmp[0]);//選手番号
        int events = Integer.parseInt(tmp[1]);//イベント

        /*
        イベントをQ回ループする。
        ファール回数をリストに格納する。
        イベント3では、ファール累計を参照してY/Nを答える。
        */

        //イベント用の配列を確保
        int[][] score = new int[2][events];
        /*
        0:イベント
        1:選手番号
        */

        //イベントをQ回ループ
        for (int i = 0; i < events; i++) {
            for(int j =0; j <2; j++){
                score[j][i] = sc.nextInt(); 
            }
        }

        //ファール回数を格納するリスト確保&初期値化
        List<Integer> faulCount = new ArrayList<>();
        for (int i = 0; i < player; i++) {
            faulCount.add(0);
        }
        /*
        0:選手番号
        1:ファール回数
        */

        //イベントQ回ループで各イベント処理記述
        //ファール加算と宣言を記述

        for (int i = 0; i < events; i++) {
            int eachEvent = score[0][i];
            int playerNo = score[1][i] -1;

            if (eachEvent == 1) {
                faulCount.set(playerNo,faulCount.get(playerNo) + 1);
            }else if(eachEvent == 2){
                faulCount.set(playerNo,2);
            }else if (eachEvent == 3) {
                if (faulCount.get(playerNo) >= 2) {
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("想定外のエラーです。");
            }
        }

    }
}