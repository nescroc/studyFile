class Sample{
	int x;
	int y;
}
public class SampleEx{
	public static void main(String[] arg){
		Sample sp = new Sample();
		System.out.println(sp.x);
		//자바에서 포함 멤버들이 각각 접근 지정자를 가진다.
		//생성자로 초기화시 멤버들 각각의 기본 자료형으로 초기화된다. char = \u0000
	}
}