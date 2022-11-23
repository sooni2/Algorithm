import java.util.Arrays;

public class descendingOrder {

        public long solution(long n) {
            long answer = 0;
            String str = String.valueOf(n);
            String[] nums = str.split("");
            Arrays.sort(nums); //[1,1,2,3,7,8]
            long[] num = new long[nums.length];
            for(int i=0; i<nums.length; i++){
                num[i]= Long.parseLong(nums[nums.length-1-i]);
            }

            String almostanswer = "";
            for(int i=0; i<num.length;i++){
                almostanswer += num[i];
            }
            answer = Long.parseLong(almostanswer);
            return answer;
        }


    public static void main(String[] args) {
        descendingOrder method = new descendingOrder();
        System.out.println(method.solution(118372));
    }
}
