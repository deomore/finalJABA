package vlsu;

public class MinNode implements  AbstNode{
    private  final AbstNode leftNode;
    private  final  AbstNode rightNode;

    public MinNode (AbstNode leftNode,  AbstNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public int calculate() {
            return leftNode.calculate() - rightNode.calculate();
    }
    @Override
    public String toString() {
        return "(" + leftNode.toString() + ") - (" + rightNode.toString() + ")";
    }
}
