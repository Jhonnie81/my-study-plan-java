public class LoopFor {
    public static void main(String[] args) {
         for (int i = 0; i < 5; i++) {
             System.out.println("i tem valor: " + i);
         }
         for (int i = 5; i >= 0; i--) {
             System.out.println("i tem valor: " + i);
         }
         for (int i = 0, j = 10; i < j ; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);
         }
         for (int count = 0;count < 10;count +=2 ){
             System.out.println("valor de count " + count);
         }
    }
}
