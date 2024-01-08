package ui;

import service.MatchService;
import data.Team;
import java.util.Scanner;

/**
 * Klasa UserInterface jest odpowiedzialna za interakcję z użytkownikiem.
 * Pozwala na wybór drużyn i typów meczów, a następnie wyświetla wyniki.
 */
public class UserInterface {
    private MatchService matchService;
    private Scanner scanner;

    public UserInterface(MatchService matchService) {
        this.matchService = matchService;
        this.scanner = new Scanner(System.in);
    }

    public void displayOptions() {
        // Tutaj wyświetl opcje dla użytkownika
    }

    public void handleUserInput() {
        // Tutaj zaimplementuj logikę do obsługi wejścia od użytkownika
    }

    // Metody pomocnicze do wyświetlania i obsługi wyników
}
