import javax.swing.*;
import java.awt.*;

public class CounterApp extends JFrame {
    private int value;
    public CounterApp(int initialValue) {
        setBounds(350, 150, 700, 500);
        setTitle("Просто счетчик");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font font = new Font("Comic", Font.BOLD, 45);
        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add (counterValueView, BorderLayout.CENTER);
        value = initialValue;
        counterValueView.setText(String.valueOf(value));
        JPanel panel = new JPanel(new GridLayout(1, 2));
        JButton decrementButton = new JButton("Назад");
        decrementButton.setFont(font);
        panel.add(decrementButton);
        add(panel, BorderLayout.SOUTH);
        JButton incrementButton = new JButton("Вперед");
        incrementButton.setFont(font);
        panel.add(incrementButton);
        add(panel, BorderLayout.SOUTH);
        decrementButton.addActionListener(actionEvent -> {
            value--;
            counterValueView.setText(String.valueOf(value));
        });
        incrementButton.addActionListener(actionEvent -> {
        value++;
        counterValueView.setText(String.valueOf(value));
        });
        setVisible(true);
    }
    public static void main (String[] args) {
        new CounterApp(0);
    }
}
