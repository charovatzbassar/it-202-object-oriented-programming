package week7.lecture;

@FunctionalInterface
interface OperationInterface {
    int operation(int a, int b);
}

@FunctionalInterface
interface MessageInterface {
    String saySomething(String something);
}

class Test {
    public static void main(String[] args) {
//        MessageInterface printMessage = something -> something;


        OperationInterface sum = (int a, int b) -> a + b;
        OperationInterface divide = (int a, int b) -> a / b;

        System.out.println(operate(10,5,sum));
    }

    public static int operate(int a, int b, OperationInterface operation) {
        return operation.operation(a,b);
    }
}