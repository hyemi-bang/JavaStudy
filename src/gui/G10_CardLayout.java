package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class G10_CardLayout {

	// 필요한 레이아웃등등은 구글링 하여 정보를 찾기
	/*
		다음 카드로 넘기듯 컴포넌트를 넘기면서 보여줄 수 있는 레이아웃
		ex: 설치 프로그램
		
	*/
	
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("CardLayout Sample");
		
		CardLayout card = new CardLayout();
		f.setLayout(card);
		
		JPanel panel1 = new JPanel(new BorderLayout());
		JPanel panel2 = new JPanel(new GridLayout(3,3));
		JPanel panel3 = new JPanel(null);
		
		JButton panel1NextBtn = new JButton("다음");
		panel1NextBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("다음");
				// 카드레이아웃을 조정하기 위해서는 해당 카드레이 아웃의 부모컨테이너를 전달해줘야한다.
				card.next(f.getContentPane()); 
				
			}
			
		});
		
		panel1.add(panel1NextBtn, "South");
		
		for(int i = 0 ; i < 9 ; ++i) {
			//panel2.add(new JButton("Button" + i));
			// 가운데에 있는 버튼을 눌렀을때 다음으로 넘어가게 하기 위해서는 
			JButton btn = new JButton("Button" + i);
			
			if(i == 4) {
				btn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						card.next(f.getContentPane());
						
					}
					
				});
			}
			panel2.add(btn);
		}
		
		JButton panel3Prev1Btn = new JButton("Prev");
		JButton panel3Page1Btn = new JButton("Page1");
		JButton panel3Page2Btn = new JButton("Page2");
		JButton panel3NextBtn = new JButton("Next");
		
		panel3Prev1Btn.setBounds(50,200,80,50);
		panel3Page1Btn.setBounds(170,200,80,50);
		panel3Page2Btn.setBounds(290,200,80,50);
		panel3NextBtn.setBounds(410,200,80,50);
		
		
		panel3Prev1Btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				card.previous(f.getContentPane());
				
			}
			
		});
		
		panel3Page1Btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// show를 사용하기 위해서는 카드레이아웃에 컴포넌트를 추가할때 이름 설정이 필요하다.
				card.show(f.getContentPane(), "apple");
				
			}
			
		});
		
		
		panel3.add(panel3Prev1Btn);
		panel3.add(panel3Page1Btn);
		panel3.add(panel3Page2Btn);
		panel3.add(panel3NextBtn);
	
		
		//f.add(panel1);
		//f.add(panel2);
		//f.add(panel3);
		// 카드레이아웃에 컴포넌트를 추가할 때 이름을 설정해 두면 좋다.
		f.add("apple", panel1);
		f.add("banana", panel2);
		f.add("grape", panel3);
		
		f.setVisible(true);
		f.setBounds(200,200,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
