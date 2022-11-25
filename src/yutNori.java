public class yutNori {
    public String solution(int[] arr1) {
        //문제: 우리나라 고유의 윷놀이는 네 개의 윷짝을 던져서 배(0)와 등(1)이 나오는 숫자를 세어 도, 개, 걸, 윷, 모를 결정합니다.
        // 네 개 윷짝을 던져서 나온 각 윷짝의 배 혹은 등 정보가 주어질 때
        // 도(배 1개, 등 3개), 개(배 2개, 등 2개), 걸(배 3개, 등 1개), 윷(배 4개), 모(등 4개) 중
        // 어떤 것인지를 결정하는 프로그램을 작성하세요.

        //0(배)의 개수에 따라서 정해진다. 도, 개 , 걸, 윷, 모

        String answer = "";
        int bae =0;

        for(int i=0; i<arr1.length; i++){
            if (arr1[i]==0){
                bae++;
            }

        if(bae==0){
             answer = "모";
        }
        if(bae==1){
            answer = "도";
        }
        if(bae==2){
            answer = "개";
        }

        if(bae==3){
            answer = "걸";
            }

        if(bae==4){
            answer = "윷";
            }

        }

        return answer;

    }

    public static void main(String[] args) {
    yutNori method = new yutNori();
    int[] s = {1,0,0,0};
        System.out.println(method.solution(s));




    }
}
