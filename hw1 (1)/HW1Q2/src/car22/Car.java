package car22;

public class Car {
	private int speed;
	
	
	public void SpeedUp (){
		speed= speed +1 -(speed/10);
}
	
	public void slowDown (){
		
		 speed = (speed*9) / 10; 
	}
	
	public void stop () {
	  speed=0;
 }
 
	public void show() {
	  System.out.print(speed);
 }
     
 

}

