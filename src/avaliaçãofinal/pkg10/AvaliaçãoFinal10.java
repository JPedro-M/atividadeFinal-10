package avaliaçãofinal.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author troll
 */
public class AvaliaçãoFinal10 {
    public static void main(String[] args) {
        int numero, soma;
        
        numero = 1;
        soma = 0;
        while (numero != 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Um numero igual a 0 termina o processo.\n\nInforme um número:"));
            
            if (numero >= 1 && numero <= 500 && numero%2 != 0 && numero%3 == 0) {
                soma += numero;
            }
        }
        
        JOptionPane.showMessageDialog(null, "A soma dos numeros negativos, multiplos de 3 e entre 1 e 500 é: "+soma);
    }
}
