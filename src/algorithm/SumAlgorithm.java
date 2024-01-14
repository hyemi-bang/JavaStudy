package algorithm;
//[?] n명의 국어점수 중 80점 이상인 점수의 합계
/**
 * 합계 알고리즘(Sum Algorithm) : 주어진 조건과 범위에 해당하는 자료 합계
 */
public class SumAlgorithm {
    
    public static void main(String[] args) {
        //[1] input 입력 : n 명의 국어점수
        int[] scores = {100, 75, 90, 50, 37, 95};
        int sum = 0;
        
        //[2] process 처리 : 합계 알고리즘 영역
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >=80) {
                sum += scores[i];
            }
        }
        //[3] output 출력
        System.out.println(scores.length + "명의 점수 중 80점 이상의 총점:" + sum);

    }

}
