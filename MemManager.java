import java.io.*;
import java.util.*;
/**
   회원관리 메인 클래스
*/
public class MemManager{
   //멤버
   private BufferedReader br;
   private boolean isStop;
   private ArrayList<MyMember> data;
   private int position;
   //생성자
   public MemManager(){
      br = new BufferedReader(new InputStreamReader(System.in));
      isStop = false;
      data = new ArrayList<MyMember>();
      position = -1;
   }
   //메서드
   /**
      회원 정보를 등록시키는 기능
   */
   public void addMember() throws IOException{  
      System.out.println();
      System.out.print("이름 = ");
      String name = br.readLine();
      System.out.print("나이 = ");
      int age = Integer.parseInt(br.readLine());
      System.out.print("전화번호 = ");
      String tel = br.readLine();
      System.out.print("주소 = ");
      String address = br.readLine();

      MyMember member = new MyMember(name, age, tel, address);
      
      data.add(member);
      System.out.println("\n성공적으로 등록되었습니다.");
   }

   /**
      회원 검색을 수행해주는 메서드
   */
   public void searchMember() throws IOException{ 
      System.out.println();

      System.out.print("찾으시는 회원이름 = ");
      String name = br.readLine();
      
      position = -1;
      for(int i=0; i<data.size(); i++){
         MyMember member = data.get(i);
         if(name.equals(member.getName())){//찾은거
            position = i; break;
         }
      }//end for
      
      System.out.println();
      if(position < 0){
         System.out.println(name + "님은 저희 회원이 아닙니다. 회원가입을 하세요^^");
      }else{
         System.out.println(name + "님의 정보 검색 성공");
      }
   }

   /**
      회원정보를 수정하는 메서드
   */
   public void updateMember() throws IOException{ 
      System.out.println();

      if(position < 0){
         System.err.println("검색을 먼저 수행하셔야 합니다.");
         return;
      }

      int menu = -1; boolean isLoop = true;
      MyMember member = data.get(position);
      while(isLoop){
         System.out.println(member.getName() + "님의 정보수정");
         System.out.println("1. 연락처 수정");
         System.out.println("2. 주소 수정");
         System.out.println("0. 수정 취소");
         System.out.print("메뉴선택 : ");

         try{
            menu = Integer.parseInt(br.readLine());
         }catch(NumberFormatException nfe){
            menu = -1;
         }

         System.out.println();
         switch(menu){
            case 1 : 
               System.out.print("수정할 연락처 = ");
               member.setTel(br.readLine());
               System.out.println(member.getName() + "님의 연락처를 성공적으로 수정하였습니다.");
               isLoop = false;
               break;
            case 2 : 
               System.out.print("수정할 주소 = ");
               member.setAddress(br.readLine());
               System.out.println(member.getName() + "님의 주소를 성공적으로 수정하였습니다.");
               isLoop = false;
               break;
            case 0 : 
               System.out.println(member.getName() + "님의 정보 수정을 취소합니다.");
               isLoop = false;
               break;
            default: 
               System.err.println("메뉴선택오류 : 메뉴를 확인하시고 다시 선택해 주세요^^;");
               isLoop = true;
               break;
         }
         System.out.println();
      }//end while
   }

   /**
      회원정보를 삭제하는 메서드
   */
   public void deleteMember() throws IOException{ 
      System.out.println();

      if(position < 0){
         System.err.println("검색을 먼저 수행하셔야 합니다.");
         return;
      }

      MyMember member = data.get(position);
      System.out.print(member.getName() + "님의 정보를 정말로 삭제 하시겠습니까? (y/n) : ");
      String result = br.readLine();

      if(result.equals("Y") || result.equals("y")){
         System.out.println(member.getName() + "님의 정보가 성공적으로 삭제 되었습니다.");
         data.remove(position);
         position = -1;
      }else{
         System.out.println(member.getName() + "님의 정보 삭제를 취소합니다.");
      }
   }

   /**
      회원 전체 목록을 출력해 주는 메서드
   */
   public void display(){ 
      System.out.println();
      for(MyMember member : data){
         System.out.println(member.toString());
      }
   }
   /**
      프로그램의 종료 기능 처리
   */
   public void stopProgram() throws IOException{ 
      System.out.println();
      System.out.print("정말로 종료하시겠습니까? (y/n) : ");
      String result = br.readLine();

      if(result.equals("Y") || result.equals("y")){
         System.out.println("프로그램을 종료합니다.");
         isStop = true;
      }else{
         System.out.println("프로그램을 종료를 취소합니다.");
         isStop = false;
      }
   }
   /**
      메뉴를 보여주고 프로그램을 시작시키는 기능
   */
   public void startProgram() throws IOException{
      int menu = -1;
      while(!isStop){
         System.out.println("1.회원가입");
         System.out.println("2.회원검색");
         System.out.println("3.회원정보수정");
         System.out.println("4.회원정보삭제");
         System.out.println("5.회원전체보기");
         System.out.println("0.프로그램종료");
         System.out.print("메뉴선택 : ");
         
         try{
            menu = Integer.parseInt(br.readLine());
         }catch(NumberFormatException nfe){
            menu = -1;
         }

         switch(menu){
            case 1: addMember(); break;
            case 2: searchMember(); break;
            case 3: updateMember(); break;
            case 4: deleteMember(); break;
            case 5: display(); break;
            case 0: stopProgram(); break;
            default: 
               System.err.println("\n메뉴선택오류 : 메뉴를 확인하시고 다시 선택해 주세요^^;");
               break;
         }//end switch
         System.out.println();
      }//end while
   }

   public static void main(String[] ar){
      MemManager manager = new MemManager();
      try{
         manager.startProgram();
      }catch(IOException ioe){
         ioe.printStackTrace();
      }
   }
}