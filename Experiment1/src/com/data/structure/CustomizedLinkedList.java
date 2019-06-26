package com.data.structure;

public class CustomizedLinkedList {

	private Node start;
	private Node end;
	private int size;

	public void add(int data) {
		if (null == start) {
			start = new Node(data, null);
			end = start;
			size++;
		} else {
			Node node = new Node(data, null);
			end.setNode(node);
			end = node;
			size++;
		}
	}

	public void display() {
		Node node = start;
		while (null != node) {
			System.out.println(node.getData()+ " --->");
			node = node.getNode();

		}

	}

	public int size() {
		return size;
	}

	public void findMiddle() {
		int mid = size / 2;
		get(mid+1);

	}

	public void get(int index) {
		Node node = start;
		for (int i = 0; i < index; i++) {
			if (i == (index - 1)) {
				System.out.println(node.getData() + " is present at the given index "+index);
				break;
			}
			node = node.getNode();

		}

	}

	public void remove(int index) {
		Node node = start;
		Node tempNode=null;
		for (int i = 0; i < index; i++) {
			if (i == (index - 1)) {
				System.out.println(node.getData() + " is removed at the given index "+index);
				tempNode.setNode(node.getNode());
				display();

				break;
			}
			tempNode=node;
			node = node.getNode();

		}

	}

	private void getNode(int index) {
		// TODO Auto-generated method stub
		
	}

	public void update(int index, int value) {

		Node node = start;
		for (int i = 0; i < index; i++) {
			if (i == (index - 1)) {
				System.out.println(node.getData() + " is updated  at the given index "+index +" to givan value "+value);
				node.setData(value);
				
				break;
			}
			node = node.getNode();

		}

	
		
		
	}

	public void add(Node n) {

		if (null == start) {
			start = n;
			end = start;
			size++;
		} else {
			end.setNode(n);
			end = n;
			size++;
		}
	
	}

	public boolean isCyclic() {
		Node fast=start;
		Node slow=start;
		while(fast != null && fast.getNode()!=null ) {
			fast=fast.getNode().getNode();
			slow=slow.getNode();
			if(fast==slow) {
				System.out.println(" loop is at "+slow.getData());
				return true;
			}
					
		}
		return false;
	}
	
	
	
	public void deleteLast() {
	//	Node newReverseNode = null;
		Node node = start;
		Node temp=null;
		while (null != node.getNode()) {
			
			temp=node;
			node = node.getNode();
		}
		System.out.println(node.getData());
		temp.setNode(null);
	//	newReverseNode=node;
		
	}
}
