package lecture_20230403;
import java.util.Random;
public class test {

        public static void main(String[] args) {
            int[] arr = new int[5];
            Random rand = new Random();
            int index = 0;

            while (index < arr.length) {
                int num = rand.nextInt(5);

                boolean duplicate = false;
                for (int i = 0; i < index; i++) {
                    if (arr[i] == num) {
                        duplicate = true;
                        break;
                    }
                }

                if (!duplicate) {
                    arr[index] = num;
                    index++;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

