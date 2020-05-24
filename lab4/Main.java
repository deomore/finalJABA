package vlsu;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
        ArrayList pointList = new ArrayList();
        	        int N;
        	        System.out.print("Enter the number of points: ");
        	        N = console.nextInt();
        	        System.out.println();

         	        for(int i = 0; i < N; i++) {
            	            System.out.print("X = ");
            	            double x = console.nextDouble();
            	            System.out.print("Y = ");
            	            double y = console.nextDouble();
            	            System.out.println();
            	            pointList.add(new Points(x,y));
            	        }

         	        OutPut(pointList);
    }

         	    private static void OutPut (ArrayList list) {
        	        Collections.sort(list, new PointComparator());
        	        for(Object obj : list) {
            	            System.out.println(obj.toString());
        	        }
    }
}


