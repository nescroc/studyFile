import java.io.*;

public class InputEx2{
	public static void main(String[] args)throws IOException{
		int num1;
		int num2;
		System.out.print("����1 =");
		num1 = System.in.read()-48;
		System.in.read(); System.in.read(); //���Ͱ� ó��
		System.out.print("����2=");
		num2 = System.in.read()-'0';
		System.out.println("����" + (num1>num2?num1:num2)+"�� �� ũ�׿�");
	}
}