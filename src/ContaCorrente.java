
public class ContaCorrente{

    float saldo;
    String nome;

    public ContaCorrente(String nome) {
        this.nome = nome;
    }

    public ContaCorrente(String nome, float saldo) {
        this.saldo = saldo;
        this.nome = nome;
    }

    float  verificaSaldo(){
         return saldo;
    }

    float depositaValor(float valor){
        this.saldo += valor;
        return saldo;
    }

    float sacaValor(float valor){
        if(valor <= saldo){
            saldo -= valor;
        }else{
            System.out.println("Você não possui este saldo.");
        }
        return saldo;
    }
}
