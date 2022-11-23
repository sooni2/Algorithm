public class addNumbers {
    public int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        String[] add = num.split("");
        for(int i=0; i<add.length; i++){
            answer += Integer.parseInt(add[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        addNumbers method = new addNumbers();
        System.out.println(method.solution(123));
    }
}
