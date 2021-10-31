package main.threads;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;

import main.guis.ClockCanvas;
import main.models.Moment;

public class ClockThread extends Thread {
    private ClockCanvas clockCanvas;
    private JLabel digitalTime;

    public ClockThread() {
    }

    @Override
    public void run() {
	while (true) {
	    try {
		Moment time = getTime();
		clockCanvas.setTime(time);
		clockCanvas.repaint();
		Thread.sleep(1000);
	    } catch (InterruptedException ex) {
		Logger.getLogger(ClockThread.class.getName()).log(Level.SEVERE, null, ex);
	    }
	}
    }

    /**
     * Get time
     * 
     * @return time at the moment
     */
    private Moment getTime() {
	Calendar calendar = Calendar.getInstance();

	int hour = calendar.get(Calendar.HOUR);
	int minute = calendar.get(Calendar.MINUTE);
	int second = calendar.get(Calendar.SECOND);

	return new Moment(hour, minute, second);
    }

    public ClockCanvas getClockCanvas() {
	return clockCanvas;
    }

    public void setClockCanvas(ClockCanvas clockCanvas) {
	this.clockCanvas = clockCanvas;
    }

    public JLabel getDigitalTime() {
	return digitalTime;
    }

    public void setDigitalTime(JLabel digitalTime) {
	this.digitalTime = digitalTime;
    }

}
