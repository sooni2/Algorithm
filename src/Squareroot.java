public class Squareroot {
    public long solution(long n) {
        long answer = 0;
        long x = 0;
        x = (long) Math.sqrt(n);
        if(x*x ==n){
            answer = (x+1)*(x+1);
        } else {
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Squareroot method = new Squareroot();
        System.out.println(method.solution(121));
    }
}
