package edu.ncsu.monopoly.gui;

import javax.swing.JOptionPane;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import edu.ncsu.monopoly.*;
import edu.ncsu.monopoly.test.boardScenarios.GameBoardFull;
import persistencia.Persistencia;

public class Main {

    private static int inputNumberOfPlayers(MainWindow window) {
        int numPlayers = 0;
        while (numPlayers <= 0 || numPlayers > GameMaster.MAX_PLAYER) {
            String numberOfPlayers = JOptionPane.showInputDialog(window, "How many players");
            if (numberOfPlayers == null) {
                System.exit(0);
            }
            try {
                numPlayers = Integer.parseInt(numberOfPlayers);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(window, "Please input a number");
            }
            if (numPlayers <= 0 || numPlayers > GameMaster.MAX_PLAYER) {
                JOptionPane.showMessageDialog(window, "Please input a number between one and eight");
            } else {
                GameMaster.instance().setNumberOfPlayers(numPlayers);
            }
        }
        return numPlayers;
    }

    public static void main(String[] args) {

        Manager myManager = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("monopoly_data.dat"));
            myManager = (Manager) in.readObject();
        } catch (Exception e) {
            myManager = new Manager();
        }
        MainMenu mainMenu = new MainMenu(myManager);
        //MainMenu.setLocationRelativeTo(null);
        mainMenu.setVisible(true);

        /*
        GameMaster master = GameMaster.instance();
        MainWindow window = new MainWindow();
        GameBoard gameBoard = null;
        if (args.length > 0) {
            if (args[0].equals("test")) {
                master.setTestMode(true);
            }
            try {
                Class c = Class.forName(args[1]);
                gameBoard = (GameBoard) c.newInstance();
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(window, "Class Not Found.  Program will exit");
                System.exit(0);
            } catch (IllegalAccessException e) {
                JOptionPane.showMessageDialog(window, "Illegal Access of Class.  Program will exit");
                System.exit(0);
            } catch (InstantiationException e) {
                JOptionPane.showMessageDialog(window, "Class Cannot be Instantiated.  Program will exit");
                System.exit(0);
            }
        } else {
            gameBoard = new GameBoardFull();
        }

        master.setGameBoard(gameBoard);
        int numPlayers = inputNumberOfPlayers(window);
        for (int i = 0; i < numPlayers; i++) {
            String name
                    = JOptionPane.showInputDialog(window, "Please input name for Player " + (i + 1));
            GameMaster.instance().getPlayer(i).setName(name);
        }
        window.setupGameBoard(gameBoard);
        window.show();
        master.setGUI(window);
        master.startGame();
          */
    }

}
