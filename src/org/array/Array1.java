package org.array;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Array1 {
	public static void main(String[]args) {
		
		int [] r =new int[7];
		
		r[0]=2000;
		r[1]=3000;
		r[2]=1000;
		r[3]=5000;
		r[4]=6000;
		r[5]=7000;
		r[6]=8000;
		
		System.out.println("Array values");
		
		{for(int i=0;i<r.length;i++) {System.out.println(r[i]);}}
		
		System.out.println('\n'+"Array to list value");
		
		List<Integer> li = new ArrayList<Integer>();
		System.out.println('\n'+"For LOOP");
		
		for(int i=0;i<r.length;i++) {
			 li.add(r[i]);}
			 
		System.out.println(li);
		
		Set<Integer> s = new LinkedHashSet<Integer>();
		System.out.println('\n'+"List to set value");
		
		s.addAll(li);
		
		System.out.println(s);
	
	
	
	}}
		
				
	