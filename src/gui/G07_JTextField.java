package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class G07_JTextField extends JFrame{

	public G07_JTextField() {
		super("JTextField Sample");
		
		setLayout(null);
		
		JLabel label = new JLabel("취미: ");
		label.setBounds(50, 100, 50, 30);
		
		JTextField tf = new JTextField(30);
		
		tf.setLocation(100,100);
		tf.setSize(200, 30);
		
		// JTextField의 액션 리스너는 
		// 텍스트 필드가 선택된 채로 엔터키를 눌렀을 떄 발동한다.
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 이벤트 발생시 ActionEvent에 대한 필요한 정보
				// (이벤트 발생 당시의 여러정보들이)들이 함께 넘어온다
				System.out.println("이벤트가 발생한 컴포넌트: " + e.getSource());
				System.out.println("이벤트 발생 시간: " +new Date(e.getWhen()));
				System.out.println("이벤트 발생 시간: " +e.getWhen());
				System.out.println("발생 당시 텍스트필드의 값: " + e.getActionCommand());
			}
			
		});
		
		//Key가 눌렸을때 (키보드가 눌렸을때) 발생ㅇ하는 이벤트에 대한 처리
		tf.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				//  입력이 있을때 (키를 눌렀을 때 호출/ ctrl, alt, shift등 입력이 없을때는 발동하지 않음)
				// 한글은 2번 ~3번 누를 떄 글자가 입력될 때 있기 때문에 keyTyped에서만 나오는 것 같다.
				System.out.println("입력이 있음");
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				 //키보드가 눌렸을때 (ctrl, alt, shift 등에도 발동)
				System.out.println("누르고 있음");
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// 키보드에서 손을 떼었을때 발동하는 이벤트
//				System.out.println("손을 뗌");
				System.out.println(e.getKeyChar()); // 눌렀다 떼었을 때 어떤 키를 눌렀었는지
				System.out.println(e.getKeyCode()); // 특수기호와 char에 없는 키들보기
				
				switch(e.getKeyCode()) {
				case KeyEvent.VK_SPACE:
					System.out.println("스페이스바가 눌렸습니다.");
					break;
				case KeyEvent.VK_SHIFT :
					System.out.println("쉬프트키가 눌렸습니다.");
					
					// KeyEvent. 해보면 이 외에도 많은 정보를 볼 수 있다.
				
				}
			}
			
		});
		
		add(label);
		add(tf);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,500,500);
		setVisible(true);
	
	}

	
	public static void main(String[] args) {
		
			new G07_JTextField();

	}

}
