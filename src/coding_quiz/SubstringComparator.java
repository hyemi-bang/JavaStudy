package coding_quiz;

public class SubstringComparator {

	/* 
	숫자로 이루어진 문자열 t와 p가 주어질 때, 
	t에서 p와 길이가 같은 부분문자열 중에서, 
	이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수
	
	t="3141592" p="271" 일때 
	t의 길이가 3임으로 : 314, 141,415,159,592
	p보다 작은 수 : 141, 159 2개
	result : 2 출력되야 한다.
	*/
	
	public int substringComparator(String t, String p) {
		// p의 길이를 length에 저장
		// 문자열 t 에서 length 만큼 잘라서 long 타입으로 저장 (int 로 저장하면 값이 작으니 long으로 추출)
		// for문으로 순회하면서 substring 후 p 와 크기 비교 후, 작거나 같으면 count 증가
		
		int count = 0;
		long num = Long.parseLong(p);
		int tLength = t.length();
		int pLength = p.length();
		
		
		for (int i = 0 ; i <= tLength - pLength; i++) {
			long diff = Long.parseLong(t.substring(i, i+pLength));
			if (diff <= num) count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		SubstringComparator sub = new SubstringComparator();
		System.out.println(sub.substringComparator("3141592", "271"));
	}
}
