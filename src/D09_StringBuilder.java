
public class D09_StringBuilder {

	/*
	
	# StringBuilder
	- 문자열을 조립할 때 쓰는 기능들이 모여있는 클래스
	- 문자열 누적연산(+=)을 통해 문자열을 조립하는것보다 속도가 훨씬 빠르다
	- 한번 만들어진 String은 수정이 불가능하다 누적연산을 하게되면 속도가 느려진다.
	
	*/
	
	public static void main(String[] args) {
		
		String str = "";

		str += "a"; // == newString("a");
		str += "b";  // == newString("ab");
		str += "c";  // == newString("abc"); 
		// 실제로는 이렇게 계속 새로운 인스턴스를 만들어 더해준것이다.
		// 즉 속도가 느리다.
		
		System.out.println(str); // abc

		// StringBuilder sb = new StringBuilder(); // >> 빈 문자열("")로 시작
		StringBuilder sb = new StringBuilder("가나다"); // >> "가나다"로 시작을 다르게 할 수도 있다
		
		//append(value) : 문자열의 맨 뒤에 내용 추가, 모든 타입을 다 받을 수 있다
		sb.append("a");
		sb.append("b");
		sb.append("c");
		sb.append("d");
		sb.append("e");
		sb.append("f");
		sb.append(1000);
		sb.append('a');
		
		// insert(index, value) : 원하는 자리에 내용을 추가 할 수 있다.
		sb.insert(1, true);
		sb.insert(2, '@');
		
		// delete(start, end) : start이상, end 미만의 조립 문자열의 원하는 부분을 지운다
		sb.delete(0, 5);
		
		String result = sb.toString();
		System.out.println("문자열조립 : "+ result); // 문자열조립 : e나다abcdef1000a
		
		//reverse() : 조립하던 문자열을 반대로 뒤집는다
		sb.reverse();
		
		String result1 = sb.toString();
		System.out.println("문자열조립 끝! : "+ result1); // 문자열조립 끝! : a0001fedcba다나e
		
		// 이 외에는 . 찍고 그때 그때 확인해봐라~
		
		
	}

}
