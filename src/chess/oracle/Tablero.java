
package chess.oracle;

import chess.oracle.Piezas.Caballo;
import chess.oracle.Piezas.Peon;
import chess.oracle.Piezas.Pieza;
import chess.oracle.Piezas.Rey;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Tablero extends javax.swing.JFrame {

    public Tablero() {
        initComponents();
        limpiarmatriz(matriz);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopMenuLugar = new javax.swing.JPopupMenu();
        ColocarPeonBlanco = new javax.swing.JMenuItem();
        ColocarReyBlanco = new javax.swing.JMenuItem();
        ColocarCaballoBlanco = new javax.swing.JMenuItem();
        ColocarPeonNegro = new javax.swing.JMenuItem();
        ColocarReyNegro = new javax.swing.JMenuItem();
        ColocarCaballoNegro = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        H1 = new javax.swing.JButton();
        G4 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        F7 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        D8 = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        F5 = new javax.swing.JButton();
        H6 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        H3 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        H8 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        G8 = new javax.swing.JButton();
        D7 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        E7 = new javax.swing.JButton();
        H2 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        F6 = new javax.swing.JButton();
        G6 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        E6 = new javax.swing.JButton();
        E5 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        H7 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        H5 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        F8 = new javax.swing.JButton();
        G7 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        E8 = new javax.swing.JButton();
        G5 = new javax.swing.JButton();
        H4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        G3 = new javax.swing.JButton();
        D6 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        comboOpciones = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        ColocarPeonBlanco.setText("Colocar Peon Blanco");
        ColocarPeonBlanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ColocarPeonBlancoMouseClicked(evt);
            }
        });
        ColocarPeonBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColocarPeonBlancoActionPerformed(evt);
            }
        });
        PopMenuLugar.add(ColocarPeonBlanco);

        ColocarReyBlanco.setText("Colocar Rey Blanco");
        ColocarReyBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColocarReyBlancoActionPerformed(evt);
            }
        });
        PopMenuLugar.add(ColocarReyBlanco);

        ColocarCaballoBlanco.setText("Colocar Caballo Blanco");
        ColocarCaballoBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColocarCaballoBlancoActionPerformed(evt);
            }
        });
        PopMenuLugar.add(ColocarCaballoBlanco);

        ColocarPeonNegro.setText("Colocar Peon Negro");
        ColocarPeonNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColocarPeonNegroActionPerformed(evt);
            }
        });
        PopMenuLugar.add(ColocarPeonNegro);

        ColocarReyNegro.setText("Colocar Rey Negro");
        ColocarReyNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColocarReyNegroActionPerformed(evt);
            }
        });
        PopMenuLugar.add(ColocarReyNegro);

        ColocarCaballoNegro.setText("Colocar Caballo Negro");
        ColocarCaballoNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColocarCaballoNegroActionPerformed(evt);
            }
        });
        PopMenuLugar.add(ColocarCaballoNegro);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Ver matris en consola");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        H1.setBackground(new java.awt.Color(0, 0, 0));
        H1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        H1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H1MouseClicked(evt);
            }
        });

        G4.setBackground(new java.awt.Color(0, 0, 0));
        G4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        G4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G4MouseClicked(evt);
            }
        });

        B8.setBackground(new java.awt.Color(255, 255, 255));
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8MouseClicked(evt);
            }
        });

        C7.setBackground(new java.awt.Color(255, 255, 255));
        C7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C7MouseClicked(evt);
            }
        });

        F3.setBackground(new java.awt.Color(0, 0, 0));
        F3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F3MouseClicked(evt);
            }
        });

        C4.setBackground(new java.awt.Color(0, 0, 0));
        C4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C4MouseClicked(evt);
            }
        });

        F7.setBackground(new java.awt.Color(0, 0, 0));
        F7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F7MouseClicked(evt);
            }
        });

        C6.setBackground(new java.awt.Color(0, 0, 0));
        C6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C6MouseClicked(evt);
            }
        });

        C1.setBackground(new java.awt.Color(255, 255, 255));
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C1MouseClicked(evt);
            }
        });

        B1.setBackground(new java.awt.Color(0, 0, 0));
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });

        D8.setBackground(new java.awt.Color(255, 255, 255));
        D8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D8MouseClicked(evt);
            }
        });

        G2.setBackground(new java.awt.Color(0, 0, 0));
        G2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        G2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G2MouseClicked(evt);
            }
        });

        D4.setBackground(new java.awt.Color(255, 255, 255));
        D4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D4MouseClicked(evt);
            }
        });

        C3.setBackground(new java.awt.Color(255, 255, 255));
        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C3MouseClicked(evt);
            }
        });

        C8.setBackground(new java.awt.Color(0, 0, 0));
        C8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C8MouseClicked(evt);
            }
        });

        B4.setBackground(new java.awt.Color(255, 255, 255));
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4MouseClicked(evt);
            }
        });

        D3.setBackground(new java.awt.Color(0, 0, 0));
        D3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D3MouseClicked(evt);
            }
        });

        A1.setBackground(new java.awt.Color(255, 255, 255));
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        A4.setBackground(new java.awt.Color(0, 0, 0));
        A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A4MouseClicked(evt);
            }
        });

        F5.setBackground(new java.awt.Color(0, 0, 0));
        F5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F5MouseClicked(evt);
            }
        });

        H6.setBackground(new java.awt.Color(255, 255, 255));
        H6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        H6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H6MouseClicked(evt);
            }
        });

        B6.setBackground(new java.awt.Color(255, 255, 255));
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6MouseClicked(evt);
            }
        });

        A6.setBackground(new java.awt.Color(0, 0, 0));
        A6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A6MouseClicked(evt);
            }
        });

        C5.setBackground(new java.awt.Color(255, 255, 255));
        C5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C5MouseClicked(evt);
            }
        });

        F2.setBackground(new java.awt.Color(255, 255, 255));
        F2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        F2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F2MouseClicked(evt);
            }
        });

        A8.setBackground(new java.awt.Color(0, 0, 0));
        A8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A8MouseClicked(evt);
            }
        });

        H3.setBackground(new java.awt.Color(0, 0, 0));
        H3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        H3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H3MouseClicked(evt);
            }
        });

        E1.setBackground(new java.awt.Color(255, 255, 255));
        E1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E1MouseClicked(evt);
            }
        });

        F4.setBackground(new java.awt.Color(255, 255, 255));
        F4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F4MouseClicked(evt);
            }
        });

        H8.setBackground(new java.awt.Color(255, 255, 255));
        H8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        H8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H8MouseClicked(evt);
            }
        });

        F1.setBackground(new java.awt.Color(0, 0, 0));
        F1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        F1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F1MouseClicked(evt);
            }
        });

        B7.setBackground(new java.awt.Color(0, 0, 0));
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7MouseClicked(evt);
            }
        });

        B2.setBackground(new java.awt.Color(255, 255, 255));
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });

        C2.setBackground(new java.awt.Color(0, 0, 0));
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C2MouseClicked(evt);
            }
        });

        G8.setBackground(new java.awt.Color(0, 0, 0));
        G8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        G8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G8MouseClicked(evt);
            }
        });

        D7.setBackground(new java.awt.Color(0, 0, 0));
        D7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D7MouseClicked(evt);
            }
        });

        A2.setBackground(new java.awt.Color(0, 0, 0));
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
        });

        E7.setBackground(new java.awt.Color(255, 255, 255));
        E7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E7MouseClicked(evt);
            }
        });

        H2.setBackground(new java.awt.Color(255, 255, 255));
        H2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        H2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H2MouseClicked(evt);
            }
        });

        A5.setBackground(new java.awt.Color(255, 255, 255));
        A5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A5MouseClicked(evt);
            }
        });

        F6.setBackground(new java.awt.Color(255, 255, 255));
        F6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F6MouseClicked(evt);
            }
        });

        G6.setBackground(new java.awt.Color(0, 0, 0));
        G6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        G6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G6MouseClicked(evt);
            }
        });

        D1.setBackground(new java.awt.Color(0, 0, 0));
        D1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D1MouseClicked(evt);
            }
        });

        D5.setBackground(new java.awt.Color(0, 0, 0));
        D5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D5MouseClicked(evt);
            }
        });

        E3.setBackground(new java.awt.Color(255, 255, 255));
        E3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E3MouseClicked(evt);
            }
        });

        E6.setBackground(new java.awt.Color(0, 0, 0));
        E6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E6MouseClicked(evt);
            }
        });

        E5.setBackground(new java.awt.Color(255, 255, 255));
        E5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E5MouseClicked(evt);
            }
        });

        G1.setBackground(new java.awt.Color(255, 255, 255));
        G1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        G1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G1MouseClicked(evt);
            }
        });

        H7.setBackground(new java.awt.Color(0, 0, 0));
        H7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        H7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H7MouseClicked(evt);
            }
        });

        D2.setBackground(new java.awt.Color(255, 255, 255));
        D2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D2MouseClicked(evt);
            }
        });

        H5.setBackground(new java.awt.Color(0, 0, 0));
        H5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        H5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H5MouseClicked(evt);
            }
        });

        A7.setBackground(new java.awt.Color(255, 255, 255));
        A7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A7MouseClicked(evt);
            }
        });

        F8.setBackground(new java.awt.Color(255, 255, 255));
        F8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F8MouseClicked(evt);
            }
        });

        G7.setBackground(new java.awt.Color(255, 255, 255));
        G7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        G7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G7MouseClicked(evt);
            }
        });

        A3.setBackground(new java.awt.Color(255, 255, 255));
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A3MouseClicked(evt);
            }
        });

        E2.setBackground(new java.awt.Color(0, 0, 0));
        E2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E2MouseClicked(evt);
            }
        });

        E8.setBackground(new java.awt.Color(0, 0, 0));
        E8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E8MouseClicked(evt);
            }
        });

        G5.setBackground(new java.awt.Color(255, 255, 255));
        G5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        G5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G5MouseClicked(evt);
            }
        });

        H4.setBackground(new java.awt.Color(255, 255, 255));
        H4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        H4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H4MouseClicked(evt);
            }
        });

        B5.setBackground(new java.awt.Color(0, 0, 0));
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
        });

        G3.setBackground(new java.awt.Color(255, 255, 255));
        G3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        G3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G3MouseClicked(evt);
            }
        });

        D6.setBackground(new java.awt.Color(255, 255, 255));
        D6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D6MouseClicked(evt);
            }
        });

        B3.setBackground(new java.awt.Color(0, 0, 0));
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3MouseClicked(evt);
            }
        });

        E4.setBackground(new java.awt.Color(0, 0, 0));
        E4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {A1, A2, A3, A4, A5, A6, A7, A8, B1, B2, B3, B4, B5, B6, B7, B8, C1, C2, C3, C4, C5, C6, C7, C8, D1, D2, D3, D4, D5, D6, D7, D8, E1, E2, E3, E4, E5, E6, E7, E8, F1, F2, F3, F4, F5, F6, F7, F8, G1, G2, G3, G4, G5, G6, G7, G8, H1, H2, H3, H4, H5, H6, H7, H8});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {A1, A2, A3, A4, A5, A6, A7, A8, B1, B2, B3, B4, B5, B6, B7, B8, C1, C2, C3, C4, C5, C6, C7, C8, D1, D2, D3, D4, D5, D6, D7, D8, E1, E2, E3, E4, E5, E6, E7, E8, F1, F2, F3, F4, F5, F6, F7, F8, G1, G2, G3, G4, G5, G6, G7, G8, H1, H2, H3, H4, H5, H6, H7, H8});

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("8");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("3");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("2");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("4");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("5");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("6");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("7");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("1");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jButton2.setText("Limpiar Tablero");

        jButton4.setText("Analizar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        comboOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coronar Peon", "Comer Caballo", "Buscar Jaque" }));
        comboOpciones.setSelectedIndex(-1);
        comboOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOpcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comboOpciones, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Resultados");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel18)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("H");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("C");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("B");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("D");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("E");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("F");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("G");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("A");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        jButton3.setText("Imprime la lista");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked
        if (evt.isMetaDown()) {
            actual = this.A1;
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 0;
            mostrarmenu(A1.getX(), A1.getY(), this.jPanel1);
            System.out.println(coordX);
        } else {
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 0;

        }
    }//GEN-LAST:event_A1MouseClicked

    private void A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseClicked
        if (evt.isMetaDown()) {
            actual = this.A2;
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 1;
            mostrarmenu(A2.getX(), A2.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 1;
        }
    }//GEN-LAST:event_A2MouseClicked

    private void A3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseClicked
        if (evt.isMetaDown()) {
            actual = this.A3;
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 2;
            mostrarmenu(A3.getX(), A3.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 2;
        }
    }//GEN-LAST:event_A3MouseClicked

    private void A4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseClicked
        if (evt.isMetaDown()) {
            actual = this.A4;
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 3;
            mostrarmenu(A4.getX(), A4.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 3;
        }
    }//GEN-LAST:event_A4MouseClicked

    private void A5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A5MouseClicked
        if (evt.isMetaDown()) {
            actual = this.A5;
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 4;
            mostrarmenu(A5.getX(), A5.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 4;
        }
    }//GEN-LAST:event_A5MouseClicked

    private void A6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A6MouseClicked
        if (evt.isMetaDown()) {
            actual = this.A6;
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 5;
            mostrarmenu(A6.getX(), A6.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 5;
        }
    }//GEN-LAST:event_A6MouseClicked

    private void A7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A7MouseClicked
        if (evt.isMetaDown()) {
            actual = this.A7;
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 6;
            mostrarmenu(A7.getX(), A7.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 6;
        }
    }//GEN-LAST:event_A7MouseClicked

    private void A8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A8MouseClicked
        if (evt.isMetaDown()) {
            actual = this.A8;
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 7;
            mostrarmenu(A8.getX(), A8.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('A');
            this.coordY = 7;
        }
    }//GEN-LAST:event_A8MouseClicked

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
        if (evt.isMetaDown()) {
            actual = this.B1;
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 0;
            mostrarmenu(B1.getX(), B1.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 0;
        }
    }//GEN-LAST:event_B1MouseClicked

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked
        if (evt.isMetaDown()) {
            actual = this.B2;
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 1;
            mostrarmenu(B2.getX(), B2.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 1;
        }
    }//GEN-LAST:event_B2MouseClicked

    private void B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseClicked
        if (evt.isMetaDown()) {
            actual = this.B3;
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 2;
            mostrarmenu(B3.getX(), B3.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 2;
        }
    }//GEN-LAST:event_B3MouseClicked

    private void B4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MouseClicked
        if (evt.isMetaDown()) {
            actual = this.B4;
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 3;
            mostrarmenu(B4.getX(), B4.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 3;
        }
    }//GEN-LAST:event_B4MouseClicked

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
        if (evt.isMetaDown()) {
            actual = this.B5;
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 4;
            mostrarmenu(B5.getX(), B5.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 4;
        }
    }//GEN-LAST:event_B5MouseClicked

    private void B6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseClicked
        if (evt.isMetaDown()) {
            actual = this.B6;
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 5;
            mostrarmenu(B6.getX(), B6.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 5;
        }
    }//GEN-LAST:event_B6MouseClicked

    private void B7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseClicked
        if (evt.isMetaDown()) {
            actual = this.B7;
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 6;
            mostrarmenu(B7.getX(), B7.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 6;
        }
    }//GEN-LAST:event_B7MouseClicked

    private void B8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseClicked
        if (evt.isMetaDown()) {
            actual = this.B8;
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 7;
            mostrarmenu(B8.getX(), B8.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('B');
            this.coordY = 7;
        }
    }//GEN-LAST:event_B8MouseClicked

    private void C1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseClicked
        if (evt.isMetaDown()) {
            actual = this.C1;
            this.coordX = this.getnumericcoordenade('C');
            this.coordY = 0;
            mostrarmenu(C1.getX(), C1.getY(), this.jPanel1);
        }
    }//GEN-LAST:event_C1MouseClicked

    private void C2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseClicked
        if (evt.isMetaDown()) {
            actual = this.C2;
            this.coordX = this.getnumericcoordenade('C');
            this.coordY = 1;
            mostrarmenu(C2.getX(), C2.getY(), this.jPanel1);
        }
    }//GEN-LAST:event_C2MouseClicked

    private void C3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C3MouseClicked
        if (evt.isMetaDown()) {
            actual = this.C3;
            this.coordX = this.getnumericcoordenade('C');
            this.coordY = 2;
            mostrarmenu(C3.getX(), C3.getY(), this.jPanel1);
        }
    }//GEN-LAST:event_C3MouseClicked

    private void C4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C4MouseClicked
        if (evt.isMetaDown()) {
            actual = this.C4;
            this.coordX = this.getnumericcoordenade('C');
            this.coordY = 3;
            mostrarmenu(C4.getX(), C4.getY(), this.jPanel1);
        }

    }//GEN-LAST:event_C4MouseClicked

    private void C5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C5MouseClicked
        if (evt.isMetaDown()) {
            actual = this.C5;
            this.coordX = this.getnumericcoordenade('C');
            this.coordY = 4;
            mostrarmenu(C5.getX(), C5.getY(), this.jPanel1);
        }

    }//GEN-LAST:event_C5MouseClicked

    private void C6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C6MouseClicked
        if (evt.isMetaDown()) {
            actual = this.C6;
            this.coordX = this.getnumericcoordenade('C');
            this.coordY = 5;
            mostrarmenu(C6.getX(), C6.getY(), this.jPanel1);
        }

    }//GEN-LAST:event_C6MouseClicked

    private void C7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C7MouseClicked
        if (evt.isMetaDown()) {
            actual = this.C7;
            this.coordX = this.getnumericcoordenade('C');
            this.coordY = 6;
            mostrarmenu(C7.getX(), C7.getY(), this.jPanel1);
        }

    }//GEN-LAST:event_C7MouseClicked

    private void C8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C8MouseClicked
        if (evt.isMetaDown()) {
            actual = this.C8;
            this.coordX = this.getnumericcoordenade('C');
            this.coordY = 7;
            mostrarmenu(C8.getX(), C8.getY(), this.jPanel1);
        }

    }//GEN-LAST:event_C8MouseClicked

    private void D1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MouseClicked
        if (evt.isMetaDown()) {
            actual = this.D1;
            this.coordX = this.getnumericcoordenade('D');
            this.coordY = 0;
            mostrarmenu(D1.getX(), D1.getY(), this.jPanel1);
        }

    }//GEN-LAST:event_D1MouseClicked

    private void D2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D2MouseClicked
        if (evt.isMetaDown()) {
            actual = this.D2;
            this.coordX = this.getnumericcoordenade('D');
            this.coordY = 1;
            mostrarmenu(D2.getX(), D2.getY(), this.jPanel1);
        }

    }//GEN-LAST:event_D2MouseClicked

    private void D3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D3MouseClicked
        if (evt.isMetaDown()) {
            actual = this.D3;
            this.coordX = this.getnumericcoordenade('D');
            this.coordY = 2;
            mostrarmenu(D3.getX(), D3.getY(), this.jPanel1);
        }

    }//GEN-LAST:event_D3MouseClicked

    private void D4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D4MouseClicked
        if (evt.isMetaDown()) {
            actual = this.D4;
            this.coordX = this.getnumericcoordenade('D');
            this.coordY = 3;
            mostrarmenu(D4.getX(), D4.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('D');
            this.coordY = 3;
        }


    }//GEN-LAST:event_D4MouseClicked

    private void D5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D5MouseClicked
        if (evt.isMetaDown()) {
            actual = this.D5;
            this.coordX = this.getnumericcoordenade('D');
            this.coordY = 4;
            mostrarmenu(D5.getX(), D5.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('D');
            this.coordY = 4;
        }

    }//GEN-LAST:event_D5MouseClicked

    private void D6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D6MouseClicked
        if (evt.isMetaDown()) {
            actual = this.D6;
            this.coordX = this.getnumericcoordenade('D');
            this.coordY = 5;
            mostrarmenu(D6.getX(), D6.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('D');
            this.coordY = 5;
        }

    }//GEN-LAST:event_D6MouseClicked

    private void D7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D7MouseClicked
        if (evt.isMetaDown()) {
            actual = this.D7;
            this.coordX = this.getnumericcoordenade('D');
            this.coordY = 6;
            mostrarmenu(D7.getX(), D7.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('D');
            this.coordY = 6;
        }

    }//GEN-LAST:event_D7MouseClicked

    private void D8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D8MouseClicked
        if (evt.isMetaDown()) {
            actual = this.D8;
            this.coordX = this.getnumericcoordenade('D');
            this.coordY = 7;
            mostrarmenu(D8.getX(), D8.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('D');
            this.coordY = 7;
        }

    }//GEN-LAST:event_D8MouseClicked

    private void E1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E1MouseClicked
        if (evt.isMetaDown()) {
            actual = this.E1;
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 0;
            mostrarmenu(E1.getX(), E1.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 0;
        }

    }//GEN-LAST:event_E1MouseClicked

    private void E2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E2MouseClicked
        if (evt.isMetaDown()) {
            actual = this.E2;
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 1;
            mostrarmenu(E2.getX(), E2.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 1;
        }

    }//GEN-LAST:event_E2MouseClicked

    private void E3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E3MouseClicked
        if (evt.isMetaDown()) {
            actual = this.E3;
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 2;
            mostrarmenu(E3.getX(), E3.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 2;
        }

    }//GEN-LAST:event_E3MouseClicked

    private void E4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E4MouseClicked
        if (evt.isMetaDown()) {
            actual = this.E4;
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 3;
            mostrarmenu(E4.getX(), E4.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 3;
        }

    }//GEN-LAST:event_E4MouseClicked

    private void E5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E5MouseClicked
        if (evt.isMetaDown()) {
            actual = this.E5;
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 4;
            mostrarmenu(E5.getX(), E5.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 4;
        }

    }//GEN-LAST:event_E5MouseClicked

    private void E6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E6MouseClicked
        if (evt.isMetaDown()) {
            actual = this.E6;
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 5;
            mostrarmenu(E6.getX(), E6.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 5;
        }

    }//GEN-LAST:event_E6MouseClicked

    private void E7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E7MouseClicked
        if (evt.isMetaDown()) {
            actual = this.E7;
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 6;
            mostrarmenu(E7.getX(), E7.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 6;
        }

    }//GEN-LAST:event_E7MouseClicked

    private void E8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E8MouseClicked
        if (evt.isMetaDown()) {
            actual = this.E8;
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 7;
            mostrarmenu(E8.getX(), E8.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('E');
            this.coordY = 7;
        }

    }//GEN-LAST:event_E8MouseClicked

    private void F1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F1MouseClicked
        if (evt.isMetaDown()) {
            actual = this.F1;
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 0;
            mostrarmenu(F1.getX(), F1.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 0;
        }

    }//GEN-LAST:event_F1MouseClicked

    private void F2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F2MouseClicked
        if (evt.isMetaDown()) {
            actual = this.F2;
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 1;
            mostrarmenu(F2.getX(), F2.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 1;
        }

    }//GEN-LAST:event_F2MouseClicked

    private void F3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F3MouseClicked
        if (evt.isMetaDown()) {
            actual = this.F3;
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 2;
            mostrarmenu(F3.getX(), F3.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 2;
        }

    }//GEN-LAST:event_F3MouseClicked

    private void F4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F4MouseClicked
        if (evt.isMetaDown()) {
            actual = this.F4;
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 3;
            mostrarmenu(F4.getX(), F4.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 3;
        }

    }//GEN-LAST:event_F4MouseClicked

    private void F5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F5MouseClicked
        if (evt.isMetaDown()) {
            actual = this.F5;
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 4;
            mostrarmenu(F5.getX(), F5.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 4;
        }

    }//GEN-LAST:event_F5MouseClicked

    private void F6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F6MouseClicked
        if (evt.isMetaDown()) {
            actual = this.F6;
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 5;
            mostrarmenu(F6.getX(), F6.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 5;
        }

    }//GEN-LAST:event_F6MouseClicked

    private void F7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F7MouseClicked
        if (evt.isMetaDown()) {
            actual = this.F7;
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 6;
            mostrarmenu(F7.getX(), F7.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 6;
        }

    }//GEN-LAST:event_F7MouseClicked

    private void F8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F8MouseClicked
        if (evt.isMetaDown()) {
            actual = this.F8;
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 7;
            mostrarmenu(F8.getX(), F8.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('F');
            this.coordY = 7;
        }

    }//GEN-LAST:event_F8MouseClicked

    private void G1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G1MouseClicked
        if (evt.isMetaDown()) {
            actual = this.G1;
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 0;
            mostrarmenu(G1.getX(), G1.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 0;
        }
    }//GEN-LAST:event_G1MouseClicked

    private void G2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G2MouseClicked
        if (evt.isMetaDown()) {
            actual = this.G2;
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 1;
            mostrarmenu(G2.getX(), G2.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 1;
        }
    }//GEN-LAST:event_G2MouseClicked

    private void G3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G3MouseClicked
        if (evt.isMetaDown()) {
            actual = this.G3;
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 2;
            mostrarmenu(G3.getX(), G3.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 2;
        }
    }//GEN-LAST:event_G3MouseClicked

    private void G4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G4MouseClicked
        if (evt.isMetaDown()) {
            actual = this.G4;
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 3;
            mostrarmenu(G4.getX(), G4.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 3;
        }
    }//GEN-LAST:event_G4MouseClicked

    private void G5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G5MouseClicked
        if (evt.isMetaDown()) {
            actual = this.G5;
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 4;
            mostrarmenu(G5.getX(), G5.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 4;
        }
    }//GEN-LAST:event_G5MouseClicked

    private void G6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G6MouseClicked
        if (evt.isMetaDown()) {
            actual = this.G6;
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 5;
            mostrarmenu(G6.getX(), G6.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 5;
        }
    }//GEN-LAST:event_G6MouseClicked

    private void G7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G7MouseClicked
        if (evt.isMetaDown()) {
            actual = this.G7;
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 6;
            mostrarmenu(G7.getX(), G7.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 6;
        }
    }//GEN-LAST:event_G7MouseClicked

    private void G8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G8MouseClicked
        if (evt.isMetaDown()) {
            actual = this.G8;
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 7;
            mostrarmenu(G8.getX(), G8.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('G');
            this.coordY = 7;
        }
    }//GEN-LAST:event_G8MouseClicked

    private void H1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H1MouseClicked
        if (evt.isMetaDown()) {
            actual = this.H1;
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 0;
            mostrarmenu(H1.getX(), H1.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 0;
        }
    }//GEN-LAST:event_H1MouseClicked

    private void H2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H2MouseClicked
        if (evt.isMetaDown()) {
            actual = this.H2;
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 1;
            mostrarmenu(H2.getX(), H2.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 1;
        }
    }//GEN-LAST:event_H2MouseClicked

    private void H3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H3MouseClicked
        if (evt.isMetaDown()) {
            actual = this.H3;
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 2;
            mostrarmenu(H3.getX(), H3.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 2;
        }
    }//GEN-LAST:event_H3MouseClicked

    private void H4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H4MouseClicked
        if (evt.isMetaDown()) {
            actual = this.H4;
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 3;
            mostrarmenu(H4.getX(), H4.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 3;
        }
    }//GEN-LAST:event_H4MouseClicked

    private void H5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H5MouseClicked
        if (evt.isMetaDown()) {
            actual = this.H5;
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 4;
            mostrarmenu(H5.getX(), H5.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 4;
        }
    }//GEN-LAST:event_H5MouseClicked

    private void H6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H6MouseClicked
        if (evt.isMetaDown()) {
            actual = this.H6;
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 5;
            mostrarmenu(H6.getX(), H6.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 5;
            System.out.println("");
        }
    }//GEN-LAST:event_H6MouseClicked

    private void H7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H7MouseClicked
        if (evt.isMetaDown()) {
            actual = this.H7;
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 6;
            mostrarmenu(H7.getX(), H7.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 6;
        }
    }//GEN-LAST:event_H7MouseClicked

    private void H8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H8MouseClicked
        if (evt.isMetaDown()) {
            actual = this.H8;
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 7;
            mostrarmenu(H8.getX(), H8.getY(), this.jPanel1);
        } else {
            this.coordX = this.getnumericcoordenade('H');
            this.coordY = 7;
        }
    }//GEN-LAST:event_H8MouseClicked

    private void ColocarPeonBlancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColocarPeonBlancoMouseClicked

    }//GEN-LAST:event_ColocarPeonBlancoMouseClicked

    private void ColocarPeonBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColocarPeonBlancoActionPerformed
        if (this.contadorpeonblanco == 8) {
            JOptionPane.showMessageDialog(null, "Solo puede colocar ocho Peones Blancos");
        } else {
            try {
                Image img = ImageIO.read(getClass().getResource("peon Blanco.png"));
                actual.setIcon(new ImageIcon(img));
                matriz[coordX][coordY] = "PB";
                Peon peonBlanco = new Peon(coordX, coordY, "PB");
                this.Piezas.insert(peonBlanco, this.contalista);
                contalista++;
                this.contadorpeonblanco++;
            } catch (IOException ex) {
            }
        }

    }//GEN-LAST:event_ColocarPeonBlancoActionPerformed

    private void ColocarReyBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColocarReyBlancoActionPerformed
        if (this.contadorreyblanco == 1) {
            JOptionPane.showMessageDialog(null, "Solo puede colocar un Rey Blanco");
        } else {
            try {
                Image img = ImageIO.read(getClass().getResource("rey Blanco.png"));
                actual.setIcon(new ImageIcon(img));
                matriz[coordX][coordY] = "RB";
                Rey reyBlanco = new Rey(coordX, coordY, "RB");
                this.Piezas.insert(reyBlanco, this.contalista);
                contalista++;
                this.contadorreyblanco++;
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_ColocarReyBlancoActionPerformed

    private void ColocarCaballoBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColocarCaballoBlancoActionPerformed
        if (this.contadorcaballoblanco >= 2) {
            JOptionPane.showMessageDialog(null, "No puede colocar mas de dos caballos Blancos");
        } else {
            try {
                Image img = ImageIO.read(getClass().getResource("caballo blanco.png"));
                actual.setIcon(new ImageIcon(img));
                matriz[coordX][coordY] = "CB";
                Caballo caballoBlanco = new Caballo(coordX, coordY, "CB");
                this.Piezas.insert(caballoBlanco, this.contalista);
                contalista++;
                this.contadorcaballoblanco++;
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_ColocarCaballoBlancoActionPerformed

    private void ColocarPeonNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColocarPeonNegroActionPerformed
        if (this.contadorpeonnegro == 8) {
            JOptionPane.showMessageDialog(null, "Solo puede colocar ocho Peones Negros");
        } else {
            try {
                Image img = ImageIO.read(getClass().getResource("peon Negro.png"));
                actual.setIcon(new ImageIcon(img));
                matriz[coordX][coordY] = "PN";
                Peon peonNegro = new Peon(coordX, coordY, "PN");
                this.Piezas.insert(peonNegro, this.contalista);
                contalista++;
                this.contadorpeonnegro++;
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_ColocarPeonNegroActionPerformed

    private void ColocarReyNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColocarReyNegroActionPerformed
        if (this.contadorreynegro == 1) {
            JOptionPane.showMessageDialog(null, "Solo puede colocar un Rey Negro");
        } else {
            try {
                Image img = ImageIO.read(getClass().getResource("rey negro.png"));
                actual.setIcon(new ImageIcon(img));
                matriz[coordX][coordY] = "RN";

                Rey reyNegro = new Rey(coordX, coordY, "RN");

                this.Piezas.insert(reyNegro, this.contalista);
                contalista++;
                this.contadorreynegro++;
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_ColocarReyNegroActionPerformed

    private void ColocarCaballoNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColocarCaballoNegroActionPerformed
        if (this.contadorcaballonegro >= 2) {
            JOptionPane.showMessageDialog(null, "No puede colocar mas de dos caballos Negros");
        } else {
            try {
                Image img = ImageIO.read(getClass().getResource("caballonegro.png"));
                actual.setIcon(new ImageIcon(img));
                matriz[coordX][coordY] = "CN";
                Caballo caballoNegro = new Caballo(coordX, coordY, "CN");
                this.Piezas.insert(caballoNegro, this.contalista);
                contalista++;
                this.contadorcaballonegro++;
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_ColocarCaballoNegroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Piezas.Print_Lista();
    }//GEN-LAST:event_jButton3MouseClicked

    private void comboOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboOpcionesActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        if (this.coordX != -1) {

        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int op = comboOpciones.getSelectedIndex();
        if (op == 1) {
            TreeNode root = new TreeNode(matriz);
            Pieza tomove = check(actual, coordX, coordY);
            if (!(tomove instanceof Peon)) {
                JOptionPane.showMessageDialog(this, "No es un peon");
            }
        } else if (op == 2) {

        } else {

        }
    }//GEN-LAST:event_jButton4ActionPerformed
    private void mostrarmenu(int x, int y, javax.swing.JPanel coming) {
        this.PopMenuLugar.show(coming, x, y);

    }

    private int getnumericcoordenade(char leter) {
        int value = -1;
        if (leter == 'A' || leter == 'a') {
            value = 0;
        } else if (leter == 'B' || leter == 'b') {
            value = 1;
        } else if (leter == 'C' || leter == 'c') {
            value = 2;
        } else if (leter == 'D' || leter == 'd') {
            value = 3;
        } else if (leter == 'E' || leter == 'e') {
            value = 4;
        } else if (leter == 'F' || leter == 'f') {
            value = 5;
        } else if (leter == 'G' || leter == 'g') {
            value = 6;
        } else if (leter == 'H' || leter == 'h') {
            value = 7;
        }
        return value;
    }

    private void limpiarmatriz(String matriz[][]) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = "  ";
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Dark Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JMenuItem ColocarCaballoBlanco;
    private javax.swing.JMenuItem ColocarCaballoNegro;
    private javax.swing.JMenuItem ColocarPeonBlanco;
    private javax.swing.JMenuItem ColocarPeonNegro;
    private javax.swing.JMenuItem ColocarReyBlanco;
    private javax.swing.JMenuItem ColocarReyNegro;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton D6;
    private javax.swing.JButton D7;
    private javax.swing.JButton D8;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JButton E5;
    private javax.swing.JButton E6;
    private javax.swing.JButton E7;
    private javax.swing.JButton E8;
    private javax.swing.JButton F1;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton F5;
    private javax.swing.JButton F6;
    private javax.swing.JButton F7;
    private javax.swing.JButton F8;
    private javax.swing.JButton G1;
    private javax.swing.JButton G2;
    private javax.swing.JButton G3;
    private javax.swing.JButton G4;
    private javax.swing.JButton G5;
    private javax.swing.JButton G6;
    private javax.swing.JButton G7;
    private javax.swing.JButton G8;
    private javax.swing.JButton H1;
    private javax.swing.JButton H2;
    private javax.swing.JButton H3;
    private javax.swing.JButton H4;
    private javax.swing.JButton H5;
    private javax.swing.JButton H6;
    private javax.swing.JButton H7;
    private javax.swing.JButton H8;
    private javax.swing.JPopupMenu PopMenuLugar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboOpciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
    public Pieza check(javax.swing.JButton button, int cordX, int cordY) {
        Pieza pieza = new Pieza();
        if (button.getIcon() == null) {
            JOptionPane.showMessageDialog(this, "No hay pieza");
        } else {
            for (int i = 0; i < contalista; i++) {
                if (((Pieza) Piezas.get(i)).getPos_hor() == cordX && ((Pieza) Piezas.get(i)).getPos_vert() == cordY) {
                    pieza = ((Pieza) Piezas.get(i));
                }
            }
        }
        if (pieza instanceof Peon) {
            Peon peon = new Peon(pieza);
            return peon;
        }else if (pieza instanceof Caballo) {
            Caballo caballo = new Caballo(pieza);
            return caballo;
        }else if (pieza instanceof Rey) {
            Rey rey = new Rey(pieza);
            return rey;
        }
        return pieza;
    }

    public boolean legal(Pieza pieza, int newRow, int newColumn, String[][] playerMatrix, int currentPlayer) {
        boolean legal = true;
        if (pieza instanceof Peon) {
            if ((currentPlayer == 1 && newRow >= ((Peon) pieza).getPos_hor() || (currentPlayer == 2 && newRow <= ((Peon) pieza).getPos_hor()))) { //Si se mueven en direccion incorrcta            
                legal = false;
            } else if (newColumn != ((Peon) pieza).getPos_vert()) {
                if ((newColumn > ((Peon) pieza).getPos_vert() && newColumn == (((Peon) pieza).getPos_vert() + 1)) || (newColumn < ((Peon) pieza).getPos_vert() && newColumn == (((Peon) pieza).getPos_vert() - 1))) {
                    if ((newRow == (((Peon) pieza).getPos_hor() + 1) && currentPlayer == 2) || (newRow == (((Peon) pieza).getPos_hor() - 1) && currentPlayer == 1)) {
                        if (playerMatrix[newRow][newColumn] == "") {
                            legal = false;
                        }
                    } else {
                        legal = false;
                    }
                } else {
                    legal = false;
                }
            } else if ((currentPlayer == 1 && newRow < (((Peon) pieza).getPos_hor() - 1)) || (currentPlayer == 2 && newRow > (((Peon) pieza).getPos_hor() + 1))) { //If moved two or more places

                if ((currentPlayer == 1 && newRow == (((Peon) pieza).getPos_hor() - 2)) || (currentPlayer == 2 && newRow == (((Peon) pieza).getPos_hor() + 2))) { //If moved two places

                } else {

                    legal = false;

                }

            }
        }

        return legal;
    }

    public boolean moverPeon(Pieza pieza, String[][] matriz, TreeNode node, int jugador) {
        String[][] moved = matriz;
        boolean legal = true;
        if (jugador == 1 && ((Peon) pieza).getPos_hor() == 0 || jugador == 2 && ((Peon) pieza).getPos_hor() == 7) {
            ((Peon) pieza).setEstado("Coronado");
        }
        if (jugador == 1 && moved[((Peon) pieza).getPos_hor() + 1][((Peon) pieza).getPos_vert() + 1].contains("N")) {
            moved[((Peon) pieza).getPos_hor()][((Peon) pieza).getPos_vert()] = "";
            ((Peon) pieza).movement(3, 1);
            moved[((Peon) pieza).getPos_hor()][((Peon) pieza).getPos_vert()] = ((Peon) pieza).getNombre();
            node.addChild(moved);
        } else if ((jugador == 1 && moved[((Peon) pieza).getPos_hor() - 1][((Peon) pieza).getPos_vert() + 1].contains("N"))) {
            moved[((Peon) pieza).getPos_hor()][((Peon) pieza).getPos_vert()] = "";
            ((Peon) pieza).movement(4, 1);
            moved[((Peon) pieza).getPos_hor()][((Peon) pieza).getPos_vert()] = ((Peon) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 2 && moved[((Peon) pieza).getPos_hor() + 1][((Peon) pieza).getPos_vert() - 1].contains("B")) {
            moved[((Peon) pieza).getPos_hor()][((Peon) pieza).getPos_vert()] = "";
            ((Peon) pieza).movement(3, 2);
            moved[((Peon) pieza).getPos_hor()][((Peon) pieza).getPos_vert()] = ((Peon) pieza).getNombre();
            node.addChild(moved);
        } else if ((jugador == 2 && moved[((Peon) pieza).getPos_hor() - 1][((Peon) pieza).getPos_vert() - 1].contains("B"))) {
            moved[((Peon) pieza).getPos_hor()][((Peon) pieza).getPos_vert()] = "";
            ((Peon) pieza).movement(4, 2);
            moved[((Peon) pieza).getPos_hor()][((Peon) pieza).getPos_vert()] = ((Peon) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 1 && moved[((Peon) pieza).getPos_hor() + 1][((Peon) pieza).getPos_vert() + 1].contains("B")) {
            legal = false;
        } else if ((jugador == 1 && moved[((Peon) pieza).getPos_hor() - 1][((Peon) pieza).getPos_vert() + 1].contains("B"))) {
            legal = false;
        } else if (jugador == 2 && moved[((Peon) pieza).getPos_hor() + 1][((Peon) pieza).getPos_vert() - 1].contains("N")) {
            legal = false;
        } else if ((jugador == 2 && moved[((Peon) pieza).getPos_hor() - 1][((Peon) pieza).getPos_vert() - 1].contains("N"))) {
            legal = false;
        } else if (jugador == 1 && moved[((Peon) pieza).getPos_hor()][((Peon) pieza).getPos_vert() + 1].equals("")) {
            moved[((Peon) pieza).getPos_hor()][((Peon) pieza).getPos_vert()] = "";
            ((Peon) pieza).movement(2, 1);
            moved[((Peon) pieza).getPos_hor()][((Peon) pieza).getPos_vert()] = ((Peon) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 2 && moved[((Peon) pieza).getPos_hor()][((Peon) pieza).getPos_vert() + 1].equals("")) {
            moved[((Peon) pieza).getPos_hor()][((Peon) pieza).getPos_vert()] = "";
            ((Peon) pieza).movement(2, 2);
            moved[((Peon) pieza).getPos_hor()][((Peon) pieza).getPos_vert()] = ((Peon) pieza).getNombre();
            node.addChild(moved);
        }
        return legal;
    }

    public void moverRey(Pieza pieza, String[][] matriz, TreeNode node, int jugador) {

    }

    public boolean moverCaballo(Pieza pieza, String[][] matriz, TreeNode node, int jugador) {
        String[][] moved = matriz;
        boolean legal = true;
        if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() + 1][((Caballo) pieza).getPos_vert() + 2].contains("N")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(1, 1);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() - 1][((Caballo) pieza).getPos_vert() + 2].contains("N")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(2, 1);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() + 1][((Caballo) pieza).getPos_vert() - 2].contains("N")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(3, 1);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() - 1][((Caballo) pieza).getPos_vert() - 2].contains("N")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(4, 1);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() + 2][((Caballo) pieza).getPos_vert() + 1].contains("N")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(5, 1);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() - 2][((Caballo) pieza).getPos_vert() + 1].contains("N")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(6, 1);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() + 2][((Caballo) pieza).getPos_vert() - 1].contains("N")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(7, 1);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() - 2][((Caballo) pieza).getPos_vert() - 1].contains("N")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(8, 1);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 2 && moved[((Caballo) pieza).getPos_hor() + 1][((Caballo) pieza).getPos_vert() + 2].contains("B")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(1, 2);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 2 && moved[((Caballo) pieza).getPos_hor() - 1][((Caballo) pieza).getPos_vert() + 2].contains("B")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(2, 2);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 2 && moved[((Caballo) pieza).getPos_hor() + 1][((Caballo) pieza).getPos_vert() - 2].contains("B")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(3, 2);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 2 && moved[((Caballo) pieza).getPos_hor() - 1][((Caballo) pieza).getPos_vert() - 2].contains("B")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(4, 2);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 2 && moved[((Caballo) pieza).getPos_hor() + 2][((Caballo) pieza).getPos_vert() + 1].contains("B")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(5, 2);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 2 && moved[((Caballo) pieza).getPos_hor() - 2][((Caballo) pieza).getPos_vert() + 1].contains("B")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(6, 2);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 2 && moved[((Caballo) pieza).getPos_hor() + 2][((Caballo) pieza).getPos_vert() - 1].contains("B")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(7, 2);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 2 && moved[((Caballo) pieza).getPos_hor() - 2][((Caballo) pieza).getPos_vert() - 1].contains("B")) {
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = "";
            ((Caballo) pieza).movement(8, 2);
            moved[((Caballo) pieza).getPos_hor()][((Caballo) pieza).getPos_vert()] = ((Caballo) pieza).getNombre();
            node.addChild(moved);
        } else if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() + 1][((Caballo) pieza).getPos_vert() + 2].contains("B")) {
            legal = false;
        } else if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() - 1][((Caballo) pieza).getPos_vert() + 2].contains("B")) {
            legal = false;
        } else if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() + 1][((Caballo) pieza).getPos_vert() - 2].contains("B")) {
            legal = false;
        } else if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() - 1][((Caballo) pieza).getPos_vert() - 2].contains("B")) {
            legal = false;
        } else if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() + 2][((Caballo) pieza).getPos_vert() + 1].contains("B")) {
            legal = false;
        } else if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() - 2][((Caballo) pieza).getPos_vert() + 1].contains("B")) {
            legal = false;
        } else if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() + 2][((Caballo) pieza).getPos_vert() - 1].contains("B")) {
            legal = false;
        } else if (jugador == 1 && moved[((Caballo) pieza).getPos_hor() - 2][((Caballo) pieza).getPos_vert() - 1].contains("B")) {
            legal = false;
        } else if (jugador == 2 && moved[((Caballo) pieza).getPos_hor() - 1][((Caballo) pieza).getPos_vert() + 2].contains("N")) {
            legal = false;
        } else if (jugador == 2 && moved[((Caballo) pieza).getPos_hor() + 1][((Caballo) pieza).getPos_vert() - 2].contains("N")) {
            legal = false;
        } else if (jugador == 2 && moved[((Caballo) pieza).getPos_hor() - 1][((Caballo) pieza).getPos_vert() - 2].contains("N")) {
            legal = false;
        } else if (jugador == 2 && moved[((Caballo) pieza).getPos_hor() + 2][((Caballo) pieza).getPos_vert() + 1].contains("N")) {
            legal = false;
        } else if (jugador == 2 && moved[((Caballo) pieza).getPos_hor() - 2][((Caballo) pieza).getPos_vert() + 1].contains("N")) {
            legal = false;
        } else if (jugador == 2 && moved[((Caballo) pieza).getPos_hor() + 2][((Caballo) pieza).getPos_vert() - 1].contains("N")) {
            legal = false;
        } else if (jugador == 2 && moved[((Caballo) pieza).getPos_hor() - 2][((Caballo) pieza).getPos_vert() - 1].contains("N")) {
            legal = false;
        }
        return legal;
    }

    private javax.swing.JButton actual = new javax.swing.JButton();
    String matriz[][] = new String[8][8];
    Lista Piezas = new Lista();
    int contadorcaballonegro = 0, contadorcaballoblanco = 0, contadorreyblanco = 0, contadorreynegro = 0,
            contadorpeonnegro = 0, contadorpeonblanco = 0, coordX = -1, coordY = -1, contalista = 0;
}
