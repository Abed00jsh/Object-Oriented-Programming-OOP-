
public class Rectangle {
	 private int xu, yu;
	 private int xl, yl;
	 
	public Rectangle (int a, int b, int c, int d) {
		 xu=a;
		 yu=b;
		 xl=c;
		 yl=d;
		 }

	public Rectangle () {
		 xu=0;
		 yu=0;
		 xl=1;
		 yl=-1;
		 }
 public int getArea(){
	    return (xl-xu)*(yu-yl);
		  }
 
 
 public int getPerimiter () {
	 return  (xl-xu)+(yu-yl)+(xl-xu)+(yu-yl) ;
 }
	
 
 public void moveTo(int e, int f, int g, int m) {
	 xu=e;
	 yu=f;
	 xl=g;
	 yl=m;
 }
 
 public boolean isInside(int a, int b) {
	 if (((a> xu) && (a< xl)) && ((b>yl)&&(b<yu))){
		 return true;
	 }
	 else {
		 return false;
	 }
 }
 
 public double getDiagonalLength() {
return	 Math.sqrt((xl-xu)*(xl-xu)+(yu-yl)*(yu-yl));
 }
 
 public void show(){
		System.out.println("xu="+xu+", yu="+yu+", xl="+xl+ ", yl="+yl);
		 }
 
 public boolean  isSquare( ) {
	 if ((xl - xu) == (yu - yl)){
		 return true;
	 }
	 return false;
 }
 
 public boolean isGolden() {
	 if (1.618*(yu-yl) == (xl-xu)) {
		 return true;
	 }
	 return false;
 }
}


