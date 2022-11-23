import java.util.Scanner;

public class stringControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean answer = true;
        if(s.length() !=4 && s.length() !=6){
            answer = false; //길이가 4와 6이 아니면 false
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)<'0'|| s.charAt(i)>'9'){ //0보다 작거나 9보다 크면 false
                answer = false;
            }
        }
        System.out.println(answer);
    }
}
