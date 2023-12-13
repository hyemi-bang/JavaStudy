
public class B05_Operator03 {
/*
  #대입 연산자
    = : 왼쪽의 변수에 오른쪽의 값을 넣는다.
 
  #복합 대입연산자
   
   += : 왼쪽의 변수에 오른쪾의 값을 더해 누적시킨다.
   -= : 		""  		빼서 누적시킨다.
   *= :			""			곱해서 누적시킨다.
   /= : 		""			나눠서 누적시킨다.
   %= : 		""			나눈 나머지를 누적시킨다..
   
  #단항 연산자
   ++ : 해당 변수에 1을 더해 누적시킨다.
   -- : 해당 변수에 1을 빼서 누적시킨다.
   
   - 단항 연산자는 위치에 따라 차이가 있다.
    1. 단항 연산자가 변수의 뒤에 붙어있는 경우 해당줄의 모든 명령이 끝난 후 값을 변화시킨다.
  	   > a++, a--
    2. 단항 연산자가 변수의 앞에 붙어 있는 경우 해당 줄의 명령을 실행 하기 전에 값을 먼저 변화시킨다.
       > ++a, --a
  
  #boolean 타입의 복합 대입연산자
   boolean () = true;
   () &= false; AND 연산을 한 후 누적
   () |= false; OR 연산을 한 후 누적
   () ^= false; XOR 연산을 한 후 누적 (XOR은 ()값과 = 오른쪽 변 값이 다르면 true, 같으면 false)
           ==> 브레이크 밟지 않고 있고(false) , 시동이 켜져 있다(true) -> 출발 (true)
           ==> 브레이크 밟고 있고 (true), 시동이 켜져 있다 (true) -> 출발하지 않음 (false)
   
   
*/
	public static void main(String[] args) {
		
		int num =10;
		
		num += 2; // num = num+2; 것을 줄인것
		
		System.out.println(num);
		
		int a =20;
		a+=5;
		System.out.println(a); // 25
		a -=10 ;
		System.out.println(a); // 15
		a *= 3;
		System.out.println(a); // 45
		a /= 10;
		System.out.println(a); // 4		
		a %=3;
		System.out.println(a); // 1 계속 왼쪽 변수에 누적이 되어 계산이 되고 있다.
		
		
		int count = 10;
		count ++; //count = count +1; 줄인것
		System.out.println(count); //11
		System.out.println(count++); // 11 ;을 끝낸 후 더한다
		System.out.println(count); // 12
		System.out.println(++count);//13 더하고 실행된다.
		
		
		boolean readable = true;
		readable &= false; // AND 연산을 한 후 누적시킨다.
		System.out.println(readable);
		readable |= true; // OR 연산을 한 후 누적시킨다.
		System.out.println(readable);
		readable ^= false; // XOR 연산을 한 후 누적시킨다.
		System.out.println(readable);
	}

}
