public class TriangularOutput {

        public void solution(int star) {
            //star는 피라미드의 층수
            //for문을 사용해서 *입력
            //2의배수에 +1 값이 한층당 *의 수
            //앞의 빈 칸만 만들어 주면 됨

            for (int i = 0; i <star ; i++) {

                for(int blank =1; blank<star-i; blank++) {
                    System.out.print(" "); //빈 칸 출력
                }

                for(int stars =0; stars<2*i+1; stars++){
                    System.out.print("*"); //* 출력; 별의 개수는 홀수
                }

                System.out.println(); //층 바꾸기
            }

        }

        public static void main(String[] args) {
            TriangularOutput method = new TriangularOutput();
            int star = 5;
            method.solution(star);
        }
    }

