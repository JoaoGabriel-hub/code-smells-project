public class Calculator {

    public int calculate(int a, int b, String op) {
        if(op.equals("add")) {
            return a + b;
        } else if(op.equals("sub")) {
            return a - b;
        } else if(op.equals("mul")) {
            return a * b;
        } else if(op.equals("div")) {
            if(b == 0) {
                System.out.println("Erro");
                return 0;
            }
            return a / b;
        }
        return 0;
    }
}