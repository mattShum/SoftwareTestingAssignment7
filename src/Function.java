
public class Function {
	
	public static int Fun(int x, int k, int y){
		System.out.println("Edge A");
		int i;
		System.out.println("Edge B");
		for (i = x; i < y; i++){
			System.out.println("Branch 1 - True");
			if (x%5 < 3){
				System.out.println("Branch 2 - True");
				k = y - x;
				y = y + i;
				System.out.println("Edge C");
			}
			else{
				System.out.println("Branch 2 - False");
				x = k - 2;
				y = y + x;
				System.out.println("Edge D");
			}
			y = y - x;
			i = i + 2;
			System.out.println("Edge E");
		}
		System.out.println("Branch 1 - False");
		if (x < 0 || y < 0){
			System.out.println("Branch 3 - True");
			k = y - x;
			System.out.println("Edge F");
		}
		else{
			System.out.println("Branch 3 - False");
			x = y + k;
			System.out.println("Edge G");
		}
		return x;
	}
}
