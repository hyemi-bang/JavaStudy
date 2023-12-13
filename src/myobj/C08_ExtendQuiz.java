package myobj;

public class C08_ExtendQuiz {
	

	public static void main(String[] args) {
	
		Cellphone c1 = new Cellphone("Z폴드", "블랙", "삼성");
		RadioPhone r1 = new RadioPhone();
		r1.changeChannel();
		StovePhone s1 = new StovePhone("난로폰", "화이트", "샤오미", 200);
		s1.handStove();
		s1.cookMode();
		
		
	}

}

class Cellphone {
	
	String name;
	String color;
	String brand;
	int sound;
	
	public Cellphone(String name, String color, String brand) {
		this.name = name;
		this.color = color;
		this.brand = brand;
	} 
	
	void ringBell () {
		++sound;
	}
	

}

class RadioPhone extends Cellphone{
	
	int channel; 
	double frequency; // 주파수
	
	public RadioPhone() {
		super("애플라디오","블랙","애플");
		this.frequency = 98.8;
	}
	


	public RadioPhone(String name, String color, String brand, double frequency) {
		super(name,color,brand);
		this.frequency = frequency;
	}
	
	void changeChannel () {
		channel += 1;
	}
	
}


class StovePhone extends Cellphone{
	
	final int MAX_TEMPER;
	int temperature;
	int brightness;
	
	public StovePhone(String name, String color, String brand,int MAX_TEMPER) {
		super(name, color, brand);
		this.MAX_TEMPER = MAX_TEMPER;
		
	}
	
	void handStove () {
		--temperature;
		System.out.println("손난로 용으로 온도를 맞춥니다");
	}
	
	void cookMode() {
		++temperature;
	}
	
}

