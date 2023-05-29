    import java.util.ArrayList;
import java.util.List;
    public class arraysiguais {

        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {4, 5, 6, 7, 8};

            List<Integer> numerosIguais = new ArrayList<>();

            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        numerosIguais.add(array1[i]);
                        break;
                    }
                }
            }

            System.out.println("Números iguais nos arrays: " + numerosIguais);
        }
    }


