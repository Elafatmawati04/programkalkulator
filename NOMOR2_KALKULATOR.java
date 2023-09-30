/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_ELAFATMAWATI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author user
 */
class kalkulator extends JFrame implements ActionListener {
    // Objek komponen
    JLabel bilangan1 = new JLabel("Masukan Angka Ke 1");
    JTextField input1 = new JTextField(15);
    JLabel bilangan2 = new JLabel("Masukan Angka Ke 2");
    JTextField input2 = new JTextField(15);
    JLabel hasil = new JLabel("Hasil Perhitungan");
    JTextField output = new JTextField(15);
    JButton jumlah = new JButton("+");
    JButton kurang = new JButton("-");
    JButton bagi = new JButton("/");
    JButton kali = new JButton("*");

    kalkulator(){
        super("kalkulator");
        setSize(200, 220);
        setLocation(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void tampilan(){
        getContentPane().add(bilangan1);
        getContentPane().add(input1);
        getContentPane().add(bilangan2);
        getContentPane().add(input2);
        getContentPane().add(hasil);
        getContentPane().add(output);
        getContentPane().add(jumlah);
        getContentPane().add(kurang);
        getContentPane().add(bagi);
        getContentPane().add(kali);

        jumlah.addActionListener(this);
        kurang.addActionListener(this);
        kali.addActionListener(this);
        bagi.addActionListener(this);

        getContentPane().setLayout (new FlowLayout());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double angka1 = Double.parseDouble(input1.getText());
        double angka2 = Double.parseDouble(input2.getText());
        double hasil = 0;
        if(e.getSource() == jumlah){
            hasil = angka1 + angka2;
        } else if(e.getSource() == kurang){
            hasil = angka1 - angka2;
        } else if(e.getSource() == kali){
            hasil = angka1 * angka2;
        } else if(e.getSource() == bagi){
            hasil = angka1 / angka2;
        }
        output.setText(Double.toString(hasil));
    }
}

public class NOMOR2_KALKULATOR {
     public static void main(String[] args) {
      kalkulator f = new kalkulator();
      f.tampilan();
    }
}
