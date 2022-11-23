import java.time.LocalDate;
import java.util.Scanner;

public class year_2016 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        String answer = "";
        LocalDate date = LocalDate.of(2016, a,b);
        System.out.println(date); // 2016-5-24
        answer = date.getDayOfWeek().toString(); //요일은 String 타입으로 변환해야한다.
        System.out.println(answer); // TUESDAY
        System.out.println(answer.substring(0,3)); //.substring 메서드 사용해서 앞 3글자만 출력
    }
}
