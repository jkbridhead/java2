package lecture_20230423;

import java.util.Scanner;

public class lol1 {
    public static void main(String[] args) {
        System.out.println("페이커님의 포지션은 미드이고 야스오를선택했습니다.");
        System.out.println("페이커의 기본공격은 100입니다.");
        System.out.println("상대 캐릭터 탈론의 체력은 1000입니다.");
        Scanner sc = new Scanner(System.in);
        System.out.println("아이템을 선택하세요.");
        String i = sc.nextLine();
        int hp = 1000;
        switch (i){
            case "도란검":
                while (0<=hp){
                    hp = hp-105;
                    if(hp<=0){
                        hp = 0;
                        System.out.println("공격을 시작합니다. 적에게 준 피해량 105, 탈론의 남은 체력 "+hp+". 탈론이 죽었습니다.");
                        break;
                    }
                    System.out.println("공격을 시작합니다. 적에게 준 피해량 105, 탈론의 남은 체력 "+hp);
                }
                System.out.print("승리");
               break;
            case "도란링":
                while (0<=hp){
                    hp = hp-101;
                    if(hp<=0){
                        hp = 0;
                        System.out.println("공격을 시작합니다. 적에게 준 피해량 101, 탈론의 남은 체력 "+hp+". 탈론이 죽었습니다.");
                        break;
                    }
                    System.out.println("공격을 시작합니다. 적에게 준 피해량 101, 탈론의 남은 체력 "+hp);
                }
                System.out.print("승리");
                break;
            case "도란방패":
                while (0<=hp){
                    hp = hp-90;
                    if(hp<=0){
                      hp = 0;
                          System.out.println("공격을 시작합니다. 적에게 준 피해량 90, 탈론의 남은 체력 "+hp+". 탈론이 죽었습니다.");
                        break;
                    }
                    System.out.println("공격을 시작합니다. 적에게 준 피해량 90, 탈론의 남은 체력 "+hp);
                }
                System.out.print("승리");
                break;
            case "신발":
                while (0<=hp){
                    hp = hp-100;
                    if(hp<=0){
                        hp = 0;
                        System.out.println("공격을 시작합니다. 적에게 준 피해량 100, 탈론의 남은 체력 "+hp+". 탈론이 죽었습니다.");
                        break;
                    }
                    System.out.println("공격을 시작합니다. 적에게 준 피해량 100, 탈론의 남은 체력 "+hp);
                }
                System.out.print("승리");
                break;

        }
    }
}
