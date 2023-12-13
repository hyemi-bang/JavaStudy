import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D06_Comparator {
	/*
	
	# Comparable
	- 이 인터페이스를 구현한 클래스는 크기 비교가 가능해진다
	
	# Comparator
	- 이 인터페이스를 구현할 클래스는 크기 비교의 기준이 된다
	
	*/

	public static void main(String[] args) {
		
		System.out.println(10 > 20); // false
		
		Grape g1 = new Grape(3300, 33, 10, "대관령", 1);
		Grape g2 = new Grape(4800, 30, 8, "포도농장", 3); 
		// System.out.println(g1 > g2);   기준이 없어서 비교할 수 없음~
	
		System.out.println(g1.compareTo(g2)); // -1
		
		List<Integer> numbers = new ArrayList<>();
		Collections.addAll(numbers, 99, 1,88,-9,13,15,8,3,99,100);		
		Collections.sort(numbers);
		
		System.out.println(numbers);
		
		//List<Peach> peaches = new ArrayList<>();

		//peaches.add(new Peach());
		//peaches.add(new Peach());
		
		// 리스트 정렬을 하기 위해서는 해당 리스트의 내용물이 크기 비교의 기준이 마련되어 있는 객체여야 한다
		//Collections.sort(peaches);
		// The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Peach>)
		// Collections 유형의 메서드 정렬(List)이 인수(List<Peach>)에 적용되지 않았습니다
		
		List<Grape> grapes = new ArrayList<>();
		grapes.add(new Grape(3300, 33, 10, "대관령농장", 1));
		grapes.add(new Grape(3800, 31, 5, "복숭아농장", 3));
		grapes.add(new Grape(2300, 29, 7, "박씨네닭장", 1));
		grapes.add(new Grape(5150, 40, 8, "최가네농장", 5));
		grapes.add(new Grape(6300, 50, 8, "웅이네농장", 2));
		grapes.add(new Grape(3000, 60, 12, "김가네농장", 1));
		
		// Comparable 인터페이스가 구현된 클래스만 sort가 가능하다
		Collections.sort(grapes);
		System.out.println(grapes);
		
		Collections.sort(grapes, new GrapeNameComparator());
		Collections.reverse(grapes);
		
		System.out.println(grapes);
	}

}


class GrapeNameComparator implements Comparator<Grape>{

	@Override
	public int compare(Grape o1, Grape o2) {
		
		if(o1.nunOfFruits == o2.nunOfFruits) {
			return 0;
		} else if(o1.nunOfFruits > o2.nunOfFruits) {
			return 1;
		} else {
			return -1;
		}
	}

}
class Grape implements Comparable<Grape> {
	// The type Grape must implement the inherited abstract method Comparable.compareTo(Object)
	// 제네릭 타입이 있는 인터페이스 (추상메서드가 필요
	int price;
	int color;
	int nunOfFruits;
	int sweet;
	String farm;
	int grade;
	
	public Grape(int price, int nunOfFruits, int sweet, String farm, int grade) {
		this.price = price;
		this.nunOfFruits = nunOfFruits;
		this.sweet = sweet;
		this.farm = farm;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return String.format("[%d/%d/%d/%s/%d] \n", price, nunOfFruits, sweet, farm, grade);
	}
	
	@Override
	public int compareTo(Grape o) {
		// 이곳에서 현재 인스턴스와 전달되는 인스턴스의 비교 결과를 정의한다
		
		// 두 객체의 크기가 같다면 0을 리턴
		// 두 객체 중 현재 객체의 크기가 더 크다면 1을 리턴
		// 두 객체 중 매개변수로 전달받은 객체의 크기가 더 크면 -1 리턴
//		
//		if(this.price == o.price) {
//			return 0;
//		} else if(this.price > o.price) {
//			return 1;
//		} else {
//			return -1;
//		}	
//	}
//	
//	public int compareTo1(Grape o) {
		if(this.grade == o.grade) {
			return 0;
		} else if(this.grade > o.grade) {
			return -1;
		} else {
			return 1;
		}
	}
}
