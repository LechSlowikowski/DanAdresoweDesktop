package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/********************************************************
 * nazwa klasy: JMyTextField
 * parametry wejściowe: brak
 * wartość zwracana: brak
 * opis: klasa uzupełniająca JMyTextField o czcionkę, margines, tło i kolor
 * autor: 89012345678
 * ****************************************************/
public class JMyTextField extends JTextField {
    private Font font;
    private EmptyBorder margines;
    private Color tlo;
    private Color kolor;

    /********************************************************
     * nazwa funkcji: JMyTextField
     * parametry wejściowe: hint - podpowiedź wyświetlana w polu tekstowym
     *                      font - czciona pola tekstowego
     *                      margines - zdefinowany margines pola tekstowego
     *                      tlo - kolor tła
     *                      kolor - kolor czcionki
     * wartość zwracana: brak
     * opis: konstruktor klasy JMyTextField
     * autor: 89012345678
     * ****************************************************/
    public JMyTextField(String hint, Font font, EmptyBorder margines, Color tlo, Color kolor) {
        super();
        this.setToolTipText(hint);
        this.font = font;
        this.margines = margines;
        this.tlo = tlo;
        this.kolor = kolor;
        this.setFont(font);
        this.setBorder(margines);
        if (kolor != null) {
            this.setForeground(kolor);
        }
        if (tlo != null) {
            this.setBackground(tlo);
        }
        this.setOpaque(true);
    }

    /********************************************************
     * nazwa funkcji: JMyTextField
     * parametry wejściowe: hint - podpowiedź wyświetlana w polu tekstowym
     *                      font - czciona pola tekstowego
     *                      margines - zdefinowany margines pola tekstowego
     * wartość zwracana: brak
     * opis: konstruktor klasy JMyTextField
     * autor: 89012345678
     * ****************************************************/
    public JMyTextField(String hint, Font font, EmptyBorder margines) {
        super();
        this.setToolTipText(hint);
        this.font = font;
        this.margines = margines;
        this.setFont(font);
        this.setBorder(margines);
        this.setOpaque(true);
    }
}
