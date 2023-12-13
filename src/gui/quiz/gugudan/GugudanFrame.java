package gui.quiz.gugudan;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GugudanFrame extends JFrame {

	final int GUGUDAN_SIZE;
	int dan =2;
	
	
	// 이 프레임에 사용되는 하위 컴포넌트 및 해당 컴포넌트의 설정
	//모아놓기
	List<JLabel> gugudanLabels = new ArrayList<>(); // 여기에 9개의 라벨을 만들어줘야한다.
	Font gugudanLabelFont = new Font("Consolas", Font.PLAIN, 25);
	
	JPanel topPanel = new JPanel(new GridLayout(9,1));
	JPanel bottomPanel = new JPanel(new GridLayout(1,2));
	
	// 필요한 경우 이 프레임의 하위 컴포넌트에서 현재 컴포넌트의 모든것을 알 수 있도록 데이터를 전달해주는 것이 편하다
	JButton prevBtn = new PrevButton(this); // this는 구구단 프레임
	JButton nextBtn = new NextButton(this); // 필요할 시 다운
	
	// 이벤트모음 (인스턴스 변수로 만듦)
	ActionListener gugudanButtonAction;
	
		

	public GugudanFrame() {
		this(9);
	}
	
	public GugudanFrame(int size) {
		GUGUDAN_SIZE = size;
		
		// 이벤트 초기화 (생성자로 부터 전달된 값을 사용하기 위해
		gugudanButtonAction = new GugudanButtonActionListener(this);
		
		// 레이아웃 설정
		setLayout(new BorderLayout());
		// 이프레임과 관련된 모든 이벤트들
		Container pane = getContentPane();

		for(int i = 0; i < 9; ++i) {
			int gop = i+1;
			JLabel gugudanLabel = new JLabel();
			
			gugudanLabel.setText(String.format("2 x %d = %d", gop, 2 * gop));
			gugudanLabel.setFont(gugudanLabelFont);
			
			gugudanLabels.add(gugudanLabel);
			topPanel.add(gugudanLabel);
		}
		
		pane.add(topPanel, "Center");
		pane.add(bottomPanel, "South");
		
		
		bottomPanel.add(prevBtn);
		bottomPanel.add(nextBtn);  
		// 다형성(상속받았기) 때문에 자바문법안에 들어갈 수 있다 
		
		// 컴포넌트에 이벤트 추가 (모든 컴포넌트들을 초기화 한후 맨 마지막에 붙이는 것이 좋다)
		prevBtn.addActionListener(gugudanButtonAction);
		nextBtn.addActionListener(gugudanButtonAction);
		
		
		setTitle("Gugudan");
		setBounds(100, 100, 300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true); // set~~하고 갑을 넣는 것부터가 객체지향적이지 못하다
	}
	
	public static void main(String[] args) {
	
		new GugudanFrame();
	}
}
