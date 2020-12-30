public class Main {
    public static void main(String[] args) {
        int CurrentAmount = 100;
        int ReplenishmentAmount = 12445;
        int Bonus;
        int TotalAmount;
        if (ReplenishmentAmount <= 1000) {
            Bonus = 0;
            TotalAmount = CurrentAmount + ReplenishmentAmount;
        } else {
            Bonus =ReplenishmentAmount / 100;
            TotalAmount = CurrentAmount + ReplenishmentAmount + Bonus;
        }
        System.out.println(Bonus);
        System.out.println(TotalAmount);
    }
}
