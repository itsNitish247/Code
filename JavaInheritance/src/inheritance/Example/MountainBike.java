package inheritance.Example;

public class MountainBike extends Bicycle{

	public int seatHeight;
	public MountainBike(int speed, int gear  , int startHeight) {
		super(speed, gear);
	 seatHeight = startHeight;
	}
	
	public void setHeight ( int newValue) {
		seatHeight = newValue;
	}
	
		public String toString() {
			return (super.toString() + "\n" + "and seat height is" + " " + seatHeight );
		
	}

}
