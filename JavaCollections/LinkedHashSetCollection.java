import java.util.*;
/**
  *class LinkedHash Set Collection
  *@author: shubhamkamble
*/
public class LinkedHashSetCollection{
	/**
	  *main method
	  *@param args args
	*/
	public static void main(String args[]){
    		LinkedHashSet<String> set=new LinkedHashSet<String>();
    		set.add("Ravi");
    		set.add("Vijay");
    		set.add("Ravi");
    		set.add("Ajay");
    		Iterator<String> itr=set.iterator();
    		while(itr.hasNext()){
    			System.out.println(itr.next());
    		}
	}
 }
