/**
  *class Array List Collection
  *@author:shubhamkamble
*/
import java.util.*;
class ArrayListCollection{
	/**
	  *main method
	  *@param args args.
	*/
	public static void main(String args[]){
		//creating arraylist
		ArrayList<String> list=new ArrayList<String>();
		/**
		  *Adding object in array list
		*/
		list.add("Shubham");
		list.add("Gauri");
		list.add("Kunal");
		list.add("Ajay");
		//Traversing list through Iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
