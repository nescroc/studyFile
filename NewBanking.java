import java.io.*;//---1
public class NewBanking{//Banking.java
    public static void main(String[] args) throws IOException{   //---2
      NewAccount na = new NewAccount("홍길동", "1111");
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//---3
      String strWork;

      System.out.print("비밀번호 = ");
      strWork = br.readLine();

      if(!na.passCheck(strWork)){
         System.err.println("비밀번호 오류");
         System.exit(0);
      }
      do{
         System.out.println("\n \n 작업내용을 선택하세요");
         System.out.println("=========================");
         System.out.println("입        금 =======>      1");
         System.out.println("출        금 =======>      2");
         System.out.println("잔 고  확 인 =======>      3");
         System.out.println("비밀번호변경 =======>      4");
         System.out.println("종        료 =======>      0");
         System.out.println("=========================");
         System.out.print("작업내용을 선택하세요 : ");
         strWork = br.readLine();
         int switchInt = 0;
         if(strWork != null)
            switchInt = Integer.parseInt(strWork);
         else{
            System.out.println("작업내용을 입력하지 않았습니다.");
            System.exit(0);
         }
         switch(switchInt){
         case 0:   break;
         case 1:
            System.out.println("\n =================");
            System.out.print("금액을 입력하세요 : ");
            String strdepositIn = br.readLine();
            long depositLong = Long.parseLong(strdepositIn);
            na.deposit(depositLong);
            break;
         case 2:
           System.out.println("\n =================");
           System.out.print("금액을 입력하세요 : ");
           String strwithdrawIn = br.readLine();
           long withdrawLong = Long.parseLong(strwithdrawIn);
           na.withdraw(withdrawLong);
           break;
         case 3:
            System.out.println(na.getName() + "님의 잔고는 " + na.getBalance() +" 원이고, 비밀번호는 " + 
                              na.getPass() + " 입니다.");
            break;
         case 4:
           System.out.println("\n =================");
           System.out.print("변경할 비밀번호를 입력하세요 : ");
           String tempPass = br.readLine();
           na.setPass(tempPass);
           System.out.println("성공적으로 비밀번호를 변경하였습니다.");
           break;
         default:
            System.out.println("0~4 사이 숫자 입력\n");
         }
      }while(!strWork.equals("0"));
    }
}