package lecture_20230403;

import java.util.*;
import java.util.Random;
import java.util.ArrayList;


public class lol {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("파티원 수를 정해주세요. ");
            int party = scan.nextInt();

            System.out.println("게임을 선택해주세요");
            System.out.println("1.일반게임");
            System.out.println("2.랭크게임");
            System.out.println("3.우르프");
            System.out.println("4.단일챔피언");
            System.out.println("5.Ai");
            Scanner sc = new Scanner(System.in);
            String mod = sc.nextLine();

            switch (mod) {
                case "일반게임":
                    System.out.println("일반게임을 선택했습니다.");
                    System.out.println("일반게임을 일반게임을 매칭을 하겠습니다..............");
                    try {
                        Thread.sleep(1000); // 1초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("게임이 매칭되었습니다.");
                    break;
                case "랭크게임":
                    System.out.println("랭크게임을 선택했습니다.");
                    System.out.println("랭크게임을 일반게임을 매칭을 하겠습니다..............");
                    try {
                        Thread.sleep(1000); // 1초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("게임이 매칭되었습니다.");
                    break;
                case "우르프":
                    System.out.println("우르프을 선택했습니다.");
                    System.out.println("우르프을 일반게임을 매칭을 하겠습니다..............");
                    try {
                        Thread.sleep(1000); // 1초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("게임이 매칭되었습니다.");

                    break;

                case "단일챔피언":
                    System.out.println("단일챔피언을 선택했습니다.");
                    System.out.println("단일챔피언을 일반게임을 매칭을 하겠습니다..............");
                    try {
                        Thread.sleep(1000); // 1초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("게임이 매칭되었습니다.");
                    break;

                case "ai": case "AI": case "Ai":
                    System.out.println("Ai을 선택했습니다.");
                    System.out.println("Ai을 매칭을 하겠습니다..............");
                    try {
                        Thread.sleep(1000); // 1초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("게임이 매칭되었습니다.");
                    break;
            }

            Random rand = new Random();
            int randomNumber = rand.nextInt(2)+1 ;
            switch (randomNumber){
                case 1:
                    System.out.println("팀진영은 블루팀입니다.");
                    try {
                        Thread.sleep(1000); // 1초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("팀진영은 레드팀입니다.");
                    try {
                        Thread.sleep(1000); // 1초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }





            ArrayList<String> position = new ArrayList<>();
            position.add("미드");
            position.add("탑");
            position.add("정글");
            position.add("원딜");
            position.add("서폿");


            int randomNumber2 = rand.nextInt(position.size()); //배열의 크기만큼 난수 생성

            System.out.println("페이커님의 포지션은 "+ position.get(randomNumber2)+ "입니다.");

            position.remove(randomNumber2); // 배열 삭제




            for(int a = 1 ; a <= party; a++){
                randomNumber2 = rand.nextInt(position.size());
                System.out.println("파티원" + a + "의 포지션은 " + position.get(randomNumber2) + "입니다.");
                position.remove(randomNumber2);

            }

            for(int a = 1 ; a <= 4-party; a++){
                randomNumber2 = rand.nextInt(position.size());
                System.out.println("외부인" + a + "의 포지션은 "+ position.get(randomNumber2)+ "입니다.");
                position.remove(randomNumber2);

            }

        }
    }





