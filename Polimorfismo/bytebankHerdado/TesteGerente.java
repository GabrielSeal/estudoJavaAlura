package bytebankHerdado;



public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Gabriel Seal");
        g1.setCpf("123456789");
        g1.setSalario(3000);

        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());
        System.out.println(g1.getCpf());

        g1.setSenha(2222);
        boolean autenticou = g1.autentica(2222);

        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());
    }
}
