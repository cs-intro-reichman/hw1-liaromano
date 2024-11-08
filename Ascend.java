// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lin= Integer.parseInt(args[0]);
		int a=(int) (Math.random()*lin);
		int b=(int) (Math.random()*lin);
		int c=(int) (Math.random()*lin);
		System.out.println(a+ " "+b+" "+c);
		int max= Math.max(a, b);
		int min= Math.min(a,b);
		int middle= c;
		middle= Math.min(max, middle);
		middle= Math.max(min,middle);
		max= Math.max(max,c);
		min= Math.min(min,c);

System.out.println(min+" "+middle+" "+max);
	}
}


