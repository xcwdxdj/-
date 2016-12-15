public class Ex_1_1_19 {
	 public static long F(int N){
	    int i;
	    long a = 0;
	    long b = 1; 
	    long c = 0;
	    if (N <= 1) {
	        return N;
	    }
	    else {
	        for (i = 2; i <= N; i++) {
	            c = a + b;
	            a = b;
	            b = c;
	        }
	        return c;
	    }
	}
	public static void main(String[] args) {
      for(int N = 0; N<100; N++){
        System.out.println(N + " " + F(N));
      }
    } 
}
