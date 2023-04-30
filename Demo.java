public class Demo {
        public static void main(String[] args) {
            try {
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                String inputString = scanner.nextLine();
                if (!inputString.equals("India")) {
                    throw new NOMATCHEXCP(1, inputString);
                }
            } catch (NOMATCHEXCP e) {
                System.out.println(e.getMessage());
            }
        }
    }
