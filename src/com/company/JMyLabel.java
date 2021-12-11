package com.company;

import sun.invoke.empty.Empty;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/********************************************************
 * nazwa klasy: JMyLabel
 * parametry wejściowe: brak
 * wartość zwracana: brak
 * opis: klasa uzupełniająca JLabel o czcionkę, margines, tło i kolor
 * autor: 89012345678
 * ****************************************************/
public class JMyLabel extends JLabel {
    private Font font;
    private EmptyBorder margines;
    private Color tlo;
    private Color kolor;

    /********************************************************
     * nazwa funkcji: JMyLabel
     * parametry wejściowe: text - tekst wyświetlany w etykiecie
     *                      font - czciona etykiety
     *                      margines - zdefinowany margines etykiety
     *                      tlo - kolor tła
     *                      kolor - kolor czcionki
     * wartość zwracana: brak
     * opis: konstruktor klasy JMyLabel
     * autor: 89012345678
     * ****************************************************/
    public JMyLabel(String text, Font font, EmptyBorder margines, Color tlo, Color kolor) {
        super(text);
        this.font = font;
        this.margines = margines;
        this.tlo = tlo;
        this.kolor = kolor;
        this.setFont(font);
        if (tlo != null) {
            this.setBackground(tlo);
        }
        if (kolor != null) {
            this.setForeground(kolor);
        }
        this.setBorder(margines);
        this.setOpaque(true);
    }

    /********************************************************
     * nazwa funkcji: JMyLabel
     * parametry wejściowe: text - tekst wyświetlany w etykiecie
     *                      font - czciona etykiety
     *                      margines - zdefinowany margines etykiety
     * wartość zwracana: brak
     * opis: konstruktor klasy JMyLabel
     * autor: 89012345678
     * ****************************************************/
    public JMyLabel(String text, Font font, EmptyBorder margines) {
        super(text);
        this.font = font;
        this.margines = margines;
        this.setFont(font);
        this.setBorder(margines);
        this.setOpaque(true);
    }
}
