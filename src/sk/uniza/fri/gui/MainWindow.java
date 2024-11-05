package sk.uniza.fri.gui;

import sk.uniza.fri.aplikacia.TrControl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 8. 10. 2024 - 14:38
 *
 * @author matus
 */
public class MainWindow {
    private JFrame window;
    private JPanel leftPanel;

    private TrControl trControl;


    public MainWindow() {
        this.trControl = new TrControl();
        this.window = new JFrame();
        this.leftPanel = new JPanel();
        this.window.setTitle("Aplikácia pre geodetov");
        this.window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.window.setLayout(new BorderLayout(10, 5));
        this.window.setSize(1000, 800);
        this.window.setLocationRelativeTo(null);
        this.leftPanel.setLayout(new BoxLayout(this.leftPanel, BoxLayout.Y_AXIS));
        this.leftPanel.setBackground(Color.BLACK);


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        this.window.add(this.leftPanel, BorderLayout.WEST);


        Button najdiCelokButtom = new Button("Najdi uzemne celky");
        Button pridajCelokButton = new Button("Pridaj Uzemny celok");
        Button upravCelok = new Button("Uprav Uzemny celok");
        Button vygenerujCelky = new Button("Vygeneruj Uzemne celky");
        Button vyradCelok = new Button("Vyrad uzemny celok");
        Button nacitajZoSuboru = new Button("Nacitaj databazu zo suborov");
        Button ulozDoSuboru = new Button("Uloz databazu do suborov");
        this.leftPanel.add(najdiCelokButtom);
        this.leftPanel.add(pridajCelokButton);
        this.leftPanel.add(vygenerujCelky);
        this.leftPanel.add(upravCelok);
        this.leftPanel.add(vyradCelok);
        this.leftPanel.add(nacitajZoSuboru);
        this.leftPanel.add(ulozDoSuboru);


        upravCelok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    UpravCelok upravCelok = new UpravCelok(MainWindow.this);
                    upravCelok.setContentPane(upravCelok.$$$getRootComponent$$$());
                    upravCelok.pack();
                    upravCelok.setVisible(true);


                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(null, "Prosím zadajte platné hodnoty");
                }
            }
        });

        nacitajZoSuboru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    NacitajZoSubora nacitajZoSubora = new NacitajZoSubora(MainWindow.this);
                    nacitajZoSubora.setContentPane(nacitajZoSubora.$$$getRootComponent$$$());
                    nacitajZoSubora.pack();
                    nacitajZoSubora.setVisible(true);


                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(null, "Prosím zadajte platné hodnoty");
                }
            }
        });

        ulozDoSuboru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    UlozDoSubora ulozDoSubora = new UlozDoSubora(MainWindow.this);
                    ulozDoSubora.setContentPane(ulozDoSubora.getPanel1());
                    ulozDoSubora.pack();
                    ulozDoSubora.setVisible(true);


                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(null, "Prosím zadajte platné hodnoty");
                }
            }
        });

        vygenerujCelky.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    VygenerujData vygenerujData = new VygenerujData(MainWindow.this);
                    vygenerujData.setContentPane(vygenerujData.$$$getRootComponent$$$());
                    vygenerujData.pack();
                    vygenerujData.setVisible(true);


                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(null, "Prosím zadajte platné hodnoty");
                }
            }
        });

        najdiCelokButtom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    NajdiCelok najdiCelokQuery = new NajdiCelok(MainWindow.this);
                    najdiCelokQuery.setContentPane(najdiCelokQuery.getjPanel());
                    najdiCelokQuery.pack();
                    najdiCelokQuery.setVisible(true);


                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(null, "Prosím zadajte platné hodnoty");
                }


            }
        });


        pridajCelokButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PridajCelok pridajCelok = new PridajCelok(MainWindow.this);
                pridajCelok.setContentPane(pridajCelok.getjPanel());
                pridajCelok.pack();
                pridajCelok.setVisible(true);

            }
        });

        vyradCelok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VymazCelok vyradCelok = new VymazCelok(MainWindow.this);
                vyradCelok.setContentPane(vyradCelok.getjPanel());
                vyradCelok.pack();
                vyradCelok.setVisible(true);
            }
        });



        najdiCelokButtom.setBackground(Color.WHITE);
        pridajCelokButton.setBackground(Color.WHITE);
        vygenerujCelky.setBackground(Color.WHITE);
        upravCelok.setBackground(Color.WHITE);
        vyradCelok.setBackground(Color.WHITE);
        ulozDoSuboru.setBackground(Color.WHITE);
        nacitajZoSuboru.setBackground(Color.WHITE);
    }

    public void show() {
        this.window.setVisible(true);
    }

    public TrControl getTrControl() {
        return this.trControl;
    }
}
