import java.util.Random;
import java.util.Scanner;
public class shellsort {
	public static void main(String args[]) {
		int number_of_elements, c, d;
        int  minIndex, tmp;
		int s=0;
	    
	    Scanner in = new Scanner(System.in);
	 
	    System.out.println("Input number of integers to sort");
	    number_of_elements = in.nextInt();
	    int array[] = new int[number_of_elements];
	    System.out.println("Enter " + number_of_elements + " integers");
	    for (c = 0; c <number_of_elements ; c++) {
	        int rnd = new Random().nextInt(number_of_elements);
	        array[c] = rnd;
	    }
 int comp=0;
 int swap=0;
        int i1, i, j, increment, temp;
         /* Shell Sort Program */
         for (increment = number_of_elements / 2; increment > 0; increment /= 2)
         {
                for (i = increment; i < number_of_elements; i++)
             {  
                	comp++;
                    temp = array[i];
                        for (j = i; j >= increment; j -= increment) 
                    {
                        	comp++;
                        	
                            if (temp < array[j - increment]) {
                            	swap++;
                                array[j] = array[j - increment];
                            } else {
                                break;
                            }
                        }
                       array[j] = temp;
            }
        }
        System.out.println("After Sorting:");
        System.out.println("swap =" +swap +" comp ="+ comp);
        for (i1 = 0; i1 < 5; i1++) {
            System.out.println(array[i1]);
        }
        
    }
	
}
