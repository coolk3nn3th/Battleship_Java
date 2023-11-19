package grid02;

import grid01.Ship;

public class Square {
	private int number;
	//private boolean ship;
	private boolean firedAt;
	private Ship theShip;
	
	public Square(int number) {
		setNumber(number);
	}
	
	public boolean isThereAShip() {
		if(theShip == null) {
			return false;
		}
		return true;
	}
	
	//getters and setters
	public void setShip(Ship theShip) {
		this.theShip = theShip;
	}
	
	
	
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return this.number;
	}
}
