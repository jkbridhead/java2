package lecture_20230226;

import java.util.Scanner;

public class Lecture_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number<0 || 100<number){
            System.out.print("입력오류!!");
        }else{
            System.out.print(number);
        }
        // 문제 7번
    }
}
