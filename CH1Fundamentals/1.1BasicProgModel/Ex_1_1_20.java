public class Exchangemn {
	public static double NJC(int N){
		if(N==1)	return (N);
		else{
			return N*NJC(N-1);
		}
	}
	public static void main(String[] args) {
		
			System.out.println(Math.log(NJC(4)));
		
    } 
}
//这题就是一种引导作用，之前1.1.16-1.1.19都是在从各个方面阐述迭代的特性，从这一题开始，这个问题变成了尝试用迭代思想解决问题。
