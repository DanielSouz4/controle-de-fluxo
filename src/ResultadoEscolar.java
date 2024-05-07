public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;
        int notaDois = 5;
        // utilizando if else

        // if(nota >= 7){
        //     System.out.println("Aprovado! ^-^");

        // }else if(nota>= 4 && nota <7){
        //     System.out.println("Você esta na final ! -_-");
        // } else{
        //     System.out.println("Reprovado! *-*");
        // }
        
        System.out.println("Nota: "+ nota);
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado+"\n");

        System.out.println("Nota: "+ notaDois);
        String resultadoDois = notaDois >=7 ? "Aprovado" : notaDois >= 4 && notaDois <7 ? "Final" : "Reprovado";
        System.out.println(resultadoDois);

    }
}
