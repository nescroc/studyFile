import java.io.*;
import java.util.Random;
public class Abcd{
<<<<<<< HEAD
	public static void main(String args[])throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int lotto[][]; // �ζ� ������ �迭���� ����
		
		System.out.print("\t�� ������ �Ͻǲ����� ? ");
		
		int number = Integer.parseInt(br.readLine());
		
		lotto = new int[number][6]; //2���� �迭 �ʱ�ȭ
		
		for(int i=0; i<number; i++){//���� ���� ���Ӽ� ��ŭ
			
			for(int j=0; j<lotto[i].length; j++){
				
				lotto[i][j] = (int)(Math.random()*45 ) + 1;
				
				for(int k=0; k<j; k++){
				
					if(lotto[i][j] == lotto[i][k]){
		j = j-1;
		break;
										}
							}
					}
// ���⿡ �˸��� �ڵ带 �߰��� �ּ���.
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
               System.out.println("�����Դϴ�.");
               score += 10;
            }else{
               System.out.println("Ʋ�Ƚ��ϴ�. ������ " + (num1 + num2) + " �Դϴ�.");
            }

            System.out.println();

            if(cnt == 10){
               System.out.println("����� ������ " + score + "�� �Դϴ�.");

               System.out.print("\n����Ͻðڽ��ϱ�? (y/n) : ");
               char res = (char) System.in.read();
               System.in.read(); System.in.read();

               if(res == 'y' || res == 'Y'){
                  score = 0;
                  cnt = 0;
                  System.out.println();
               }else{
                  System.out.println("���α׷��� �����մϴ�.");
               }
            }
         }//end for

	}
>>>>>>> origin
}



/*
	-214748364~214748364
*/
