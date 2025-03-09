
public class programRectangle {

	public static void main(String[] args) {
		 Rectangle r1 = new Rectangle(3, 4, 5, 2);
    	 
 		 Rectangle r2 = new Rectangle(5,6,7,1);
 		 
 		 r2.moveTo(1,5,3,1);
 		 System.out.println(r1.getPerimiter());
 		 System.out.println(r2.getPerimiter());
 		 System.out.println(r1.isSquare());
 	   	 System.out.println(r2.isSquare());
         
		}

	
	}

