import java.util.LinkedList;
import java.util.Queue;

public class gamemapShortcut {

    //위치를 가지고 있을 객체
    class Node {
        private int row;
        private int col;

        //생성자
        private Node(int row, int col) {
            this.row = row;
            this.col = col;
        }

        //getter
        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }
    }

    public int solution(int[][] maps) {
        Queue<Node> q = new LinkedList<>();
        //row 계산을 위해 상우하좌 순서로 지정
        int[] drow = {0, 1, 0, -1};
        //col 계산을 위해 상우하좌 순서로 지정
        int[] dcol = {-1, 0, 1, 0};
        int row = 0;
        int col = 0;
        //초기값을 큐에 저장
        q.offer(new Node(row, col));
        //큐가 없어질때까지 반복
        while (!q.isEmpty()) {
            Node now = q.poll();
            row = now.getRow();
            col = now.getCol();
            //좌표를 계산
            for (int i = 0; i < 4; i++) {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                //다음 좌표가 map 안에 포함되어있고, 다음 위치에 한번도 가지 않았을 경우
                if (
                        nrow >= 0 && nrow < maps[0].length && ncol >= 0 && ncol < maps.length && maps[ncol][nrow] == 1) {
                    //이전까지 온 값을 다음 갈 위치에 누적 합
                    maps[ncol][nrow] = maps[col][row] + 1;
                    //다음 좌표를 큐에 넣음
                    q.offer(new Node(nrow, ncol));
                }
            }
        }
        //maps의 마지막 위치 저장하기
        int answer = maps[maps.length - 1][maps[0].length - 1];
        return answer == 1 ? -1 : answer;
        //마지막 위치에 도착하면 answer 리턴 아니면 -1리턴
    }





    public static void main(String[] args) {
        gamemapShortcut method = new gamemapShortcut();
        int arr[][] = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(method.solution(arr));
    }
}



