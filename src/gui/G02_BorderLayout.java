package gui;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G02_BorderLayout {
/*
 	# 레이아웃 관리자 (Layout Manager)
 	- 컨테이너에는 레이아웃 관리자를 설정할 수 있다
 	- 레이아웃을 설정한 컨테이너어는 컴포넌트를 원하는 위치에 부착할 수 없고
 	  레이아웃에서 정해주는 위치에만 부착할 수 있다.
 	- 컴포넌트를 자유롭게 배치하고 싶다면 해당 컨테이너의 레이아웃 매니저를 null로 설정해야한다.(기본값)
 	  (setLocation, setSize를 통해 배치한다)
 	  
 	  #BorderLayout
 	  - JFrame의 기본값
 	  - 동,서,남,북,가운데에 컴포넌트를 배치할 수 있다
 	  
 */
	public static void main(String[] args) {
		
		JFrame f = new JFrame("My GUI Program");
		
		//변수 5개 만들기 싫어서 리스트로 만든 것이다.
		List<JButton> btns = new ArrayList<>();
		for(int i = 1; i <=5; ++i) {
			JButton btn = new JButton("Button" + i);
			btns.add(btn);
		}
		
		// 생성자에 gap(여백)을 설정할 수 있는 오버로딩이 존재한다.
		// f.setLayout(new BorderLayout()); 기본값 0,0
		f.setLayout(new BorderLayout(10, 30));
		
		// 보더 레이아웃이 설정된 컨테이너에 컴포넌트를 붙인다.
		f.add(btns.get(0), BorderLayout.EAST); // 상수로 사용해야하지만, BorderLayout.EAST 의 EAST 자체가 문자열이기 때문에 "East"사용해도 된다.
		f.add(btns.get(1), BorderLayout.SOUTH);
		f.add(btns.get(2), BorderLayout.WEST);
		f.add(btns.get(3), BorderLayout.NORTH);
		f.add(btns.get(4), BorderLayout.CENTER);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
		

	}

}
