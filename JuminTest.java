/**
   �ֹι�ȣ �м� ���α׷�
*/
import java.io.*;//----1
import java.util.Calendar;
public class JuminTest{
      public static void main(String[] ar)throws IOException{//----2
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//---3

         System.out.print("�̸� = ");
         String name = br.readLine();

         int[] jumin = new int[13];
         System.out.print("�ֹι�ȣ = "); // 1234567890123\r\n
         for(int i=0; i<jumin.length; i++){
            jumin[i] = System.in.read() - 48; 
         }
         System.in.read(); System.in.read();
         
         /* Ȯ�� 
         for(int i=0; i<jumin.length; i++)
            System.out.println("jumin[" + i + "] = " + jumin[i]);
         */

         float hap = 0.f; float temp = 0.f; float total = 0.f; float cre = 2.f;
         for(int i=0; i<jumin.length-1; i++){
            if(cre == 10.f) cre = 2.f;
            hap += jumin[i] * cre;
            cre++;
         }
         temp = 11.f * (int)(hap/11.f) + 11.f - hap;
         total = temp - 10.f * (int)(temp/10.f);
         
         if(total != jumin[jumin.length-1]){
            System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
            System.exit(0);
         }

         System.out.println();
         System.out.println(name + "���� �������� �м� ���");
         int year = 1900;
         switch(jumin[6]){
            case 3:
            case 4: year = 2000; break;
            case 9:
            case 0: year = 1800; break;
            default: year = 1900; break;
         }
         year += jumin[0]*10 + jumin[1];
         int month = jumin[2]*10 + jumin[3];
         int day = jumin[4]*10 + jumin[5];
         System.out.println("������� : " + year + "�� " + month + "�� " + day + "��");
         System.out.println("���� : " + (Calendar.getInstance().get(Calendar.YEAR) - year + 1) + "��");
         System.out.println(jumin[6]%2 == 0 ? "���� : ����" :"���� : ����") ;
         switch(jumin[7]){
            case 0 : System.out.println("������� : ����"); break;
            case 1 : System.out.println("������� : ���"); break;
            case 2 : System.out.println("������� : ����"); break;
            case 3 : System.out.println("������� : ���"); break;
            case 4 : System.out.println("������� : �泲"); break;
            case 5 : System.out.println("������� : ����"); break;
            case 6 : System.out.println("������� : ����"); break;
            case 7 : System.out.println("������� : ���"); break;
            case 8 : System.out.println("������� : �泲"); break;
            case 9 : System.out.println("������� : ����"); break;
         }
      }//end main
}