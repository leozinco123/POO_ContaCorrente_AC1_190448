package AC1;

import javax.swing.text.View;
import javax.swing.text.StyledEditorKit.BoldAction;

public class ContaCorrente {
    
    int conta;
    double saldo, limEspecial;
    String cliente;

    public ContaCorrente(int conta, double saldo, double limEspecial, String cliente)
    {

        this.conta = conta;
        this.saldo = saldo;
        this.limEspecial = limEspecial;
        this.cliente = cliente;

    }

    public boolean deposito(int conta, double deposito)
    {
        if(conta != this.conta)
        {
            System.out.println("Conta invalida");
            return false;
        }
        else
        {
            this.saldo += deposito;
            System.out.println("Deposito feito com sucesso.");
            System.out.print("Saldo atual: " + this.saldo);

            return true;
        }

    }

    public boolean saque(int conta, double saque)
    {
        if(conta != this.conta)
        {
            System.out.println("Conta invalida");
            return false;
        }
        else if(saque > saldo)
        {
            System.out.println("Saque acima do limite");
            System.out.print("Saldo atual: " + this.saldo);
            return false;
        }
        else
        {
            this.saldo -= saque;
            System.out.println("Saque feito com sucesso.");
            System.out.print("Saldo atual: " + this.saldo);
            return true;
        }

    }

    public boolean verSaldo(int conta)
    {
        if(conta != this.conta)
        {
            System.out.println("Conta invalida");
            return false;
        }
        else
        {
            System.out.print("Saldo atual: " + this.saldo);
            return true;
        }
    }

    public boolean somatorioEspecial(double saldo, int conta, double limEspecial)
    {
        for();
        if(this.limEspecial > 0)
        {

        }
    }

}

