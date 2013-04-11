
public class Point {

	double x, y ;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double distance (Point p) {
		double dx=x-p.x;
		double dy=y-p.y;
		return Math.sqrt(dx*dx+dy*dy) ;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Point I = new Point(1, 0) ;
		Point J = new Point(0, 1) ;
		Point M = new Point(1, 1) ;
		
		System.out.println ("D(I,J)="+I.distance(J)) ;
		System.out.println ("D(I,M)="+I.distance(M)) ;
	}

}
