package main.guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ClockUI extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    ClockUI frame = new ClockUI();
		    frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the frame.
     */
    public ClockUI() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 522, 536);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel lblNewLabel = new JLabel("New label");
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setBounds(30, 10, 253, 29);
	contentPane.add(lblNewLabel);

	JPanel panel = new JPanel();
	panel.setBounds(68, 49, 215, 205);
	contentPane.add(panel);
	panel.setLayout(null);

	JLabel lblNewLabel_1 = new JLabel("New label");
	lblNewLabel_1.setBounds(136, 289, 45, 13);
	contentPane.add(lblNewLabel_1);
    }
}
