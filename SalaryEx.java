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
		//System.out.println("�� ���¸� �������" + sal.pay);
		sal.setPay(1000,"1234");
		int myPay = sal.getPay();
		System.out.println("���¿� �Ա��� �ݾ�"+ myPay);
	}
}
