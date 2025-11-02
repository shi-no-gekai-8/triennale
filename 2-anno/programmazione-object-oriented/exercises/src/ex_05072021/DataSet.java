package ex_05072021;

import java.util.ArrayList;

public class DataSet {
	public DataSet() {
		this.array = new ArrayList<>();
	}
	public void add(Quiz quizAggiunto) {
		array.add(quizAggiunto);
	}
	private ArrayList<Quiz> array;
}
