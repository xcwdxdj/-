import java.util.Arrays;
import java.util.Scanner;

import edu.princeton.cs.algs4.In;


// Based on class BinarySearch
public class Exchangemn
{
    public static int rank(int key, int[] a){
    	return indexOf(key,a,0,a.length-1);
    }
    public static int indexOf(int key,int[] a,int lo,int hi){
    	System.out.println(lo+" "+hi);
//    	System.out.println(hi);
    	if(lo>hi)		return -1;
    	int mid = lo+(hi-lo)/2;
    	if(key>mid)		return indexOf(key, a, mid+1, hi);
    	else if(key<mid)	return indexOf(key, a, lo, mid-1);
    	else			return mid;
    }
    
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        System.out.println(rank(k,a));
    }
}

//这次做题让我明白一个道理，原版书翻译真的有问题，会让人有错误的理解，所以读原文更好一些，比如22题的有一部分翻译是“打印出它的参数lo和hi并按照递归的深度缩进”
//其实我很想说这甚至都不是个句子，这就是我们学算法时会遇到的一些很奇葩的事情。
