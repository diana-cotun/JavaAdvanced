package Task1_pg8_Exeptions;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(divide(2, 0));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    private static double divide(double a, double b) throws RuntimeException {
        if (b <= 0) {
            throw new RuntimeException ("CannotDivideByOException");
        }
        return a / b;
    }

//    private static void cannotDivideByOException() throws Exception {
//        throw new Exception("CannotDivideByOException");
//    }
}
