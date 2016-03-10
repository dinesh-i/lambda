/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
 ***/
package collections.fpij;

import static java.util.stream.Collectors.joining;

public class PrintList {
	public static void main(final String[] args) {
		System.out.println("//" + "START:FOREACH_OUTPUT");
		for(final String name : Folks.friends) {
			System.out.print(name + ", ");
		}
		System.out.println();
		System.out.println("//" + "END:FOREACH_OUTPUT");

		System.out.println("//" + "START:FOR_OUTPUT");
		for(int i = 0; i < (Folks.friends.size() - 1); i++) {
			System.out.print(Folks.friends.get(i) + ", ");
		}
		if(Folks.friends.size() > 0) 
			System.out.println(Folks.friends.get(Folks.friends.size() - 1));
		System.out.println("//" + "END:FOR_OUTPUT");

		System.out.println("//" + "START:JOIN_OUTPUT");
		System.out.println(String.join(", ", Folks.friends));
		System.out.println("//" + "END:JOIN_OUTPUT");

		System.out.println("//" + "START:MAP_JOIN_OUTPUT");
		System.out.println(
				Folks.friends.stream()
				.map(String::toUpperCase)
				.collect(joining(", ")));
		System.out.println("//" + "END:MAP_JOIN_OUTPUT");

	}
}
