import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class thefinalday {

        public String solution(int month, int day) {
            String answer = "";

            LocalDate date = LocalDate.of(2022, month, day);
            LocalDate newDate = date.plusDays(98);
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M월 dd일");

            answer = dateTimeFormatter.format(newDate);

            return answer;
        }

        public static void main(String[] args) {
            thefinalday method = new thefinalday();
            System.out.println(method.solution(1, 18));
        }

}
