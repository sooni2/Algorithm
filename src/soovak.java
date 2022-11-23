import java.util.Scanner;

public class soovak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        String answer = "";
        n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                answer +='수';
            } else{
                answer +='박';
            }
        }
        System.out.println(answer);
    }
}
