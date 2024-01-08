package service;

import data.Match;
import data.Team;
import utils.RegexUtil;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Klasa MatchService zarządza logiką biznesową związaną z meczami.
 * Umożliwia filtrowanie i przetwarzanie danych meczów.
 */
public class MatchService {
    private List<Match> matches;

    public MatchService(List<Match> matches) {
        this.matches = matches;
    }

    /**
     * Filtruje mecze, zwracając te, które są meczami domowymi dla podanej drużyny.
     * @param team Drużyna, dla której filtrowane są mecze domowe.
     * @return Lista meczów domowych dla podanej drużyny.
     */
    public List<Match> getHomeMatchesForTeam(Team team) {
        return matches.stream()
                .filter(match -> match.getHost().equals(team))
                .collect(Collectors.toList());
    }

    /**
     * Filtruje mecze, zwracając te, które są meczami wyjazdowymi dla podanej drużyny.
     * @param team Drużyna, dla której filtrowane są mecze wyjazdowe.
     * @return Lista meczów wyjazdowych dla podanej drużyny.
     */
    public List<Match> getAwayMatchesForTeam(Team team) {
        return matches.stream()
                .filter(match -> match.getGuest().equals(team))
                .collect(Collectors.toList());
    }

    // Tutaj można dodać więcej metod związanych z przetwarzaniem danych o meczach.
}
