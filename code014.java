import java.util.*;
 /**
  * Person
  */
 record Person(String name, int score, int time) {}

/**
 * code014
 */
public class code014 {
    public static void main(String[] args) {
 
        //入力値をcode上で使用可能なように調整
        Scanner sc = new Scanner(System.in);
        String tmp[] = sc.nextLine().split(" ");
        int peopleN = Integer.parseInt(tmp[0]);
        int standingK = Integer.parseInt(tmp[1]);

        //参加者の情報を格納する配列を定義
        //recordクラスで型の異なる配列？を定義
        List<Person> personValue = new ArrayList<>();
        for (int i = 0; i < peopleN; i++) {
            String[]value = sc.nextLine().split(" ");
            personValue.add(new Person(value[0],
                                    Integer.parseInt(value[1]),
                                    Integer.parseInt(value[2])));
        };

        /*
        score降順
        time昇順
        name昇順　（アルファベット順で昇順なる？）
        */
    
        personValue.sort(
            Comparator.comparingInt(Person::score).reversed()
                      .thenComparingInt(Person::time)
                      .thenComparing(Person::name)
        );

        //System.out.println(personValue.get(standingK)); //配列として出力されてしまう。名前のみ出力できない。
        System.out.println(personValue.get(standingK-1).name());//Listの先頭なのでindexは0スタート
    }
}