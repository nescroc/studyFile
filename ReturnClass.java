public class ReturnClass{
	public static void main(String[] args){
		PrivateTest pt = new PrivateTest();
		pt.setjumin(51565);
		System.out.println(pt.getjumin);


	}
	
}

class PrivateTest{
	private int jumin;
	
	public void setjumin(int jumin){
		this.jumin = jumin;
	}
	public int getjumin(){
		
		return jumin;
	};

}
