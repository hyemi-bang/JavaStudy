package algorithm;

//[?] 지정범위 데이터의 순위를 구하는 로직

/*
 * 순위 rank 알고리즘 : 점수에 대한 순위 구하기
 */

public class RankAlgoritm {
    public static void main(String[] args) {
        //[1] input :: 배열, 자료구조 영역
        int[] scores = { 90, 87, 100, 99, 94, 80 };
        int[] rankings = { 1, 1, 1, 1, 1, 1 }; // 모두 1로 초기화 시켜놔 주는 것

        //[2] process
        for (int i = 0; i < scores.length; i++) {
            rankings[i] = 1; // 순위 배열을 매 회전마다 1등으로 초기화 하는 핵심적인 내용임
            for (int j = 0; j < scores.length; j++) {
                if (scores[i] < scores[j]) { // 현재 [i]와 나머지 [j]들을 비교하는 비교문
                    rankings[i]++; // 랭크알고리즘 ( 나보다 큰 점수 나오면, 순위 1 증가)
                }
            }
        }
        //[3] output :: 콘솔로 공부하고 있지만, 웹 데스크탑 모바일 환경 , 서비스 환경이 되는 것임.
        for (int i = 0; i < scores.length; i++) {
            
            System.out.println(String.format("%3d점 : %1d등", scores[i], rankings[i]));
        }
    }
}
