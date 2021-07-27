import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter four co-ordinates x1,y1,x2,y2");
	    double x1= myObj.nextDouble();
	    double x2= myObj.nextDouble();
	    double y1= myObj.nextDouble();
	    double y2= myObj.nextDouble();
	           System.out.println("Co-ordinates given are :" +"\n"+ "x1="+ x1 + "\n" + "x2="+ x2 + "\n" + "y1="+ y1 +  "\n" + "y2="+ y2);
		double length_L1 = Math.sqrt( ( ( x2 - x1 ) * ( x2 - x1 ) ) + ( ( y2 - y1 ) * ( y2 - y1 ) ) );
	    	   System.out.println("Length of line,L1 = " +length_L1);
	}
}
