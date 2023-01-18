public class CheckScore {

    /**
     * Ho creato il metodo checkScore dentro la classe CheckScore che ha il seguante parametro.
     * @param score che sara il numero che dovra confrontare.
     * @throws ArithmeticException e cui abbiamo l'eccezione nel caso in cui il numero sia piu grande di 100.00
     * oppure piu piccolo di 0.
     */
    public static void checkScore(double score) throws ArithmeticException{
        if(score > 0 && score <= 50.00) {
            System.out.println("Average score");
        } else if(score > 50.00 && score <= 100.00) {
            System.out.println("Very good score");
        } else {
            /**
             * Qui ho "lanciato" una nuova eccezione e scritto il suo messaggio.
             */
            throw new ArithmeticException("Score is out of scale");
            }
        }
    }

