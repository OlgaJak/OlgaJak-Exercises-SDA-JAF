package Exceptions.Task1;

public class Task1 {
    public class CannotDivideBy0Exception extends Exception {
        public CannotDivideBy0Exception() {
            super("Cannot divide by 0!");
        }
    }

    public class Divider {
        public double divide(double dividend, double divisor) throws CannotDivideBy0Exception {
            if (divisor == 0) {
                throw new CannotDivideBy0Exception();
            }
            return dividend / divisor;
        }
    }
}
