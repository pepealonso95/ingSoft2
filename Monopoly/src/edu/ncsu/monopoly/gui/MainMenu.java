package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.*;
import edu.ncsu.monopoly.boardScenarios.GameBoardCCJail;
import edu.ncsu.monopoly.boardScenarios.GameBoardFull;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;

public class MainMenu extends javax.swing.JFrame {

    private Manager myManager;
    private String path;
    private File imageFile = null;
    private int players;
    private boolean configurado;
    private ArrayList<String> playerNames;
    private ArrayList<String> playerColors;

    public MainMenu(Manager m) {
        initComponents();

        this.myManager = m;
        this.panelRegistrarJugador.setVisible(false);
        this.panelRegistrarJugador.setEnabled(false);
        this.panelConfigurarPartida.setVisible(false);
        this.panelConfigurarPartida.setEnabled(false);
        this.panelRanking.setVisible(false);
        this.panelRanking.setEnabled(false);
        ButtonGroup groupObjetivo = new ButtonGroup();
        ButtonGroup groupDistribucion = new ButtonGroup();
        this.setSize(700, 650);
        this.players = 2;
        this.configurado = false;
        this.playerNames = new ArrayList<String>();
        this.playerColors = new ArrayList<String>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelMenuPrincipal = new javax.swing.JPanel();
        btnRegistrarJugador = new javax.swing.JButton();
        btnConfigurarPartida = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRanking = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        panelRegistrarJugador = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        lblRegistrarJugador = new javax.swing.JLabel();
        lblRegistrado = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelarJugador = new javax.swing.JButton();
        btnUploadFile = new javax.swing.JButton();
        pathLbl = new javax.swing.JLabel();
        panelConfigurarPartida = new javax.swing.JPanel();
        nrLabel = new javax.swing.JLabel();
        nrComboBox = new javax.swing.JComboBox<String>();
        selectPlayer1Lbl = new javax.swing.JLabel();
        selectPlayer1ComboBox = new javax.swing.JComboBox<String>();
        color1Lbl = new javax.swing.JLabel();
        color1ComboBox = new javax.swing.JComboBox<String>();
        player1Lbl = new javax.swing.JLabel();
        player2Lbl = new javax.swing.JLabel();
        color2ComboBox = new javax.swing.JComboBox<String>();
        selectPlayer2Lbl = new javax.swing.JLabel();
        color2Lbl = new javax.swing.JLabel();
        selectPlayer2ComboBox = new javax.swing.JComboBox<String>();
        selectPlayer4ComboBox = new javax.swing.JComboBox<String>();
        color4Lbl = new javax.swing.JLabel();
        selectPlayer4Lbl = new javax.swing.JLabel();
        color4ComboBox = new javax.swing.JComboBox<String>();
        player4Lbl = new javax.swing.JLabel();
        player3Lbl = new javax.swing.JLabel();
        color3ComboBox = new javax.swing.JComboBox<String>();
        selectPlayer3Lbl = new javax.swing.JLabel();
        color3Lbl = new javax.swing.JLabel();
        selectPlayer3ComboBox = new javax.swing.JComboBox<String>();
        selectPlayer6ComboBox = new javax.swing.JComboBox<String>();
        color6Lbl = new javax.swing.JLabel();
        selectPlayer6Lbl = new javax.swing.JLabel();
        color6ComboBox = new javax.swing.JComboBox<String>();
        player6Lbl = new javax.swing.JLabel();
        player5Lbl = new javax.swing.JLabel();
        color5ComboBox = new javax.swing.JComboBox<String>();
        selectPlayer5Lbl = new javax.swing.JLabel();
        color5Lbl = new javax.swing.JLabel();
        selectPlayer5ComboBox = new javax.swing.JComboBox<String>();
        selectPlayer8ComboBox = new javax.swing.JComboBox<String>();
        color8Lbl = new javax.swing.JLabel();
        selectPlayer8Lbl = new javax.swing.JLabel();
        color8ComboBox = new javax.swing.JComboBox<String>();
        player8Lbl = new javax.swing.JLabel();
        player7Lbl = new javax.swing.JLabel();
        color7ComboBox = new javax.swing.JComboBox<String>();
        selectPlayer7Lbl = new javax.swing.JLabel();
        color7Lbl = new javax.swing.JLabel();
        selectPlayer7ComboBox = new javax.swing.JComboBox<String>();
        setBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        configurarLbl = new javax.swing.JLabel();
        panelRanking = new javax.swing.JPanel();
        lblRankingJugadores = new javax.swing.JLabel();
        btnSalirRanking = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstJugadores1 = new javax.swing.JList();
        playerImgLbl = new javax.swing.JLabel();

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
        btnConfigurarPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnConfigurarPartidaMouseReleased(evt);
            }
        });
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
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        panelRegistrarJugador.setPreferredSize(new java.awt.Dimension(700, 650));

        lblName.setText("Nombre");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblImage.setText("Imagen");

        lblRegistrarJugador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRegistrarJugador.setText("Registrar Jugador");

        lblRegistrado.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelarJugador.setText("Volver");
        btnCancelarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarJugadorActionPerformed(evt);
            }
        });

        btnUploadFile.setText("Upload file");
        btnUploadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegistrarJugadorLayout = new javax.swing.GroupLayout(panelRegistrarJugador);
        panelRegistrarJugador.setLayout(panelRegistrarJugadorLayout);
        panelRegistrarJugadorLayout.setHorizontalGroup(
            panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarJugadorLayout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistrarJugadorLayout.createSequentialGroup()
                        .addComponent(btnCancelarJugador)
                        .addGap(33, 33, 33)
                        .addComponent(btnRegistrar))
                    .addGroup(panelRegistrarJugadorLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegistrarJugadorLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblRegistrarJugador))
                    .addGroup(panelRegistrarJugadorLayout.createSequentialGroup()
                        .addGroup(panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblImage))
                        .addGap(104, 104, 104)
                        .addGroup(panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRegistrarJugadorLayout.createSequentialGroup()
                                .addComponent(btnUploadFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pathLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(57, 57, 57))
        );
        panelRegistrarJugadorLayout.setVerticalGroup(
            panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistrarJugadorLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lblRegistrarJugador)
                .addGap(53, 53, 53)
                .addGroup(panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistrarJugadorLayout.createSequentialGroup()
                        .addGroup(panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUploadFile)
                            .addComponent(lblImage))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarJugadorLayout.createSequentialGroup()
                        .addComponent(pathLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(lblRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRegistrarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelarJugador))
                .addContainerGap(260, Short.MAX_VALUE))
        );

        nrLabel.setText("Cantidad jugadores:");

        nrComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8" }));
        nrComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nrComboBoxFocusLost(evt);
            }
        });
        nrComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrComboBoxActionPerformed(evt);
            }
        });

        selectPlayer1Lbl.setText("Seleccionar existente:");

        selectPlayer1ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        color1Lbl.setText("Color:");

        color1ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "rojo", "azul", "amarillo", "verde", "naranja", "rosado", "negro", "blanco" }));

        player1Lbl.setText("Jugador 1");

        player2Lbl.setText("Jugador 2");

        color2ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "rojo", "azul", "amarillo", "verde", "naranja", "rosado", "negro", "blanco" }));
        color2ComboBox.setSelectedIndex(1);

        selectPlayer2Lbl.setText("Seleccionar existente:");

        color2Lbl.setText("Color:");

        selectPlayer2ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        selectPlayer4ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        color4Lbl.setText("Color:");

        selectPlayer4Lbl.setText("Seleccionar existente:");

        color4ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "rojo", "azul", "amarillo", "verde", "naranja", "rosado", "negro", "blanco" }));
        color4ComboBox.setSelectedIndex(3);

        player4Lbl.setText("Jugador 4");

        player3Lbl.setText("Jugador 3");

        color3ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "rojo", "azul", "amarillo", "verde", "naranja", "rosado", "negro", "blanco" }));
        color3ComboBox.setSelectedIndex(2);

        selectPlayer3Lbl.setText("Seleccionar existente:");

        color3Lbl.setText("Color:");

        selectPlayer3ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        selectPlayer6ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        color6Lbl.setText("Color:");

        selectPlayer6Lbl.setText("Seleccionar existente:");

        color6ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "rojo", "azul", "amarillo", "verde", "naranja", "rosado", "negro", "blanco" }));
        color6ComboBox.setSelectedIndex(5);

        player6Lbl.setText("Jugador 6");

        player5Lbl.setText("Jugador 5");

        color5ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "rojo", "azul", "amarillo", "verde", "naranja", "rosado", "negro", "blanco" }));
        color5ComboBox.setSelectedIndex(4);

        selectPlayer5Lbl.setText("Seleccionar existente:");

        color5Lbl.setText("Color:");

        selectPlayer5ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        selectPlayer8ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        color8Lbl.setText("Color:");

        selectPlayer8Lbl.setText("Seleccionar existente:");

        color8ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "rojo", "azul", "amarillo", "verde", "naranja", "rosado", "negro", "blanco" }));
        color8ComboBox.setSelectedIndex(7);

        player8Lbl.setText("Jugador 8");

        player7Lbl.setText("Jugador 7");

        color7ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "rojo", "azul", "amarillo", "verde", "naranja", "rosado", "negro", "blanco" }));
        color7ComboBox.setSelectedIndex(6);

        selectPlayer7Lbl.setText("Seleccionar existente:");

        color7Lbl.setText("Color:");

        selectPlayer7ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBtn.setText("Aceptar");
        setBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancelar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        configurarLbl.setText("CONFIGURAR PARTIDA");

        javax.swing.GroupLayout panelConfigurarPartidaLayout = new javax.swing.GroupLayout(panelConfigurarPartida);
        panelConfigurarPartida.setLayout(panelConfigurarPartidaLayout);
        panelConfigurarPartidaLayout.setHorizontalGroup(
            panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectPlayer8Lbl)
                                    .addComponent(player8Lbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectPlayer8ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(color8Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(color8ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectPlayer7Lbl)
                                    .addComponent(player7Lbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectPlayer7ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(color7Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(color7ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectPlayer6Lbl)
                                    .addComponent(player6Lbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectPlayer6ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(color6Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(color6ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectPlayer5Lbl)
                                    .addComponent(player5Lbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectPlayer5ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(color5Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(color5ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectPlayer4Lbl)
                                    .addComponent(player4Lbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectPlayer4ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(color4Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(color4ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectPlayer3Lbl)
                                    .addComponent(player3Lbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectPlayer3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(color3Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(color3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectPlayer2Lbl)
                                    .addComponent(player2Lbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectPlayer2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(color2Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(color2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                                        .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(selectPlayer1Lbl)
                                            .addComponent(player1Lbl))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selectPlayer1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelConfigurarPartidaLayout.createSequentialGroup()
                                        .addComponent(nrLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nrComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)))
                                .addGap(36, 36, 36)
                                .addComponent(color1Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(color1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(setBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(configurarLbl)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        panelConfigurarPartidaLayout.setVerticalGroup(
            panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfigurarPartidaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(configurarLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nrLabel)
                    .addComponent(nrComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(player1Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectPlayer1Lbl)
                    .addComponent(selectPlayer1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color1Lbl)
                    .addComponent(color1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player2Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectPlayer2Lbl)
                    .addComponent(selectPlayer2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color2Lbl)
                    .addComponent(color2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                        .addComponent(player3Lbl)
                        .addGap(18, 18, 18)
                        .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectPlayer3Lbl)
                            .addComponent(selectPlayer3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(color3Lbl)
                            .addComponent(color3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(player4Lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectPlayer4Lbl)
                            .addComponent(selectPlayer4ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(color4Lbl)
                            .addComponent(color4ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(player5Lbl))
                    .addGroup(panelConfigurarPartidaLayout.createSequentialGroup()
                        .addComponent(setBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectPlayer5Lbl)
                    .addComponent(selectPlayer5ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color5Lbl)
                    .addComponent(color5ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player6Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectPlayer6Lbl)
                    .addComponent(selectPlayer6ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color6Lbl)
                    .addComponent(color6ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player7Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectPlayer7Lbl)
                    .addComponent(selectPlayer7ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color7Lbl)
                    .addComponent(color7ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player8Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConfigurarPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectPlayer8Lbl)
                    .addComponent(selectPlayer8ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color8Lbl)
                    .addComponent(color8ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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
        lstJugadores1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstJugadores1ValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lstJugadores1);

        javax.swing.GroupLayout panelRankingLayout = new javax.swing.GroupLayout(panelRanking);
        panelRanking.setLayout(panelRankingLayout);
        panelRankingLayout.setHorizontalGroup(
            panelRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRankingLayout.createSequentialGroup()
                .addGroup(panelRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRankingLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(btnSalirRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRankingLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRankingLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lblRankingJugadores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addComponent(playerImgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        panelRankingLayout.setVerticalGroup(
            panelRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRankingLayout.createSequentialGroup()
                .addGroup(panelRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRankingLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblRankingJugadores)
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalirRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRankingLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(playerImgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelRegistrarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelConfigurarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelRegistrarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelConfigurarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfigurarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigurarPartidaActionPerformed

    }//GEN-LAST:event_btnConfigurarPartidaActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        if(this.configurado){
            GameMaster master = GameMaster.newInstance(this.myManager);
        MainWindow window = new MainWindow();
        GameBoard gameBoard = new GameBoardCCJail();
        master.setGameBoard(gameBoard);
        GameMaster.instance().setNumberOfPlayers(this.players);
           // String name1 = myManager.getPlayerList().get(CBplayer1.getSelectedIndex()).getName();
            //GameMaster.instance().getPlayer(1).setName(name1);
            //String name2 = myManager.getPlayerList().get(CBplayer2.getSelectedIndex()).getName();
            //GameMaster.instance().getPlayer(2).setName(name2);
          
            for(int i=0;i<this.players;i++){
              GameMaster.instance().getPlayer(i).setName(playerNames.get(i));
              GameMaster.instance().getPlayer(i).setColor(playerColors.get(i));
              this.myManager.getPlayer(playerNames.get(i)).addGamePlayed();
            }
        
        window.setupGameBoard(gameBoard);
        window.show();
        master.setGUI(window);
        master.startGame();
        } else {
            JOptionPane.showMessageDialog(this, "Configure una partida para jugar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnJugarActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnRegistrarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarJugadorActionPerformed
        // TODO add your handling code here:
        this.panelMenuPrincipal.setEnabled(false);
        this.panelMenuPrincipal.setVisible(false);
        this.panelRegistrarJugador.setVisible(true);
        this.panelRegistrarJugador.setEnabled(true);

        this.txtName.setText("");

        this.lblRegistrado.setText("");
    }//GEN-LAST:event_btnRegistrarJugadorActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
       
        
        String name = txtName.getText();     

        if (myManager.playerAlreadyExists(name)) {
            lblRegistrado.setText("Ese nombre se encuentra en uso!");
            lblRegistrado.setForeground(Color.red);
        } 
        else if(isEmpty(name)){
            lblRegistrado.setText("Debes ingresar un nombre");
            lblRegistrado.setForeground(Color.red);
        }       
        else {
            PlayerInfo p = new PlayerInfo(name);
            if(imageFile!=null){
                saveImage(imageFile,name+"_pic");
                p.setPicture("/images/" +name+"_pic.jpg" );
                imageFile=null;
            }
            
            myManager.addPlayerToList(p);
            lblRegistrado.setText("El jugador " + name + " fue agregado!");
            txtName.setText("");
            pathLbl.setText("");
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarJugadorActionPerformed
        // TODO add your handling code here:
        this.panelRegistrarJugador.setVisible(false);
        this.panelRegistrarJugador.setEnabled(false);
        this.panelMenuPrincipal.setEnabled(true);
        this.panelMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnCancelarJugadorActionPerformed

    private void btnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActionPerformed
        // TODO add your handling code here:
        if (!myManager.getPlayerList().isEmpty()) {
            this.panelMenuPrincipal.setEnabled(false);
            this.panelMenuPrincipal.setVisible(false);
            this.panelRanking.setVisible(true);
            this.panelRanking.setEnabled(true);

            this.lstJugadores1.setListData(myManager.getPlayerList().toArray());
        } else {
            JOptionPane.showMessageDialog(this, "No hay jugadores registrados", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRankingActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("monopoly_data.dat"));
            out.writeObject(myManager);
            out.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirRankingActionPerformed
        // TODO add your handling code here:
        this.panelRanking.setVisible(false);
        this.panelRanking.setEnabled(false);
        this.panelMenuPrincipal.setEnabled(true);
        this.panelMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnSalirRankingActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("monopoly_data.dat"));
            out.writeObject(myManager);
            out.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void btnUploadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int res = fileChooser.showOpenDialog(this);

        if (res == JFileChooser.APPROVE_OPTION) {

            int width = 963;    //width of the image
            int height = 640;   //height of the image
            BufferedImage image = null;
           
            imageFile = fileChooser.getSelectedFile().getAbsoluteFile();   
            pathLbl.setText(fileChooser.getSelectedFile().getAbsolutePath());
            //saveImage(f);
        }

       

    }//GEN-LAST:event_btnUploadFileActionPerformed

    private void nrComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrComboBoxActionPerformed
        // TODO add your handling code here:
        this.players = Integer.parseInt((String)this.nrComboBox.getSelectedItem());
        setPlayerValues();
    }//GEN-LAST:event_nrComboBoxActionPerformed

    private void btnConfigurarPartidaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigurarPartidaMouseReleased
        // TODO add your handling code here:
        if (!myManager.getPlayerList().isEmpty()) {
            this.panelConfigurarPartida.setVisible(true);
            this.panelConfigurarPartida.setEnabled(true);
            this.panelMenuPrincipal.setEnabled(false);
            this.panelMenuPrincipal.setVisible(false);
            setPlayerValues();
            setPlayersToSelect();
        } else {
            JOptionPane.showMessageDialog(this, "No hay jugadores registrados", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConfigurarPartidaMouseReleased

    private void nrComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nrComboBoxFocusLost
        // TODO add your handling code here:
        this.players = Integer.parseInt((String)this.nrComboBox.getSelectedItem());
        setPlayerValues();
    }//GEN-LAST:event_nrComboBoxFocusLost

    private void setBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setBtnActionPerformed
        // TODO add your handling code here:
        if(addPlayersToParty()){
            this.configurado = true;
            this.panelConfigurarPartida.setVisible(false);
            this.panelConfigurarPartida.setEnabled(false);
            this.panelMenuPrincipal.setEnabled(true);
            this.panelMenuPrincipal.setVisible(true);
        }else{
            this.configurado = false;
            JOptionPane.showMessageDialog(this, "Todos los jugadores deben de ser distintos con colores distintos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_setBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        this.panelConfigurarPartida.setVisible(false);
        this.panelConfigurarPartida.setEnabled(false);
        this.panelMenuPrincipal.setEnabled(true);
        this.panelMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void lstJugadores1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstJugadores1ValueChanged
        // TODO add your handling code here:
        PlayerInfo player = (PlayerInfo)this.lstJugadores1.getSelectedValue();
        ImageIcon oImageIcon = new ImageIcon(getClass().getResource(player.getPicture()));
        Image oImage = oImageIcon.getImage();
        Image newImage = oImage.getScaledInstance(187, 160,  java.awt.Image.SCALE_SMOOTH);
        this.playerImgLbl.setIcon(new ImageIcon(newImage));
    }//GEN-LAST:event_lstJugadores1ValueChanged

    public boolean addPlayersToParty(){
        boolean flag = true;
        this.playerNames.clear();
        this.playerColors.clear();
        this.playerNames.add((String)selectPlayer1ComboBox.getSelectedItem());
        this.playerColors.add((String)color1ComboBox.getSelectedItem());
        if(this.playerNames.contains((String)selectPlayer2ComboBox.getSelectedItem())||this.playerColors.contains((String)color2ComboBox.getSelectedItem())){
            flag = false;
        }else{
            this.playerNames.add((String)selectPlayer2ComboBox.getSelectedItem());
            this.playerColors.add((String)color2ComboBox.getSelectedItem());
        }
        if(this.players>=3){
            if(this.playerNames.contains((String)selectPlayer3ComboBox.getSelectedItem())||this.playerColors.contains((String)color3ComboBox.getSelectedItem())){
                flag = false;
            }else{
                this.playerNames.add((String)selectPlayer3ComboBox.getSelectedItem());
                this.playerColors.add((String)color3ComboBox.getSelectedItem());
            }
        }
        if(this.players>=4){
            if(this.playerNames.contains((String)selectPlayer4ComboBox.getSelectedItem())||this.playerColors.contains((String)color4ComboBox.getSelectedItem())){
                flag = false;
            }else{
                this.playerNames.add((String)selectPlayer4ComboBox.getSelectedItem());
                this.playerColors.add((String)color4ComboBox.getSelectedItem());
            }
        }
        if(this.players>=5){
            if(this.playerNames.contains((String)selectPlayer5ComboBox.getSelectedItem())||this.playerColors.contains((String)color5ComboBox.getSelectedItem())){
                flag = false;
            }else{
                this.playerNames.add((String)selectPlayer5ComboBox.getSelectedItem());
                this.playerColors.add((String)color5ComboBox.getSelectedItem());
            }
        }
        if(this.players>=6){
            if(this.playerNames.contains((String)selectPlayer6ComboBox.getSelectedItem())||this.playerColors.contains((String)color6ComboBox.getSelectedItem())){
                flag = false;
            }else{
                this.playerNames.add((String)selectPlayer6ComboBox.getSelectedItem());
                this.playerColors.add((String)color6ComboBox.getSelectedItem());
            }
        }
        if(this.players>=7){
            if(this.playerNames.contains((String)selectPlayer7ComboBox.getSelectedItem())||this.playerColors.contains((String)color7ComboBox.getSelectedItem())){
                flag = false;
            }else{
                this.playerNames.add((String)selectPlayer7ComboBox.getSelectedItem());
                this.playerColors.add((String)color7ComboBox.getSelectedItem());
            }
        }
        if(this.players>=8){
            if(this.playerNames.contains((String)selectPlayer8ComboBox.getSelectedItem())||this.playerColors.contains((String)color8ComboBox.getSelectedItem())){
                flag = false;
            }else{
                this.playerNames.add((String)selectPlayer8ComboBox.getSelectedItem());
                this.playerColors.add((String)color8ComboBox.getSelectedItem());
            }
        }
        return flag;
    }
    
    public void setPlayersToSelect(){
        this.selectPlayer1ComboBox.setModel(new DefaultComboBoxModel(this.myManager.getPlayerNames().toArray()));
        this.selectPlayer2ComboBox.setModel(new DefaultComboBoxModel(this.myManager.getPlayerNames().toArray()));
        this.selectPlayer3ComboBox.setModel(new DefaultComboBoxModel(this.myManager.getPlayerNames().toArray()));
        this.selectPlayer4ComboBox.setModel(new DefaultComboBoxModel(this.myManager.getPlayerNames().toArray()));
        this.selectPlayer5ComboBox.setModel(new DefaultComboBoxModel(this.myManager.getPlayerNames().toArray()));
        this.selectPlayer6ComboBox.setModel(new DefaultComboBoxModel(this.myManager.getPlayerNames().toArray()));
        this.selectPlayer7ComboBox.setModel(new DefaultComboBoxModel(this.myManager.getPlayerNames().toArray()));
        this.selectPlayer8ComboBox.setModel(new DefaultComboBoxModel(this.myManager.getPlayerNames().toArray()));
    }
    
    public void setPlayerValues(){
        if(this.players<3){
            this.player3Lbl.setVisible(false);
            this.player3Lbl.setEnabled(false);
            this.selectPlayer3Lbl.setVisible(false);
            this.selectPlayer3Lbl.setEnabled(false);
            this.selectPlayer3ComboBox.setVisible(false);
            this.selectPlayer3ComboBox.setEnabled(false);
            this.color3Lbl.setVisible(false);
            this.color3Lbl.setEnabled(false);
            this.color3ComboBox.setVisible(false);
            this.color3ComboBox.setEnabled(false);
        }else{
            this.player3Lbl.setVisible(true);
            this.player3Lbl.setEnabled(true);
            this.selectPlayer3Lbl.setVisible(true);
            this.selectPlayer3Lbl.setEnabled(true);
            this.selectPlayer3ComboBox.setVisible(true);
            this.selectPlayer3ComboBox.setEnabled(true);
            this.color3Lbl.setVisible(true);
            this.color3Lbl.setEnabled(true);
            this.color3ComboBox.setVisible(true);
            this.color3ComboBox.setEnabled(true);
        }
        if(this.players<4){
            this.player4Lbl.setVisible(false);
            this.player4Lbl.setEnabled(false);
            this.selectPlayer4Lbl.setVisible(false);
            this.selectPlayer4Lbl.setEnabled(false);
            this.selectPlayer4ComboBox.setVisible(false);
            this.selectPlayer4ComboBox.setEnabled(false);
            this.color4Lbl.setVisible(false);
            this.color4Lbl.setEnabled(false);
            this.color4ComboBox.setVisible(false);
            this.color4ComboBox.setEnabled(false);
        }else{
            this.player4Lbl.setVisible(true);
            this.player4Lbl.setEnabled(true);
            this.selectPlayer4Lbl.setVisible(true);
            this.selectPlayer4Lbl.setEnabled(true);
            this.selectPlayer4ComboBox.setVisible(true);
            this.selectPlayer4ComboBox.setEnabled(true);
            this.color4Lbl.setVisible(true);
            this.color4Lbl.setEnabled(true);
            this.color4ComboBox.setVisible(true);
            this.color4ComboBox.setEnabled(true);
        }
        if(this.players<5){
            this.player5Lbl.setVisible(false);
            this.player5Lbl.setEnabled(false);
            this.selectPlayer5Lbl.setVisible(false);
            this.selectPlayer5Lbl.setEnabled(false);
            this.selectPlayer5ComboBox.setVisible(false);
            this.selectPlayer5ComboBox.setEnabled(false);
            this.color5Lbl.setVisible(false);
            this.color5Lbl.setEnabled(false);
            this.color5ComboBox.setVisible(false);
            this.color5ComboBox.setEnabled(false);
        }else{
             this.player5Lbl.setVisible(true);
            this.player5Lbl.setEnabled(true);
            this.selectPlayer5Lbl.setVisible(true);
            this.selectPlayer5Lbl.setEnabled(true);
            this.selectPlayer5ComboBox.setVisible(true);
            this.selectPlayer5ComboBox.setEnabled(true);
            this.color5Lbl.setVisible(true);
            this.color5Lbl.setEnabled(true);
            this.color5ComboBox.setVisible(true);
            this.color5ComboBox.setEnabled(true);
        }
        if(this.players<6){
            this.player6Lbl.setVisible(false);
            this.player6Lbl.setEnabled(false);
            this.selectPlayer6Lbl.setVisible(false);
            this.selectPlayer6Lbl.setEnabled(false);
            this.selectPlayer6ComboBox.setVisible(false);
            this.selectPlayer6ComboBox.setEnabled(false);
            this.color6Lbl.setVisible(false);
            this.color6Lbl.setEnabled(false);
            this.color6ComboBox.setVisible(false);
            this.color6ComboBox.setEnabled(false);
        }else{
            this.player6Lbl.setVisible(true);
            this.player6Lbl.setEnabled(true);
            this.selectPlayer6Lbl.setVisible(true);
            this.selectPlayer6Lbl.setEnabled(true);
            this.selectPlayer6ComboBox.setVisible(true);
            this.selectPlayer6ComboBox.setEnabled(true);
            this.color6Lbl.setVisible(true);
            this.color6Lbl.setEnabled(true);
            this.color6ComboBox.setVisible(true);
            this.color6ComboBox.setEnabled(true);
        }
        if(this.players<7){
            this.player7Lbl.setVisible(false);
            this.player7Lbl.setEnabled(false);
            this.selectPlayer7Lbl.setVisible(false);
            this.selectPlayer7Lbl.setEnabled(false);
            this.selectPlayer7ComboBox.setVisible(false);
            this.selectPlayer7ComboBox.setEnabled(false);
            this.color7Lbl.setVisible(false);
            this.color7Lbl.setEnabled(false);
            this.color7ComboBox.setVisible(false);
            this.color7ComboBox.setEnabled(false);
        }else{
            this.player7Lbl.setVisible(true);
            this.player7Lbl.setEnabled(true);
            this.selectPlayer7Lbl.setVisible(true);
            this.selectPlayer7Lbl.setEnabled(true);
            this.selectPlayer7ComboBox.setVisible(true);
            this.selectPlayer7ComboBox.setEnabled(true);
            this.color7Lbl.setVisible(true);
            this.color7Lbl.setEnabled(true);
            this.color7ComboBox.setVisible(true);
            this.color7ComboBox.setEnabled(true);
        }
        if(this.players<8){
            this.player8Lbl.setVisible(false);
            this.player8Lbl.setEnabled(false);
            this.selectPlayer8Lbl.setVisible(false);
            this.selectPlayer8Lbl.setEnabled(false);
            this.selectPlayer8ComboBox.setVisible(false);
            this.selectPlayer8ComboBox.setEnabled(false);
            this.color8Lbl.setVisible(false);
            this.color8Lbl.setEnabled(false);
            this.color8ComboBox.setVisible(false);
            this.color8ComboBox.setEnabled(false);
        }else{
            this.player8Lbl.setVisible(true);
            this.player8Lbl.setEnabled(true);
            this.selectPlayer8Lbl.setVisible(true);
            this.selectPlayer8Lbl.setEnabled(true);
            this.selectPlayer8ComboBox.setVisible(true);
            this.selectPlayer8ComboBox.setEnabled(true);
            this.color8Lbl.setVisible(true);
            this.color8Lbl.setEnabled(true);
            this.color8ComboBox.setVisible(true);
            this.color8ComboBox.setEnabled(true);
        }
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
    
    public boolean isEmpty(String aString){
        boolean returnVal = false;
        if(aString.trim().equals("") || aString.equals(null))
            returnVal=true;
        return returnVal;
    }

    public void saveImage(File f, String fileName) {
        int width = 963;    //width of the image
        int height = 640;   //height of the image
        BufferedImage image = null;

        try {
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(f);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error leyendo archivo", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        try {
            f = new File("build/classes/images/" + fileName + ".jpg");  //output file path
            ImageIO.write(image, "jpg", f);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error guardando imagen", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarJugador;
    private javax.swing.JButton btnConfigurarPartida;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnRanking;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarJugador;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirRanking;
    private javax.swing.JButton btnUploadFile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> color1ComboBox;
    private javax.swing.JLabel color1Lbl;
    private javax.swing.JComboBox<String> color2ComboBox;
    private javax.swing.JLabel color2Lbl;
    private javax.swing.JComboBox<String> color3ComboBox;
    private javax.swing.JLabel color3Lbl;
    private javax.swing.JComboBox<String> color4ComboBox;
    private javax.swing.JLabel color4Lbl;
    private javax.swing.JComboBox<String> color5ComboBox;
    private javax.swing.JLabel color5Lbl;
    private javax.swing.JComboBox<String> color6ComboBox;
    private javax.swing.JLabel color6Lbl;
    private javax.swing.JComboBox<String> color7ComboBox;
    private javax.swing.JLabel color7Lbl;
    private javax.swing.JComboBox<String> color8ComboBox;
    private javax.swing.JLabel color8Lbl;
    private javax.swing.JLabel configurarLbl;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRankingJugadores;
    private javax.swing.JLabel lblRegistrado;
    private javax.swing.JLabel lblRegistrarJugador;
    private javax.swing.JList lstJugadores1;
    private javax.swing.JComboBox<String> nrComboBox;
    private javax.swing.JLabel nrLabel;
    private javax.swing.JPanel panelConfigurarPartida;
    private javax.swing.JPanel panelMenuPrincipal;
    private javax.swing.JPanel panelRanking;
    private javax.swing.JPanel panelRegistrarJugador;
    private javax.swing.JLabel pathLbl;
    private javax.swing.JLabel player1Lbl;
    private javax.swing.JLabel player2Lbl;
    private javax.swing.JLabel player3Lbl;
    private javax.swing.JLabel player4Lbl;
    private javax.swing.JLabel player5Lbl;
    private javax.swing.JLabel player6Lbl;
    private javax.swing.JLabel player7Lbl;
    private javax.swing.JLabel player8Lbl;
    private javax.swing.JLabel playerImgLbl;
    private javax.swing.JComboBox<String> selectPlayer1ComboBox;
    private javax.swing.JLabel selectPlayer1Lbl;
    private javax.swing.JComboBox<String> selectPlayer2ComboBox;
    private javax.swing.JLabel selectPlayer2Lbl;
    private javax.swing.JComboBox<String> selectPlayer3ComboBox;
    private javax.swing.JLabel selectPlayer3Lbl;
    private javax.swing.JComboBox<String> selectPlayer4ComboBox;
    private javax.swing.JLabel selectPlayer4Lbl;
    private javax.swing.JComboBox<String> selectPlayer5ComboBox;
    private javax.swing.JLabel selectPlayer5Lbl;
    private javax.swing.JComboBox<String> selectPlayer6ComboBox;
    private javax.swing.JLabel selectPlayer6Lbl;
    private javax.swing.JComboBox<String> selectPlayer7ComboBox;
    private javax.swing.JLabel selectPlayer7Lbl;
    private javax.swing.JComboBox<String> selectPlayer8ComboBox;
    private javax.swing.JLabel selectPlayer8Lbl;
    private javax.swing.JButton setBtn;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void setIcon(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
