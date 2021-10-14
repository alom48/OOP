/*
 * Name: Bodrul Alom
 * ID: 2012020348
 * Section: 5G
 * Email: cse_2012020348@lus.ac.bd
 * Date: 16 September 2021
 */

package bodrul;

public class Main {

	public static void main(String[] args) {

		Player player = new Player("Shakib",75);
		Cricket cricket = new Cricket("Internationa",20,player);
		Football football = new Football();
		cricket.display();
	}
}
