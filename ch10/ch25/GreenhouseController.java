//: innerclasses/GreenhouseController.java
// Configure and execute the greenhouse system.
// {Args: 5000}
package ch25;
class Machine extends GreenhouseControls{
	  private boolean machine = false;
	  public class MachineOn extends Event{
			  public MachineOn (long delayTime)
			  {super(delayTime);}
			  public void action(){ machine = true;}
			  public String toString() { return "machine is on";}	 
	  }

}
public class GreenhouseController {
  public static void main(String[] args) {
	  Machine gc = new Machine();
    // Instead of hard-wiring, you could parse
    // configuration information from a text file here:
    gc.addEvent(gc.new Bell(900));
    Event[] eventList = {
      gc.new ThermostatNight(0),
      gc.new LightOn(200),
      gc.new LightOff(400),
      gc.new WaterOn(600),
      gc.new WaterOff(800),
      gc.new FanOn(800),
      gc.new FanOff(900),
      gc.new ThermostatDay(1400),
      gc.new MachineOn(900),
    };	

    gc.addEvent(gc.new Restart(2000, eventList));
    if(args.length == 1)
      gc.addEvent(
        new GreenhouseControls.Terminate(
          new Integer(args[0])));

    
    gc.run();
  }
} /* Output:
Bing!
Thermostat on night setting
Light is on
Light is off
Greenhouse water is on
Greenhouse water is off
Thermostat on day setting
Restarting system
Terminating
*///:~
