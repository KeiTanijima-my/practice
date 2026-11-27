import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

/**
 * code011
 */
public class code011 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int moveTime = Integer.parseInt(sc.nextLine());
        String moveValue[] = sc.nextLine().split("");

        int x = 0;
        int y = 0;

        /*
        マップ型で座標を格納。
        */
        Map<Integer, int[]> dimension = new HashMap<>();

        for (int i = 0; i < moveTime; i++) {
            String point =moveValue[i];
            switch (point) {
                case "R":
                    dimension.put(i,new int[]{x+1, y});
                    break;
                case "L":
                    dimension.put(i,new int[]{x-1, y});
                    break;
                case "U":
                    dimension.put(i,new int[]{x, y+1});
                    break;
                case "D":
                    dimension.put(i,new int[]{x, y-1});
                    break;            
                default:
                    System.out.println("エラーです。");
                    break;
            }                
        }

        /*
        セット型に座標配列を格納して,重複を.add()で削る。
        */
        Set<int[]> dimensionDuplication = new HashSet<>();

        for(var val : dimension.values()){
            dimensionDuplication.add(val );
        }

        if (dimensionDuplication.size() != dimension.size()) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}