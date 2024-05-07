public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 45;
        double valorSolicitado = 22;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("saque efetuado com sucesso. Novo saldo: "+saldo);
        }else{
            System.out.println("Saldo insuficiente !!!");
        }

    }

}
