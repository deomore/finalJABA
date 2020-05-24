package vlsu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество элементов ");
        int n = console.nextInt();
        System.out.println("Теперь введите элементы");
        List first = null;
      	        for (int i = 0; i < n; i++) {
         	            int value = console.nextInt();
           	            first = List.insert(first, value);
          	        }

        	        int sum = List.sum(List.raiseToCube(List.filter3(first)));
       	        System.out.println(sum);
         	    }
    }


