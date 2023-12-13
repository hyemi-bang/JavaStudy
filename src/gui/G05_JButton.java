package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G05_JButton  extends JFrame{
							//G05_JButton 클래스가 JFrame이 된 것이다.(상속받아)

	//Swing 컴포넌트들은 상속을 통한 구현이 가능하다.
	// 사용자가 불러다 사용할 수 있는 프레임 객체가 된 것.
	public G05_JButton() { // 내가 가지고 있는 속성들을 수정하는 것이다.
		setLayout(null);
		
		//Contentpane : 프레임 내에서 실제로 내용이 그려지는 곳
		getContentPane().setBackground(Color.BLACK);
		
		JButton btn1 = new JButton("Button 1");
		
		// 여러가지 버튼 설정들
		btn1.setText("Changed Text");// 생성자에서도 설정 가능하지만, 변경할 수 있다.
		btn1.setBackground(Color.BLACK);// 배경 색
		btn1.setForeground(new Color(214,206,147)); // 글씨 색
		btn1.setBounds(100, 100, 300, 70);
		//btn1.setEnabled(false); 버튼 비활성화
		
		// 버튼을 눌렀을 때 동작을 설정
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.ORANGE);
				
			}
			
		});
		
		// addActionListener 버튼을 눌렀을 때의 동작을 설정 할 수 있다.
		btn1.addActionListener(new ActionListener() { // 즉석에서 상속을 받아서 인스턴스를 받아야한다. 한번만 사용할 수 있는 상태
			@Override
			public void actionPerformed(ActionEvent e) {
			System.out.println("버튼을 누르셨네요?");
				
			}
		});
		
		
		
		add(btn1);
		add(new MyButton(100, 200, this));
		
		setTitle("JButton Examples!");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(100,100);
		setVisible(true);
	}	
		
	public static void main(String[] args) {
		new G05_JButton();
		

	}
}

class MyActionLister implements ActionListener{

	JFrame parent;
	
	public MyActionLister(JFrame parent) {
		this.parent = parent;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		parent.getContentPane().setBackground(Color.gray);
		
	}
	
}

class MyButton extends JButton implements ActionListener{
	JFrame parent;
	
	public MyButton(int x, int y, JFrame parent) {
		// 버튼을 누르면, 다른 버튼들의 색도 바뀌게 하고싶을때. ()에 여러개를 받아야 할때
		// 하나씩 입력 받거나.
		// list로 하면 각 번호가 뭐가 있는지 알아야 하기 때문에 Map 타입으로 하고 다운캐스팅 받아야한다. 

		this.parent = parent;
		
		setBounds(x,y,300,70);
		setForeground(new Color(161, 198, 255));
		setBackground(new Color(0, 0, 0));
		addActionListener(this);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		parent.getContentPane().setBackground(Color.green);
		
	}
}














