package br.com.dio.ui.custom.button;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ResetButon extends JButton {

    public ResetButon(final ActionListener actionListener) {
        this.setText("Reinciar jogo");
        this.addActionListener(actionListener);
    }
}
