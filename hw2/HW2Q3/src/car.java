
public class car {

private int speed;
private String carNumber;
private int maxSpeed;

public car (int x, String l) {
	maxSpeed=x;
    carNumber=l;
    speed=0;
}
public car (int x,int m,int n,int k) {
}
	
public void speedUp(){
	if (speed>=maxSpeed) {
		speed=maxSpeed;
	}
	else {
		speed=speed+1;
	}
}
public void show() {
	  System.out.print("carNumber="+ carNumber+ ", ");
	  System.out.print("speed=" + speed + ", " );
	  System.out.println("maxSpeed="+ maxSpeed);
	   

}

public int getSpeed() {
	 return speed;
}


public void slowDown(){
	if (speed<=0) {
		speed=0;
	}
	else {
		speed=speed-1;
	}
		
}
public void stop () {
	  speed=0;
 }
 
public void speedUp(int i){
	if (i<0){
		
	}
	else {
	if (speed>=maxSpeed) {
		speed=maxSpeed;
	}
	if(speed + i >=maxSpeed) {
	
	}
	
	else {
		speed=speed+i;
	}
	}
}
public void slowDown(int i){
	if (i<0) {
		
	}
	else {
	if (speed<=0) {
		speed=0;
	}
	if (speed-i<=0) {
		
	}
	else {
		speed=speed-i;
	}
		
}
}


}
