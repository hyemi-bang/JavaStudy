package Algorithm;

//[?] 주어진 데이터 중 가장 작은 '짝수' 값 구하기

/**
 * MinAlgorithm / 최솟값 알고리즘 : 필터링(주어진 범위,조건)의 자료들의 가장 작은 값
 */
public class MinAlgorithm {

    public static void main(String[] args) {
        //[1] initialize
        int min = Integer.MAX_VALUE; // 정수형 데이터 중 가장 큰 값으로 초기화

        //[2] input 
        int[] numbers ={ 1,3,5,7,2 }; // 이진수표현+숫자 구분자 사용시 -> 7= 0b0111, 1=0b0000_0001

        //[3] process
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min && numbers[i] % 2 ==0) {                
                min = numbers[i]; //  더 작은 값으로 할당
                
            }
        }
        //[4] output
        System.out.println("짝수 최솟값: " + min);

        //[5] dispose (마무리 단계)
        
    }
}