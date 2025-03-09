package mhmat;

public class Clock {
	private int hours;
	private int minutes;
	private int seconds;
	private int milliseconds;
	
public void tick () {
	milliseconds=milliseconds+1;
	seconds=seconds+milliseconds/1000;
	milliseconds=milliseconds%1000;
	minutes=minutes+seconds/60;
	hours=hours+minutes/60;
	seconds=seconds%60;
	minutes=minutes%60;
	hours=hours%24;
	}
public void show(){
	System.out.print("The current time is" );
	System.out.print(':');
	System.out.print(hours);
	System.out.print(':');
	System.out.print(minutes);
	System.out.print(':');
	System.out.print(seconds);
	System.out.print(':');
	System.out.print(milliseconds);
	}
	
public void setMidNight () {
	    int hours=0;
	    int minutes=0;
		 int seconds=0;
		 int milliseconds;
}
		
public void setMidDay () {
	    int hours=12;
	    int minutes=0;
		int seconds=0;
		int milliseconds=0;
		
}
	}
	
