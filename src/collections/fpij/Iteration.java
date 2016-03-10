/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
 ***/
package collections.fpij;

import java.util.function.Consumer;


public class Iteration {
	public static void main(final String[] args) {
		for(int i = 0; i < Folks.friends.size(); i++) {
			System.out.println(Folks.friends.get(i));
		}

		for(final String name : Folks.friends) {
			System.out.println(name);
		}

		System.out.println("//" + "START:INTERNAL_FOR_EACH_OUTPUT Using Consumer");
		Folks.friends.forEach(new Consumer<String>() {
			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		});

		System.out.println("//" + "START:INTERNAL_FOR_EACH_OUTPUT Using Consumer as Lambda");
		Folks.friends.forEach(name -> System.out.println(name));

		System.out.println("//" + "END:INTERNAL_FOR_EACH_OUTPUT");

		System.out.println("//" + "START:INTERNAL_OUTPUT");
		Folks.friends.forEach((final String name) -> System.out.println(name));
		System.out.println("//" + "END:INTERNAL_OUTPUT");

		Folks.friends.forEach((name) -> System.out.println(name));

		Folks.friends.forEach(name -> System.out.println(name));

		Folks.friends.forEach(System.out::println);
	}
}
