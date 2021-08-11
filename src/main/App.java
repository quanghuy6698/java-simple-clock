package main;

import main.guis.ClockCanvas;
import main.guis.ClockGUI;
import main.threads.ClockThread;

public class App {

    public static void main(String[] args) {
	ClockCanvas clockCanvas = new ClockCanvas();
	ClockThread clockThread = new ClockThread();
	ClockGUI clockGUI = new ClockGUI();
	clockGUI.setClockCanvas(clockCanvas);
	clockGUI.setClockThread(clockThread);

	clockGUI.setVisible(true);
    }
}
