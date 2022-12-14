package Exerc1Exerc2e4;

/**
 *
 * @author WilkermanVianna
 */
public class Exerc1Lista {
    /* primeira tentativa */
    /*public static void main(String[] args) {
        for(int x=0; x<=10; x++)
            for(int y=0; y<=10; y++) 
                System.out.println(x+" + "+y+" = "+(x + y));
            
        
    }*/
    
    public static void main(String [] args) {
        int[][] Soma = new int[10][10];
        int i, j;
        for (i = 1; i < 11; i++){
            for (j = 1; j < 11; j++){
                Soma[i - 1][j - 1] = i + j;
                System.out.println(i + " + " + j + " = " + Soma[i - 1][j - 1] + '\n');
            }
    }
    
    
    }
}
