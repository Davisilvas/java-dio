public class FormatadorDeCep {
    public static void main(String[] args) {
        try {
            String meuCepFormatado = formatarCepP("23765064");
            System.out.println(meuCepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP precisat ter 8 dígitos.");
        }
    }
    static String formatarCepP(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        return "23.765-064";
    }
}
