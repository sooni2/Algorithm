import java.util.concurrent.LinkedTransferQueue;

public class primeNumbers {

    public String solution(String s) {
        String answer = "";
        //1은 소수가 아니다
        //2를 제외한 짝수도 소수가 아니다.
        //제곱근(sqrt) 범위 나누기법이란?
        //소수 여부를 검사할 수에 대해서 그 값의 제곱근을 기준으로 그 곱은 대칭적으로 곱이 일어나므로 
        //제곱근 이하의 작은 값까지만 검사를 하면 나머지는 검사를 할 필요가 없다는 방법으로 검사할 데이터를 제곱근 개 이하로 줄 일 수 있는 방법

        //소수 중 최대값
        //소수가 아닌 수 중 최소값 

        int primeMax = 0;
        int nonPrimeMin = Integer.MAX_VALUE;

        String[] numbers = s.split(" "); //

        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (numbercheck(num)) {
                if (num > primeMax) {
                    primeMax = num;
                }
            } else {
                if (num < nonPrimeMin) {
                    nonPrimeMin = num;
                }
            }
        }
        return nonPrimeMin + " " + primeMax;
    }

    private boolean numbercheck(int num) {
        //1이하는 소수가 아님
        if (num <= 1)
            return false;
        //2는 소수지만 2로 나누어지는 수는 소수가 아님
        if (num % 2 == 0)
            return num == 2;

        //3부터 소수 검사; 제곱근 이하의 수로 나누어지면 소수
        for (int i = 3; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        primeNumbers method = new primeNumbers();
        String s = "97 75 88 99 95 92 73";
        System.out.println(method.solution(s));
    }
}

