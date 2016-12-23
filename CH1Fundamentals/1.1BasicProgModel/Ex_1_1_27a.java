//可以说是输出了数不尽的0了，这个方法用递归虽然代码简单，但是代价太大，在Ex-1-1-27b中会尝试用迭代之类的方法去实现
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Acg {
	
	public static double binomial(int N, int k, double p){
		StdOut.println('0 ');
		if(N==0 && k==0)		return 1.0;
		if(N<0 || k<0)			return 0.0;
		return	(1.0-p)*binomial(N-1,k,p) + p*binomial(N-1,k-1,p);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 50;
		double p = 0.25;
		StdOut.print(binomial(100,50,0.25));
	}

}
