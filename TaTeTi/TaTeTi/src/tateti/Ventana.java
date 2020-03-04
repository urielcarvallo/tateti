package tateti;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    private boolean jugador1 = true;
    private boolean jugador2 = false;
    int puntajeJugador1 = 0, puntajeJugador2 = 0;
    private String nombreJ1, nombreJ2;
    public Ventana() {
        initComponents();
        
        txtPuntajeJugador1.setText(String.valueOf(puntajeJugador1));
        txtPuntajeJugador2.setText(String.valueOf(puntajeJugador2));
        
        txtPuntajeJugador1.setEditable(false);
        txtPuntajeJugador2.setEditable(false);
        txtJugadorNombre.setEditable(false);
    }
    
    public void setNombreJ1(String nombre1){
        this.nombreJ1 = nombre1;
        txtJugadorNombre.setText(nombreJ1);
    }
    public void setNombreJ2(String nombre2){
        this.nombreJ2 = nombre2;
    }
    
    public void Validar(){
//        if (btnUno.getBackground()==Color.red || btnUno.getBackground()==Color.blue 
//        || btnDos.getBackground()==Color.red || btnDos.getBackground()==Color.blue
//        || btnTres.getBackground()==Color.red || btnTres.getBackground()==Color.blue
//        || btnCuatro.getBackground()==Color.red || btnCuatro.getBackground()==Color.blue
//        || btnCinco.getBackground()==Color.red || btnCinco.getBackground()==Color.blue
//        || btnSeis.getBackground()==Color.red || btnSeis.getBackground()==Color.blue
//        || btnSiete.getBackground()==Color.red || btnSiete.getBackground()==Color.blue
//        || btnOcho.getBackground()==Color.red || btnOcho.getBackground()==Color.blue
//        || btnNueve.getBackground()==Color.red || btnNueve.getBackground()==Color.blue)
        //{
            if (btnUno.getBackground() == Color.red && (btnUno.getBackground() == btnDos.getBackground() &&
                    btnUno.getBackground() == btnTres.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR UNO GANA!!");
                puntajeJugador1+=1;
                txtPuntajeJugador1.setText(String.valueOf(puntajeJugador1));
                Reiniciar(); //Rojo fila uno
            }
            if (btnUno.getBackground() == Color.blue && (btnUno.getBackground() == btnDos.getBackground() &&
                    btnUno.getBackground() == btnTres.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR DOS GANA!!");
                puntajeJugador2+=1;
                txtPuntajeJugador2.setText(String.valueOf(puntajeJugador2));
                Reiniciar(); // Azul fila uno
            }
            if (btnCuatro.getBackground() == Color.red && (btnCuatro.getBackground() == btnCinco.getBackground() &&
                    btnCuatro.getBackground() == btnSeis.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR UNO GANA!!");
                puntajeJugador1+=1;
                txtPuntajeJugador1.setText(String.valueOf(puntajeJugador1));
                Reiniciar(); //Rojo fila dos
            }
            if (btnCuatro.getBackground() == Color.blue && (btnCuatro.getBackground() == btnCinco.getBackground() &&
                    btnCuatro.getBackground() == btnSeis.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR DOS GANA!!");
                puntajeJugador2+=1;
                txtPuntajeJugador2.setText(String.valueOf(puntajeJugador2));
                Reiniciar(); //Azul fila dos
            }
            if (btnSiete.getBackground() == Color.red && (btnSiete.getBackground() == btnOcho.getBackground() &&
                    btnSiete.getBackground() == btnNueve.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR UNO GANA!!");
                puntajeJugador1+=1;
                txtPuntajeJugador1.setText(String.valueOf(puntajeJugador1));
                Reiniciar(); //Rojo fila tres
            }
            if (btnSiete.getBackground() == Color.blue && (btnSiete.getBackground() == btnOcho.getBackground() &&
                    btnSiete.getBackground() == btnNueve.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR DOS GANA!!");
                puntajeJugador2+=1;
                txtPuntajeJugador2.setText(String.valueOf(puntajeJugador2));
                Reiniciar(); //Azul fila tres
            }
            if (btnUno.getBackground() == Color.red && (btnUno.getBackground() == btnCuatro.getBackground() &&
                    btnUno.getBackground() == btnSiete.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR UNO GANA!!");
                puntajeJugador1+=1;
                txtPuntajeJugador1.setText(String.valueOf(puntajeJugador1));
                Reiniciar(); // Rojo Columna uno
            }
            if (btnUno.getBackground() == Color.blue && (btnUno.getBackground() == btnCuatro.getBackground() &&
                    btnUno.getBackground() == btnSiete.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR DOS GANA!!");
                puntajeJugador1+=2;
                txtPuntajeJugador2.setText(String.valueOf(puntajeJugador2));
                Reiniciar(); // Azul Columna uno
            }
            if (btnDos.getBackground() == Color.red && (btnDos.getBackground() == btnCinco.getBackground() &&
                    btnDos.getBackground() == btnOcho.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR UNO GANA!!");
                puntajeJugador1+=1;
                txtPuntajeJugador1.setText(String.valueOf(puntajeJugador1));
                Reiniciar(); // Rojo Columna dos
            }
            if (btnDos.getBackground() == Color.blue && (btnDos.getBackground() == btnCinco.getBackground() &&
                    btnDos.getBackground() == btnOcho.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR DOS GANA!!");
                puntajeJugador2+=1;
                txtPuntajeJugador2.setText(String.valueOf(puntajeJugador2));
                Reiniciar(); // Azul Columna dos
            }
            if (btnTres.getBackground() == Color.red && (btnTres.getBackground() == btnSeis.getBackground() &&
                    btnTres.getBackground() == btnNueve.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR UNO GANA!!");
                puntajeJugador1+=1;
                txtPuntajeJugador1.setText(String.valueOf(puntajeJugador1));
                Reiniciar(); // Rojo Columna tres
            } 
            if (btnTres.getBackground() == Color.blue && (btnTres.getBackground() == btnSeis.getBackground() &&
                    btnTres.getBackground() == btnNueve.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR DOS GANA!!");
                puntajeJugador2+=1;
                txtPuntajeJugador2.setText(String.valueOf(puntajeJugador2));
                Reiniciar(); // Azul Columna tres
            } 
            if (btnUno.getBackground() == Color.red && (btnUno.getBackground() == btnCinco.getBackground() &&
                    btnUno.getBackground() == btnNueve.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR UNO GANA!!");
                puntajeJugador1+=1;
                txtPuntajeJugador1.setText(String.valueOf(puntajeJugador1));
                Reiniciar(); // Rojo Diagonal baja 
            }
            if (btnUno.getBackground() == Color.blue && (btnUno.getBackground() == btnCinco.getBackground() &&
                    btnUno.getBackground() == btnNueve.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR DOS GANA!!");
                puntajeJugador2+=1;
                txtPuntajeJugador2.setText(String.valueOf(puntajeJugador2));
                Reiniciar(); // Azul Diagonal baja 
            }
            if (btnTres.getBackground() == Color.red && (btnTres.getBackground() == btnCinco.getBackground() &&
                    btnTres.getBackground() == btnSiete.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR UNO GANA!!");
                puntajeJugador1+=1;
                txtPuntajeJugador1.setText(String.valueOf(puntajeJugador1));
                Reiniciar(); // Rojo Diagonal sube 
            }
            if (btnTres.getBackground() == Color.blue && (btnTres.getBackground() == btnCinco.getBackground() &&
                    btnTres.getBackground() == btnSiete.getBackground() ) ){
                JOptionPane.showMessageDialog(null, "JUGADOR DOS GANA!!");
                puntajeJugador2+=1;
                txtPuntajeJugador2.setText(String.valueOf(puntajeJugador2));
                Reiniciar(); // Azul Diagonal sube 
            }
        //}
    }
    
    public void Reiniciar(){
        btnUno.setEnabled(true);
        btnDos.setEnabled(true);
        btnTres.setEnabled(true);
        btnCuatro.setEnabled(true);
        btnCinco.setEnabled(true);
        btnSeis.setEnabled(true);
        btnSiete.setEnabled(true);
        btnOcho.setEnabled(true);
        btnNueve.setEnabled(true);
        
        btnUno.setBackground(Color.gray);
        btnDos.setBackground(Color.gray);
        btnTres.setBackground(Color.gray);
        btnCuatro.setBackground(Color.gray);
        btnCinco.setBackground(Color.gray);
        btnSeis.setBackground(Color.gray);
        btnSiete.setBackground(Color.gray);
        btnOcho.setBackground(Color.gray);
        btnNueve.setBackground(Color.gray);
        jugador1 = true; jugador2=false;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPuntajeJugador1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPuntajeJugador2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtJugadorNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUno.setBackground(java.awt.Color.gray);
        btnUno.setForeground(new java.awt.Color(0, 255, 204));
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnDos.setBackground(java.awt.Color.gray);
        btnDos.setForeground(new java.awt.Color(0, 255, 204));
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnTres.setBackground(java.awt.Color.gray);
        btnTres.setForeground(new java.awt.Color(0, 255, 204));
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnCuatro.setBackground(java.awt.Color.gray);
        btnCuatro.setForeground(new java.awt.Color(0, 255, 204));
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnCinco.setBackground(java.awt.Color.gray);
        btnCinco.setForeground(new java.awt.Color(0, 255, 204));
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setBackground(java.awt.Color.gray);
        btnSeis.setForeground(new java.awt.Color(0, 255, 204));
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnSiete.setBackground(java.awt.Color.gray);
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnOcho.setBackground(java.awt.Color.gray);
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnNueve.setBackground(java.awt.Color.gray);
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        jLabel1.setText("Puntaje Jugador 1:");

        jLabel2.setText("Puntaje Jugador 2:");

        jLabel3.setText("Turno del Jugador:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtJugadorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnSiete, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(btnCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnCinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnOcho, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNueve, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPuntajeJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPuntajeJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(btnReiniciar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtPuntajeJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnReiniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPuntajeJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtJugadorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSiete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOcho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        if (jugador1==true){
            btnUno.setBackground(Color.red);
            jugador1 = false; jugador2 = true;
            txtJugadorNombre.setText(nombreJ2);
            Validar();
            
        }else{
            btnUno.setBackground(Color.blue);
            jugador1 = true; jugador2 = false;
            txtJugadorNombre.setText(nombreJ1);
            Validar();
        }
        btnUno.setEnabled(false);
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        if (jugador1==true){
            btnDos.setBackground(Color.red);
            jugador1 = false; jugador2 = true;
            txtJugadorNombre.setText(nombreJ2);
            Validar();
        }else{
            btnDos.setBackground(Color.blue);
            jugador1 = true; jugador2 = false;
            txtJugadorNombre.setText(nombreJ1);
            Validar();
        }
        btnDos.setEnabled(false);
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        if (jugador1==true){
            btnTres.setBackground(Color.red);
            jugador1 = false; jugador2 = true;
            txtJugadorNombre.setText(nombreJ2);
            Validar();
        }else{
            btnTres.setBackground(Color.blue);
            jugador1 = true; jugador2 = false;
            txtJugadorNombre.setText(nombreJ1);
            Validar();
        }
        btnTres.setEnabled(false);
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        if (jugador1==true){
            btnCuatro.setBackground(Color.red);
            jugador1 = false; jugador2 = true;
            txtJugadorNombre.setText(nombreJ2);
            Validar();
        }else{
            btnCuatro.setBackground(Color.blue);
            jugador1 = true; jugador2 = false;
            txtJugadorNombre.setText(nombreJ1);
            Validar();
        }
        btnCuatro.setEnabled(false);
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        if (jugador1==true){
            btnCinco.setBackground(Color.red);
            jugador1 = false; jugador2 = true;
            txtJugadorNombre.setText(nombreJ2);
            Validar();
        }else{
            btnCinco.setBackground(Color.blue);
            jugador1 = true; jugador2 = false;
            txtJugadorNombre.setText(nombreJ1);
            Validar();
        }
        btnCinco.setEnabled(false);
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        if (jugador1==true){
            btnSeis.setBackground(Color.red);
            jugador1 = false; jugador2 = true;
            txtJugadorNombre.setText(nombreJ2);
            Validar();
        }else{
            btnSeis.setBackground(Color.blue);
            jugador1 = true; jugador2 = false;
            txtJugadorNombre.setText(nombreJ1);
            Validar();
        }
        btnSeis.setEnabled(false);
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        if (jugador1==true){
            btnSiete.setBackground(Color.red);
            jugador1 = false; jugador2 = true;
            txtJugadorNombre.setText(nombreJ2);
            Validar();
        }else{
            btnSiete.setBackground(Color.blue);
            jugador1 = true; jugador2 = false;
            txtJugadorNombre.setText(nombreJ1);
            Validar();
        }
        btnSiete.setEnabled(false);
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        if (jugador1==true){
            btnOcho.setBackground(Color.red);
            jugador1 = false; jugador2 = true;
            txtJugadorNombre.setText(nombreJ2);
            Validar();
        }else{
            btnOcho.setBackground(Color.blue);
            jugador1 = true; jugador2 = false;
            txtJugadorNombre.setText(nombreJ1);
            Validar();
        }
        btnOcho.setEnabled(false);
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        if (jugador1==true){
            btnNueve.setBackground(Color.red);
            jugador1 = false; jugador2 = true;
            txtJugadorNombre.setText(nombreJ2);
            Validar();
        }else{
            btnNueve.setBackground(Color.blue);
            jugador1 = true; jugador2 = false;
            txtJugadorNombre.setText(nombreJ1);
            Validar();
        }
        btnNueve.setEnabled(false);
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        Reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtJugadorNombre;
    private javax.swing.JTextField txtPuntajeJugador1;
    private javax.swing.JTextField txtPuntajeJugador2;
    // End of variables declaration//GEN-END:variables
}