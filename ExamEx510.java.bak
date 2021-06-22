/**
   숫자3자리 야구게임
*/
import java.io.*;//---1
public class ExamEx512{
   public static void main(String[] ar)throws IOException{//---2
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//---3

      System.out.print("게임을 시작하시겠습니까? (y/n) : ");
      char result = (char)System.in.read();
      System.in.read(); System.in.read();
      
      if(result != 'Y' && result != 'y'){
         System.out.println("게임을 종료합니다.");
         System.exit(0);
      }

      System.out.println("숫자를 생성했습니다.");
      int number[] = new int[3];
      for(int i=0; i<number.length; i++){
         number[i] = (int)(Math.random()*10); // 0<= number <1 * 10
         for(int j=0; j<i; j++){
            if(number[i] == number[j]){// i 지금만든거 j가 아까만든거
               i--;
               break;
            }
         }//end for j
      }//end for i

      /*   확인 :
      for(int i=0; i<number.length; i++) System.out.println("number[" + i + "] = " + number[i]);
       */

      System.out.println();
      int[] input = new int[3];
      for(int i=0; i<10; i++){
         System.out.print("당신이 생각하는 숫자는 = "); // 4 5 6 \r \n
         for(int j=0; j<input.length; j++){
            input[j] = System.in.read() - 48;
         }
         System.in.read(); System.in.read();

         int strike = 0; int ball = 0;
         for(int j=0; j<input.length; j++){// j 내가 입력한 수
            for(int k=0; k<number.length; k++){// k 컴퓨터가 만든 수
               if(input[j] == number[k]){
                  if(k==j) strike++;
                  else ball++;
                  break;
               }
            }
         }

         if(strike == 3){
            System.out.println("정답입니다. : " + (i+1) + "구 만에 맞추셨습니다.");
            break;
         }
         if(i == 9){
            System.out.println("실패하셨습니다.");
            break;
         }
         System.out.print(i + 1 + "구 : " + strike + "스트라이크, " + ball + "볼");
         System.out.println();
      }

   }//end main
}