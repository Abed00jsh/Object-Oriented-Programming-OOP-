
public class programSet {

	public static void main(String[] args) {

		Set s1 = new Set (2,6,1,2,2,6,7,19,5);
		Set s2 = new Set();
		s2.add(7);
		s2.add(2);
		s2.add(8);
		s2.add(11);
		Set s3;
		s3= s1.union(s2);
		s3.show();
		s1.intersect(s2).show();
		System.out.println( s1.union(s2).subset(s1.intersect(s2)));
		int[] b;
		b = s3.toArray();
		for (int k=0; k<b.length;k++)
		 System.out.println(b[k]);
		}

		
	

}
