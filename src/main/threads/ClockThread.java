package main.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.guis.ClockCanvas;

public class ClockThread extends Thread {
    private ClockCanvas clockCanvas;

    public ClockThread() {
    }

    @Override
    public void run() {
	while (true) {
	    try {
		clockCanvas.repaint();
		Thread.sleep(1000);
	    } catch (InterruptedException ex) {
		Logger.getLogger(ClockThread.class.getName()).log(Level.SEVERE, null, ex);
	    }
	}
    }

    public ClockCanvas getClockCanvas() {
	return clockCanvas;
    }

    public void setClockCanvas(ClockCanvas clockCanvas) {
	this.clockCanvas = clockCanvas;
    }

}
