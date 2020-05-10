package com.tipsAndTricks.access.package1;

class player {
	private String name;
	private static int count = 0;

	public player(String name) {
		super();
		this.name = name;
		count++;
	}

	static public int getCount() {
		// System.out.println(name);
		return count;
	}

	public String getName() {
		System.out.println(count);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class StaticModifireRunner {

	public static void main(String[] args) {
		player player1 = new player("Ronaldo");
		System.out.println(player.getCount());

		player player2 = new player("Federer");
		System.out.println(player.getCount());

	}

}
