/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
 ***/
package collections.fpij;

import java.util.function.Predicate;


public class PickElementsMultipleCollection {
	public static void main(final String[] args) {
		{
			final long countFriendsStartN = 
					Folks.friends.stream()
					.filter(name -> name.startsWith("N")).count();

			final long countEditorsStartN = 
					Folks.editors.stream()
					.filter(name -> name.startsWith("N")).count();

			final long countComradesStartN = 
					Folks.comrades.stream()
					.filter(name -> name.startsWith("N")).count();

			System.out.println(countFriendsStartN);
			System.out.println(countComradesStartN);
			System.out.println(countEditorsStartN);
		}

		{
			final Predicate<String> startsWithN = name -> name.startsWith("N");

			final long countFriendsStartN = 
					Folks.friends.stream()
					.filter(startsWithN)
					.count();
			final long countEditorsStartN = 
					Folks.editors.stream()
					.filter(startsWithN)
					.count();
			final long countComradesStartN = 
					Folks.comrades.stream()
					.filter(startsWithN)
					.count();

			System.out.println(countFriendsStartN);
			System.out.println(countComradesStartN);
			System.out.println(countEditorsStartN);
		}
	}
}
