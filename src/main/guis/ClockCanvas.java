package main.guis;

import java.awt.Canvas;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Calendar;

import main.constants.AppConstants;
import main.models.Moment;

public class ClockCanvas extends Canvas {
    private static final long serialVersionUID = 1L;

    private Moment time;

    public ClockCanvas() {
	setSize(400, 400);
    }

    @Override
    public void paint(Graphics graphics) {
	drawClock(graphics);
	drawClockwise(graphics);
    }

    /**
     * Draw clock
     * 
     * @param graphics - Graphic contexts
     */
    private void drawClock(Graphics graphics) {
	graphics.setFont(new Font("Tahoma", Font.BOLD, 18));
	graphics.drawString("12", 193, 70);
	graphics.drawString("3", 332, 205);
	graphics.drawString("6", 195, 344);
	graphics.drawString("9", 55, 205);
	graphics.drawOval(50, 50, 300, 300);
    }

    /**
     * Draw clockwise
     * 
     * @param graphics - Graphic contexts
     */
    private void drawClockwise(Graphics graphics) {
	Calendar calendar = Calendar.getInstance();

	int hour = calendar.get(Calendar.HOUR);
	int minute = calendar.get(Calendar.MINUTE);
	int second = calendar.get(Calendar.SECOND);

	double hourAngle = (Math.PI * hour) / 6;
	hourAngle += (minute * Math.PI) / 360;
	double minuteAngle = (Math.PI * minute) / 30;
	double secondAngle = (Math.PI * second) / 30;

	int x1 = (int) (200 + 80 * Math.sin(hourAngle));
	int y1 = (int) (200 - 80 * Math.cos(hourAngle));

	int x2 = (int) (200 + 100 * Math.sin(minuteAngle));
	int y2 = (int) (200 - 100 * Math.cos(minuteAngle));

	int x3 = (int) (200 + 120 * Math.sin(secondAngle));
	int y3 = (int) (200 - 120 * Math.cos(secondAngle));

	graphics.setColor(AppConstants.HOUR_CLOCKWISE_COLOR);
	graphics.drawLine(200, 200, x1, y1);
	graphics.setColor(AppConstants.MINUTE_CLOCKWISE_COLOR);
	graphics.drawLine(200, 200, x2, y2);
	graphics.setColor(AppConstants.SECONDS_CLOCKWISE_COLOR);
	graphics.drawLine(200, 200, x3, y3);

    }

    public Moment getTime() {
	return time;
    }

    public void setTime(Moment time) {
	this.time = time;
    }

}
