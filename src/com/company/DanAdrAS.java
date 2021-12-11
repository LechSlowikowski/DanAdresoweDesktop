package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class DanAdrAS {

    public static void main(String[] args) {
        JFrame okno = new JFrame("Dane osobowe");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setSize(300, 600);
        JPanel panelGlowny = new JPanel();
        panelGlowny.setLayout(new GridLayout(11, 1));
        //defnijemy fonty, których będziemy używać
        Font fontTytul = new Font("Verdana", Font.BOLD, 25);
        Font fontLabel = new Font("Arial", Font.ITALIC, 18);
        Font fontEdit = new Font("Arial", Font.PLAIN, 18);
        //definiujemy marginesy
        EmptyBorder marginesLewy = new EmptyBorder(0, 5, 0, 0);

        //etykieta tytułowa
        JMyLabel lblTytul = new JMyLabel("Dane osobowe", fontTytul, marginesLewy, Color.GREEN, Color.WHITE);
        //etykieta imie
        JMyLabel lblImie = new JMyLabel("Imię:", fontLabel, marginesLewy);
        //pole edycyjne imie
        JMyTextField txtImie = new JMyTextField("Wprowadź imię", fontEdit, marginesLewy);
        //etykieta nazwisko
        JMyLabel lblNazwisko = new JMyLabel("Nazwisko:", fontLabel, marginesLewy);
        //pole edycyjne nazwisko
        JMyTextField txtNazwisko = new JMyTextField("Wprowadź nazwisko", fontEdit, marginesLewy);
        //etykieta miasto
        JMyLabel lblMiasto = new JMyLabel("Miasto:", fontLabel, marginesLewy);
        //pole edycyjne miasto
        JMyTextField txtMiasto = new JMyTextField("Wprowadź miasto", fontEdit, marginesLewy);
        //etykieta telefon
        JMyLabel lblTelefon = new JMyLabel("Telefon:", fontLabel, marginesLewy);
        //pole edycyjne telefon
        JMyTextField txtTelefon = new JMyTextField("Wprowadź telefon", fontEdit, marginesLewy);

        JPanel panelPrzycisku = new JPanel();
        JButton btnZatwierdz = new JButton("ZATWIERDŹ");
        btnZatwierdz.setFont(fontEdit);
        panelPrzycisku.add(btnZatwierdz);

        JPanel panelKomunikatu = new JPanel();
        JMyLabel lblKomunikat = new JMyLabel("Autor 89012345678", fontLabel, marginesLewy);
        panelKomunikatu.add(lblKomunikat);

        panelGlowny.add(lblTytul);
        panelGlowny.add(lblImie);
        panelGlowny.add(txtImie);
        panelGlowny.add(lblNazwisko);
        panelGlowny.add(txtNazwisko);
        panelGlowny.add(lblMiasto);
        panelGlowny.add(txtMiasto);
        panelGlowny.add(lblTelefon);
        panelGlowny.add(txtTelefon);
        panelGlowny.add(panelPrzycisku);
        panelGlowny.add(panelKomunikatu);

        okno.add(panelGlowny);
        okno.setVisible(true);
    }
}
