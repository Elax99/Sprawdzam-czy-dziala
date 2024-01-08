package io; // Pakiet io w głównym pakiecie projektu

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Klasa DataDownloader odpowiada za pobieranie zawartości ze strony internetowej.
 * Umożliwia odczytanie danych z podanego URL i zwrócenie ich jako String.
 */
public class DataDownloader {

    // Prywatne pole przechowujące adres URL strony z terminarzem i wynikami.
    private final String pageUrl;

    /**
     * Konstruktor klasy DataDownloader przyjmujący URL jako parametr.
     * @param pageUrl URL strony do pobrania danych.
     */
    public DataDownloader(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    /**
     * Metoda downloadData pobiera dane ze strony internetowej.
     * @return String zawierający dane ze strony.
     * @throws IOException gdy wystąpi problem z połączeniem lub odczytem danych.
     */
    public String downloadData() throws IOException {
        StringBuilder data = new StringBuilder();
        URL url = new URL(this.pageUrl);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line).append(System.lineSeparator());
            }
        }
        return data.toString();
    }
}
