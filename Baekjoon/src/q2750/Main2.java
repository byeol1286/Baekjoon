package q2750;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//Collection.sort()이용 리스트(List) 타입을 정렬함 Arrays.sort()은 배열 정렬 메서드
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for (int num : list) {
            System.out.println(num);
        }

        sc.close();
    }
}
