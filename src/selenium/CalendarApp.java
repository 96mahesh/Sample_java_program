//package selenium;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.util.Calendar;
//
//public class CalendarApp extends JFrame {
//    private JTextField yearField;
//    private JTextArea calendarArea;
//
//    public CalendarApp() {
//        setTitle("Calendar");
//        setSize(400, 300);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setLayout(new FlowLayout());
//
//        JLabel yearLabel = new JLabel("Enter Year:");
//        add(yearLabel);
//
//        yearField = new JTextField(10);
//        add(yearField);
//
//        JButton showButton = new JButton("Show Calendar");
//        showButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                int year = Integer.parseInt(yearField.getText());
//                Calendar cal = Calendar.getInstance();
//                cal.set(Calendar.YEAR, year);
//                cal.set(Calendar.MONTH, Calendar.JANUARY);
//                cal.set(Calendar.DAY_OF_MONTH, 1);
//
//                StringBuilder calendarText = new StringBuilder();
//                while (cal.get(Calendar.YEAR) == year) {
//                    calendarText.append(cal.get(Calendar.MONTH) + 1).append("/").append(cal.get(Calendar.DAY_OF_MONTH)).append("/").append(cal.get(Calendar.YEAR)).append("\n");
//                    cal.add(Calendar.DAY_OF_MONTH, 1);
//                }
//
//                calendarArea.setText(calendarText.toString());
//            }
//        });
//        add(showButton);
//
//        calendarArea = new JTextArea(10, 30);
//        JScrollPane scrollPane = new JScrollPane(calendarArea);
//        add(scrollPane);
//
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new CalendarApp();
//            }
//        });
//    }
//}
