import java.util.Arrays;

import static java.util.Arrays.fill;

public class elimination {
    public int[] solution(int[] arr) {
        if(arr.length<=1){
        int[] answer = {-1};
        return answer;
        }

        int min = arr[0];

        for(int i=arr.length-1; i>0; i--){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);

        int[] answer = new int[arr.length-1];
        int index=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=min){
            answer[index++]=arr[i];
        }

        }

        return answer;
    }

    public static void main(String[] args) {
        elimination method = new elimination();
        System.out.println(Arrays.toString(method.solution(new int[]{5,6,7,8})));
    }
}
