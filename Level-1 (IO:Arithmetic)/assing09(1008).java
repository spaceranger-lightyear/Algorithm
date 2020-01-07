/*
 Q. 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 
 Input. 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 Output. 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
 */
package exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int a = kb.nextInt();
        int b = kb.nextInt();
        
        System.out.println((double)a/(double)b);
    }
}