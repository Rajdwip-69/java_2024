package dataAbstruction;

public class LambdaExpression {
    public static void main(String[] args) {
        superInterface s1 = () ->{

        };
    }
}

@FunctionalInterface
interface superInterface{
    void outerclass();
}
