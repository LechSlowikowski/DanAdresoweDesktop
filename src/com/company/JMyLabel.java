package com.company;

import sun.invoke.empty.Empty;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JMyLabel extends JLabel {
    private Font font;
    private EmptyBorder margines;
    private Color tlo;
    private Color kolor;

    public JMyLabel(String text, Font font, EmptyBorder margines, Color tlo, Color kolor) {
        super(text);
        this.font = font;
        this.margines = margines;
        this.tlo = tlo;
        this.kolor = kolor;
        this.setFont(font);
        if(tlo != null){
            this.setBackground(tlo);
        }
        if(kolor != null) {
            this.setForeground(kolor);
        }
        this.setBorder(margines);
        this.setOpaque(true);
    }

    public JMyLabel(String text, Font font, EmptyBorder margines) {
        super(text);
        this.font = font;
        this.margines = margines;
        this.setFont(font);
        this.setBorder(margines);
        this.setOpaque(true);
    }
}
