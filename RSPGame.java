/**
   ���� ���� �� ����
*/
import java.io.*;//----1
public class RSPGame{
      public static void main(String[] ar)throws IOException{//----2
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//---3

         int money = 1000;
         int menu = -1;
         boolean isStop = false;
         String[] str = { "�ָ�", "����", "���ڱ�"};
         int[][] result = { {0, 1, -1}, {-1, 0 , 1}, {1, -1, 0} }; //����   =  1 �̱�     0 ���    -1 ��

         while(!isStop){
            System.out.println("1.�ָ�");
            System.out.println("2.����");
            System.out.println("3.���ڱ�");
            System.out.println("0.��������");
            System.out.print("�޴����� : ");
            menu = Integer.parseInt(br.readLine());

            if(menu == 0){
               System.out.println();
               System.out.print("������ �����Ͻðڽ��ϱ�? (y/n) : ");
               char res = (char) System.in.read();
               System.in.read(); System.in.read();

               if(res == 'y' || res == 'Y'){
                  System.out.println();
                  System.out.println("���α׷��� �����մϴ�.");
                  System.out.println();
                  isStop = true;
                  continue;
                  // break; // System.exit(0);
               }else{
                  System.out.println();
                  isStop = false;
                  continue;
               }
            }

            if(menu != 1 && menu != 2 && menu != 3){
               System.out.println();
               System.out.println("�޴��Է¿��� : �޴��� Ȯ���Ͻð� �ٽ� ������ �ּ���");
               System.out.println();
               continue;
            }

            System.out.println();
            System.out.print("���ñݾ� = ");
            int bat = Integer.parseInt(br.readLine());

            /*
            if(bat >= money){
               System.out.println("�ܾ׺��� ū �ݾ��� �����ϽǼ� �����ϴ�.");
               System.out.println("�ܾ� ��ŭ �ڵ����� ���õǾ����ϴ�.");
               bat = money;
            }else if(bat <= 0){
               System.out.println("0���� ū �ݾ��� ������ �żž� �մϴ�.");
               System.out.println();
               continue;
            }
            */
            System.out.println();
            System.out.print("������������ �Ͻ÷��� Enter�� ġ����^^.");
            System.in.read(); System.in.read();
            System.out.println();

            int computer = (int)(Math.random()*3) + 1; // 1. �ָ� 2. ���� 3. ���ڱ�
            System.out.println("You : " + str[menu-1] + ", Computer : " + str[computer-1]);
            if(result[menu-1][computer-1] == 1){ // ���� �̱��
               System.out.println("You Win !!");
               money += bat;
            }else if(result[menu-1][computer-1] == -1){// ���� ����
               System.out.println("You Loose !!");
               money -= bat;
            }else{
               System.out.println("You Draw !!");
            }
            System.out.println("�ܾ� : " + money + "��");
            
            if(money >= 3000){
               System.out.println();
               System.out.println("����� Ÿ¥�̱���. ���� �׸� �Ͻ�����");
               System.out.println("���α׷��� �����մϴ�.");
               isStop = true;
            }else if(money <= 0){
               System.out.println();
               System.out.println("�μմ� ����� �ٽÿ�����.");
               System.out.println("���α׷��� �����մϴ�.");
               isStop = true;
            }
            System.out.println();
         }//end while
      }//end main
}