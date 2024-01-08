package data;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

/**
 * Klasa Team reprezentuje drużynę w kontekście ligi lub turnieju.
 * Zawiera nazwę drużyny oraz listy meczów domowych i wyjazdowych.
 */
@Getter
@Setter
public class Team {
    private String name; // Nazwa drużyny
    private List<Match> homeMatches; // Lista meczów rozgrywanych na własnym boisku
    private List<Match> awayMatches; // Lista meczów rozgrywanych na wyjeździe

    // Konstruktor, gettery i settery są generowane przez Lombok.
}
