public class Main {
    public static void main(String[] args) {
        int current_amount = 100;
        int replenishment_amount = 12;
        int bonus;
        int total_amount;
        if (replenishment_amount <= 1000) {
            bonus = 0;
            total_amount = current_amount + replenishment_amount;
            System.out.println(bonus);
            System.out.println(total_amount);
        }
        if (replenishment_amount > 1000) {
            bonus = replenishment_amount / 100;
            total_amount = current_amount + replenishment_amount + bonus;
            System.out.println(bonus);
            System.out.println(total_amount);
        }
    }
}
