public class   WriteEx{
	public static void main(String[] args){
		System.out.write(65);
		System.out.flush(); // 버퍼에 있는 것을 출력해라.
		System.out.println();
		byte[] by = {'J','A','V','A'};
		System.out.write(by,0,4);
		//바이트 배열 사용의 경우에는 오토플러시 기능이 있다.
		System.out.println();
	}
}
