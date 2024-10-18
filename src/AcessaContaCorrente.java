
public class AcessaContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("vitor");

        //System.out.println("Antes");
        //System.out.println(conta.nome);
        //System.out.println(conta.verificaSaldo());

        //conta.nome = "Augusto";
        //conta.depositaValor(100);

        //System.out.println("Depois");
        //System.out.println(conta.nome);
        //System.out.println(conta.verificaSaldo());

        ContaCorrente joao = new ContaCorrente("João", 1000);

        System.out.println("Novo usuario criado: " +joao.nome);
        System.out.println("Saldo: R$"+joao.verificaSaldo());
        System.out.println("Valor depositado: R$"+joao.depositaValor(300));
        System.out.println("Novo saldo: R$"+joao.verificaSaldo());
    }
}
