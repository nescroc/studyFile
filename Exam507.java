/**
   java ExamEx507 과목1점수 과목2점수 과목3점수
*/
public class Exam507{
   public static void main(String[] ar){
      int[] jumsu = new int[ar.length+1]; // +1 총점 
      for(int i=0; i<jumsu.length-1; i++){
         jumsu[i] = Integer.parseInt(ar[i]);
         jumsu[jumsu.length-1] += jumsu[i];//총점계산
      }
      float avg = jumsu[jumsu.length-1] / (float)(jumsu.length-1);

      for(int i=0; i<jumsu.length-1; i++){
         if(jumsu[i] < 40){
            System.out.println("결과 : 과락으로 불합격");
            return;
         }
      }

      if(avg >= 60){
         System.out.println("결과 : 합격");
      }else{
         System.out.println("결과 : 불합격");
      }
   }
}