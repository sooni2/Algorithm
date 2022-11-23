import java.util.Arrays;
import java.util.Scanner;

public class py {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int p =0;
        int y =0;
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='p'|| arr[i]=='P'){
                p++;
            }
        }
        System.out.println(p);
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='y'|| arr[i]=='Y'){
                y++;
            }
        }
        System.out.println(y);
        boolean answer = true;
        if(p==y){
            answer = true;
        }else{
            answer = false;
        }
        System.out.println(answer);
    }
}
