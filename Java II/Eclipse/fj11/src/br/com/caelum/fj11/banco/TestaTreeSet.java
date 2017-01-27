package br.com.caelum.fj11.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaTreeSet {
	public static void main(String[] args) {
		List<Integer> s = new ArrayList<>();
		
		for (int i = 0; i < 1000; i++) {
			s.add(i);
		}
		
		Collections.reverse(s);
		System.out.println(s);
		
	}
}
