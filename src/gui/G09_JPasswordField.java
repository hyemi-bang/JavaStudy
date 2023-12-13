package gui;

import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class G09_JPasswordField extends JFrame{
	
	// Java Swing component list 구글링
	// 여러방법들이 있으니 직접 구글링해서 사용해라
	// https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html

	//비밀번호를 입력할 떄 사용하는 필드
	
	public G09_JPasswordField() {
		super("JPasswordField Sample");
		setLayout(new GridLayout(2, 2));
		
		JLabel idLabel = new JLabel("ID: ");
		JTextField idField = new JTextField();

		add(idLabel);
		add(idField);
		
		JLabel pwLabel = new JLabel("PW: ");
		// 비밀번호를 텍스트 필드로 하게 되면 다 보인다.
		//JTextField pwField = new JTextField();
		JPasswordField pwField = new JPasswordField();

		add(pwLabel);
		add(pwField);
		
		
		//프레임의 크기를 정할때 어떤 크기가 적당한지 알아보기
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentMoved(ComponentEvent e) {
				//System.out.println(e.getComponent());
				System.out.println(
						"x: " + e.getComponent().getX() +
						",y: " + e.getComponent().getY());
			}
			@Override
			public void componentResized(ComponentEvent e) {
				System.out.println(
				"width: " + e.getComponent().getWidth() +
				", height: "+ e.getComponent().getHeight());
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(790,240,250,80);
		setVisible(true);
	}
	public static void main(String[] args) {
	
		new G09_JPasswordField();
	}

}
