package lecture_20230319;

import java.util.Scanner;

public class Lecture_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로를 입력하시오 :");
        int a = sc.nextInt();

        System.out.print("세로를 입려하시오 :");
        int b = sc.nextInt();

        for(int i = 0; i<b; i++){
            for(int j = 0; j<a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        if (a == b) {
            System.out.println("정사각형입니다.");
        } else {
            System.out.println("직사각형입니다.");
        }

    }
}
