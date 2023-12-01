package Tugas9.Tugas9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class Mahasiswa extends JFrame{
    private JPanel panelutama;
    private JTextField nama;
    private JComboBox Tanggal;
    private JComboBox Tahun;
    private JComboBox Bulan;
    private JTextField alamat;
    private JButton PROSES;
    private JTextArea Nama;
    private JTextArea TL;
    private JTextArea Alamat;
    private JTextArea Usia;

    public Mahasiswa() {
        this.setContentPane(panelutama);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        PROSES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = Nama.getText();
                int tlTanggal = Integer.parseInt((String) Tanggal.getSelectedItem());
                int tlBulan = Bulan.getSelectedIndex() + 1;
                int tlTahun = Integer.parseInt((String) Tahun.getSelectedItem());
                String alamat = Alamat.getText();

                Nama.setText("nama          :" + " " + nama);
                TL.setText("Tanggal Lahir           :" + " " + tlTanggal + " " + Bulan.getSelectedItem() + " " + tlTahun);
                Alamat.setText("alamat          :" + " " + alamat);

                LocalDate birthdate = LocalDate.of(tlTahun, tlBulan, tlTanggal);
                LocalDate currentDate = LocalDate.now();
                Period period = Period.between(birthdate, currentDate);

                int years = period.getYears();
                int months = period.getMonths();
                int days = period.getDays();

                Usia.setText("Usia          :" + " " + years + " tahun, " + months + " bulan, " + days + " hari");
            }
        });
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setVisible(true);
    }
}