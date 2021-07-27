import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
	    Scanner inputLength = new Scanner(System.in);
	    System.out.println("Enter eight co-ordinates x1,y1,x2,y2,x3,x4,y3,y4");
	    double x1= inputLength.nextDouble();
	    double x2= inputLength.nextDouble();
	    double y1= inputLength.nextDouble();
	    double y2= inputLength.nextDouble();
	    double x3= inputLength.nextDouble();
	    double x4= inputLength.nextDouble();
	    double y3= inputLength.nextDouble();
	    double y4= inputLength.nextDouble();
	    
	           System.out.println("Co-ordinates given are :" +"\n"+ "x1="+ x1 + "\n" + "x2="+ x2 + "\n" + "y1="+ y1 +  "\n" + "y2="+ y2);
	           System.out.println("Co-ordinates given are :" +"\n"+ "x3="+ x3 + "\n" + "x4="+ x4 + "\n" + "y3="+ y3 +  "\n" + "y4="+ y4);
		double length_L1 = Math.sqrt( ( ( x2 - x1 ) * ( x2 - x1 ) ) + ( ( y2 - y1 ) * ( y2 - y1 ) ) );
	    	   System.out.println("Length of line,L1 = " +length_L1 +"cm");
	    double length_L2 = Math.sqrt( ( ( x4 - x3 ) * ( x4 - x3 ) ) + ( ( y4 - y3 ) * ( y4 - y3 ) ) );
	    	   System.out.println("Length of line,L2 = " +length_L2 +"cm");
	
	
	    	if (Double.compare(length_L1, length_L2) == 0){
	    		System.out.println("Both lines are equal in length");
	    	    }
	    	else {
	    			System.out.println("Both lines are not equal in length");
	    	}
	
	}
	
	
	
}
