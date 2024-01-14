package algorithm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample extends JFrame {

    private JPanel calendarPanel;

    public CalendarExample() {
        setTitle("Calendar Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        calendarPanel = new JPanel(new GridLayout(0, 7));

        displayCalendar(2023, Calendar.NOVEMBER);
        add(calendarPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void displayCalendar(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);

        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 1; i <= lastDayOfMonth; i++) {
            JLabel dayLabel = new JLabel(String.valueOf(i), SwingConstants.CENTER);
            dayLabel.setOpaque(true);
            dayLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            if (i == 15) { // 예시로 15일부터 25일까지 강조
                dayLabel.setBackground(Color.YELLOW);
            }

            calendarPanel.add(dayLabel);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalendarExample());
    }
}
