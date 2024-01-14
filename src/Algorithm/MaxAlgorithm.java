package Algorithm;

//[?] 주어진 데이터 중 가장 큰 값
//* MAX 최댓값 알고리즘, : (주어진 범위+ 주어진 조건) 자료들의 가장 큰 값

public class MaxAlgorithm {
    public static void main(String[] args) {
        //[1] initilize
        int max = Integer.MIN_VALUE; //정수형식의 데이터 중 가장 작은 값으로 초기화

        //[2] input
        int[] numbers ={ -2, -3, -5, -7, -9, -1, 0, 5, 8 };

        //[3] process :: MAX
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // max 더 큰 값으로 할당
            }
        }
        //[4] output
        System.out.println("최댓값: "+ max);
    }
    
}