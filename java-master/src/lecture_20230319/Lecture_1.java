package lecture_20230319;
import java.util.Scanner;
public class Lecture_1 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double num1, num2, result;
            char operator;
            boolean done = false;

            while (!done) {
                // 숫자와 연산자를 입력받음
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = scanner.nextDouble();
                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = scanner.nextDouble();
                System.out.print("연산자를 입력하세요 (+, -, *, / 중 하나): ");
                operator = scanner.next().charAt(0);

                // 연산자에 따라 사칙연산을 수행하고 결과 출력
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println(num1 + " * " + num2 + " = " + result);
                        break;
                    case '/':
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                        break;
                    default:
                        System.out.println("잘못된 연산자입니다.");
                        break;
                }

                // 계속할지 여부를 물어봄
                System.out.print("계속하시겠습니까? (y/n): ");
                char choice = scanner.next().charAt(0);
                if (choice == 'n' || choice == 'N') {
                    done = true;
                }
            }

            scanner.close();
        }
    }


