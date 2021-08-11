package main.guis;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Calendar;

public class ClockCanvas extends Canvas {
    private static final long serialVersionUID = 1L;

    public ClockCanvas() {
	setSize(400, 500);
    }

    @Override
    public void paint(Graphics g) {
	drawClock(g);
	drawClockwise(g);
    }

    private void drawClock(Graphics g) {
	g.setFont(new Font("Tahoma", Font.PLAIN, 18));
	g.drawString("12", 193, 70);
	g.drawString("3", 332, 205);
	g.drawString("6", 195, 344);
	g.drawString("9", 55, 205);
	g.drawOval(50, 50, 300, 300);
    }

    private void drawClockwise(Graphics g) {
	Calendar calendar = Calendar.getInstance();

	int hour = calendar.get(Calendar.HOUR);
	int minute = calendar.get(Calendar.MINUTE);
	int second = calendar.get(Calendar.SECOND);

	double hourAngle = (Math.PI * hour) / 6;
	hourAngle += (minute * Math.PI) / 360;
	double minuteAngle = (Math.PI * minute) / 30;
	double secondAngle = (Math.PI * second) / 30;

	double x1 = 200 + 80 * Math.sin(hourAngle);
	double y1 = 200 - 80 * Math.cos(hourAngle);

	double x2 = 200 + 100 * Math.sin(minuteAngle);
	double y2 = 200 - 100 * Math.cos(minuteAngle);

	double x3 = 200 + 120 * Math.sin(secondAngle);
	double y3 = 200 - 120 * Math.cos(secondAngle);

	Graphics2D g2 = (Graphics2D) g;
	g2.setColor(Color.black);
	g2.draw(new Line2D.Double(200, 200, x1, y1));
	g2.setColor(Color.blue);
	g2.draw(new Line2D.Double(200, 200, x2, y2));
	g2.setColor(Color.red);
	g2.draw(new Line2D.Double(200, 200, x3, y3));

	String time = hour + ":" + minute + ":" + second;
	drawTimeString(g, time);
    }

    private void drawTimeString(Graphics g, String time) {
	g.setFont(new Font("Tahoma", Font.PLAIN, 18));
	g.setColor(Color.red);
	g.drawString(time, 100, 390);
    }

}
