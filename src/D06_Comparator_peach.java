
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D06_Comparator_peach {
	
	static int compareGrade(String g1, String g2) {
		char firstCh1 = g1.charAt(0);
		char firstCh2 = g2.charAt(0);
		
		if(firstCh1 == firstCh2) {
			int len1 = g1.length();
			int len2 = g2.length();
			
			if(len1 == len2) {
				return 0;
			} else if (len1 > len2) {
				return 1;
			} else {
				return -1;	
			}
					
		} else if(firstCh1 > firstCh2) {
			return -1;
		} else {
			return 1; 
		}
	}
	

	public static void main(String[] args) {

		List<Peach> peaches = new ArrayList<>();
		Collections.addAll(peaches,
				new Peach(5000, 3.33, "A+", "김농장"),
				new Peach(2000, 4.38, "B", "감농장"),
				new Peach(2500, 2.63, "C", "배농장"),
				new Peach(3800, 7.77, "D", "배농장"),
				new Peach(2100, 5.11, "B", "웅농장"),
				new Peach(4300, 4.63, "B+", "웅농장"));
		

		// 복숭아를 정렬하면 기본적으로 무게를 기준으로 내림차순 정렬
		Collections.sort(peaches);
		System.out.println(peaches);

		System.out.println();

		
		// 복숭아를 등급 기준으로 오름차순 정렬, 등급이 같은 경우 가격 기준 내림차순 정렬
		peaches.add(new Peach(4900, 3.83, "A+", "상상농장"));
		peaches.add(new Peach(3300, 2.53, "A", "상상농장"));
		
		Collections.sort(peaches, new Comparator<Peach>() {

			@Override
			public int compare(Peach o1, Peach o2) {
				// 사전상으로 A , A+ 일때 A+가 뒤에 나옴으로 사전상으로 정렬하여 오름/내림차순 보면 우리가 원하는대로 나오지 않는다
				
				int result = compareGrade(o1.grade, o2.grade);  // 등급
				if (result == 0) {
		            // 등급이 같은 경우에만 가격 비교
		            return Double.compare(o2.price, o1.price);
		        } else {
		            return result;
		        }
			}
			
		});
		
		
		System.out.println("##연습문제 3번##등급 기준으로 오름차순##등급같으면 가격기준 내림차순##");
		System.out.println(peaches);
		// 생성자 뒤에 바로 {}만들어서 익명 클래스만들수 있다
		// 익명 내부 지역 클래스로 Comparator 상속 받아서 만들기
		// 즉석에서 만들어 사용하고 다시 사용하지 않을때

		// 복숭아를 농장이름 오름차순으로 정렬, 같은 농장인 경우 등급 기준으로 오름차순 정렬
		// 스트링도 컴페어러블 인터페이스가 정렬되어있기 떄문에 String에도 compareto() 사용할 수 있다
		peaches.add(new Peach(4300, 4.13, "C", "웅농장"));
		peaches.add(new Peach(4300, 2.05, "C+", "웅농장"));
		peaches.add(new Peach(2800, 3.10, "C+", "웅농장"));
		peaches.add(new Peach(2100, 2.13, "C", "웅농장"));
		
		
		Collections.sort(peaches, new Comparator<Peach>() {
			
			
			@Override
			public int compare(Peach o1, Peach o2) {
				int result1 = o1.farm.compareTo(o2.farm);
				
				if(result1 == 0) {
					return compareGrade(o2.grade, o1.grade);
				} else {
					return result1;
				}
			}
			
		});
		System.out.println("##4번문제##농장이름 오름차순으로 정렬, 같은 농장인 경우 등급 기준으로 오름차순##");
		System.out.println(peaches);
	}
}


// 복숭아 클래스는 가격, 등급(A+,A,B+,B,C+,C,D...), 무게, 농장이름 필드값을 가지고 있다
class Peach implements Comparable<Peach> {
	
	int price;
	double weight;
	String grade;	
	String farm;

	public Peach(int price, double weight, String grade,  String farm) {
		this.price = price;
		this.weight = weight;
		this.grade = grade;
		this.farm = farm;
	}

	@Override
	// 복숭아를 정렬하면 기본적으로 무게를 기준으로 내림차순 정렬
	// Integer, Double, String 등은 이미 Comparable이 구현된 클래스이다.
	public int compareTo(Peach o) {
		return Double.compare(o.weight,this.weight); 
		// 오른쪽이 더 클때 해서, 내림차순으로 정렬
		// Double.compare F3눌러서 설명 확인~
		// if(){}문에서 중괄호에 들어가는게 한줄 이면 중괄호 없이 하기도 한다~
	}

	@Override
    public String toString() {
        return String.format("[%d/%.2f/%s/%s]\n", price, weight, grade, farm);
    }
}
