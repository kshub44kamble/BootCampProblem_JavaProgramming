import java.util.*;
/**
  *Linked List Collection problem
  *@author: shubhamkamble
*/
public class LinkedListCollection{
/**
  *main method
  *@param args
*/
public static void main(String args[]){
	LinkedList<String> al=new LinkedList<String>();
	al.add("Shubham");
	al.add("Gauri");
	al.add("Kunal");
	al.add("Ajay");
	Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
    		}
	}
}
