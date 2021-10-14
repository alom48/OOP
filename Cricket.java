/*
 * Name: Bodrul Alom
 * ID: 2012020348
 * Section: 5G
 * Email: cse_2012020348@lus.ac.bd
 * Date: 16 September 2021
 */

package bodrul;

public class Cricket extends Sports{

	String matchType;
	int over;
	Player player;
	
	Cricket(String matchType,int over,Player player)
	{
		this.matchType = matchType;
		this.over = over;
		this.player = player;
	}
	
	void display()
	{
		System.out.println("Match Type: " + matchType);
		System.out.println("Over of the Match: " + over);
		System.out.println("Name of the Player: " + player.playerName);
		System.out.println("Jersey No. of the Player: " + player.jerseyNumber);
	}
}
