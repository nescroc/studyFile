/**
   java ExamEx507 ����1���� ����2���� ����3����
*/
public class Exam507{
   public static void main(String[] ar){
      int[] jumsu = new int[ar.length+1]; // +1 ���� 
      for(int i=0; i<jumsu.length-1; i++){
         jumsu[i] = Integer.parseInt(ar[i]);
         jumsu[jumsu.length-1] += jumsu[i];//�������
      }
      float avg = jumsu[jumsu.length-1] / (float)(jumsu.length-1);

      for(int i=0; i<jumsu.length-1; i++){
         if(jumsu[i] < 40){
            System.out.println("��� : �������� ���հ�");
            return;
         }
      }

      if(avg >= 60){
         System.out.println("��� : �հ�");
      }else{
         System.out.println("��� : ���հ�");
      }
   }
}