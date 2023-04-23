package lecture_20230423;

import java.util.Scanner;
import java.util.Scanner;


public class lol7 {
    public static void main(String[] args) {
        System.out.println("대결을 시작힙니까? 1:시작, 2:탈주");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 2:
                break;

            case 1:
                try {
                    Thread.sleep(2000); // 2초 대기
                } catch (InterruptedException e) {
                    // 예외 처리
                }
                System.out.println("미니언이 생성되었습니다.");
        }
    }
}
