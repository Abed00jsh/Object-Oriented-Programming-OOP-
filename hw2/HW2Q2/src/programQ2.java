
public class programQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StraightLine Line = new StraightLine(0.0, 1.0, 4.0, 3.0);
		StraightLine parallel = new StraightLine(0.0, 0.0, 8.0, 4.0);
		System.out.println(parallel.slope());
		StraightLine perpendicular = new StraightLine(0.0, 1.0, 4.0, -7.0);
		double x;
		x= (Line.slope()*(perpendicular.slope()));
		System.out.println(x);
	}

}