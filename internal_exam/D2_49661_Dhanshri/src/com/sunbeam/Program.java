package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Node{
	Node prev;
	Vehicle vehicle;
	Node next;
	
	public Node(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}

class LinkedList {
	Node head;
	Node tail;
	public boolean empty() {
		return this.head == null;
	}
	public void addFirst(Vehicle vehicle) {
		Node newNode = new Node(vehicle);
		if(this.empty()) {
			this.head = newNode;
			this.tail = newNode;
			this.head.prev = this.tail;
			this.tail.next = this.head;
		}else {
			this.head.prev = newNode;
			newNode.next = this.head;
			this.head = newNode;
			this.head.prev = this.tail;
			this.tail.next = this.head;
		}
	}
	public void addLast(Vehicle vehicle) {
		Node newNode = new Node(vehicle );
		if( this.empty())
			this.head = newNode;
		else {
			this.tail.next = newNode;
			newNode.prev = this.tail;	
		}
		this.tail = newNode;
		this.head.prev = this.tail;
		this.tail.next = this.head;
		
		System.out.println(this.tail.vehicle);
	} 
	
	public void removeFirst() {
		if(this.empty())
			throw new InvalidOperationException("List is empty !");
		else if(this.head == this.tail)
			this.head = this.tail = null;
		else
		{
			Node temp = this.head;
			this.head = this.head.next;
			this.head.prev = this.tail;
			this.tail.next = this.head;
			
			temp.next = temp.prev = temp = null;
		}
	}
	
	public void removeLast() {
		if(this.empty())
			throw new InvalidOperationException("List is empty !");
		else if(this.head == this.tail)
			this.head = this.tail = null;
		else
		{
			Node temp = this.tail;
			this.tail = this.tail.prev;
			this.head.prev = this.tail;
			this.tail.next = this.head;
			
			temp.next = temp.prev = temp = null;
		}
	}
	public Vehicle searchByNumber(int number) {
		if(this.empty())
			throw new InvalidOperationException("List is empty !");
		else {
			Node trav = this.head;
			do {
				if(trav.vehicle.getNumber() == number)
					return trav.vehicle;
				trav = trav.next;
			}while(trav != this.head);
			
		}
		return null;
	}
	
	public void reverse( ) {
		if( this.empty())
			throw new InvalidOperationException("LinkedList is empty");
		Node current, next;
		current = this.head;
		while(current != this.tail) {
			next = current.next;
			current.next = current.prev;
			current.prev = next;
			current = next;
		}
		current.next = current.prev;
		current.prev = head;
		current = head;
		this.head = this.tail;
		this.tail = current;
	}
	
	public void sort() {
		Node current = this.head;
		Node index = null;
		Vehicle temp = null;
		if(this.empty())
			throw new InvalidOperationException("List is empty !");
		
		for(current = this.head; current!= this.tail; current = current.next) {  
  
            for(index = current.next; index != this.head; index = index.next) {  
                
                if(current.vehicle.getPrice() > index.vehicle.getPrice()) {  
                    temp = current.vehicle;  
                    current.vehicle = index.vehicle;  
                    index.vehicle = temp;  
                }  
            } 
		}
	}
	
	public void printList( ) throws InvalidOperationException{
		if( this.empty())
			throw new InvalidOperationException("LinkedList is empty");
		Node trav = this.head;
		do{
			System.out.print(trav.vehicle+"	");
			trav = trav.next;
			System.out.println();
		}while( trav != this.head );
		System.out.println();
	}
	
}

class InvalidOperationException extends RuntimeException{
	private static final long serialVersionUID = -8724484729031480234L;
	public InvalidOperationException(String message) {
		super(message);
	}
}
public class Program {
	private static Scanner sc = new Scanner(System.in);
	
	private static void acceptNumber(int[] Number) {
		System.out.print("Enter number to search vehicle	:	");
		Number[0] = sc.nextInt();
	}
	private static Vehicle acceptRecord(Vehicle vehicle) {
		System.out.println();
		sc.nextLine();
		System.out.print("Enter Company Name	:	");
		vehicle.setCompany(sc.nextLine());
		System.out.print("Enter Model       	:	");
		vehicle.setModel(sc.nextLine());
		System.out.print("Enter Type         	:	");
		vehicle.setType(sc.nextLine());
		System.out.print("Enter Price	        :	");
		vehicle.setPrice(sc.nextDouble());
		System.out.print("Enter Number	      	:	");
		vehicle.setNumber(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter Color	      	:	");
		vehicle.setColour(sc.nextLine());
		
		return vehicle;
	}
	public static int menuList( ) {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Add Last Vehicle object into the list.");
		System.out.println("2.Add Fisrt Vehicle object into the list.");
		System.out.println("3.Delete Last Vehicle object from the list.");
		System.out.println("4.Delete First Vehicle object from the list.");
		System.out.println("5.Search Vehicle by No.");
		System.out.println("6.Print all Vehicle details.");
		System.out.println("7.Print Vehicle list in reverse order.");
		System.out.println("8.Sort Vehicle List by price.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		int choice;
		int[] Number = new int[1];
		LinkedList list = new LinkedList();
		while((choice = Program.menuList()) != 0) {
			switch(choice) {
			case 1:
				Vehicle v1 = Program.acceptRecord(new Vehicle());
				list.addLast(v1);
				break;
			case 2:
				Vehicle v2 =Program.acceptRecord(new Vehicle());
				list.addFirst(v2);
				break;
			case 3:
				list.removeLast();
				break;
			case 4:
				list.removeFirst();
				break;
			case 5:
				Program.acceptNumber(Number);
				System.out.println(list.searchByNumber(Number[0]));
				break;
			case 6:
				list.printList();
				break;
			case 7:
				list.reverse();
				list.printList();
				break;
			case 8:
				list.sort();
				list.printList();
				break;
			}
		}
	}
}
