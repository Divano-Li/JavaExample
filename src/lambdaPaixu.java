import java.util.*;
public class lambdaPaixu{
	public static void main(String[] args){ 
		String[] players = {"Rafael Nadal", "Novak Djokovic", 
			"Stanislas Wawrinka", "David Ferrer",
			"Roger Federer", "Andy Murray",
			"Tomas Berdych", "Juan Martin Del Potro",
			"Richard Gasquet", "John Isner"};
		// 1.1 ʹ�������ڲ������ name ���� players
		Arrays.sort(players, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s1.compareTo(s2));
			}
		});
		for(String a : players )
		{
			System.out.println(a);
		}
	}
}