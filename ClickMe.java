import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickMe implements ActionListener {
    private int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label1;

    public ClickMe() {
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Click me");
        button.addActionListener(this);
        button.setBackground(Color.MAGENTA);
        button.setLocation(720, 5);
        button.setSize(new Dimension(70, 30));
        label1 = new JLabel("Number of clicks: 0");

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(5, 2));
        panel.add(button);
        panel.add(label1);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Click me");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ClickMe();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label1.setText("Number of clicks: " +count);

    }
}
