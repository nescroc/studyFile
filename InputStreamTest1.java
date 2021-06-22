public class InputStreamTest1{
      
         public static void main(String[] args) {
                  byte[] input = new byte [256];
                  
                 try {
                       System.in.read(input, 0, 5);
                       System.out.println(new String(input));
 
                } catch (IOException e) {
                        e.printStackTrace();
                }
       }
  }