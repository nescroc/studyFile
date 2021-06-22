import java.io.*;
import java.util.Random;
public class Abcd{
<<<<<<< HEAD
	public static void main(String args[])throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int lotto[][]; // 로또 저장할 배열공간 선언
		
		System.out.print("\t몇 게임을 하실꺼에요 ? ");
		
		int number = Integer.parseInt(br.readLine());
		
		lotto = new int[number][6]; //2차원 배열 초기화
		
		for(int i=0; i<number; i++){//내가 선택 게임수 만큼
			
			for(int j=0; j<lotto[i].length; j++){
				
				lotto[i][j] = (int)(Math.random()*45 ) + 1;
				
				for(int k=0; k<j; k++){
				
					if(lotto[i][j] == lotto[i][k]){
		j = j-1;
		break;
										}
							}
					}
// 여기에 알맞은 코드를 추가해 주세요.
				}
		}
=======
	public static void main(String[] ar)throws IOException{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//---3

         int score = 0;
         for(int cnt=1; cnt<=10; cnt++){
            int num1 = (int)(Math.random()*100) + 1;
            int num2 = (int)(Math.random()*100) + 1;

            System.out.print("[" + cnt + "] " + num1 + " + " + num2 + " = ");
            int dap = Integer.parseInt(br.readLine());

            if(dap == (num1+num2)){
               System.out.println("정답입니다.");
               score += 10;
            }else{
               System.out.println("틀렸습니다. 정답은 " + (num1 + num2) + " 입니다.");
            }

            System.out.println();

            if(cnt == 10){
               System.out.println("당신의 점수는 " + score + "점 입니다.");

               System.out.print("\n계속하시겠습니까? (y/n) : ");
               char res = (char) System.in.read();
               System.in.read(); System.in.read();

               if(res == 'y' || res == 'Y'){
                  score = 0;
                  cnt = 0;
                  System.out.println();
               }else{
                  System.out.println("프로그램을 종료합니다.");
               }
            }
         }//end for

	}
>>>>>>> origin
}



/*
	-214748364~214748364
*/
