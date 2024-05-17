package Programs;

public class programs1 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("x");
		System.out.println("HI");
		Integer i = x;
		System.out.println("i=" + i.intValue());
		System.out.println(i);
		x = i.max(x, y);
		System.out.println(x);
	}

}
