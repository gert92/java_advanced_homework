package task5;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(divide(2,0));
        } catch (CannotDivideBy0Exception e){
            e.printStackTrace();
        }

    }

    public static double divide(double a, double b) throws CannotDivideBy0Exception {
        if (b == 0){
            throw new CannotDivideBy0Exception("Cannot divide by 0");
        }
        return a / b;
    }


}


