package vlsu;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AbstNode firstTestNode = new MultiNode(Arrays.<AbstNode>asList(
             	                new MinNode(Arrays.<AbstNode>asList(new SimpleNode(5), new SimpleNode(5))),
              	                new MinNode(Arrays.<AbstNode>asList(new SimpleNode(3), new SimpleNode(1))),
            	                new SimpleNode(2),
              	                new SimpleNode(3)
        ));

      	        AbstNode secondTestNode = new MultiNode(Arrays.<AbstNode>asList(
            	                new MinNode(Arrays.<AbstNode>asList(new SimpleNode(5), new SimpleNode(3))),
             	                new MinNode(Arrays.<AbstNode>asList(new SimpleNode(3), new SimpleNode(1))),
          	                new SimpleNode(2),
                        new SimpleNode(3)
                    ));
		System.out.println("The first expression is: " + firstTestNode.toString() + "\tValue is: " + firstTestNode.calculate());
	    System.out.println("The second expression is: " + secondTestNode.toString() + "\tValue is: " + secondTestNode.calculate());

	}
}

