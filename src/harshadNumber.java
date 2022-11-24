public class harshadNumber {
    public boolean solution(int x) {
        boolean answer = true;

        String num = String.valueOf(x);
        String[] numbers = num.split("");

        int sum =0;

        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }

        if(x%sum==0){
            return answer;
        } else{
            answer=false;
            return answer;
        }

    }

    public static void main(String[] args) {
        harshadNumber method = new harshadNumber();
        System.out.println(method.solution(18));
    }
}
