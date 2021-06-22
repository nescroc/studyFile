/**
   주민번호 분석 프로그램
*/
import java.io.*;//----1
public class MabangJin{
      public static void main(String[] ar)throws IOException{//----2
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//---3
         
         int num = 0;
         do{
            System.out.print("숫자(홀수만) = ");
            num = Integer.parseInt(br.readLine());
         }while(num%2 == 0);

         int[][] mabang = new int[num][num];
         int row = 0; int col = num / 2;
         for(int i=1; i<=num*num; i++){
            mabang[row][col] = i;
            if(i%num == 0){
               row++; continue;
            }
            row--; col++;
            if(row < 0) row = mabang.length-1;
            if(col > mabang.length-1) col = 0;
         }

         System.out.println();
         for(int i=0; i<mabang.length; i++){
            for(int j=0; j<mabang[i].length; j++){
               System.out.print(mabang[i][j] + "\t");
            }
            System.out.println();
         }
         System.out.println();
      }//end main
}