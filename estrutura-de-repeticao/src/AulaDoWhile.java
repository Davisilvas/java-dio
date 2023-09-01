public record AulaDoWhile() {
    public static void main(String[] args) {
        int x = 3 ;

        do {
            x += 3;
            System.out.println(x);
        } while (x < 2);
    }
}
