package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainMenu extends javax.swing.JFrame {

    private Manager myManager;
    
    public MainMenu(Manager m) {
        initComponents();
        
        this.myManager = m;
        this.panelRegistrarJugador.setVisible(false);
        this.panelRegistrarJugador.setEnabled(false);
        this.panelConfigurarPartida.setVisible(false);
        this.panelConfigurarPartida.setEnabled(false);
        this.panelReplay.setVisible(false);
        this.panelReplay.setEnabled(false);
        this.panelRanking.setVisible(false);
        this.panelRanking.setEnabled(false);
        ButtonGroup groupObjetivo = new ButtonGroup();
        groupObjetivo.add(btnTorre);
        groupObjetivo.add(btnJugada);
        groupObjetivo.add(btnTiempo);
        ButtonGroup groupDistribucion = new ButtonGroup();
        groupDistribucion.add(btnDistL);
        groupDistribucion.add(btnDistI);
        groupDistribucion.add(btnDistA);
        this.setSize(700, 650);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelMenuPrincipal = new javax.swing.JPanel();
        btnRegistrarJugador = new javax.swing.JButton();
        btnConfigurarPartida = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnReplay = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRanking = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        panelRegistrarJugador = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        lblAlias = new javax.swing.JLabel();
        spnEdad = new javax.swing.JSpinner();
        txtAlias = new javax.swing.JTextField();
        lblRegistrarJugador = new javax.swing.JLabel();
        lblRegistrado = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelarJugador = new javax.swing.JButton();
        panelReplay = new javax.swing.JPanel();
        lblReplay = new javax.swing.JLabel();
        btnSalirReplay = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstReplays = new javax.swing.JList();
        btnReplicar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        panelConfigurarPartida = new javax.swing.JPanel();
        lblOpcion = new javax.swing.JLabel();
        btnTorre = new javax.swing.JRadioButton();
        btnJugada = new javax.swing.JRadioButton();
        btnTiempo = new javax.swing.JRadioButton();
        sldrCantidad = new javax.swing.JSlider();
        lblSlider = new javax.swing.JLabel();
        lblNumSlider = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstJugadores = new javax.swing.JList();
        btnJugadorB = new javax.swing.JButton();
        btnJugadorN = new javax.swing.JButton();
        btnRegistrarConfiguracion = new javax.swing.JButton();
        btnDistL = new javax.swing.JRadioButton();
        btnDistI = new javax.swing.JRadioButton();
        btnDistA = new javax.swing.JRadioButton();
        lblDistribucion = new javax.swing.JLabel();
        lblJugadores = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        sldrCuadrante = new javax.swing.JSlider();
        lblCuadrante = new javax.swing.JLabel();
        lblNumCuadrante = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRanking = new javax.swing.JPanel();
        lblRankingJugadores = new javax.swing.JLabel();
        btnSalirRanking = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstJugadores1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelMenuPrincipal.setFocusCycleRoot(true);
        panelMenuPrincipal.setPreferredSize(new java.awt.Dimension(550, 550));

        btnRegistrarJugador.setText("Registrar jugador");
        btnRegistrarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarJugadorActionPerformed(evt);
            }
        });

        btnConfigurarPartida.setText("Configurar partida");
        btnConfigurarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigurarPartidaActionPerformed(evt);
            }
        });

        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        btnReplay.setText("Replay");
        btnReplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplayActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnRanking.setText("Ranking");
        btnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingActionPerformed(evt);
            }
        });

        lblMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMenu.setText("Menu Principal");

        javax.swing.GroupLayout panelMenuPrincipalLayout = new javax.swing.GroupLayout(panelMenuPrincipal);
        panelMenuPrincipal.setLayout(panelMenuPrincipalLayout);
        panelMenuPrincipalLayout.setHorizontalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegistrarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfigurarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReplay, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
        );
        panelMenuPrincipalLayout.setVerticalGroup(
            panelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuPrincipalLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblMenu)
                .addGap(38, 38, 38)
                .addComponent(btnRegistrarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfigurarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReplay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        panelRegistrarJugador.setPreferredSize(new java.awt.Dimension(700, 650));

        lblNombre.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblEdad.setText("Edad");

        lblAlias.setText("Alias");

        txtAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAliasActionPerformed(evt);
            }
        });

        lblRegistrarJugador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRegistrarJugador.setText("Registrar Jugador");

        lblRegistrado.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelarJugador.setText("Cancelar");
        btnCancelarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarJugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegistrarJugadorLayout = new javax.swing.GroupLayout(panelRegistrarJugador);
        panelRegistrarJugador.setLayout(panelRegistrarJugadorLayout);
        panelRegistrarJugadorLayout.setHorizontalGroup(
            panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarJugadorLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelRegistrarJugadorLayout.createSequentialGroup()
                            .addGroup(panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblAlias)
                                .addComponent(lblEdad)
                                .addComponent(lblNombre))
                            .addGap(104, 104, 104)
                            .addGroup(panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre)
                                .addComponent(txtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelRegistrarJugadorLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnCancelarJugador)
                        .addGap(81, 81, 81)
                        .addComponent(btnRegistrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarJugadorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRegistrarJugador)
                        .addGap(65, 65, 65)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        panelRegistrarJugadorLayout.setVerticalGroup(
            panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarJugadorLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lblRegistrarJugador)
                .addGap(68, 68, 68)
                .addGroup(panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlias)
                    .addComponent(txtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelarJugador))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        panelReplay.setPreferredSize(new java.awt.Dimension(700, 700));

        lblReplay.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblReplay.setText("Replicar Partidas");

        btnSalirReplay.setText("Salir");
        btnSalirReplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirReplayActionPerformed(evt);
            }
        });

        lstReplays.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(lstReplays);

        btnReplicar.setText("Replicar");
        btnReplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplicarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelReplayLayout = new javax.swing.GroupLayout(panelReplay);
        panelReplay.setLayout(panelReplayLayout);
        panelReplayLayout.setHorizontalGroup(
            panelReplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReplayLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(panelReplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReplayLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnSalirReplay, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnGuardar)
                        .addGap(43, 43, 43)
                        .addComponent(btnReplicar))
                    .addGroup(panelReplayLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(lblReplay))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        panelReplayLayout.setVerticalGroup(
            panelReplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReplayLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblReplay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelReplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalirReplay)
                    .addComponent(btnReplicar)
                    .addComponent(btnGuardar))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        lblOpcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOpcion.setText("Elija tipo de partida");
        lblOpcion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnTorre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTorre.setText("Partida a formar torre");
        btnTorre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTorre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorreActionPerformed(evt);
            }
        });

        btnJugada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnJugada.setText("Partida por jugadas");
        btnJugada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnJugada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugadaActionPerformed(evt);
            }
        });

        btnTiempo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTiempo.setText("Partida por tiempo");
        btnTiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiempoActionPerformed(evt);
            }
        });

        sldrCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sldrCantidadMouseReleased(evt);
            }
        });

        lblSlider.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lstJugadores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstJugadores);

        btnJugadorB.setText("Jugador Blanco");
        btnJugadorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugadorBActionPerformed(evt);
            }
        });

        btnJugadorN.setText("Jugador Negro");
        btnJugadorN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugadorNActionPerformed(evt);
            }
        });

        btnRegistrarConfiguracion.setText("Registrar");
        btnRegistrarConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarConfiguracionActionPerformed(evt);
            }
        });

        btnDistL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDistL.setText("Distribucion en L");
        btnDistL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDistL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistLActionPerformed(evt);
            }
        });

        btnDistI.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDistI.setText("Distribucion en I");
        btnDistI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDistI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistIActionPerformed(evt);
            }
        });

        btnDistA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDistA.setText("Distribucion al azar");
        btnDistA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDistA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistAActionPerformed(evt);
            }
        });

        lblDistribucion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDistribucion.setText("Elija una distribución");
        lblDistribucion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblJugadores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblJugadores.setText("Elija un jugador negro y un jugador blanco distintos");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        sldrCuadrante.setMaximum(4);
        sldrCuadrante.setMinimum(1);
        sldrCuadrante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sldrCuadranteMouseReleased(evt);
            }
        });

        lblCuadrante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCuadrante.setText("Eliga el cuadrante (1-4)");

        lblNumCuadrante.setText("4");

        javax.swing.GroupLayout panelConfigurarPartidaLayout = new javax.swing.GroupLayout(panelConfigurarPartida);
        panelConfigurarPartida.setLayout(panelConfigurarPartidaLayout);
        panelConfigurarPartidaLayout.setHorizontalGroup(
            panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                        .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                        .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sldrCuadrante, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblOpcion)
                                                    .addComponent(btnTorre)
                                                    .addComponent(btnJugada)
                                                    .addComponent(btnTiempo)
                                                    .addComponent(lblSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblNumCuadrante, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                        .addComponent(sldrCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblNumSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(lblCuadrante))))
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblJugadores)))
                        .addContainerGap())
                    .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                        .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addGap(356, 356, 356)
                                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDistI)
                                    .addComponent(btnDistA)
                                    .addComponent(btnDistL)
                                    .addComponent(lblDistribucion)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfigurarPartidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnJugadorN)
                .addGap(73, 73, 73)
                .addComponent(btnJugadorB)
                .addGap(101, 101, 101)
                .addComponent(btnRegistrarConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        panelConfigurarPartidaLayout.setVerticalGroup(
            panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                            .addComponent(lblDistribucion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDistL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDistI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDistA))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfigurarPartidaLayout.createSequentialGroup()
                            .addComponent(lblOpcion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnTorre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnJugada)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnTiempo)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sldrCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lblCuadrante)
                .addGap(18, 18, 18)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldrCuadrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumCuadrante, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(lblJugadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfigurarPartidaLayout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(52, 52, 52)))
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJugadorB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJugadorN))
                .addGap(45, 45, 45))
        );

        panelRanking.setPreferredSize(new java.awt.Dimension(700, 700));

        lblRankingJugadores.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRankingJugadores.setText("Ranking Jugadores");

        btnSalirRanking.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnSalirRanking.setText("Salir");
        btnSalirRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirRankingActionPerformed(evt);
            }
        });

        lstJugadores1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(lstJugadores1);

        javax.swing.GroupLayout panelRankingLayout = new javax.swing.GroupLayout(panelRanking);
        panelRanking.setLayout(panelRankingLayout);
        panelRankingLayout.setHorizontalGroup(
            panelRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRankingLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(panelRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRankingLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lblRankingJugadores))
                    .addGroup(panelRankingLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnSalirRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        panelRankingLayout.setVerticalGroup(
            panelRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRankingLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblRankingJugadores)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnSalirRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelReplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelRegistrarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelConfigurarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelReplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelRegistrarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelConfigurarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfigurarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigurarPartidaActionPerformed
        configuracion = new Configuracion();
        if (s.getRanking().size() > 1) {
            this.panelMenuPrincipal.setEnabled(false);
            this.panelMenuPrincipal.setVisible(false);
            this.panelConfigurarPartida.setVisible(true);
            this.panelConfigurarPartida.setEnabled(true);
            this.lblSlider.setVisible(false);
            this.lblSlider.setEnabled(false);
            this.lblNumSlider.setVisible(false);
            this.lblNumSlider.setEnabled(false);
            this.sldrCantidad.setVisible(false);
            this.sldrCantidad.setEnabled(false);
            configuracion.setCantidad(-1);
            configuracion.setCuadrante(-1);
            configuracion.setObjetivo('x');
            configuracion.setOrden('x');
            configuracion.setJugadorB(null);
            configuracion.setJugadorN(null);
            lblJugadores.setText("Elija un jugador negro y un jugador blanco distintos");
            this.lstJugadores.setListData(s.getRanking().toArray());
        } else {
            JOptionPane.showMessageDialog(this, "No se puede configurar una partida sin registrar al menos 2 jugadores antes", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConfigurarPartidaActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        int pos = 0;
        if (s.getUltimaPartida().getOrden() != 'x') {
            VentanaTablero ventana = new VentanaTablero(s, false, pos);
        } else {
            JOptionPane.showMessageDialog(this, "No se puede jugar sin configurar una partida antes", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnJugarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAliasActionPerformed

    private void btnRegistrarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarJugadorActionPerformed
        // TODO add your handling code here:
        this.panelMenuPrincipal.setEnabled(false);
        this.panelMenuPrincipal.setVisible(false);
        this.panelRegistrarJugador.setVisible(true);
        this.panelRegistrarJugador.setEnabled(true);
        this.txtAlias.setText("");
        this.txtNombre.setText("");
        this.spnEdad.setValue(0);
        this.lblRegistrado.setText("");
    }//GEN-LAST:event_btnRegistrarJugadorActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        int numero = (Integer) spnEdad.getValue();
        if (numero < 1 || numero > 150) {
            lblRegistrado.setText("El valor ingresado debe ser un entero entre: " + 1 + " y " + 150 + ", vuelva a ingresar");
            lblRegistrado.setForeground(Color.red);
        } else {
            if (registrarJugador(txtNombre.getText(), numero, txtAlias.getText())) {
                lblRegistrado.setText("Se ha registrado con exito!");
                this.panelRegistrarJugador.setVisible(false);
                this.panelRegistrarJugador.setEnabled(false);
                this.panelMenuPrincipal.setEnabled(true);
                this.panelMenuPrincipal.setVisible(true);
            } else {
                lblRegistrado.setText("El alias debe de ser unico, vuelva a intentarlo");
                lblRegistrado.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnJugadorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugadorBActionPerformed
        // TODO add your handling code here:
        Object o = lstJugadores.getSelectedValue();
        configuracion.setJugadorB(((Ranking) o).getAlias());
    }//GEN-LAST:event_btnJugadorBActionPerformed

    private void btnJugadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugadaActionPerformed
        // TODO add your handling code here:
        this.lblSlider.setVisible(true);
        this.lblSlider.setEnabled(true);
        this.lblNumSlider.setVisible(true);
        this.lblNumSlider.setEnabled(true);
        this.sldrCantidad.setVisible(true);
        this.sldrCantidad.setEnabled(true);
        this.lblSlider.setText("Elija la cantidad de jugadas");
        this.sldrCantidad.setMaximum(30);
        this.sldrCantidad.setMinimum(1);
        this.lblNumSlider.setText("" + this.sldrCantidad.getValue());
        configuracion.setObjetivo('j');
    }//GEN-LAST:event_btnJugadaActionPerformed

    private void btnTorreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorreActionPerformed
        // TODO add your handling code here:
        this.lblSlider.setVisible(false);
        this.lblSlider.setEnabled(false);
        this.lblNumSlider.setVisible(false);
        this.lblNumSlider.setEnabled(false);
        this.sldrCantidad.setVisible(false);
        this.sldrCantidad.setEnabled(false);
        configuracion.setObjetivo('t');
    }//GEN-LAST:event_btnTorreActionPerformed

    private void sldrCantidadMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldrCantidadMouseReleased
        // TODO add your handling code here:
        if (configuracion.getObjetivo() == 'j') {
            this.lblNumSlider.setText("" + this.sldrCantidad.getValue());
            configuracion.setCantidad(this.sldrCantidad.getValue());
        } else if (configuracion.getObjetivo() == 's') {
            this.lblNumSlider.setText("" + this.sldrCantidad.getValue());
            configuracion.setCantidad(this.sldrCantidad.getValue() * 60);
        }
    }//GEN-LAST:event_sldrCantidadMouseReleased

    private void btnTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiempoActionPerformed
        // TODO add your handling code here:
        this.lblSlider.setVisible(true);
        this.lblSlider.setEnabled(true);
        this.lblNumSlider.setVisible(true);
        this.lblNumSlider.setEnabled(true);
        this.sldrCantidad.setVisible(true);
        this.sldrCantidad.setEnabled(true);
        this.lblSlider.setText("Elija la duracion (1-10)");
        this.sldrCantidad.setMinimum(1);
        this.sldrCantidad.setMaximum(10);
        this.lblNumSlider.setText("" + this.sldrCantidad.getValue());
        configuracion.setObjetivo('s');
    }//GEN-LAST:event_btnTiempoActionPerformed

    private void btnDistLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistLActionPerformed
        // TODO add your handling code here:
        configuracion.setOrden('l');
    }//GEN-LAST:event_btnDistLActionPerformed

    private void btnDistIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistIActionPerformed
        // TODO add your handling code here:
        configuracion.setOrden('i');
    }//GEN-LAST:event_btnDistIActionPerformed

    private void btnDistAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistAActionPerformed
        // TODO add your handling code here:
        configuracion.setOrden('a');
    }//GEN-LAST:event_btnDistAActionPerformed

    private void btnRegistrarConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarConfiguracionActionPerformed
        // TODO add your handling code here:
        if (configuracion.getOrden() != 'x' && configuracion.getObjetivo() != 'x' && configuracion.getCuadrante() != -1 && configuracion.getJugadorB() != null && configuracion.getJugadorN() != null) {
            s.setUltimaPartida(configuracion);
            this.panelConfigurarPartida.setVisible(false);
            this.panelConfigurarPartida.setEnabled(false);
            this.panelMenuPrincipal.setEnabled(true);
            this.panelMenuPrincipal.setVisible(true);
        } else {
            lblJugadores.setText("Faltan datos por ingresar");
            lblJugadores.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnRegistrarConfiguracionActionPerformed

    private void btnJugadorNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugadorNActionPerformed
        // TODO add your handling code here:
        Object o = lstJugadores.getSelectedValue();
        configuracion.setJugadorN(((Ranking) o).getAlias());
    }//GEN-LAST:event_btnJugadorNActionPerformed

    private void btnCancelarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarJugadorActionPerformed
        // TODO add your handling code here:
        this.panelRegistrarJugador.setVisible(false);
        this.panelRegistrarJugador.setEnabled(false);
        this.panelMenuPrincipal.setEnabled(true);
        this.panelMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnCancelarJugadorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.panelConfigurarPartida.setVisible(false);
        this.panelConfigurarPartida.setEnabled(false);
        this.panelMenuPrincipal.setEnabled(true);
        this.panelMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void sldrCuadranteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldrCuadranteMouseReleased
        // TODO add your handling code here:
        this.lblNumCuadrante.setText("" + this.sldrCuadrante.getValue());
        configuracion.setCuadrante(this.sldrCuadrante.getValue());
    }//GEN-LAST:event_sldrCuadranteMouseReleased

    private void btnReplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplayActionPerformed
        // TODO add your handling code here:
        if (!s.getReplay().isEmpty()) {
            this.panelReplay.setVisible(true);
            this.panelReplay.setEnabled(true);
            this.panelMenuPrincipal.setEnabled(false);
            this.panelMenuPrincipal.setVisible(false);
            this.lstReplays.setListData(s.getReplay().toArray());
        } else {
            JOptionPane.showMessageDialog(this, "No hay partidas guardadas", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnReplayActionPerformed

    private void btnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActionPerformed
        // TODO add your handling code here:
        if (!s.getRanking().isEmpty()) {
            this.panelMenuPrincipal.setEnabled(false);
            this.panelMenuPrincipal.setVisible(false);
            this.panelRanking.setVisible(true);
            this.panelRanking.setEnabled(true);
            this.lstJugadores1.setListData(s.getRanking().toArray());
        } else {
            JOptionPane.showMessageDialog(this, "No hay jugadores registrados", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRankingActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("arcoiris_data.dat"));
            out.writeObject(s);
            out.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirRankingActionPerformed
        // TODO add your handling code here:
        this.panelRanking.setVisible(false);
        this.panelRanking.setEnabled(false);
        this.panelMenuPrincipal.setEnabled(true);
        this.panelMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnSalirRankingActionPerformed

    private void btnSalirReplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirReplayActionPerformed
        // TODO add your handling code here:
        this.panelReplay.setVisible(false);
        this.panelReplay.setEnabled(false);
        this.panelMenuPrincipal.setEnabled(true);
        this.panelMenuPrincipal.setVisible(true);

    }//GEN-LAST:event_btnSalirReplayActionPerformed

    private void btnReplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplicarActionPerformed
        // TODO add your handling code here:
        if (!lstReplays.isSelectionEmpty()) {
            int pos = lstReplays.getSelectedIndex();
            VentanaTablero ventana = new VentanaTablero(s, true, pos);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una partida para replicar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnReplicarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (!lstReplays.isSelectionEmpty()) {
            JFileChooser filechooser = new JFileChooser();
            filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            if (filechooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                String path = filechooser.getSelectedFile().getPath();
                Object o = lstReplays.getSelectedValue();
                Replay elReplay = ((Replay) o);
                ArrayList<String> partidaGuardar = elReplay.getLogPartida();
                DateFormat dateFormat = new SimpleDateFormat("MMddHHmm");
                Calendar cal = Calendar.getInstance();
                ArchivoGrabacion grabar = new ArchivoGrabacion(path + "\\PARTIDA" + dateFormat.format(cal.getTime()) + ".txt");
                for (int i = 0; i < partidaGuardar.size(); i++) {
                    grabar.grabarLinea(partidaGuardar.get(i));
                }
                grabar.cerrar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una partida para guardar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("arcoiris_data.dat"));
            out.writeObject(s);
            out.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formWindowClosing

    public boolean registrarJugador(String nombre, int edad, String alias) {
        Ranking j = new Ranking(nombre, alias, edad);
        return s.addJugador(j);
    }

    public boolean verificarQueSeaInt(String numero, int min, int max) {
        boolean ok = true;
        try {
            if (Integer.parseInt(numero) < min && Integer.parseInt(numero) > max) {
                ok = false;
            }
        } catch (NumberFormatException e) {
            ok = false;
        }
        return ok;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarJugador;
    private javax.swing.JButton btnConfigurarPartida;
    private javax.swing.JRadioButton btnDistA;
    private javax.swing.JRadioButton btnDistI;
    private javax.swing.JRadioButton btnDistL;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JRadioButton btnJugada;
    private javax.swing.JButton btnJugadorB;
    private javax.swing.JButton btnJugadorN;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnRanking;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarConfiguracion;
    private javax.swing.JButton btnRegistrarJugador;
    private javax.swing.JButton btnReplay;
    private javax.swing.JButton btnReplicar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirRanking;
    private javax.swing.JButton btnSalirReplay;
    private javax.swing.JRadioButton btnTiempo;
    private javax.swing.JRadioButton btnTorre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblAlias;
    private javax.swing.JLabel lblCuadrante;
    private javax.swing.JLabel lblDistribucion;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblJugadores;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumCuadrante;
    private javax.swing.JLabel lblNumSlider;
    private javax.swing.JLabel lblOpcion;
    private javax.swing.JLabel lblRankingJugadores;
    private javax.swing.JLabel lblRegistrado;
    private javax.swing.JLabel lblRegistrarJugador;
    private javax.swing.JLabel lblReplay;
    private javax.swing.JLabel lblSlider;
    private javax.swing.JList lstJugadores;
    private javax.swing.JList lstJugadores1;
    private javax.swing.JList lstReplays;
    private javax.swing.JPanel panelConfigurarPartida;
    private javax.swing.JPanel panelMenuPrincipal;
    private javax.swing.JPanel panelRanking;
    private javax.swing.JPanel panelRegistrarJugador;
    private javax.swing.JPanel panelReplay;
    private javax.swing.JSlider sldrCantidad;
    private javax.swing.JSlider sldrCuadrante;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JTextField txtAlias;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
