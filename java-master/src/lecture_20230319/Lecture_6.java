package lecture_20230319;

import java.util.Scanner;
import java.util.Random;

import java.util.Random;
import java.util.Scanner;

public class Lecture_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("게임을 시작 하시겠습니까? 1)예, 2)아니오");
        String a = scan.nextLine();

        if (a.equals("예")) { // equals() 메소드로 문자열 값 비교
            System.out.println("예, 매칭을 시작하겠습니다.");
            System.out.println("게임이 매칭되었습니다.");

            // Random 객체 생성
            Random rand = new Random();
            // 1에서 4까지의 정수 난수 생성
            int randomNumber = rand.nextInt(4) + 1;

            switch (randomNumber) { // switch-case 구문으로 변경
                case 1:
                    System.out.println("페이커님의 포지션은 탑입니다.");
                    break;
                case 2:
                    System.out.println("페이커님의 포지션은 정글입니다.");
                    break;
                case 3:
                    System.out.println("페이커님의 포지션은 미드입니다.");
                    break;
                case 4:
                    System.out.println("페이커님의 포지션은 원딜입니다.");
                    break;
                default:
                    System.out.println("페이커님의 포지션은 서포터입니다.");
                    break;
            }
        }
    }
}




