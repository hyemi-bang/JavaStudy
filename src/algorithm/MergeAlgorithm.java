package algorithm;

//[?] 2개의 정수 배열 합치기, 2개의 배열은 오름차순으로 정렬되어 있다고 가정

/**
 * MergeAlgorithm (병합 알고리즘) : 오름차순으로 정렬되어 있는 정수 배열을 하나로 병합
 */
public class MergeAlgorithm {

    public static void main(String[] args) {

        //[1] input // 2개의 배열을 선언함
        int[] first = {1, 3, 5}; // 정수형 배열을 first라는 이름으로 선언, 오름차순으로 정렬되어있음
        int[] second = {2, 4}; // 정수형 배열을 second 라는 이름으로 선언
        int M = first.length; int N = second.length;
        int[] merge = new int[M + N]; // 병합된 배열 /// 뉴 정수형 배열을 선언한다, [M+N]이름으로. 머지라는 이름의 배열에다, 위에 두개의 크기만큼 담을거야
        int i =0; int j =0; int k =0; //i,j,k 관행

        //[2] process // 머지알고리즘은 while 구문 3개 나옴
        while(i < M && j < N) { // 둘 중 하나라도 배열의 끝에 도달할 떄까지 반복 // 공식임
            if (first[i] < second[j]) { // 작은 값을 merge 배열에 저장
                merge[k++] = first[i++];
            }
            else{
                merge[k++] = second[j++];
            }
        }
        while (i<M) {// 첫번째 배열의 끝까지 도달할 때까지
            merge[k++] = first[i++];
        }
        while (j<N) {// 두번째 배열의 끝까지 도달할 때까지
            merge[k++] = second[j++];
        }

        //[3] output
        for (int item : merge) {
            System.out.println(item+ "");
        }
        System.out.println();
    }
}