//这个题是要讲欧几里得算法表现出来的一道算法题，应该属于数学和计算机结合的一道经典的题目了
//我找到了一个网页讲欧几里得算法，可以说一眼就知道是怎么回事了，附上链接@https://xuanwo.org/2015/03/11/number-theory-gcd/
//算法其实写起来超简单，数学万岁

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Acg {
	public static int acg(int a, int b){
		if(b==0)	return a;
		return	acg(b,a%b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 38;
		StdOut.print(acg(a,b));
	}

}
