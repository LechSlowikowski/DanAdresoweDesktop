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
        //JMyLabel lblTytul = new JMyLabel("Dane osobowe", fontTytul, marginesLewy, Color.GREEN, Color.WHITE);

        JLabel lblTytul = new JLabel("Dane osobowe");
        lblTytul.setFont(fontTytul);
        lblTytul.setBackground(Color.GREEN);
        lblTytul.setForeground(Color.WHITE);
        lblTytul.setBorder(marginesLewy);
        lblTytul.setOpaque(true);


        //etykieta imie
        //JMyLabel lblImie = new JMyLabel("Imię:", fontLabel, marginesLewy);

        JLabel lblImie = new JLabel("Imię:");
        lblImie.setFont(fontLabel);
        lblImie.setBorder(marginesLewy);
        lblImie.setOpaque(true);

        //pole edycyjne imie
        JTextField txtImie = new JTextField("Wprowadź imię");
        txtImie.setFont(fontEdit);
        txtImie.setBorder(marginesLewy);
        txtImie.setOpaque(true);

        //etykieta nazwisko
        JLabel lblNazwisko = new JLabel("Nazwisko:");
        lblNazwisko.setFont(fontLabel);
        lblNazwisko.setBorder(marginesLewy);
        lblNazwisko.setOpaque(true);

        //pole edycyjne nazwisko
        JTextField txtNazwisko = new JTextField("Wprowadź nazwisko");
        txtNazwisko.setFont(fontEdit);
        txtNazwisko.setBorder(marginesLewy);
        txtNazwisko.setOpaque(true);

        //etykieta miasto
        JLabel lblMiasto = new JLabel("Miasto:");
        lblMiasto.setFont(fontLabel);
        lblMiasto.setBorder(marginesLewy);
        lblMiasto.setOpaque(true);

        //pole edycyjne miasto
        JTextField txtMiasto = new JTextField("Wprowadź miasto");
        txtMiasto.setFont(fontEdit);
        txtMiasto.setBorder(marginesLewy);
        txtMiasto.setOpaque(true);

        //etykieta telefon
        JLabel lblTelefon = new JLabel("Telefon:");
        lblTelefon.setFont(fontLabel);
        lblTelefon.setBorder(marginesLewy);
        lblTelefon.setOpaque(true);

        //pole edycyjne telefon
        JTextField txtTelefon = new JTextField("Wprowadź telefon");
        txtTelefon.setFont(fontEdit);
        txtTelefon.setBorder(marginesLewy);
        txtTelefon.setOpaque(true);

        JPanel panelPrzycisku = new JPanel();
        JButton btnZatwierdz = new JButton("ZATWIERDŹ");
        btnZatwierdz.setFont(fontEdit);
        panelPrzycisku.add(btnZatwierdz);

        JPanel panelKomunikatu = new JPanel();
        JLabel lblKomunikat = new JLabel("Autor 89012345678");
        lblKomunikat.setFont(fontLabel);
        lblKomunikat.setOpaque(true);
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
