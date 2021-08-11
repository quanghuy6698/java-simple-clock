package main.guis;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.threads.ClockThread;

public class ClockGUI extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel panel;
    private ClockThread clockThread;
    private ClockCanvas clockCanvas;

    /**
     * Create app frame.
     */
    public ClockGUI() {
//	initComponents();
	panel = new JPanel();
	getContentPane().add(panel);
	pack();

	clockCanvas = new ClockCanvas();
	panel.add(clockCanvas);

	clockThread = new ClockThread();
	clockThread.setClockCanvas(clockCanvas);
	clockThread.start();

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	setBounds(100, 100, AppConstants.APP_WIDTH, AppConstants.APP_HEIGHT);
	setTitle("Simple Clock");
	setResizable(false);
	setSize(new java.awt.Dimension(400, 500));
    }

    private void initComponents() {

	panel = new JPanel();

	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	setTitle("Simple Clock");
	setResizable(false);
	setSize(new java.awt.Dimension(400, 500));

	getContentPane().add(panel, java.awt.BorderLayout.CENTER);

	pack();
    }

    public JPanel getPanel() {
	return panel;
    }

    public void setPanel(JPanel panel) {
	this.panel = panel;
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
