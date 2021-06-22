import java.io.*;

public class InputEx2{
	public static void main(String[] args)throws IOException{
		int num1;
		int num2;
		System.out.print("숫자1 =");
		num1 = System.in.read()-48;
		System.in.read(); System.in.read(); //엔터값 처리
		System.out.print("숫자2=");
		num2 = System.in.read()-'0';
		System.out.println("숫자" + (num1>num2?num1:num2)+"가 더 크네요");
	}
}
