package ch03;

public class Example03 {

	static double calc(double gasoline, double distance) {
		System.out.println(distance / gasoline);
		int e =(int)(distance / gasoline);
		System.out.println(e);//2
		return e;
	}
	
	public static void main(String[] args) {

		double gasoline = 8.86;
		double distance = 182.736;
		double efficiency = calc(gasoline, distance);
		System.out.println(efficiency);//2.0
		System.out.println("연비: " + efficiency+ "km/L");
	}

}
//calc에서 2로 받은 값을 main에서 2.0으로 더블로 고쳐준거다.