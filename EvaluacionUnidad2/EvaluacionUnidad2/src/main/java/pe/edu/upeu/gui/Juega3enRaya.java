
package pe.edu.upeu.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import pe.edu.upeu.dao.ResultadoDAO;
import pe.edu.upeu.dao.ResultadoDaoI;
import pe.edu.upeu.modelo.ResultadoTO;
import pe.edu.upeu.util.MsgBox;
import pe.edu.upeu.util.UtilsX;



public class Juega3enRaya extends javax.swing.JFrame {
    

    private JLabel[][] casillas;
    //private ModelGame model;
    ResultadoDaoI rDao;
    public static ResultadoTO uTO = new ResultadoTO();
    DefaultTableModel modelo;
    MsgBox msg;
    TableRowSorter<TableModel> trsfiltro;
    BufferedImage image;
    UtilsX obj = new UtilsX();

    public Juega3enRaya() {
        
                
        initComponents();
        this.setLocationRelativeTo(null);
        txtIdResultado.setVisible(false);
        txtNombrePartida.setVisible(false);
        //Titulo
        this.setTitle("Evaluacion Unidad 2");
        //Icono
        try {
            image = ImageIO.read(obj.getFile("icon.png"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        this.setIconImage(image);

        casillas = new JLabel[3][3];
        asignarCasillas();
        ListarResultado();
    }

    public void ListarResultado() {
        rDao = new ResultadoDAO();
        List<ResultadoTO> listarResultado = rDao.listarResultado();
        jTable1.setAutoCreateRowSorter(true);
        modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        Object[] ob = new Object[7];
        for (int i = 0; i < listarResultado.size(); i++) {
            ob[0] = listarResultado.get(i).getNombrePartida();
            ob[1] = listarResultado.get(i).getIdResultado();
            ob[2] = listarResultado.get(i).getNombreJugador1();
            ob[3] = listarResultado.get(i).getNombreJugador2();
            ob[4] = listarResultado.get(i).getGanador();
            ob[5] = listarResultado.get(i).getPunto();
            ob[6] = listarResultado.get(i).getEstado();
            modelo.addRow(ob);
        }
        jTable1.setModel(modelo);
    }

    private void paintForm() {
        if (jTable1.getSelectedRow() != -1) {
            modelo = (DefaultTableModel) jTable1.getModel();
            int rowx = jTable1.getSelectedRow();
            Object valor = jTable1.getValueAt(rowx, 1);
            rDao = new ResultadoDAO();
            ResultadoTO d = rDao.buscarResultado(Integer.parseInt(valor.toString()));
            txtIdResultado.setText(String.valueOf(d.getIdResultado()));
            txtJugador1.setText(d.getNombreJugador1());
            txtJugador2.setText(d.getNombreJugador2());
        } else {
            txtNombrePartida.setVisible(false);
        }
    }

    public void resetForm() {
        txtIdResultado.setText("");
        txtJugador1.setText("");
        txtJugador2.setText("");
        txtJugador1.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Casilla1 = new javax.swing.JLabel();
        Casilla3 = new javax.swing.JLabel();
        Casilla4 = new javax.swing.JLabel();
        Casilla7 = new javax.swing.JLabel();
        Casilla2 = new javax.swing.JLabel();
        Casilla9 = new javax.swing.JLabel();
        Casilla6 = new javax.swing.JLabel();
        Casilla8 = new javax.swing.JLabel();
        Casilla5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        victoriasJ1 = new javax.swing.JLabel();
        victoriasJ2 = new javax.swing.JLabel();
        txtIdResultado = new javax.swing.JLabel();
        txtNombrePartida = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtJugador1 = new javax.swing.JTextField();
        txtJugador2 = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        jLabel1.setText("EVALUACION UNIDAD  2");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 456, 39));

        jLabel2.setFont(new java.awt.Font("YD2002", 3, 14)); // NOI18N
        jLabel2.setText("NOMBRE: CCANA YUCRA JOSUE DANIEL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen 6.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 850, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("JUGADOR 1 :");
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 418, -1, 27));

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("JUGADOR 2 :");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 471, -1, 28));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Casilla1.setBackground(new java.awt.Color(102, 0, 102));
        Casilla1.setFont(new java.awt.Font("Arial Black", 2, 48)); // NOI18N
        Casilla1.setForeground(new java.awt.Color(255, 255, 51));
        Casilla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Casilla1.setOpaque(true);
        jPanel5.add(Casilla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 90, 90));

        Casilla3.setBackground(new java.awt.Color(102, 0, 102));
        Casilla3.setFont(new java.awt.Font("Arial Black", 2, 48)); // NOI18N
        Casilla3.setForeground(new java.awt.Color(255, 255, 51));
        Casilla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Casilla3.setOpaque(true);
        jPanel5.add(Casilla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 6, 90, 90));

        Casilla4.setBackground(new java.awt.Color(102, 0, 102));
        Casilla4.setFont(new java.awt.Font("Arial Black", 2, 48)); // NOI18N
        Casilla4.setForeground(new java.awt.Color(255, 255, 51));
        Casilla4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Casilla4.setOpaque(true);
        jPanel5.add(Casilla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 102, 90, 90));

        Casilla7.setBackground(new java.awt.Color(102, 0, 102));
        Casilla7.setFont(new java.awt.Font("Arial Black", 2, 48)); // NOI18N
        Casilla7.setForeground(new java.awt.Color(255, 255, 51));
        Casilla7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Casilla7.setOpaque(true);
        jPanel5.add(Casilla7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 198, 90, 90));

        Casilla2.setBackground(new java.awt.Color(102, 0, 102));
        Casilla2.setFont(new java.awt.Font("Arial Black", 2, 48)); // NOI18N
        Casilla2.setForeground(new java.awt.Color(255, 255, 51));
        Casilla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Casilla2.setOpaque(true);
        jPanel5.add(Casilla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 6, 90, 90));

        Casilla9.setBackground(new java.awt.Color(102, 0, 102));
        Casilla9.setFont(new java.awt.Font("Arial Black", 2, 48)); // NOI18N
        Casilla9.setForeground(new java.awt.Color(255, 255, 51));
        Casilla9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Casilla9.setOpaque(true);
        jPanel5.add(Casilla9, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 198, 90, 90));

        Casilla6.setBackground(new java.awt.Color(102, 0, 102));
        Casilla6.setFont(new java.awt.Font("Arial Black", 2, 48)); // NOI18N
        Casilla6.setForeground(new java.awt.Color(255, 255, 51));
        Casilla6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Casilla6.setOpaque(true);
        jPanel5.add(Casilla6, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 102, 90, 90));

        Casilla8.setBackground(new java.awt.Color(102, 0, 102));
        Casilla8.setFont(new java.awt.Font("Arial Black", 2, 48)); // NOI18N
        Casilla8.setForeground(new java.awt.Color(255, 255, 51));
        Casilla8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Casilla8.setOpaque(true);
        jPanel5.add(Casilla8, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 198, 90, 90));

        Casilla5.setBackground(new java.awt.Color(102, 0, 102));
        Casilla5.setFont(new java.awt.Font("Arial Black", 2, 48)); // NOI18N
        Casilla5.setForeground(new java.awt.Color(255, 255, 51));
        Casilla5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Casilla5.setOpaque(true);
        jPanel5.add(Casilla5, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 102, 90, 90));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 300));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 62, -1, -1));

        victoriasJ1.setBackground(new java.awt.Color(255, 0, 0));
        victoriasJ1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        victoriasJ1.setForeground(new java.awt.Color(204, 255, 255));
        victoriasJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victoriasJ1.setText("0");
        victoriasJ1.setOpaque(true);
        jPanel2.add(victoriasJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 70, 27));

        victoriasJ2.setBackground(new java.awt.Color(255, 0, 0));
        victoriasJ2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        victoriasJ2.setForeground(new java.awt.Color(204, 255, 255));
        victoriasJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victoriasJ2.setText("0");
        victoriasJ2.setOpaque(true);
        jPanel2.add(victoriasJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 70, 28));
        jPanel2.add(txtIdResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 539, 101, 36));
        jPanel2.add(txtNombrePartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 581, 101, 36));

        jLabel5.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("TURNO :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 23, 120, -1));

        lblNombre.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 204));
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 127, 27));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 520));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 109, -1, 512));

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 0, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 255, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Partido ", "Id resultado", "Nombre Jugador 1", "Nombre Jugador 2", "Nombre Ganador", "Puntuacion", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(0);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(0);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 633, 354));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen1.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 370));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, 645, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("NOMBRE JUGADOR 1:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("NOMBRE JUGADOR 2:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 49, -1, -1));
        jPanel3.add(txtJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 247, -1));
        jPanel3.add(txtJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 247, -1));

        btnIniciar.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("INICIAR");
        btnIniciar.setBorder(new javax.swing.border.MatteBorder(null));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel3.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, 103, 54));

        btnAnular.setBackground(new java.awt.Color(0, 0, 0));
        btnAnular.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        btnAnular.setForeground(new java.awt.Color(255, 255, 255));
        btnAnular.setText("ANULAR");
        btnAnular.setBorder(new javax.swing.border.MatteBorder(null));
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });
        jPanel3.add(btnAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 80, 100, 54));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen1.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 510));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 109, 657, 510));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen3.jpeg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        uTO.setNombrePartida("Partida "+ uTO.getIdResultado());
        uTO.setNombreJugador1(txtJugador1.getText());
        uTO.setNombreJugador2(txtJugador2.getText());
        uTO.setGanador("");
        uTO.setPunto(0);
        uTO.setEstado("Jugando");

        rDao = new ResultadoDAO();

        int dx = rDao.create(uTO);
        uTO.setIdResultado(dx);
        lblNombre.setText(uTO.getNombreJugador1()+" (X)");
        ListarResultado();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        paintForm();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed

    }//GEN-LAST:event_btnAnularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Casilla1;
    private javax.swing.JLabel Casilla2;
    private javax.swing.JLabel Casilla3;
    private javax.swing.JLabel Casilla4;
    private javax.swing.JLabel Casilla5;
    private javax.swing.JLabel Casilla6;
    private javax.swing.JLabel Casilla7;
    private javax.swing.JLabel Casilla8;
    private javax.swing.JLabel Casilla9;
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JLabel txtIdResultado;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    private javax.swing.JLabel txtNombrePartida;
    private javax.swing.JLabel victoriasJ1;
    private javax.swing.JLabel victoriasJ2;
    // End of variables declaration//GEN-END:variables

    /*public class FondoPanel extends JPanel {
        private Image imagenX;
        @Override
        public void paint(Graphics g){
            imagenX = new ImageIcon(getClass().getResource("imagenF.jpg")).getImage();
            setOpaque(false);
            g.drawImage(imagenX, 0, 0, getWidth(), getHeight(), this);
            super.paint(g);
        }
    }*/
    private void asignarCasillas() {
        casillas[0][0] = Casilla1;
        casillas[0][1] = Casilla2;
        casillas[0][2] = Casilla3;
        casillas[1][0] = Casilla4;
        casillas[1][1] = Casilla5;
        casillas[1][2] = Casilla6;
        casillas[2][0] = Casilla7;
        casillas[2][1] = Casilla8;
        casillas[2][2] = Casilla9;
    }

    public JLabel[][] getCasillas() {
        return casillas;
    }

    public JLabel getVictoriasJ1() {
        return victoriasJ1;
    }

    public JLabel getVictoriasJ2() {
        return victoriasJ2;
    }

    public JButton getBotonReset() {
        return btnIniciar;
    }

    public JButton getBotonAnular() {
        return btnAnular;
    }
}
