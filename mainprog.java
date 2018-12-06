package assignment6;

import java.util.LinkedHashSet;
import java.util.Set;
/**Lottery machine program
 * @author Shashi Kumar Kadari Mallikarjuna 
 * @version Assignment 6
 * @since Due- 10/31/2018
 */
public class mainprog {
	/**main method
	 * @param args
	 */
	public static void main(String [] args) {
		lottery l=new lottery();
		Set<Integer> Lottery=l.Lottery;
		Set<Integer>  yourNum=l.yourNum;
		Set<Integer> match=new LinkedHashSet<Integer>();
		System.out.println("Your ticket was: "+yourNum);
		System.out.println("Winning numbers: "+Lottery);
		for(int n:yourNum) {
			if(Lottery.contains(n)) {
				match.add(n);
			}
		}
		System.out.println("Match numbers: "+match);
		System.out.println("Your prize is $"+(match.size()*250));
	}
}
