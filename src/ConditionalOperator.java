public class ConditionalOperator {
    public static void main(String[] args) {
        int money = 11;
        boolean lot = money > 10;
        boolean med = money > 6;

        if (lot){
            System.out.println("Пицца");
        } else if (med){
            System.out.println("Гамбургер");
        }else {
            System.out.println("Сэндвич");
        }
    }
}
