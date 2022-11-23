public class weirdo {

    public String solution(String s) {
        String answer = "";

        String[] word = s.split(""); //s를 한글잘씩 잘라 word 배열에 담습니다.
        int index = 0;         //홀수, 짝수를 나타나기 위한 index 변수입니다.
        int length = word.length; //word 배열의 길이

        for (int i = 0; i < length; i++) {
            if (word[i].equals(" ")){
                word[i] = " ";
                index = 0;
            }else {
                if (index % 2 != 0) {
                    word[i] = word[i].toLowerCase();
                    index++;
                } else if (index % 2 == 0) {
                    word[i] = word[i].toUpperCase();
                    index++;
                }
            }
            answer = answer + word[i];
        }
        return answer;
    }




    public static void main(String[] args) {
        weirdo method = new weirdo();
        System.out.println(method.solution("I love a pizza"));
    }
}
