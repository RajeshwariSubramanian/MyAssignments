package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		//input
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};	
		
		//Create Treeset and add into set
		Set<Integer> secLarg=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			secLarg.add(data[i]);			
		}
		System.out.println("TreeSet:"+secLarg);
		
		//Convert set into List and find second largest 
		
		List<Integer> setInToList=new ArrayList<Integer>(secLarg);
		System.out.println("List:"+setInToList);
		
		int count=setInToList.size();
		
		int secondLargestNumber=setInToList.get(count-2);
		System.out.println("The Second Largest Number in List:"+secondLargestNumber);
		
	}

}
