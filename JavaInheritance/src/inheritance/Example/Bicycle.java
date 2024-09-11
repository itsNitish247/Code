package inheritance.Example;

public class Bicycle {
public int speed;
public int gear;


public Bicycle(int speed, int gear) {
	super();
	this.speed = speed;
	this.gear = gear;
}

public void applyBrake(int decrement) {
	speed -= decrement;
									
}

public void speedUp(int increament) {
	speed +=increament;
}


public String toString() {
	return ("No of gears are" + gear + "/n" + "speed of the bicycle is" + speed);
}
}
