package Algorithm;

//[?] n개의 정수 중 13 배수의 개수

/**
 * CountAlogrithm // 개수 알고리즘 : 주어진 범위, 조건에 해당하는 자료 개수
 */
public class CountAlgorithm {

    public static void main(String[] args) {
        //[1] input : 1~n까지 데이터
        int[] numbers = { 11, 12, 13, 26, 13, 39, 13, 17, 18, 19 };
        int count = 0; // 변수 0으로 초기화 시키기

        //[2] process : 개수 알고리즘 필터링
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 13 == 0) {
                // count = count + 1; // count+= 1;
                count++;
            
            }
        }

        //[3] output
        System.out.println(numbers.length + "개의 정수 중 13의 배수의 개수: " + count);
    }
}