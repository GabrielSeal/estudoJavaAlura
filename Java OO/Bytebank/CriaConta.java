package Bytebank;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); 
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println("saldo da primeira conta " + primeiraConta.saldo);


        Conta segundaConta = new Conta();

        segundaConta.saldo = 50;
        System.out.println("saldo da segunda conta " + segundaConta.saldo);
        System.out.println("saldo de todas as contas = " + primeiraConta.saldo + segundaConta.saldo);

         
    }
}
