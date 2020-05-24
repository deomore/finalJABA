package vlsu;

public class Main {

    public static void main(String[] args) {
	AbstNode firstTestNode = new MultiNode(
	        new MinNode(new SimpleNode(5),new SimpleNode(5)),
            new MinNode(new SimpleNode(3),new SimpleNode(1))
    );
	AbstNode secondTestNode = new MultiNode(
	        new MinNode(new SimpleNode(5),new SimpleNode(3)),
            new MinNode(new SimpleNode(3),new SimpleNode(1)));

        System.out.println("The first expression is: " + firstTestNode.toString() + "\tValue is: " + firstTestNode.calculate());
        System.out.println("The second expression is: " + secondTestNode.toString() + "\tValue is: " + secondTestNode.calculate());

    }
}

