package vlsu;

public  class MultiNode  implements  AbstNode {
    private  final  AbstNode leftNode;
    private final  AbstNode rightNode;

    public MultiNode(AbstNode leftNode, AbstNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public int calculate() {
        if (leftNode.calculate()== 0)
            return 0;
        else
            return  leftNode.calculate() * rightNode.calculate();
    }
     @Override
    public String toString() {
        return  "(" + leftNode.toString() + ") * (" + rightNode.toString() + ")";
    }
}
