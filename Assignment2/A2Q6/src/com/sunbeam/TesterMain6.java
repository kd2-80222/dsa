package com.sunbeam;

import java.util.Scanner;

public class TesterMain6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Descending Stack = ");
		int size = sc.nextInt();
		DescStack st = new DescStack(size);
		int choice;

		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (st.isFull())
					System.out.println("Stack is full");
				else {
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					st.push(data);
				}
				break;
			case 2:
				if (st.isEmpty())
					System.out.println("Stack is Empty");
				else
					st.pop();
				break;
			case 3:
				if (st.isEmpty())
					System.out.println("Stack is Empty");
				else
					System.out.println("Peeked Data : " + st.peek());
				break;
			}
		} while (choice != 0);

		sc.close();

	}
}
