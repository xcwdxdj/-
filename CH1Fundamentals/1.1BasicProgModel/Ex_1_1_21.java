import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exchangemn {
	    
	public static void main(String[] args) {
        int M = 3;
        int index = 0;
        String[] strs = new String[M];
        while(index < M)
            strs[index++] = StdIn.readLine();
        for(int i = 0; i < strs.length; ++i) {
            String[] arr = strs[i].split("\\s+");
            double temp = Double.parseDouble(arr[1]) / Double.parseDouble(arr[2]);
            StdOut.printf("%-10s   %-10s   %-10s   %-13.3f\n", arr[0], arr[1], arr[2], temp);
        };
    }
	
}
//这个程序上我花了很多时间，一方面是StdIn和StdOut不能用这个问题困惑着我，后来发现是没有安装algs4.jar的锅，改明儿闲了把这些事情拿出来写一篇
//然后就是关于Java的输入输出我算是彻彻底底的被上了一课，果然没有系统的学过Java有的时候是会出问题的，然后就是原版书看不太懂，好多资源的获取也是有局限的，所以说革命尚未成功，同志还需努力
//由于基础薄弱，我要认真的把这本书所有的习题都认真的过一遍，
//另外我还是感觉自己要找个关于Java的教学视频看一看，或者看那本原版书
