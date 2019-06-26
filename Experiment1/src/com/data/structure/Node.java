package com.data.structure;

public class Node {
	private int data;
	private Node node;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	public Node(int data, Node node) {
		super();
		this.data = data;
		this.node = node;
	}
	

}
