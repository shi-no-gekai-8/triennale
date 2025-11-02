package fms;

import java.util.Comparator;

public class SquadreComparator implements Comparator<Squadre> {
	@Override
	public int compare(Squadre s1, Squadre s2) {
		if(s1.getPunti() > s2.getPunti()) {
			return -1;
		} else if(s1.getPunti() < s2.getPunti()) {
			return 1;
		}
		int differenzaReti1 = s1.getGoalFatti()-s1.getGoalSubiti();
		int differenzaReti2 = s2.getGoalFatti()-s2.getGoalSubiti();
		if(differenzaReti1 > differenzaReti2) {
			return -1;
		} else if(differenzaReti1 < differenzaReti2) {
			return 1;
		}
		return 0;
	}
	
}
