import java.util.Arrays;

public class backwardNumbers {
        public int[] solution(long n) {

            String s = String.valueOf(n);
            String[] arr = s.split("");

            int[] answer = new int[arr.length];
            for(int i=0; i<arr.length; i++){
                answer[i] =Integer.parseInt(arr[arr.length-1-i]);
            }


            return answer;
        }

    public static void main(String[] args) {
        backwardNumbers method = new backwardNumbers();
        System.out.println(Arrays.toString(method.solution(12345)));

    }
}
