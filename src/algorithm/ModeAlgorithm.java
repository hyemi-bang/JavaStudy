package algorithm;

//[?]주어진 데이터에서 가장 많이 나타난 중복된 값

/**
 * ModeAlgorithm (최빈값 알고리즘) 점수의 인덱스 (0점~100점)의 개수(count)의 최댓값(MAX)
 */
public class ModeAlgorithm {

    public static void main(String[] args) {
        //[1]input (정수/ scores)
        int[] scores ={1,2,3,3,5}; // 0~5점까지만 가정 / 3점값이 2번나왔기에 3이 최빈값이 될 것임 그걸 구하는 것
        int[] indexes = new int[5+1]; //0~5점까지(총 6개) : 점수 인덱스의 카운터, indexes말고 index로 해도 됨
        int mode = 0; // 최빈값이 담길 그릇
        int max = Integer.MIN_VALUE; // 정수가 들어갈 수 있는 가장 작은값 즉, 최대값 들어갈 자리에 최솟값으로 초기화 // 

        //[2]process
        for (int i = 0; i < scores.length; i++) {
            indexes[scores[i]]++; // count
        }
        for (int i = 0; i < indexes.length; i++) {
            if (indexes[i] > max) {
                max = indexes[i];
                mode = i ;
            }
        }
        //[3]output
        System.out.println("최빈값 :" + mode + "이" + max + "번 있습니다.");
    }
}