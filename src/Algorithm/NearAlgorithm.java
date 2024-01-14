package Algorithm;
//[?] near  , 원본 데이터중 대상 데이터와 가장 가까운 값을 구하기

/**
 * NearAlgorithm 근삿값 알고리즘, 3가지의 로직이 혼합된 형태
 * 차잇값을 먼저 구한 후 그거의 절댓값의 취해서 최솟값 구하기. 
 */
public class NearAlgorithm {
    //[0] 절댓값 구하기, 로컬함수
    public static int Abs(int number) {
        return (number < 0) ? -number : number;
    }

    public static void main(String[] args) {
        //[1]Initialize
        int min = Integer.MAX_VALUE; // 차잇값 절대값 최솟값 담길 그릇

        //[2]Input
        int[] numbers = { 10, 20, 30, 31, 27, 17, 33 };
        int target =25; // 타켓과 가까운 값
        int near = 0; // 가까운 값 

        //[3]Process
        for (int i = 0; i < numbers.length; i++) {
            int abs = Abs(numbers[i] - target); // 차잇값의 절댓값
            if (abs < min) {
                min =  abs; // 최솟값 알고리즘
                near = numbers[i];  // 차잇값의 절대값이 최솟값일 떄 값
                
            }
        }
        //[4]output
        System.out.println(target + "과 가장 가까운 값: " + near + "(차이: "+ min +")" );
        
    }
}