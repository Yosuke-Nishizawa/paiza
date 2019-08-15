

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class D130 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        List<Integer> params = 
        		Stream.of(line.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(calcMenseki(params.get(0), params.get(1), params.get(2), params.get(3)));
	}
	private static int calcMenseki(int a, int b, int c, int d) {
		int result = Math.abs(a * d - b * c);
		double resultD = (double)result;
		return (int)Math.ceil(resultD / 2);
	}
}
