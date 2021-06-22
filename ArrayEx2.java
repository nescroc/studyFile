import java.io.*;

public class ArrayEx2{
   public static void main(String[] ar)throws IOException{
		/*22. 금액을 입력받아서 화폐의 개수를 구하는 아래와 같이 프로그램을 작성하세요.
		 단 금액은 10원 이상 10만원 미만의 금액만 입력한다. 예시] 금액 = 57620
		 만원 = 5장
		 천원 = 7장
		 백원 = 6개
		 십원 = 2개
	*/
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int man = 0;
	int chun = 0;
	int baek = 0;
	int sip = 0;
	System.out.print("금액을 입력하세요.");
	int userMon = Integer.parseInt(br.readLine());
	man = userMon/10000;
	chun = (userMon-(man*10000))/1000;
	baek = (userMon-(man*10000+chun*1000))/100;
	sip = (userMon-(man*10000+chun*1000+baek*100))/10;
	
	System.out.println("만원 = "+man+"장");
	System.out.println("천원 = "+chun+"장");
	System.out.println("백원 = "+baek+"개");
	System.out.println("십원 = "+sip+"개");



   }
}

