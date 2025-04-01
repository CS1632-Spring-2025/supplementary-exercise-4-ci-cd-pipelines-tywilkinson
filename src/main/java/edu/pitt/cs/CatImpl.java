package edu.pitt.cs;

public class CatImpl implements Cat {

	int catId;
	String catName;
	boolean catRented = false;

	public CatImpl(int id, String name) {
		catId = id;
		catName = name;
	}

	public void rentCat() {
		catRented = true;
	}

	public void returnCat() {
		catRented = false;
	}

	public void renameCat(String name) {
		catName = name;
	}

	public String getName() {
		return catName;
	}

	public int getId() {
		return catId;
	}

	public boolean getRented() {
		return catRented;
	}

	public String toString() {
		String ans = "ID " + catId + ". " + catName;
		return ans;
	}

}