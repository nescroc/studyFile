/**
   �ζ� ���α׷�
*/
import java.io.*;//----1
public class LottoGame{
      public static void main(String[] ar)throws IOException{//----2
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//---3
         
         System.out.print("���Ӽ� = ");
         int game = Integer.parseInt(br.readLine());

         int[][] lotto = new int[game][6];

         for(int line=0; line<lotto.length; line++){//���Ӽ� ��ŭ ȸ��
            for(int col=0; col<lotto[line].length; col++){// �÷��� ��ŭ ȸ��
               lotto[line][col] = (int)(Math.random() * 45) + 1;// Ȯ�� 7�� �ٲٰ� 7������ �����ϸ� ������ ����� �� 1��
               for(int tCol=0; tCol<col; tCol++){
                  if(lotto[line][tCol] == lotto[line][col]){// �տ� ����Ͱ� ���� ��ȣ�� ���Դ�.
                     col--; break;
                  }
               }
            }
            
            int count = 0;//��ġ�ϴ� ��ȣ�� ����
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
               if(count == 6){ // �� �� ��ü�� ���� �ٰ� ���� ��ȣ�� ������ �ִ�.
                  line--; break;
               }
            }
         }//end for line
         
         System.out.println();
         for(int line=0; line<lotto.length; line++){
            System.out.print(line + 1 + "��° ��õ��ȣ : ");
            for(int col=0; col<lotto[line].length; col++){
               System.out.print(lotto[line][col] + "\t");
            }
            System.out.println();
         }
         System.out.println();
   }//end main
}