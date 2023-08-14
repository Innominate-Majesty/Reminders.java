package services;

public class Reminders {

    public static String getDailyReminders() {
        StringBuilder reminder = new StringBuilder();

        // Introduction to the reminders
        reminder.append("Just a friendly reminder, please:\n");

        // Reminder 1: Hydration
        reminder.append(
                "1. Stay hydrated. Please remember to drink at least 64 fluid ounces (fl oz) of water a day as recommended by research.\n");

        // Reminder 2: Sun Protection
        reminder.append(
                "2. If it’s sunny outside, please stay in shaded areas, wear protective clothing and accessories such as a hat, and wear sun protection with SPF 30 or higher. Remember to reapply per instructions on the back of the bottle.\n");

        // Reminder 3: Exercise
        reminder.append("3. Get at least 30 minutes of exercise every day, even if they are small walks.\n");

        return reminder.toString();
    }

    public static String askForSunscreenRecommendation() {
        return "Would you like some recommendations on sunscreens?";
    }

    public static String handleSunscreenRecommendationResponse(boolean wantsRecommendation) {
        if (wantsRecommendation) {
            return Recommendations.getSunscreenRecommendations(); // Removed the null parameter
        } else {
            return "Enjoy your day and have fun!";
        }
    }
}
