class Salary{
	private int pay;
	public int getPay(){
		return pay;
	}
	public void setPay(int pay, String pass){
		if(pass.equals("1234"))
			this.pay = pay;
	}
}

public class SalaryEx{
	public static void main(String[] args){
		Salary sal = new Salary();
		//sal.pay = 10000;
		//System.out.println("내 계좌를 마음대로" + sal.pay);
		sal.setPay(1000,"1234");
		int myPay = sal.getPay();
		System.out.println("계좌에 입금한 금액"+ myPay);
	}
}
