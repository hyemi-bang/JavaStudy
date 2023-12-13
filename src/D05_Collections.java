import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D05_Collections {

	/*
	 # java.util.colletions
	 
	 - 컬렉션을 편하게 다룰 수 있는 메서드들을 모아놓은 클래스
	 
	*/
	
	public static void main(String[] args) {
		
		int[] arr1 = new int[10];
		
		//Arrays.fill(arr, value) : 전달한 배열을 해당 값으로 초기화 한다
		
		Arrays.fill(arr1, 100);
		
		System.out.println(Arrays.toString(arr1));
		
		// Arrays.sort(arr) : 배열의 모든 값을 크기순으로 정렬한다
		
		
		arr1[5] = -99;
		arr1[2] = 30;
		arr1[9] = 30;
		Arrays.sort(arr1);
		
		System.out.println("정렬 후 : "+Arrays.toString(arr1));
		
		// Arrays.binarySearch(arr, value) : 정렬 후 원하는 값의 인덱스를 찾아 반환한다

		System.out.println("찾은 위치 : " + Arrays.binarySearch(arr1, 30));
		// 찾은 위치 : -1 >> 찾지 못함을 의미
		// binarySearch은 이진 검색 알고리즘을 사용하여 지정된 값에 대해 지정된 int 배열을 검색한다.
		
		//Arrays.copyOf(arr, newLength)
		//전달한 배열의 복사본을 만들어주는 메서드. 새로운 길이를 설정할 수 있다.
		int[] arr2 = Arrays.copyOf(arr1, 20);
		
		System.out.println(Arrays.toString(arr2));
		//[-99, 30, 30, 100, 100, 100, 100, 100, 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		
		// Arrays.compare(arr1, arr2) : 두 배열의 크기를 비교해준다
		// 배열크기 비교시 가장 앞에 있는 값이 우선순위가 높다
		// 왼쪽 배열이 더 크면 1, 오른쪽 배열이 더 크면 -1, 두 배열이 완전히 같으면 0을 리턴한다
		int[] stu1 = {100, 80, 90};
		int[] stu2 = {100, 88, 99};
		
		System.out.println(Arrays.compare(stu1, stu2)); // 1
		
		// Collections.addAll(Collection, values....)
		// 해당 컬렉션에 여러개의 값을 한번에 추가할 때 사용한다
		
		List<Integer> numList = new ArrayList<>();
		Set<String> animalSet = new HashSet<>();
		
		Collections.addAll(numList, 60, 20, 30, 99, 1, 60);
		Collections.addAll(animalSet, "monkey", "lion", "whale", "tiger");
		
		System.out.println(numList);
		System.out.println(animalSet);
		
		//Collections.sort(List) : 전달한 리스트를 크기순으로 정렬해준다
		//set은 정렬할 수 없기 때문에 정렬된 모습을 보고 싶다면 리스트로 만들어서 정렬해야한다.
		List<String> animalList = new ArrayList<>(animalSet);
		 
		Collections.sort(numList);
		Collections.sort(animalList);
		
		System.out.println("정렬 후: "+ numList); // 정렬 후: [1, 20, 30, 60, 60, 99]
		System.out.println(animalSet); // [monkey, whale, tiger, lion]
		
		// Collections.shuffle(List) : 전달한 리스트의 순서를 섞는다
		// Set은 불가능
		Collections.shuffle(numList);
		System.out.println("섞은 후 :" + numList); // 섞은 후 :[60, 20, 1, 60, 30, 99]
		
		// Collections.fill(List, value) : 전달한 리스트의 값을 초기화 (set불가)
		Collections.fill(numList, 0);
		System.out.println("0으로 채운 후 :" + numList); // 0으로 채운 후 :[0, 0, 0, 0, 0, 0]
		
		// Collections.frequency(Collection, value)
		// 해당 값이 몇 번 나오는지 세준다
		
		int pigCount = Collections.frequency(animalSet, "pig");
		int monkeyCount = Collections.frequency(animalSet, "monkey");
		int zeroCount = Collections.frequency(numList, 0);
		
		System.out.println("pig 나온 수 " +pigCount); //pig 나온 수 0
		System.out.println("monkey 나온 수 " +monkeyCount); // monkey 나온 수 1
		System.out.println("0나온 수 " +zeroCount); // 0나온 수 6

		
		
	
	}
	

}
