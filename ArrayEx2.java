import java.io.*;

public class ArrayEx2{
   public static void main(String[] ar)throws IOException{
		/*22. �ݾ��� �Է¹޾Ƽ� ȭ���� ������ ���ϴ� �Ʒ��� ���� ���α׷��� �ۼ��ϼ���.
		 �� �ݾ��� 10�� �̻� 10���� �̸��� �ݾ׸� �Է��Ѵ�. ����] �ݾ� = 57620
		 ���� = 5��
		 õ�� = 7��
		 ��� = 6��
		 �ʿ� = 2��
	*/
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int man = 0;
	int chun = 0;
	int baek = 0;
	int sip = 0;
	System.out.print("�ݾ��� �Է��ϼ���.");
	int userMon = Integer.parseInt(br.readLine());
	man = userMon/10000;
	chun = (userMon-(man*10000))/1000;
	baek = (userMon-(man*10000+chun*1000))/100;
	sip = (userMon-(man*10000+chun*1000+baek*100))/10;
	
	System.out.println("���� = "+man+"��");
	System.out.println("õ�� = "+chun+"��");
	System.out.println("��� = "+baek+"��");
	System.out.println("�ʿ� = "+sip+"��");



   }
}

