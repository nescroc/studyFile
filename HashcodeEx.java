public class  HashcodeEx{
	public static void main(String[] args){
		String str = new String("TEST");
		String str2 = new String("TEST");
		System.out.println("str�� str2�� �ּҰ��� ������ ? :" +
							(str==str2));
		System.out.println("str�� str2�� �ؽ��ڵ�� ������ ? :"+
							(str.hashCode()==str2.hashCode()));
		System.out.println("str�� �ؽ��ڵ� ? :"+str.hashCode());
		System.out.println("str2�� �ؽ��ڵ� ? :"+str2.hashCode());
		//��ü�� �ؽ��ڵ��
		HashcodeEx test1 = new HashcodeEx();
		HashcodeEx test2 = new HashcodeEx();
		
		System.out.println("test1�� test2�� �ּҰ��� ������ ? :" +
							(test1==test2));
		
		System.out.println("test1�� test2�� �ؽ��ڵ尪�� ������ ? :" +
							(test1.hashCode()==test2.hashCode()));
		
		System.out.println("test1�� �ؽ��ڵ尪�� ? :" +(test1.hashCode()));
		System.out.println("test2�� �ؽ��ڵ尪�� ? :" +(test2.hashCode()));


	}
}