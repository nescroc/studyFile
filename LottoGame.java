/**
   로또 프로그램
*/
import java.io.*;//----1
public class LottoGame{
      public static void main(String[] ar)throws IOException{//----2
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//---3
         
         System.out.print("게임수 = ");
         int game = Integer.parseInt(br.readLine());

         int[][] lotto = new int[game][6];

         for(int line=0; line<lotto.length; line++){//게임수 만큼 회전
            for(int col=0; col<lotto[line].length; col++){// 컬럼수 만큼 회전
               lotto[line][col] = (int)(Math.random() * 45) + 1;// 확인 7로 바꾸고 7게임을 수행하면 나오는 경우의 수 1개
               for(int tCol=0; tCol<col; tCol++){
                  if(lotto[line][tCol] == lotto[line][col]){// 앞에 만든것과 같은 번호가 나왔다.
                     col--; break;
                  }
               }
            }
            
            int count = 0;//일치하는 번호의 갯수
            for(int tLine=0; tLine<line; tLine++){
               count = 0;
               for(int col=0; col<lotto[line].length; col++){
                  for(int tCol=0; tCol<lotto[tLine].length; tCol++){
                     if(lotto[line][col] == lotto[tLine][tCol]){
                        count++; break;
                     }
                  }
                  if(col == count) break;
               }
               if(count == 6){ // 한 줄 전체가 이전 줄과 같은 번호를 가지고 있다.
                  line--; break;
               }
            }
         }//end for line
         
         System.out.println();
         for(int line=0; line<lotto.length; line++){
            System.out.print(line + 1 + "번째 추천번호 : ");
            for(int col=0; col<lotto[line].length; col++){
               System.out.print(lotto[line][col] + "\t");
            }
            System.out.println();
         }
         System.out.println();
   }//end main
}