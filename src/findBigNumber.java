public class findBigNumber {
        // 5x5 2차원 배열이 주어질 때 어떤 원소가 상하좌우에 있는 원소보다 클 때
        // 해당 위치에 * 을 표시하는 프로그램을 작성하세요.
        // 경계선에 있는 수는 상하좌우 중 존재하는 원소만을 비교합니다.
        // [0][0] 일 때, [0][1]과 [2][0]과 비교; 첫번째 수는 우,하 만 비교, 두번째 행부터 상빼고 비교
        // [1][2] 일 때, [1][1], [1][3], [0][2], [2][2] 와 비교
        // [i][j] 일 때, [i][j-1], [i][j+1], [i-1][j], [i+1][j] 와 비교한다.

        public void solution(int[][] arr1) {
            String[][] answer = new int[5][5];

            int[][] check = new int[5][5];

            for (int i = 0; i < arr1.length-1; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    if (becomingstar(arr1, i, j)) {
                        answer[i][j] = "*";
                    } else {
                        answer[i][j] = String.valueOf(arr1[i][j]);
                    }
                    System.out.println();
                }
            }

            private static boolean becomingstar( int[][] arr, int i, int j){
                int row = i;
                int col = j;

                //상 [i-1][j]
                if (row > 0) {
                    if (arr[row][col] > arr[row - 1][col]) {
                        return true;
                    }
                }

                //하
                if (row < arr.length - 1) {
                    if (arr[row][col] > arr[row + 1][col]) {
                        return false;

                        //좌

                        //우


                    }

                }
            }
        }

        public static void main(String[] args) {
            findBigNumber method = new findBigNumber();
            int[][] arr1 = {{7,4,6,5,9}, {6,1,3,4,5}, {4,8,5,6,9}, {1,3,0,6,4}, {6,4,8,1,7}};

            method.solution(arr1);
        }
    }

