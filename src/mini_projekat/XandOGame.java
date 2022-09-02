package mini_projekat;

import java.util.ArrayList;

public class XandOGame {
	ArrayList<String> table = new ArrayList<String>();
	private Player nextPlayer;
	private Player playerX;
	private Player playerO;
	
	public Player getNextPlayer() {
		return nextPlayer;
	}
	public void setNextPlayer(Player nextPlayer) {
		this.nextPlayer = nextPlayer;
	}
	public Player getPlayerX() {
		return playerX;
	}
	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}
	public Player getPlayerO() {
		return playerO;
	}
	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}
	public ArrayList<String> getTable() {
		return table;
	}
	public XandOGame() {
		super();
		for (int i = 0; i < 9; i++) {
			table.add(" ");
		}
	}
	public XandOGame(Player playerX, Player playerO) {
		super();
		this.playerX = playerX;
		this.playerO = playerO;
		for (int i = 0; i < 9; i++) {
			table.add(" ");
		}
	}
	
	public void print() {
		System.out.println(table.get(0) + " | " + table.get(1) + " | " + table.get(2) + " |");
		System.out.println(table.get(3) + " | " + table.get(4) + " | " + table.get(5) + " |");
		System.out.println(table.get(6) + " | " + table.get(7) + " | " + table.get(8) + " |");
	}
	
	public void startGame() {
		for (int i = 0; i < 9; i++) {
			table.set(i, " ");
			nextPlayer = playerX;
		}
	}
	
	public boolean isGameOver() {
		for (int i = 0; i < 9; i++) {
			if (!"x".equals(table.get(i)) || !"o".equals(table.get(i))) {
				System.out.println("Game is not over!");
				return false;
			} 
		}
		if (true) {
			System.out.println("Game is over");
		}
		return true;
		
	}
	
	public boolean isFieldFree(int fieldNumber) {
		if ("x".equals(table.get(fieldNumber)) || "o".equals(table.get(fieldNumber))) {
			System.out.println("Polje nije prazno!");
			return false;
		} else {
			System.out.println("Poslje je prazno!");
			return true;
		}
		
	}
	
	public void playNext() {
		if (this.nextPlayer == this.playerX) {
			this.nextPlayer = this.playerO;
		} else if (this.nextPlayer == this.playerO) {
			this.nextPlayer = this.playerX;
		}
	}
	
	public void makeAMove(int pozicijaPoteza) {
		if (table.get(pozicijaPoteza).equals(" ") && this.nextPlayer == this.playerX) {
			table.set(pozicijaPoteza, "x");
		} else if (table.get(pozicijaPoteza).equals(" ") && this.nextPlayer == this.playerO) {
			table.set(pozicijaPoteza, "o");
		} else {
			System.out.println("Polje je zauzeto, izaberite drugo polje!");
		}
	}
	
	public boolean isWinnerX() {
		if (table.get(0).equals("x") && table.get(1).equals("x") && table.get(2).equals("x")) {
			System.out.println("Player X is the winner!");
			return true;
		} else if (table.get(3).equals("x") && table.get(4).equals("x") && table.get(5).equals("x")) {
			System.out.println("Player X is the winner!");
			return true;
		} else if (table.get(6).equals("x") && table.get(7).equals("x") && table.get(8).equals("x")) {
			System.out.println("Player X is the winner!");
			return true;
		} else if (table.get(0).equals("x") && table.get(4).equals("x") && table.get(8).equals("x")) {
			System.out.println("Player X is the winner!");
			return true;
		} else if (table.get(2).equals("x") && table.get(4).equals("x") && table.get(6).equals("x")) {
			System.out.println("Player X is the winner!");
			return true;
		} else if (table.get(0).equals("x") && table.get(3).equals("x") && table.get(6).equals("x")) {
			System.out.println("Player X is the winner!");
			return true;
		} else if (table.get(1).equals("x") && table.get(4).equals("x") && table.get(7).equals("x")) {
			System.out.println("Player X is the winner!");
			return true;
		} else if (table.get(2).equals("x") && table.get(5).equals("x") && table.get(8).equals("x")) {
			System.out.println("Player X is the winner!");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isWinnerO() {
		if (table.get(0).equals("o") && table.get(1).equals("o") && table.get(2).equals("o")) {
			System.out.println("Player O is the winner!");
			return true;
		} else if (table.get(3).equals("o") && table.get(4).equals("o") && table.get(5).equals("o")) {
			System.out.println("Player O is the winner!");
			return true;
		} else if (table.get(6).equals("o") && table.get(7).equals("o") && table.get(8).equals("o")) {
			System.out.println("Player O is the winner!");
			return true;
		} else if (table.get(0).equals("o") && table.get(4).equals("o") && table.get(8).equals("o")) {
			System.out.println("Player O is the winner!");
			return true;
		} else if (table.get(2).equals("o") && table.get(4).equals("o") && table.get(6).equals("o")) {
			System.out.println("Player O is the winner!");
			return true;
		} else if (table.get(0).equals("o") && table.get(3).equals("o") && table.get(6).equals("o")) {
			System.out.println("Player O is the winner!");
			return true;
		} else if (table.get(1).equals("o") && table.get(4).equals("o") && table.get(7).equals("o")) {
			System.out.println("Player O is the winner!");
			return true;
		} else if (table.get(2).equals("o") && table.get(5).equals("o") && table.get(8).equals("o")) {
			System.out.println("Player O is the winner!");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isValidMove(int pozicijaPoteza) {
		if (pozicijaPoteza >= 0 && pozicijaPoteza <= 8) {
			return true;
		} else {
			return false;
		}
	}
	
	public int gameScore() {
		if (isWinnerX() == true) {
			return 1;
		} else if (isWinnerO() == true) {
			return 2;
		} else {
			return 0;
		}
	}

}
