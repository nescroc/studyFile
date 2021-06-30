import java.io.*;
import java.util.*;
/**
   ȸ������ ���� Ŭ����
*/
public class MemManager{
   //���
   private BufferedReader br;
   private boolean isStop;
   private ArrayList<MyMember> data;
   private int position;
   //������
   public MemManager(){
      br = new BufferedReader(new InputStreamReader(System.in));
      isStop = false;
      data = new ArrayList<MyMember>();
      position = -1;
   }
   //�޼���
   /**
      ȸ�� ������ ��Ͻ�Ű�� ���
   */
   public void addMember() throws IOException{  
      System.out.println();
      System.out.print("�̸� = ");
      String name = br.readLine();
      System.out.print("���� = ");
      int age = Integer.parseInt(br.readLine());
      System.out.print("��ȭ��ȣ = ");
      String tel = br.readLine();
      System.out.print("�ּ� = ");
      String address = br.readLine();

      MyMember member = new MyMember(name, age, tel, address);
      
      data.add(member);
      System.out.println("\n���������� ��ϵǾ����ϴ�.");
   }

   /**
      ȸ�� �˻��� �������ִ� �޼���
   */
   public void searchMember() throws IOException{ 
      System.out.println();

      System.out.print("ã���ô� ȸ���̸� = ");
      String name = br.readLine();
      
      position = -1;
      for(int i=0; i<data.size(); i++){
         MyMember member = data.get(i);
         if(name.equals(member.getName())){//ã����
            position = i; break;
         }
      }//end for
      
      System.out.println();
      if(position < 0){
         System.out.println(name + "���� ���� ȸ���� �ƴմϴ�. ȸ�������� �ϼ���^^");
      }else{
         System.out.println(name + "���� ���� �˻� ����");
      }
   }

   /**
      ȸ�������� �����ϴ� �޼���
   */
   public void updateMember() throws IOException{ 
      System.out.println();

      if(position < 0){
         System.err.println("�˻��� ���� �����ϼž� �մϴ�.");
         return;
      }

      int menu = -1; boolean isLoop = true;
      MyMember member = data.get(position);
      while(isLoop){
         System.out.println(member.getName() + "���� ��������");
         System.out.println("1. ����ó ����");
         System.out.println("2. �ּ� ����");
         System.out.println("0. ���� ���");
         System.out.print("�޴����� : ");

         try{
            menu = Integer.parseInt(br.readLine());
         }catch(NumberFormatException nfe){
            menu = -1;
         }

         System.out.println();
         switch(menu){
            case 1 : 
               System.out.print("������ ����ó = ");
               member.setTel(br.readLine());
               System.out.println(member.getName() + "���� ����ó�� ���������� �����Ͽ����ϴ�.");
               isLoop = false;
               break;
            case 2 : 
               System.out.print("������ �ּ� = ");
               member.setAddress(br.readLine());
               System.out.println(member.getName() + "���� �ּҸ� ���������� �����Ͽ����ϴ�.");
               isLoop = false;
               break;
            case 0 : 
               System.out.println(member.getName() + "���� ���� ������ ����մϴ�.");
               isLoop = false;
               break;
            default: 
               System.err.println("�޴����ÿ��� : �޴��� Ȯ���Ͻð� �ٽ� ������ �ּ���^^;");
               isLoop = true;
               break;
         }
         System.out.println();
      }//end while
   }

   /**
      ȸ�������� �����ϴ� �޼���
   */
   public void deleteMember() throws IOException{ 
      System.out.println();

      if(position < 0){
         System.err.println("�˻��� ���� �����ϼž� �մϴ�.");
         return;
      }

      MyMember member = data.get(position);
      System.out.print(member.getName() + "���� ������ ������ ���� �Ͻðڽ��ϱ�? (y/n) : ");
      String result = br.readLine();

      if(result.equals("Y") || result.equals("y")){
         System.out.println(member.getName() + "���� ������ ���������� ���� �Ǿ����ϴ�.");
         data.remove(position);
         position = -1;
      }else{
         System.out.println(member.getName() + "���� ���� ������ ����մϴ�.");
      }
   }

   /**
      ȸ�� ��ü ����� ����� �ִ� �޼���
   */
   public void display(){ 
      System.out.println();
      for(MyMember member : data){
         System.out.println(member.toString());
      }
   }
   /**
      ���α׷��� ���� ��� ó��
   */
   public void stopProgram() throws IOException{ 
      System.out.println();
      System.out.print("������ �����Ͻðڽ��ϱ�? (y/n) : ");
      String result = br.readLine();

      if(result.equals("Y") || result.equals("y")){
         System.out.println("���α׷��� �����մϴ�.");
         isStop = true;
      }else{
         System.out.println("���α׷��� ���Ḧ ����մϴ�.");
         isStop = false;
      }
   }
   /**
      �޴��� �����ְ� ���α׷��� ���۽�Ű�� ���
   */
   public void startProgram() throws IOException{
      int menu = -1;
      while(!isStop){
         System.out.println("1.ȸ������");
         System.out.println("2.ȸ���˻�");
         System.out.println("3.ȸ����������");
         System.out.println("4.ȸ����������");
         System.out.println("5.ȸ����ü����");
         System.out.println("0.���α׷�����");
         System.out.print("�޴����� : ");
         
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
               System.err.println("\n�޴����ÿ��� : �޴��� Ȯ���Ͻð� �ٽ� ������ �ּ���^^;");
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