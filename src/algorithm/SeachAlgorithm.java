package algorithm;

//[? 정렬되어 있는 데이터를 이진 검색(이분탐색)을 사용하여 반씩 나눠 검색

/**
 * SeachAlgorithm // (검색알고리즘) : 주어진 데이터에서 특정 데이터 찾기
 */
public class SeachAlgorithm {

    public static void main(String[] args) {
        
        //[1] input : 데이터 자료구조
        int[] data = { 1, 3, 5, 7, 9}; // 오름차순 정렬되어있다고 가정
        int N = data.length; // 의사코드로 n만큼 반복하자
        int search =3;// 검색할 데이터를 3으로 넣기
        boolean flag = false; // 찾으면 true, 찾지못하면 false
        int index = -1; // 배열에서 찾은 위치

        //[2] process : 검색알고리즘, 이진검색 (Binary Search) : Full Scan 대신 Index Scan 개념으로 
        int low = 0; // min index
        int high = N - 1; // max index
        while (low <= high) { // 이진알고리즘의 핵심부분
            int mid = (low + high) / 2; // 중간 인덱스 구하는 부분
            if (data[mid] == search) { // 만약에 데이터 중간값이 내가 찾는 값이냐? 
                flag = true; index = mid; break; // 맞으면 트루, 인덱스 미드값 기억하며 현재 인덱스를 빠져나간다.
            }
            if (data[mid] < search) {
                low = mid + 1;       // 찾을 데이터가 크면 오른쪽으로 이동        
            }
            else{
                high = mid - 1;     // 찾을 데이터가 작으면 왼쪽 영역으로 이동
            }
        }

        //[3] output :콘솔
        if (flag) {
            System.out.println(search + "를" + index + "위치에서 찾았습니다.");
        }
        else {
            System.out.println("찾지 못했습니다.");
        }

    }
}