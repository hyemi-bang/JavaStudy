package Algorithm.SumAlgorithm;
//[?] 1부터 20까지 정수 중 홀수의 합을 구하는 프로그램

/** 등차수열(Arithmetic Sequnece) : 연속하는 두 수의 차이가 일정한 수열
 */
public class ArithmeticSequnece {
    public static void main(String[] args) {
        //[1] input
        int sum = 0; //SUM 알고리즘의 핵심기능, 0으로 초기회 시키는것

        //[2] process
        for (int i = 1; i <= 20; i++) { //범위
            if (!(i % 2 == 0)) { // 필터링을 통해서 홀수만 구하는 방법 //if (i % 2== 0 짝수 / == 1 홀수 // !=0 홀수) ! not연산자
                sum += i;
                System.out.print(i + " "); // Sequence
            }
        }
        //[3] output
        System.out.println("\n1부터 20까지의 합 :" + sum);
    }
    
}

