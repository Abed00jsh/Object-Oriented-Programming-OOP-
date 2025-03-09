
public class StraightLine {
  private double x1,y1;
  private double x2,y2;
  
  
  public StraightLine() {
	  x1=0.0;
	  y1=1.0;
	  x2=4.0;
	  y2=3.0;
  }
  public StraightLine(double a, double b, double c, double d) {
	  x1=a;
	  y1=b;
	  x2=c;
	  y2=d;
  }
  
  public StraightLine(double a, double b) {
	  x1=a;
	  y1=b;
	  x2=0.0;
	  y2=0.0;
  }
  
  
 
  public void show () {
		System.out.print("("+ x1+","+y1+ ")");
		System.out.print("-"+"("+ x2+","+y2+ ")");
  }
  
  
  public double slope() {
	  return (y1-y2)/(x1-x2);
  }
  
  public boolean isOn(double x, double y) {
	  
	    double a = slope();
	    double b = y1 - a * x1;
	    double yOnLine = a * x + b;
	    return Math.abs(y - yOnLine) < 0.000001;
	    
	}
  
  
}