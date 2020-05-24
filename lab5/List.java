package vlsu;

public  class List {

        private final int value;
        private List nextElem;

        public List(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public List getNext() {
            return nextElem;
        }

        public void setNext(List nextElem) {
            this.nextElem = nextElem;
        }

         public static List insert(List first, int value) {
               if (first == null) {
                          return new List(value);
                     } else {
                	            List newElement = new List(value);
                	            newElement.setNext(first);
                 	            return newElement;
                	        }
           	    }

        	    public static List filter3(List first) {
             	        List resultList = null;
            	        while (first != null) {
                	            int value = first.getValue();
               	            if (value % 3 == 0) {
                  	                resultList = insert(resultList, value);
                   	            }
                 	            first = first.getNext();
                	        }
             	        return resultList;
            	    }

         	    public static List raiseToCube(List first) {
          	        if (first == null) {
                	            return null;
                 	        }

             	        int value = first.getValue();
            	        return insert(raiseToCube(first.getNext()), value * value * value);
             	    }

        	    public static int sum(List first) {
           	        int sum = 0;
            	        while (first != null) {
                	            sum += first.getValue();
                	            first = first.getNext();
                	        }
             	        return sum;
         	    }
}

