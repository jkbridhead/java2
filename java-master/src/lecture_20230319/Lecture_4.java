package lecture_20230319;

public class Lecture_4 {
    public static void main(String[] args) {
        for(int hour = 0; hour < 24; hour++) {
            int minute = 0;
            while (minute < 60) {
                System.out.printf("%02d:%02d\n", hour, minute);
                minute++;
            }
        }
    }

}
