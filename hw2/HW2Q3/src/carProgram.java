
public class carProgram {

	public static void main(String[] args) {
	
	car car1 = new car (120,"12345") ;
	car car2 = new car (100,"123456");
	car1.speedUp(5);
	car2.speedUp();
	car1.show();
	car2.show();
	int rnd = (int)(Math.random() * 150 + 50);
	car2.speedUp(rnd);
	car2.slowDown(rnd);
	car2.slowDown();
	car2.speedUp(30);
	car2.show();


     
     

	}
	
}





