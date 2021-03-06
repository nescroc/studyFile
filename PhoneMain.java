import java.io.*;
class CellPhone{
   private String number;

   public String getNumber(){
      return number;
   }
   public void setNumber(String number){
      this.number = number;
   }
   public void call(){
      System.out.println("음성통화");
   }
}
class Phone3G extends CellPhone{
   @Override
   public void call(){
      System.out.println("영상통화");
   }
   public void myCall(int menu){
      switch(menu){
         case 1 : super.call(); break;
         case 2 : this.call(); break;
         default : System.out.println("메뉴선택오류"); break;
      }
   }
}
public class PhoneMain{
   public static void main(String[] ar)throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("1.음성통화");
      System.out.println("2.영상통화");
      System.out.print("메뉴선택 : ");

      int menu = Integer.parseInt(br.readLine());

      System.out.println();
      Phone3G phone = new Phone3G();
      phone.myCall(menu);
            
      /*
      switch(menu){
         case 1 :
            CellPhone phone1 =  new CellPhone();
            phone1.call();
            break;
         case 2 : 
            CellPhone phone2 = new Phone3G();
            phone2.call();
            break;
      }
      */
   }
}