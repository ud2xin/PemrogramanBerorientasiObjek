import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Penilaian extends JFrame {

    private JTextField nimField, namaField, alamatField, mataKuliahField;
    private JTextField nilai1Field, nilai2Field, nilai3Field, nilai4Field, nilai5Field, nilaiAkhirField;
    private JButton simpanButton, hapusButton;
    private JTable table;
    private DefaultTableModel tableModel;

    public Penilaian() {
        setTitle("Penilaian");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(null);

        JLabel nimLabel = new JLabel("NIM");
        nimLabel.setBounds(20, 20, 100, 25);
        add(nimLabel);
        nimField = new JTextField();
        nimField.setBounds(130, 20, 150, 25);
        add(nimField);

        JLabel namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 60, 100, 25);
        add(namaLabel);
        namaField = new JTextField();
        namaField.setBounds(130, 60, 150, 25);
        add(namaField);

        JLabel alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds(20, 100, 100, 25);
        add(alamatLabel);
        alamatField = new JTextField();
        alamatField.setBounds(130, 100, 150, 25);
        add(alamatField);

        JLabel mataKuliahLabel = new JLabel("Mata Kuliah");
        mataKuliahLabel.setBounds(20, 140, 100, 25);
        add(mataKuliahLabel);
        mataKuliahField = new JTextField();
        mataKuliahField.setBounds(130, 140, 150, 25);
        add(mataKuliahField);

        JLabel nilai1Label = new JLabel("Nilai 1 (10%)");
        nilai1Label.setBounds(400, 20, 100, 25);
        add(nilai1Label);
        nilai1Field = new JTextField();
        nilai1Field.setBounds(510, 20, 150, 25);
        add(nilai1Field);

        JLabel nilai2Label = new JLabel("Nilai 2 (15%)");
        nilai2Label.setBounds(400, 60, 100, 25);
        add(nilai2Label);
        nilai2Field = new JTextField();
        nilai2Field.setBounds(510, 60, 150, 25);
        add(nilai2Field);

        JLabel nilai3Label = new JLabel("Nilai 3 - UTS (20%)");
        nilai3Label.setBounds(400, 100, 150, 25);
        add(nilai3Label);
        nilai3Field = new JTextField();
        nilai3Field.setBounds(510, 100, 150, 25);
        add(nilai3Field);

        JLabel nilai4Label = new JLabel("Nilai 4 (15%)");
        nilai4Label.setBounds(400, 140, 100, 25);
        add(nilai4Label);
        nilai4Field = new JTextField();
        nilai4Field.setBounds(510, 140, 150, 25);
        add(nilai4Field);

        JLabel nilai5Label = new JLabel("Nilai 5 (35%)");
        nilai5Label.setBounds(400, 180, 100, 25);
        add(nilai5Label);
        nilai5Field = new JTextField();
        nilai5Field.setBounds(510, 180, 150, 25);
        add(nilai5Field);

        JLabel nilaiAkhirLabel = new JLabel("Nilai Akhir");
        nilaiAkhirLabel.setBounds(400, 220, 100, 25);
        add(nilaiAkhirLabel);
        nilaiAkhirField = new JTextField();
        nilaiAkhirField.setBounds(510, 220, 150, 25);
        add(nilaiAkhirField);

        hapusButton = new JButton("Hapus");
        hapusButton.setBounds(20, 220, 100, 30);
        add(hapusButton);

        simpanButton = new JButton("Simpan");
        simpanButton.setBounds(130, 220, 100, 30);
        add(simpanButton);

        tableModel = new DefaultTableModel(new Object[]{"NIM", "Nama", "Alamat", "Mata Kuliah", "Nilai Akhir"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 270, 740, 200);
        add(scrollPane);

        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = nimField.getText();
                String nama = namaField.getText();
                String alamat = alamatField.getText();
                String mataKuliah = mataKuliahField.getText();
                String nilaiAkhir = nilaiAkhirField.getText();

                tableModel.addRow(new Object[]{nim, nama, alamat, mataKuliah, nilaiAkhir});

                nimField.setText("");
                namaField.setText("");
                alamatField.setText("");
                mataKuliahField.setText("");
                nilai1Field.setText("");
                nilai2Field.setText("");
                nilai3Field.setText("");
                nilai4Field.setText("");
                nilai5Field.setText("");
                nilaiAkhirField.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Penilaian();
    }
}
