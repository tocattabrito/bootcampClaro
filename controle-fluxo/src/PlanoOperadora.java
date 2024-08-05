public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T"; // T, M, B

        switch (plano) {
            case "T": {
                System.out.println("5GB YouTube");
            }
            case "M": {
                System.out.println("Whatsapp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        } 
    }
}
