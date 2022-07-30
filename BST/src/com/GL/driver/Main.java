package com.GL.driver;
import java.util.*;

public class Main {

	static class node {
		int data;
		node left;
		node right;

		node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	};

	static void print(node parent) {
		node curr = parent;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.right;
		}
	}

	static node prev;

	static void Inorder(node curr) {

		if (curr == null)
			return;
		Inorder(curr.left);
		prev.left = null;
		prev.right = curr;
		prev = curr;
		Inorder(curr.right);
	}

	static node flatten(node parent) {
		node dummy = new node(-1);

		prev = dummy;

		Inorder(parent);

		prev.left = null;
		prev.right = null;
		node ret = dummy.right;

		return ret;
	}

	public static void main(String[] args) {
		node root = new node(50);
		root.left = new node(30);
		root.right = new node(60);
		root.left.left = new node(10);
		root.right.left = new node(55);
		

		print(flatten(root));
	}
}
