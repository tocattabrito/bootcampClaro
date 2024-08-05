public class FormatadorCepExemplo {

    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("23765068");
            System.out.println("cep Formatado: " + cepFormatado);

        } catch (CepInvalidoException e) {
           System.out.println("Cep Invalido: " + e.getMessage());
        }
        
    }
    // Método
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) 
            throw new CepInvalidoException("O cep deve conter 8 digitos.");

            // simulando um cep formatado
            return "23.765-064";
        
    }
}
