package lecture_20230305;

import java.util.Scanner;

public class Lecture_8 {
    public static void main(String [] arg){
        Scanner scan = new Scanner(System.in);
        System.out.println("input name: ");
        String name = scan.nextLine();

        System.out.println("input gender: ");
        String gender = scan.nextLine();

        System.out.println("input age: ");
        int age = scan.nextInt();

        System.out.println("input tall: ");
        Double tall = scan.nextDouble();


        String value = gender=="M" ? "남자" : "여자";

        System.out.println("이름 : " + name);
        System.out.println("성별 : " + value);
        System.out.println("나이 : " + age);
        System.out.println("신장 : " + tall);

    }
}





