/**
 *  Para mim faz mais sentido que a conta seja uma classe e que o usuáio tenha o método main para fazer a inserção de dados
 * @param clientName -> uma string que deve conter nome e sobrenome do usuário que esta a abrir uma nova conta.
 * @param agence -> dado do tipo int que vai receber o número de uma agência. 
 * @param accountId -> dado do tipo int que vai receber o número da conta do cliente.
 * @param balance -> dado do tipo double que vai receber o saldo em conta do cliente.
 */

public class ContaTerminal {
    String clientName;
    int agence;
    int accountId;
    double balance;

    /**
     * Recebe um dado do tipo STRING e atribui à variável clientName.
     * @args name -> string que será atribuída ao clientName
     * @return -> retorna a variável clientName com um novo valor.
     */
    public String setName(String name) {
        return clientName = name;
    }

    /**
     * Recebe um dado tipo INT e atribui à variável agence.
     * @param number -> int que será atribuído à agence.
     * @return -> retorna a variável agence com um novo valor.
     */
    public int setAgence(int number){
        return agence = number;
    }

    /**
     * Recebe um dado tipo INT e atribui à variável accountId.
     * @param number -> int que será atribuído à accountId.
     * @return -> retorna a variável accountId com um novo valor.
     */
    public int setAccountId(int number){
        return accountId = number;
    }

    /**
     * Recebe um dado tipo DOUBLE e atribui à variável balance.
     * @param number -> double que será atribuído à balance.
     * @return -> retorna a variável balance com um novo valor.
     */
    public double setBalance(double value){
        return balance = value;
    }
}
 