package algorithm;
//[?] n명의 점수 중 80~95점 이하의 평균 (80~95 합계랑 개수 구한 후 나누기)
    //**평균알고리즘 : 주어진 범위에 주어진 조건에 해당하는 데이터들의 평균

public class AverageAlgorithm {

        public static void main(String[] args) {
        //[1]  input : n명의 성적
        int[] date = {90, 88, 65, 78, 50, 95};
        int sum = 0; //합계 알고리즘
        int count = 0; // 개수 알고리즘

        //[2]  process : avg = sum / count
        for (int i = 0; i < date.length; i++) {
            if (date[i] >= 80 && date[i] <= 95) {
                sum += date[i];
                count++;
            }
        }

        double avg = sum /(double)count ;


        //[3]  output
        System.out.println("80점 이상 95점 이하인 자료의 평균 :" + avg);
    }
}
