package gui.quiz.gugudan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;

public class GugudanButtonActionListener implements ActionListener {

	final private int GUGUDAN_SIZE;
	List<JLabel> gugudanLabels;
	int dan = 2;
	
	JButton prevBtn;
	JButton nextBtn; // 버튼 모양과 색 등을 변경해야 하기에 필요한 동작
	
	public GugudanButtonActionListener(GugudanFrame mainFrame) {
		GUGUDAN_SIZE = mainFrame.GUGUDAN_SIZE;
		gugudanLabels = mainFrame.gugudanLabels;
		prevBtn = mainFrame.prevBtn;
		nextBtn = mainFrame.nextBtn;
		
		prevBtn.setEnabled(false);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		// 이벤트를 만들기 위해 필요한 재료가 무엇이 있는지 생각해봐야한다.
		// 1. JLabel 9개 2. 현재 몇 단인지
		// 이 두개는 메인프레임에 공존하고 있다. 해서 메인 프레임에다 this 추가해준다.!
		
		if(e.getSource() == prevBtn) {
			--dan;
			if(dan == GUGUDAN_SIZE - 1) {
				nextBtn.setEnabled(true);
			} else if(dan == 2) {
				prevBtn.setEnabled(false);
			}
			//System.out.println("prev가 눌림");
		} else if(e.getSource() == nextBtn) {
			//System.out.println("next가 눌림");
			++dan;
			if(dan == 3) {
				prevBtn.setEnabled(true);
			} else if(dan == GUGUDAN_SIZE) {
				nextBtn.setEnabled(false);
			}
		}
		for (int i = 0; i < 9; ++i) {
			JLabel gugudanLabel = gugudanLabels.get(i);
			int gop = i + 1;
			gugudanLabel.setText(String.format("%d X %d = %d", dan, gop, dan * gop));
		}
	}

}
