public class JavaEx3{
	public static void main(String[] args)	{
		int i=0, j=5;
 tp:for(;;i++){ //0 1 2 3
	 	System.out.println("i = "+i);
		for(;;--j){//4 3 2 1
				 	System.out.println("j = "+j);
			if(i>j) break tp;
			 }
		}
	System.out.println("i = "+i+"j = "+j);

	}
}