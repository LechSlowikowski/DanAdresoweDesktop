package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JMyTextField extends JTextField {
    private Font font;
    private EmptyBorder margines;
    private Color tlo;
    private Color kolor;

    public JMyTextField(String hint, Font font, EmptyBorder margines, Color tlo, Color kolor) {
        super();
        this.setToolTipText(hint);
        this.font = font;
        this.margines = margines;
        this.tlo = tlo;
        this.kolor = kolor;
        this.setFont(font);
        this.setBorder(margines);
        if(kolor != null) {
            this.setForeground(kolor);
        }
        if(tlo != null) {
            this.setBackground(tlo);
        }
        this.setOpaque(true);
    }

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
