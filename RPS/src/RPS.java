import javax.swing.JOptionPane;

public class RPS {
	private static int win = 0, loss = 0, draw = 0, total = 0, randomNum;
	static String user = null;
	static String cpu = null;
	static String message = null;
	static String x = null;

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Play RPS?");

		while (!(input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("No"))) {
			input = JOptionPane.showInputDialog("Invalid Input" + "\n" + "Play RPS?");
		}

		if (input.equalsIgnoreCase("Yes"))
			while (!input.equalsIgnoreCase("No")) {
				user = JOptionPane.showInputDialog("Rock, Paper, Scissors, Shoot!" + "\n" + "Enter Choice:");

				while (!((user.equalsIgnoreCase("Rock")) || (user.equalsIgnoreCase("Paper"))
						|| (user.equalsIgnoreCase("Scissors")))) {

					user = JOptionPane.showInputDialog("Invalid Input" + "\n" + "Enter Choice:");
				}

				randomNum = (int) (Math.random() * 3);
				record();
				JOptionPane.showMessageDialog(null, message);
				JOptionPane.showMessageDialog(null, x);
				System.out.println(x);

				input = JOptionPane.showInputDialog("Play again?");
				while (!(input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("No"))) {
					input = JOptionPane.showInputDialog("Invalid Input" + "\n" + "Play again?");
				}
			}

	}

	private static void record() {
		total++;
		if (user.equalsIgnoreCase(cpu)) {
			message = "Tie!";
			draw++;
		} else if (user.equalsIgnoreCase("Rock"))
			switch (randomNum) {
			case 1:
				message = "Paper covers rock, CPU wins!";
				loss++;
				break;
			case 2:
				message = "Rock beats Scissors, USER wins!";
				win++;
				break;
			}
		else if (user.equalsIgnoreCase("Paper"))
			switch (randomNum) {
			case 0:
				message = "Paper covers rock, USER wins!";
				win++;
				break;
			case 2:
				message = "Scissor cuts paper, CPU wins!";
				loss++;
				break;
			}
		else if (user.equalsIgnoreCase("Scissors"))
			switch (randomNum) {
			case 0:
				message = "Scissor cuts paper, USER wins!";
				win++;
				break;
			case 1:
				message = "Rock crushes scissors, CPU wins!";
				loss++;
				break;
			}
		x = ("Total Games: " + total + " User Wins: " + win + " CPU Wins " + loss + " Draws: " + draw);
	}

}
