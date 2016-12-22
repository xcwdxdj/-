//这个程序我总是调不好，也不知道是因为我不知道如何用Java正确的读取文件中的数据的原因，还是我的算法出现了问题
//import java.lang.reflect.Array;
import java.io.File;
import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {
	public static int rank(int key, int[] a){
		//这个数组一定得是有序的
		int lo = 0;
		int N = a.length;
		int hi = N-1;
		while(lo >= hi){
			int mid = lo + (hi-lo)/2;
			if(key < a[mid]){
				hi = mid-1;
			}
			else if(key > a[mid]){
				lo = mid+1;
			}
			else	return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File f = new File("src/tinyW.txt");
		
		int[] whitelist = {84,48,68,10,18,98,12,23,54,57,33,16,77,11,29};
		Arrays.sort(whitelist);
		char flag = StdIn.readChar();
		int key = StdIn.readInt();
		while(!StdIn.isEmpty()){
			int value = rank(key, whitelist);
			if(flag == '+'){
				if(value<0){
					StdOut.println(key);
//					break;
				}
			}
			else if(flag == '-'){
				if(value>=0){
					StdOut.println(key);
//					break;
				}
			}
		}
	}

}
