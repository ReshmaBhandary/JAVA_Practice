package com.data.structure;

public class LinkedListMain {

	public static void main(String[] args) {
		CustomizedLinkedList list = new CustomizedLinkedList();
		/*list.add(1);
		list.add(2);
		list.add(7);
		list.add(3);
		list.add(9);
		list.display();
		System.out.println("sizeoflist "+list.size());
		list.get(2);
		list.findMiddle();
		System.out.println("*****************");
		list.remove(3);
		list.update(3,10);
		list.display();*/
		System.out.println("************************************************************************");
		Node n=new Node(12, null);
		list.add(n);
		list.add(new Node(13, null));
		list.add(new Node(14, null));
		list.add(new Node(15, n));
		//list.add(n);
		
		//list.display();
	//	list.deleteLast();
	//	list.display();
		boolean isCyclic=list.isCyclic();
		System.out.println(isCyclic);
		 
		
	}

}
