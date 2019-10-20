package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	Robot[] rr = new Robot[3];
	Robot timmy = new Robot(400, 700);
	Robot tammy = new Robot(800, 700);
	Robot sammy = new Robot(1200, 700);
	
	AdvancedRobotRace() {
rr[0] = timmy;
rr[1] = tammy;
rr[2] = sammy;
while(!checkWinner()) {
	Thread r1 = new Thread(()->this.race(timmy));
	Thread r2 = new Thread(()->this.race(tammy));
	Thread r3 = new Thread(()->this.race(sammy));
	r1.start();
	r2.start();
	r3.start();
	}
	}

public static void main(String[] args) {
	AdvancedRobotRace arr = new AdvancedRobotRace();
}
	public void race(Robot r) {
		
		int ran = new Random().nextInt(51);
		System.out.println(ran);
		r.move(ran);
		
	}
	public boolean checkWinner() {
		for (int i = 0; i < rr.length; i++) {
			if (rr[i].getY() < 0) {
				System.out.println(rr[i] + " wins");
				return true;
			}
		}
		return false;
	}
	
}
