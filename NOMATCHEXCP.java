public class NOMATCHEXCP extends Throwable {
    public NOMATCHEXCP(int i, String inputString) {
    }

    public class nomatchexcp extends Exception {
        private String inputString;
        public nomatchexcp(int lineNumber, String inputString) {
            super("NOMATCHEXCP: Error in line " + lineNumber + ". The input string '" + inputString + "' is not equal to 'India'.");
            this.inputString = inputString;
        }
    }

}
