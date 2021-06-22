public class  ArrayEx1{
	public static void main(String[] args){
		char[] ch;
		ch = new char[4];//배열 초기화
		//배열 값의 할당
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		//배열 내용 출력
		for (int i = 0;i<ch.length; i++ ){
			System.out.println("ch["+i+"]:"+ch[i]);
		}
		
		for(char temp : ch){
			System.out.println("temp : "+temp);
		}		
	}
}
