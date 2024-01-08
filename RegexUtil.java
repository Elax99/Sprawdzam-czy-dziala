package utils;

import data.Match;
import data.Team;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Klasa RegexUtil z metodą extractMatches służącą do wyodrębniania danych o meczach z tekstu.
 * Wykorzystuje wyrażenia regularne do znalezienia daty, czasu, nazw drużyn i wyników meczów.
 */
public class RegexUtil {

    // Wyrażenie regularne do wyszukiwania daty, godziny, nazw drużyn i wyników meczu
    private static final String MATCH_PATTERN =
            "(\\d{2}\\.\\d{2}\\.\\d{4}) - (\\d{2}:\\d{2}), (.*?) - (.*?): (\\d+):(\\d+)";

    /**
     * Wyodrębnia informacje o meczach z podanego tekstu.
     * @param text Tekst zawierający dane o meczach.
     * @return Lista obiektów Match zawierających dane o meczach.
     */
    public List<Match> extractMatches(String text) {
        List<Match> matches = new ArrayList<>();
        Pattern pattern = Pattern.compile(MATCH_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            // Parsowanie daty i czasu meczu
            LocalDateTime matchDate = LocalDateTime.parse(
                    matcher.group(1) + " " + matcher.group(2),
                    DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")
            );

            // Tworzenie obiektów drużyn
            Team host = new Team(matcher.group(3));
            Team guest = new Team(matcher.group(4));
            // Parsowanie wyników meczu
            int hostPoints = Integer.parseInt(matcher.group(5));
            int guestPoints = Integer.parseInt(matcher.group(6));

            // Utworzenie i dodanie nowego meczu do listy
            Match match = new Match();
            match.setDate(matchDate);
            match.setHost(host);
            match.setGuest(guest);
            match.setHostPoints(hostPoints);
            match.setGuestPoints(guestPoints);

            matches.add(match);
        }

        return matches;
    }
}
