package vlsu;

import java.util.Collection;

public  class  MultiNode implements  AbstNode{

      private final Collection<AbstNode> nodeList;

       	    public MultiNode(Collection<AbstNode> nodeList) {
        	        this.nodeList = nodeList;
      	    }

      	    public int calculate() {
     	        int result = 1;
     	        for(AbstNode node : nodeList)
          	        {
          	            result *= node.calculate();
            	            if(result == 0) break;
           	        }
       	        return result;
       	    }

      	    public String toString() {
    	        String result = "";
      	        boolean first = true;

     	        for(AbstNode node : nodeList)
         	        {
          	            if(!first) result += "*";
         	            first = false;
         	            result += "(" + node + ")";
          	        }
      	        return result;
    	    }
}
