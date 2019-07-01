package ie.gmit.sw.ai;

import ie.gmit.sw.ai.traversers.Node;

public class player extends Node{
	
	private Node[][] maze;
	private double playerHealth;
	
	private int weapon;

	
	
	public player(int row, int col, int type, Node[][] maze) {
		super(row, col, type);
		this.maze = maze;
	}
	
	public double getPlayerHealth() {
		return playerHealth;
	}

	public void setPlayerHealth(double playerHealth) {
		this.playerHealth = playerHealth;
	}
	
	public int getPlayerWeapon() {
		return weapon;
	}

	public void setPlayerWeapon(int weapon) {
		this.weapon = weapon;
	}

}
