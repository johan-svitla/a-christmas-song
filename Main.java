public class Main {
    public static void main(String[] args) {
        System.out.println(generateTwelveDaysOfChristmas());
    }

    public static String generateTwelveDaysOfChristmas() {
        String[] days = {
            "first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
        };

        String[] gifts = {
            "a Partridge in a Pear Tree.",
            "two Turtle Doves,",
            "three French Hens,",
            "four Calling Birds,",
            "five Gold Rings,",
            "six Geese-a-Laying,",
            "seven Swans-a-Swimming,",
            "eight Maids-a-Milking,",
            "nine Ladies Dancing,",
            "ten Lords-a-Leaping,",
            "eleven Pipers Piping,",
            "twelve Drummers Drumming,"
        };

        StringBuilder song = new StringBuilder();
        for (int i = 0; i < days.length; i++) {
            song.append("On the ").append(days[i]).append(" day of Christmas my true love gave to me: ");
            for (int j = i; j >= 0; j--) {
                song.append(gifts[j]).append(j == 0 ? "" : " ");
            }
            song.append("\n");
        }

        return song.toString();
    }
}
