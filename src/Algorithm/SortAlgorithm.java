package Algorithm;

//[?] 무작위 데이터를 순서대로 정렬 (오름차순or 내림차순)

/**
 * SortAlgorithm(정렬알고리즘) : 왼쪽에서 부터 가장 작은 or 큰 데이터로 정렬
 */
public class SortAlgorithm {

    public static void main(String[] args) {
        //[1] input : Data Structure (Array, List, Queue, Tree, DB ...)
        int[] data ={3, 2, 1, 5, 4};
        int N = data.length; // 의사코드(슈도코드) 형태로 알고리즘 표현하기 위함 'N'
        
        //[2] process : Selction Sort :선택정렬 알고리즘
        for (int i = 0; i < N -1; i++) { // i = 0 to N -1
            for (int j = i + 1; j < N; j++) { //j = i + 1 to N
                if (data[i] > data[j]) { // 부등호 방향 : 오름차순 > , 내림차순 <
                    int temp = data[i]; 
                    data[i] = data[j];
                    data[j] = temp; // int temp~ ~=temp :: SWAP
                }               
            }           
        }
        //[3] output : Console, Desktop, Web, Mobile...
        for (int i = 0; i < N; i++) {
            System.out.println(data[i] + "\t");            
        }
        System.out.println();
    }
}