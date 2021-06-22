/**
   가위 바위 보 게임
*/
import java.io.*;//----1
public class RSPGame{
      public static void main(String[] ar)throws IOException{//----2
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//---3

         int money = 1000;
         int menu = -1;
         boolean isStop = false;
         String[] str = { "주먹", "가위", "보자기"};
         int[][] result = { {0, 1, -1}, {-1, 0 , 1}, {1, -1, 0} }; //승패   =  1 이김     0 비김    -1 짐

         while(!isStop){
            System.out.println("1.주먹");
            System.out.println("2.가위");
            System.out.println("3.보자기");
            System.out.println("0.게임종료");
            System.out.print("메뉴선택 : ");
            menu = Integer.parseInt(br.readLine());

            if(menu == 0){
               System.out.println();
               System.out.print("정말로 종료하시겠습니까? (y/n) : ");
               char res = (char) System.in.read();
               System.in.read(); System.in.read();

               if(res == 'y' || res == 'Y'){
                  System.out.println();
                  System.out.println("프로그램을 종료합니다.");
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
               System.out.println("메뉴입력오류 : 메뉴를 확인하시고 다시 선택해 주세요");
               System.out.println();
               continue;
            }

            System.out.println();
            System.out.print("배팅금액 = ");
            int bat = Integer.parseInt(br.readLine());

            /*
            if(bat >= money){
               System.out.println("잔액보다 큰 금액은 배팅하실수 없습니다.");
               System.out.println("잔액 만큼 자동으로 배팅되었습니다.");
               bat = money;
            }else if(bat <= 0){
               System.out.println("0보다 큰 금액을 무조건 거셔야 합니다.");
               System.out.println();
               continue;
            }
            */
            System.out.println();
            System.out.print("가위바위보를 하시려면 Enter를 치세요^^.");
            System.in.read(); System.in.read();
            System.out.println();

            int computer = (int)(Math.random()*3) + 1; // 1. 주먹 2. 가위 3. 보자기
            System.out.println("You : " + str[menu-1] + ", Computer : " + str[computer-1]);
            if(result[menu-1][computer-1] == 1){ // 내가 이긴거
               System.out.println("You Win !!");
               money += bat;
            }else if(result[menu-1][computer-1] == -1){// 내가 진거
               System.out.println("You Loose !!");
               money -= bat;
            }else{
               System.out.println("You Draw !!");
            }
            System.out.println("잔액 : " + money + "원");
            
            if(money >= 3000){
               System.out.println();
               System.out.println("당신은 타짜이군요. 이제 그만 하시지요");
               System.out.println("프로그램을 종료합니다.");
               isStop = true;
            }else if(money <= 0){
               System.out.println();
               System.out.println("꽝손님 돈벌어서 다시오세요.");
               System.out.println("프로그램을 종료합니다.");
               isStop = true;
            }
            System.out.println();
         }//end while
      }//end main
}