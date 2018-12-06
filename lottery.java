package assignment6;
import java.util.*;
/**Lottery program that generates 6 random numbers and compare it with the numbers that the user has
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 6
 * @since Due- 10/31/2018
 */
public class lottery {
	protected Set<Integer> Lottery=generateWinningNumbers();
	protected Set<Integer>  yourNum=getTicket();
	/**method that returns the set of randomly generated numbers
	 * @return set of 6 random numbers
	 */
	public static Set<Integer> generateWinningNumbers( ){
		Random rand=new Random();
		Set<Integer> s=new LinkedHashSet<>();
		int randomnum;
		for(int i=0;i<6;i++) {
			randomnum=rand.nextInt(40) + 1;
			while(s.contains(randomnum)) {
				randomnum=rand.nextInt(40) + 1;
			}
			s.add(randomnum);	
		}
		return s;
	}
	/**method that returns the set of the user input data
	 * @return set of user input
	 */
	public static Set<Integer> getTicket( ){
		System.out.print("Type 6 lotto numbers:");
		Scanner sc=new Scanner(System.in);
		Set <Integer> input=new LinkedHashSet<>();
		int num;
		for(int i=0;i<6;i++) {
			num=sc.nextInt();
			input.add(num);
		}
		return input;
	}
}
