// Kim Merchant
// This program allows a user to create different objects called Robots that each have a name
// and power status associated with them. It gives the user ways to call for and edit the status 
// and name of each object.
// No resources apart from class notes were used to create this.
// Gilligan's Island rule followed.

public class Robot {
	// instance variables
	private String name;
	private boolean powerStatus;

	// constructor
	public Robot() {					// creates a Robot object of a generic name
		this.name = "Wall-E";			// sets the default name of a robot to Wall-E
		this.powerStatus = true;		// sets the default power status of a robot to true (on)
	}
	public Robot(String name) {			// creates a Robot object of a specific name
		this.name = name;				// sets the name of a robot to the user's input
		this.powerStatus = true;		// sets the default power status of a robot to true (on)
	}
	
	// methods
	public String getName() {			// method allows the user to call for the name of a robot
		return this.name;				// returns the name of the robot to the user
	}
	public boolean getPowerStatus() {	// method allows user to call for the power status of a robot
		return this.powerStatus;		// returns boolean for status: true = on, false = off
	}

	public void setName(String newName) {	// method allows user to change the name of a robot
		this.name = newName;				// sets the name of a robot to the user's input
	}

	public void powerOff() {			// turns "off" a Robot object and changes the name to default
		this.powerStatus = false;
		this.name = "Wall-E";
	}

	public void powerOn() {				// turns "on" a robot
		this.powerStatus= true;
	}
}
