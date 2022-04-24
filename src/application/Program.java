package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

import model.entities.Game;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Stack<Game> games = new Stack<>();

		// creates three different types of games

		Game game1 = new Game("Bioshock", 60.0);
		Game game2 = new Game("LEGO Star Wars", 100.0);
		Game game3 = new Game("Minecraft", 45.0);

		// fills the stack with games (Last In - First Out)

		games.add(game1);
		games.add(game2);
		games.add(game3);

		// prints the stack as it was created above

		System.out.println(games);

		// removes the top item of the stack

		games.pop();

		System.out.println(games);

		// checks if a certain item exists in the stack

		System.out.println();
		System.out.println("Does it contain " + game3 + "? " + games.contains(game3));
		System.out.println("Does it contain " + game1 + "? " + games.contains(game1));

		// checks if the stack is empty or not

		System.out.println();
		System.out.println("Is the stack empty? " + games.empty());

		// gets an element from the stack using its index

		try {

			System.out.println();
			System.out.print("Which index do you want to search for? ");
			int index = sc.nextInt();
			System.out.println("The element on index [" + index + "] is " + games.get(index));

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This index does not exist on the stack.");
		}

		// replaces an element that is stored in a certain index

		System.out.println();
		System.out.println("Replace " + games.get(0) + " with " + game3);
		games.set(0, game3);
		System.out.println(games);

		// gets the size of the stack

		System.out.println();
		System.out.println("The number of elements in the stack is: " + games.size());

		// deletes all the elements of a stack

		System.out.println();
		games.clear();
		System.out.println("Is the stack empty? " + games.empty());
		System.out.println("Current stack elements: " + games);

		sc.close();
	}

}
