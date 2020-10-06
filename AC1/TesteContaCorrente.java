package AC1;

import java.util.Scanner;

public class TesteContaCorrente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int conta = 100;
        double saldo = 100025, limEspecial = 1000;
        String cliente = "Leonardo";
        ContaCorrente usuario;

        saldo = sc.nextDouble();
        limEspecial = sc.nextDouble();
        cliente = sc.nextLine();

        usuario = new ContaCorrente(conta, saldo, limEspecial, cliente);

        while(saldo < limEspecial)
        {
            System.out.println("Saldo deve ser maior ou igual ao limite especial\nDigite novamente:");
            saldo = sc.nextDouble();
            usuario = new ContaCorrente(conta, saldo, limEspecial, cliente);
        }

        while(limEspecial < 0)
        {
            System.out.println("O limite especial deve ser maior ou igual a zero\nDigite novamente:");
            limEspecial = sc.nextDouble();
            usuario = new ContaCorrente(conta, saldo, limEspecial, cliente);
        }

        



    }
    
}
