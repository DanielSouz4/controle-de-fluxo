public class PlanoOperadora {
    public static void main(String[] args) {
        String palano = "T";

        System.out.println("Beneficios do seu plano: ");

        switch (palano) {
            case "T":
                System.out.println("5GB youtube");
            case "M":
                System.out.println("Whatsapp e Instagram grátis");
            case "B":
                System.out.println("Ligações Ilimeitadas");
            default:
                throw new AssertionError();
        }
    }

}
