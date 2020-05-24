package vlsu;

import java.util.Collection;

public  class MinNode implements  AbstNode {
 	    private final Collection<AbstNode> nodeList;

public MinNode(Collection<AbstNode> nodeList) {
      	        this.nodeList = nodeList;
     	    }

       	    public int calculate() {
    	        int result = 0;
        	        boolean first = true;
   	        for (AbstNode node : nodeList) {
        	            if (first) {
              	                result = node.calculate();
             	                first = false;
              	            } else {
            	                result -= node.calculate();
             	            }
         	        }
       	        return result;
      	    }

        public String toString() {
     	        String result = "";
    	        boolean first = true;
    	        for (AbstNode node : nodeList) {
       	            if (!first) result += "-";
   	            first = false;
   	            result += "(" + node + ")";
      	        }
  	        return result;
 	    }
 	}


