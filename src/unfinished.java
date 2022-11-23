import java.util.Arrays;

public class unfinished {
    public static void main(String[] args) {
        String [] participant ={"marina", "josipa", "nikola", "vinko", "filipa"};
        String [] completion = {"josipa", "filipa", "marina", "nikola"};
        String answer ="";

        Arrays.sort(participant);
        System.out.println(Arrays.toString(participant));
        Arrays.sort(completion);
        System.out.println(Arrays.toString(completion));

        for(int i =0; i< completion.length;i++){
            if(!(participant[i].equals(completion[i]))){
                answer = participant[i];
                break;
            }else{
                answer = participant[i+1];
            }

        }
        System.out.println(answer);
    }
}
