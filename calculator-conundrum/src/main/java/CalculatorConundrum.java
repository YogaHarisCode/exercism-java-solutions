class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        try {
            switch (operation){
                case "+" ->{
                    return String.format("%d %s %d = %d", operand1, operation, operand2, operand1 + operand2);
                }
                case "*" ->{
                    return String.format("%d %s %d = %d", operand1, operation, operand2, operand1 * operand2);
                }
                case "/" ->{
                    return String.format("%d %s %d = %d", operand1, operation, operand2, operand1 / operand2);
                }
                case "" -> throw new IllegalArgumentException("Operation cannot be empty");
                case null -> throw new IllegalArgumentException("Operation cannot be null");
                default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        }catch (ArithmeticException e){
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
}
