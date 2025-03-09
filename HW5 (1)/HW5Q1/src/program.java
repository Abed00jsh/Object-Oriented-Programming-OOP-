
public class program {

	public static void main(String[] args) {

		 Segment sg1 = new Segment();
		 Segment sg2 = new Segment(1,2,4,6);
		 Segment sg3 = new Segment(4,6);
		 Point p1 = new Point(1,2);
		 Point p2 = new Point (4,6);
		 Segment sg4 = new Segment (p1,p2);
		 Segment sg5 = new Segment (1,2,p2);
		 Segment sg6 = new Segment (p1,4,6);
		 Segment sg7 = new Segment (new Point(1,2), new Point(4,6));
		 Segment sg8 = new Segment (sg6);
		 sg1.readSegment();
		 sg1.middle().show();

		 Segment sg9 = new Segment (sg1.middle() , sg2.middle());


		 System.out.print(sg1.length());
		 if ( sg1.greaterThan(sg2))
		  sg1.show();
		 else
		  if ( sg1.lessThan(sg2))
		  sg2.show();
		  else {
		  sg1.show();
		  sg2.show();
		  }
		 if ( sg1.equals(sg2))
			 System.out.print("yes");
			else
			 System.out.print("no");
		 
		 System.out.print(sg1.compareTo(sg2));

	}

}
