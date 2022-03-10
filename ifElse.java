import java.util.*;
public class ifElse {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in); 
        System.out.printf ("Digite a sua nota\n");
        int nota = leitor.nextInt();
        if (nota >=6) {
            System.out.printf ("Parabéns\n");
            System.out.printf ("Sua nota: %d lhe garante aprovação", nota);
        }
        else
        ystem.out.printf ("Reprovado");


    
}
