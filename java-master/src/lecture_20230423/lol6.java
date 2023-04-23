package lecture_20230423;

import java.util.Scanner;

public class lol6
{
    public static void main(String[] args) {
        System.out.println("대결을 시작힙니까? 1:시작, 2:탈주");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 2:
             break;

            case 1:
                try {
                    Thread.sleep(2000); // 2초 대기
                } catch (InterruptedException e) {
                    // 예외 처리
                }
                System.out.println("미니언이 생성되었습니다.");
                int rand = (int)(Math.random()*100);
                int zedhp =700;
                int Zedak = 150;
                int Corkiak = 120;
                int Corkihp = 1000;

                while (Corkihp>0|| zedhp>0){
                   int Corki = Corkiak-rand;
                   int zed = Zedak - rand;
                    zedhp = zedhp - Corki;
                    System.out.println("코르키 -> 제드 "+Corki+"의 피해 (코르키 체력:"+Corkihp+", 제드체력: "+zedhp+")");
                    Corkihp = Corkihp - zed;
                    System.out.println("제드 -> 코르키 "+zed+"의 피해 (코르키 체력:"+Corkihp+", 제드체력: "+zedhp+")");
                    rand = (int)(Math.random()*100);
                    try {
                        Thread.sleep(2000); // 2초 대기
                    } catch (InterruptedException e) {
                        // 예외 처리
                    }
                }
        }
    }


}
