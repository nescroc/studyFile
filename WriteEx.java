public class   WriteEx{
	public static void main(String[] args){
		System.out.write(65);
		System.out.flush(); // ���ۿ� �ִ� ���� ����ض�.
		System.out.println();
		byte[] by = {'J','A','V','A'};
		System.out.write(by,0,4);
		//����Ʈ �迭 ����� ��쿡�� �����÷��� ����� �ִ�.
		System.out.println();
	}
}
