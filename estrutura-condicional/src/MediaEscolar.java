public class MediaEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7){
            System.out.println("Aluno atingiu nota igual ou superior a 7. Aluno aprovado na disciplina.");
        }else if(nota >= 5 && nota <7){
            System.out.println("Aluno ficou com média maior ou igual a 5 e menor que 7. Aluno encaminhado para prova final.");
        }else{
            System.out.println("Aluno não atingiu uma nota menor que 5. Aluno reprovado direto.");
        }
    }
}