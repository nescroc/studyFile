import java.io.*;

public class  BonusEx{
	public static void main(String[] args)throws IOException{
		int curMoney = 1000; //베팅머니		
		boolean whileRun = true; //여부		
		BufferedReader br = new BufferedReader
					(new InputStreamReader(System.in));
		do{	
		int menu = 0;		
		String result = "";
		int betMoney = 0;
		System.out.print("1.홀수\r\n2.짝수\r\n0.게임종료\r\n메뉴선택 : ");
		menu = System.in.read()-48;
		System.in.read();
		System.in.read();		
				if(menu==1||menu==2){
				betMoney = Integer.parseInt(br.readLine());				
				if (betMoney>curMoney){
				System.out.println("소지 금액보다 많이 베팅할 수 없습니다.");
					continue;
				}
				int enter = 0;				
				do{
					System.out.print("주사위를 던지려면 Enter를 치세요.");
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
				System.out.println("주사위값 : "+ diceNum);
				System.out.println(result);
				System.out.println("잔액 : "+curMoney);			
			}else{
				System.out.println("정확히 입력해주세요.");
			}	
		if(curMoney <= 0 || curMoney >= 3000 || menu == 0){
			if(curMoney>=3000)System.out.println("졸업하셨습니다.");
			if(curMoney<=0)System.out.println("올인하셨습니다.");
			if(menu==0)System.out.println("안녕히가세요.");

			whileRun = false;			
			}
		}while (whileRun);
	}
}
