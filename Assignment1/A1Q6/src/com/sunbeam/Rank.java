package com.sunbeam;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Rank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		System.out.println("Enter element to search");
		int ele1=sc.nextInt();
		
		Collections.addAll(list, 10, 20, 15, 3, 4, 4, 1);
		
		Stream<Integer> strm1 =list.stream();
		int count=(int) strm1.filter(ele->ele<=ele1).count();
		
		System.out.println("Rank of "+ele1+" is "+count);
		
	}

}