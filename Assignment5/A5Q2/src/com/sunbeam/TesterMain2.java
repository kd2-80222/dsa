//2. Implement stack and queue using linked list.

package com.sunbeam;

import java.util.Scanner;

public class TesterMain2 {
	public static void main(String[] args) {
		Stack st= new Stack();
		int choice;

		Scanner sc  = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					st.push(data);
				
				break;
			case 2:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					 st.pop();
				break;
			case 3:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Peeked Data = " + st.peek());
				break;
			}
		}while(choice != 0);
		
		sc.close();
	}

}
