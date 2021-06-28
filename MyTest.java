public class MyTest{
private static int a;
public static void main(String[] ar){
modify(a);
System.out.println(a);
}
public static void modify(int a){
a++;
}
}