package myobj.Yacht;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Yatchdice {

	private List<Integer> dice;

	public Yatchdice() {
		dice = new ArrayList<>();
		Collections.addAll(dice, 1, 2, 3, 4, 5, 6);
	}

	public List<Integer> rollDice(int numDice) {
		List<Integer> results = new ArrayList<>();
		for (int i = 0; i < numDice; i++) {
			int random = (int) (Math.random() * dice.size());
			results.add(dice.get(random));
		}
		return results;
	}

}
