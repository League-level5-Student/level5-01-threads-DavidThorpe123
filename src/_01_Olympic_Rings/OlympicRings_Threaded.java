package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	Robot timmy = new Robot(400, 700);
	Robot tammy = new Robot(800, 700);
	Robot sammy = new Robot(1200, 700);
	
	timmy.setSpeed(10);
	tammy.setSpeed(10);
	sammy.setSpeed(10);
	
	
	
	Thread r1 = new Thread(()->timmy.move(400));
	Thread r2 = new Thread(()->tammy.move(400));
	Thread r3 = new Thread(()->sammy.move(400));
	
	r1.start();
	r2.start();
	r3.start();
}
}

