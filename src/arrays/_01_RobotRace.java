package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	boolean attop=false;
	Robot[] robs=new Robot[5];
	Random ran=new Random();
	for (int i = 0; i < robs.length; i++) {
		robs[i]=new Robot();
		robs[i].setX(100*i+50);
		robs[i].setY(550);
		robs[i].setSpeed(1000);
		
		
	}
	while(!attop) {
	for (int i = 0; i < robs.length; i++) {
		robs[i].move(ran.nextInt(50));
		if(robs[i].getY()<=0) {
			attop=true;
			System.out.println("robot "+(i+1)+" is the winner. yay.");
			break;
		}
		
	
	}
	}
	}
}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.

