package main.guis;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import main.constants.AppConstants;
import main.threads.ClockThread;

public class ClockGUI extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel classicClockPanel;
    private JLabel digitalTime;
    private ClockThread clockThread;
    private ClockCanvas clockCanvas;

    public ClockGUI() {
	initComponents();

	clockThread = new ClockThread();
	clockThread.setClockCanvas(clockCanvas);
	clockThread.start();

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, AppConstants.APP_WIDTH, AppConstants.APP_HEIGHT);
	setTitle("Simple Clock");
	setResizable(false);
//	setSize(new java.awt.Dimension(400, 550));
    }

    /**
     * Init components
     */
    private void initComponents() {
	classicClockPanel = new JPanel();
	classicClockPanel.setLayout(new FlowLayout());

	JLabel appTitle = new JLabel();
	appTitle.setText("Simple Clock");
	appTitle.setHorizontalAlignment(SwingConstants.CENTER);
	appTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
	appTitle.setSize(400, 50);

	digitalTime = new JLabel();
	digitalTime.setText("ajaja");
	digitalTime.setHorizontalAlignment(SwingConstants.CENTER);
	digitalTime.setFont(new Font("Tahoma", Font.BOLD, 14));
	digitalTime.setForeground(Color.red);
	digitalTime.setSize(400, 50);

	clockCanvas = new ClockCanvas();

	classicClockPanel.add(appTitle);
	classicClockPanel.add(clockCanvas);
	classicClockPanel.add(digitalTime);

	setContentPane(classicClockPanel);

	pack();
    }

    public JPanel getClassicClockPanel() {
	return classicClockPanel;
    }

    public void setClassicClockPanel(JPanel classicClockPanel) {
	this.classicClockPanel = classicClockPanel;
    }

    public ClockThread getClockThread() {
	return clockThread;
    }

    public void setClockThread(ClockThread clockThread) {
	this.clockThread = clockThread;
    }

    public ClockCanvas getClockCanvas() {
	return clockCanvas;
    }

    public void setClockCanvas(ClockCanvas clockCanvas) {
	this.clockCanvas = clockCanvas;
    }

}
