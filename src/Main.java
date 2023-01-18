public class Main {
    public static void main(String[] args) {

        /**
         * Ho poi creato nel main un try catch in cui ho inserito tutti i casi richiesti dall'esercizio, ed alla fine
         * ho introdotto l'errore da prendere e risolvere, printando il messaggio riguardante l'errore.
         */
        try{
            CheckScore.checkScore(2.15);
            CheckScore.checkScore(50);
            CheckScore.checkScore(95.02);
            CheckScore.checkScore(100.01);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}