public class Question2 {

    public static void main(String[] args) {
        double eggsOnMonday = 100;  
        double eggsOnTuesday = 121;  
        double eggsOnWednesday = 117; 
        double totalEggs = eggsOnMonday + eggsOnTuesday + eggsOnWednesday;              // adding all the eggs collected per day
        double dailyAvg = totalEggs / 3;                // 3: being number of days
        double monthlyAvg = dailyAvg * 30;          // calculating monthly average of eggs that can be collected

        double profitPerEgg = 0.18; // profit per egg

        // Printing the output now ;

        // Daily Avg :
        System.out.println("Daily Average : " + dailyAvg);

        // Monthly Avg :
        System.out.println("Monthly Average : " + monthlyAvg);

        // Monthly Profit from eggs
        System.out.println("Profit: $" + profitPerEgg * monthlyAvg);

    }
}
