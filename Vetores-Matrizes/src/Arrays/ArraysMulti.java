public class ArraysMulti {
    public static void main(String[] args) {
        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0]= 10;
        notasAlunos[0][1]= 8.5;
        notasAlunos[0][2]= 7.6;
        notasAlunos[0][3]= 9.6;

        notasAlunos[1][0]= 10;
        notasAlunos[1][1]= 5.5;
        notasAlunos[1][2]= 8.6;
        notasAlunos[1][3]= 9.6;

        notasAlunos[2][0]= 10;
        notasAlunos[2][1]= 7.5;
        notasAlunos[2][2]= 7.6;
        notasAlunos[2][3]= 5.6;

        for (int i = 0; i < notasAlunos.length; i++){
            for (int j = 0; j <= notasAlunos.length; j++){
                System.out.println(notasAlunos[i][j] + " ");
            }
        }
    }
}
