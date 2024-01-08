package data;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

/**
 * Klasa Match reprezentuje pojedyncze spotkanie między dwiema drużynami.
 * Zawiera informacje o drużynach biorących udział w meczu, wyniku oraz dacie.
 */
@Getter
@Setter
public class Match {
    private Team host; // Drużyna gospodarzy
    private Team guest; // Drużyna gości
    private int hostPoints; // Punkty zdobyte przez drużynę gospodarzy
    private int guestPoints; // Punkty zdobyte przez drużynę gości
    private LocalDateTime date; // Data i czas rozegrania meczu

    // Konstruktor, gettery i settery są generowane przez Lombok.
}
