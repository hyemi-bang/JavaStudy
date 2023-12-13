package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G01_JavaSwing {

	/*
	 	# JavaSwing
	 	- 프로젝트 용 / 발전하여 핸드폰 앱을 만만드는 것 까지 나아갔다.
	 	- java로 GUI(Graphic User Interface) 프로그램을 만들수 있는 API
	 	- GUI : 컴퓨터 화면을 이미지로 제어할 수 있는 환경을 의미
	 	
	 	# Swing Container
	 	- 컨테이너 위에는 여러가지 컴포넌트들을 배치할 수 있다
	 	- JFrame, JPanel, JDialog 등 컨테이너로 분류되는 다양한 클래스들이 존재
	 	
	 	# Swing Component
	 	- 컨테이너 위에 배치할 수 있는 객체들
	 	- 버튼, 라벨, 표, 체크박스 등 컴포넌트로 분류되는 다양한 클래스 존재
	 	
	 	
	*/
	
	public static void main(String[] args) {
		
		//JFrame : 대표적인 컨테이너 /초기에는 보이지 않는 상태
		JFrame frame = new JFrame();

		frame.setTitle("My GUI Program"); // 제목설정
		frame.setLocation(100, 100); // 초기 위치 설정
		frame.setSize(500, 500); // 초기 크기를 설정
		frame.setVisible(true); // 프레임을 보이는 상태로 설정
		
		// 프레임의 x버튼을 눌렀을때 동작을 설정하는 메서드
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setDefaultCloseOperation(WindowConstants.);
		/*
			DO_NOTHING_ON_CLOSE : 눌러도 아무것도 하지 않는다
            HIDE_ON_CLOSE  : 누르면 창을 숨김
            DISPOSE_ON_CLOSE :누르면 해당 창만 종료, 프로그램은 종료하지 않는다.(기본값)
            EXIT_ON_CLOSE : 누르면 프로그램 종료
		*/
		// 해당 프레임의 레이아웃 관리자를 설정
		// 레이아웃 관리자 : 컴포넌트를 부착할 때 위치를 제어해주는 클래스
		frame.setLayout(null); 
		
		// ##컴포넌트
		//JButton : 여러 컴포넌트들 중 한 종류로 버튼의 역할
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		
		//만든 컴포넌트를 프레임에 부착해야한다.
		frame.add(button1);
		button1.setSize(150,80);
		button1.setText("<html>저는 버튼입니다~ <br>click...</html>"); //Swing의 일부 컴포넌트 라벨에서 html이 동작한다
		//https://stackoverflow.com/questions/13503280/new-line-n-is-not-working-in-jbutton-settextfnord-nfoo
		
		button1.setLocation(300,300);
		
		frame.add(button2);
		// setBounds : setLocation + setSize 합쳐진것
		button2.setBounds(100, 300, 150, 80);
		button2.setText("버튼2");
		
		
		
	}
	
}





















