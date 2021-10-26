public class TestRobot {
 
    public static void main(String[] args) {
        // create a new Robot object with the default name Wall-E
        Robot walle = new Robot();
 
        // create a new Robot object with the name of Baymax
        Robot baymax = new Robot("Baymax");

        System.out.println(walle.getName()); // Should print Wall-E
        System.out.println(walle.getPowerStatus()); // Should print true
        System.out.println(baymax.getName()); // Should print Baymax
        System.out.println(baymax.getPowerStatus()); // Should print true
 
        baymax.setName("K-2SO"); // changes the robot's name to K-2SO
 
        System.out.println(baymax.getName()); // Should print K-2SO
 
        baymax.powerOff(); // powers down K-2SO
 
        System.out.println(baymax.getName()); // Should print Wall-E
 
        System.out.println(baymax.getPowerStatus()); // Should print false
        baymax.setName("R2-D2"); // changes the robot's name to R2-D2
        baymax.powerOn(); // changes the robot's name to R2-D2
        System.out.println(baymax.getName()); // Should print R2-D2
 
        System.out.println(baymax.getPowerStatus()); // Should print true
 
        walle.powerOff(); // powers down Wall-E
        System.out.println(walle.getName()); // Should print Wall-E
 
        System.out.println(walle.getPowerStatus()); // Should print false
    }
}
