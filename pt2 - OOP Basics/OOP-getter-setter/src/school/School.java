package school;

public class School {
    public static void main(String[] args) {
        Alumn davi = new Alumn();
        davi.setName("Davi");
        davi.setAge(22);
        davi.setSex('M');

        System.out.println("O Aluno " + davi.getName() + " tem " + davi.getAge() + " anos.");
    }
}
