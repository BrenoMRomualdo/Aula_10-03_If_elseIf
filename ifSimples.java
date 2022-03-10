import java.util.Scanner;
public class ifSimples{
    public static void main(String[] args) {
        Scanner leitor;
        leitor = new Scanner (System.in);
        double nota;
        System.out.printf ("Digite a sua nota");
        nota = leitor.nextDouble();
        if (nota >=6){
            System.out.println ("Parabéns");
            System.out.println ("Aprovado");
        }
        leitor.close();
    }

}