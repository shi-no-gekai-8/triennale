package ex_01072021;

import java.util.Arrays;
import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci primo numero: ");
		float primo = input.nextFloat();
		System.out.println("Inserisci secondo numero: ");
		float secondo = input.nextFloat();
		System.out.println("Inserisci terzo numero: ");
		float terzo = input.nextFloat();
		float[] array = {primo, secondo, terzo};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
	}

}
