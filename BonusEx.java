import java.io.*;

public class  BonusEx{
	public static void main(String[] args)throws IOException{
		int curMoney = 1000; //���øӴ�		
		boolean whileRun = true; //����		
		BufferedReader br = new BufferedReader
					(new InputStreamReader(System.in));
		do{	
		int menu = 0;		
		String result = "";
		int betMoney = 0;
		System.out.print("1.Ȧ��\r\n2.¦��\r\n0.��������\r\n�޴����� : ");
		menu = System.in.read()-48;
		System.in.read();
		System.in.read();		
				if(menu==1||menu==2){
				betMoney = Integer.parseInt(br.readLine());				
				if (betMoney>curMoney){
				System.out.println("���� �ݾ׺��� ���� ������ �� �����ϴ�.");
					continue;
				}
				int enter = 0;				
				do{
					System.out.print("�ֻ����� �������� Enter�� ġ����.");
					enter = System.in.read();
							System.in.read();
				}while (enter!=13);

				int diceNum = (int)(Math.random()*6)+1;

				if((diceNum%2==0 && menu==2) || (diceNum%2==1&&menu==1)){
					curMoney += betMoney;
					result = "You Win";
						}else{
					curMoney -= betMoney;
					result = "You Lose";
					}
				System.out.println("�ֻ����� : "+ diceNum);
				System.out.println(result);
				System.out.println("�ܾ� : "+curMoney);			
			}else{
				System.out.println("��Ȯ�� �Է����ּ���.");
			}	
		if(curMoney <= 0 || curMoney >= 3000 || menu == 0){
			if(curMoney>=3000)System.out.println("�����ϼ̽��ϴ�.");
			if(curMoney<=0)System.out.println("�����ϼ̽��ϴ�.");
			if(menu==0)System.out.println("�ȳ���������.");

			whileRun = false;			
			}
		}while (whileRun);
	}
}
