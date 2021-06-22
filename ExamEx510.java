/**
   java ExamEx510 숫자
*/
import java.io.*;//---1
public class ExamEx510{
   public static void main(String[] ar)throws IOException{//---2
      BufferedReader br = new BufferedReader
		  (new InputStreamReader(System.in));//---3
      
      System.out.print("숫자 = ");
      int number = Integer.parseInt(br.readLine());
      /*정상*/
      int[] num = new int[8];
      for(int i=num.length-1; i>=0; i--){
         int su = number % 2;
         number /= 2;
         num[i] = su;
      }

      for(int i=0; i<num.length; i++){
         System.out.print(num[i]);
         if(i==3) System.out.print(" ");
      }
      System.out.println();

      /*편법
      int su = 128;
      int[] num = new int[8];
      for(int i=0; i<num.length; i++){
         if(number>=su){
            num[i] = 1;
            number -= su;
         }
         su/=2;
      }

      for(int i=0; i<num.length; i++){
         System.out.print(num[i]);
         if(i==3) System.out.print(" ");
      }
      System.out.println();
      */
   }
}