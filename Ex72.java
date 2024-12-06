package bookExercises;

import javax.swing.JOptionPane;

public class Ex72 {

	public static void addition (int a, int b) {

		JOptionPane.showMessageDialog(null, "addition  =  " + (a + b));

		return;

	}

	public static void subtraction(int a, int b) {

		JOptionPane.showMessageDialog(null, "Subtraction =  " + (a - b));

		return;

	}

	public static void multiplication(int a, int b) {

		JOptionPane.showMessageDialog(null, "Multiplication =  " + (a * b));

		return;

	}

	public static void division(int a, int b) {

		if (a == 0 || b == 0) {

			JOptionPane.showMessageDialog(null,
					"This expression contains a divisor or dividend equal to zero, therefore the application failed.");
			
			return;
		}

		else {

			JOptionPane.showMessageDialog(null, "Division = " + (a / b));
			
			return;
		}

	}

	public static void main(String[] args) {

		String userAnswer;

		int a, b;

		userAnswer = JOptionPane.showInputDialog(null, "Choose an arithmetic operation by typing \n( + ) "
				+ "addition, \n( - ) subtraction \n( * ) for multiplication, \n( / ) division");

		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Input first value: "));

		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Input second value: "));

		userAnswer = userAnswer.trim();

		switch (userAnswer) {

		case "+":

			addition (a, b);

			break;

		case "-":

			subtraction(a, b);

			break;

		case "*":

			multiplication(a, b);

			break;

		case "/":

			division(a, b);

			break;

		default:

			JOptionPane.showMessageDialog(null, "Please, input a valid arithmetic operation");
		}

	}

}
