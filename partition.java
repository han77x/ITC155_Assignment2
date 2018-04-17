package ch11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int E=5;
		
		Integer elements[]= {15,1,6,12,-3,4,8,21,2,30,-1,9};
		
		List<Integer>List=
				new LinkedList<Integer>(Arrays.asList(elements));
		List<Integer>newSet=partition(List,E);
		System.out.println(newSet);
	}//end main
		private static List<Integer> partition(List<Integer> List,int E){
		
		List<Integer>List2=new LinkedList<Integer>();
		
		for(Integer e:List)
			if (e.compareTo(E)<0)
				List2.add(e);
		return List2;
		
		
		}//end private static
		}//end class


	
	

