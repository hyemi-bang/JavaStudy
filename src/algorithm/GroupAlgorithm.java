package algorithm;

//[?] 컬렉션 형태의 데이터를 특정 키 값으로 그룹화

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * GroupAlgorithm (그룹 알고리즘) : 특정 키 값에 해당하는 그룹화된 합계 리스트 만들기
 */
public class GroupAlgorithm {
    /**
     * 테스트용 레코드 클래스
     */
    public static class Record {
        private final String name;
        private final int quantity;

        public Record(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }
        public int getQuantity() {
            return quantity;
        }
        
    }


    //[0][1]  테스트용 데이터 채우기용 로컬 함수
    public static List<Record> getAll() {
        return Arrays.asList(
            new Record("radio" , 3),
            new Record("tv" , 1),
            new Record("radio" , 2),
            new Record("dvd" , 4)
        );
    }

    //[0][2] 컬렉션 데이터 출력용 로컬 함수
    public static void printData(String message, List<Record> data) {
        System.out.println(message);
        for (Record item : data) {
            System.out.println(String.format("%5s - %d", item.getName(), item.getQuantity()));            
        }
    }



    public static void main(String[] args) {

        //[1] input
        List<Record> records = getAll(); // List of T -> List<~~>, // 입력 데이터
        List<Record> groups = new ArrayList<Record>();
        int N = records.size() ;

        //[2] process : 알고리즘 파트 (SORT -> SUM -> GROUP)
        //[A] 그룹 정렬 sort
        for (int i = 0; i < N - 1; i++) {
            for (int j = i+1; j < N; j++) {
                if (records.get(i).getName().compareTo(records.get(j).getName()) > 0) {  // if문 컬렉션 형태의 데이터
                    // 레코드의 get메서드 사용, i번째 이름과 레코드 j의 getnaeme 과 비교해서 0보다 크다면 두개의 자리를 바꿔라
                    Record t = records.get(i); // t는 레코드는 get(i) 번째에 넣고
                    records.set(i, records.get(j)); // i는 레코드 j번째에 값을 넣고
                    records.set(j,t); // j 번째에는 t (temp)를 넣어라
                } // [1]~~ : dvd -4, radio -2, radio -3, tv -1 [2]~! : blank >>로 출력이 된다.
            }
        }
        //[B] 그룹 소계 >> group algorithm
        int subtotal = 0 ; // 각각의 그룹별 소계
        for (int i = 0; i < N; i++) {
            subtotal += records.get(i).getQuantity(); // 현재(i번째) 레코드의 수량을 읽어와서 더해라
            if ((i+1) == N || //if ((i+1) == N) >> 현재 레코드가 마지막 레코드라면, 
                (records.get(i).getName() != records.get(i+1).getName())) {// || 현재 레코드와 다음 레코드가 나랑 다르다면
                //[!] 다음 레코드가 없거나, 현재 레코드와 다음 레코드가 다르면 저장
                Record r = new Record(records.get(i).getName(), subtotal); // 레코드 개체를 하나 만들어서 get(i)이름을 가져다가 getName 레코드의 첫번째 생성자의 메개번수로 넣어 서브토탈로 소계로 같이 넣어라 (??)
                groups.add(r); //위에거를 여기에 저장시키는것

                subtotal = 0; // 하나의 그룹이 완료되면 소계 초기화
            }
        }

        //[3] output
        printData("[1]정렬된 원본 데이터", records);
        printData("[2]이름으로 그룹화된 데이터", groups);
    }
}