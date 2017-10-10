package array;
//Package is a grouping of related types providing access protection and name 
//space management
import java.util.Arrays;

public class Array{
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
//Type casting is a class name
		
//Recursion in java is a process in which a method calls itself continuously. 
//A method in java that calls itself is called recursive method.

  public static void main(String args[]){
//Java Program processing starts from the main() method which is a mandatory part of every program 		
//static used to prepare a field,method or inner classes as a class field.
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
//String is predefined class name 
//args is name of the array

    int[] abc ={3,1,10,5,20};
//Integer Array is created. 
    int n = 5;
//Size of the array which is integer data tyep
  Array.recursiveCall(abc, n);

   //Array is calling the recursion  

  }

  public static void recursiveCall(int[] abc, int n){

      if(abc.length <= 1) return;               // Base case: just 1 

    int[] a = new int[abc.length / 2];        // Split array into two
//For example the array has 5 elements it will divide 5 into 2 halves and 2 elements in one set 
    //and last 2 elements in other the middle one will be alone. If size is 6 then 3 will be in
    //one half other are in other half
    int[] b = new int[abc.length - a.length]; //   halves, a and b
//we are taking halves again sorting them into halves
    for(int i = 0; i < abc.length; i++) {
//the sorting will start from the first position
        if(i < a.length) a[i] = abc[i];
//length of abc and a need to be same
        else             b[i - a.length] = abc[i];
        //otherwise the index minus length of a is to be equal to abc index

    }

    recursiveCall(a, n);                              // Recursively sort first

    recursiveCall(b, n);                              //   and second half.

    int ai = 0;        // Merge halves: ai, bi  track position in each half.

    int bi = 0;                                

    while(ai + bi < abc.length) {                
//the arrays of ai and bi should be greater than length
        if(bi >= b.length || (ai < a.length && a[ai] < b[bi]))
       //when the b array is not equal to length the it will go a array and see whether a is
        	//greater than b
        {

            abc[ai + bi] = a[ai]; // (copy element of first array over)

            ai++;// a array will be sorted

        } else {

            abc[ai + bi] = b[bi]; // (copy element of second array over)

            bi++;// b array to be sorted

        }

    }

    System.out.println(Arrays.toString(abc));
    //print the final array after sorting
    //System is a final class in java.lang package
	//out is a static member field of system class and it's type PrintStream
	//println is a method of PrintStream class and it means print in next line
	//Inside the brackets is value which to be printed		
	
  }

  

}
