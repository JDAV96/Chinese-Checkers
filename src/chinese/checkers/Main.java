/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chinese.checkers;
import java.awt.Color;
import java.io.*;

/**
 *
 * @author david
 */
public class Main {
    final static String FILE = "C:\\Users\\david\\Documents\\NetBeansProjects\\Chinese Checkers\\High.txt";
    static int[] HighScores = new int[10];
    static String[] Names = new String[10];
    static ChineseCheckers menu = new ChineseCheckers();
    static GameBoard board = new GameBoard();
    static HighScores scores = new HighScores();
    static End victory = new End();
    
public static void main(String[] args) {
    menu.setVisible(true);
}
    public static void SaveHS(int[] h, String[] n) {
        Names = n;
        HighScores = h;
        try { 
           PrintWriter p = new PrintWriter(FILE);
           for (int x = 0; x < 10; x++) {
                p.println(Names[x]);
                p.println(HighScores[x]);
           }
           p.close();
        }
        catch (Exception e) { e.printStackTrace();}
        read();
    }
    public static void NewGame() {
        board.InitializeBoard();
        board.setVisible(true);
        menu.setVisible(false);
    }
    
    public static void LoadGame() {
        board.LoadBoard();
        board.setVisible(true);
        menu.setVisible(false);
    }
    
    public static void DisplayScores() {
        read();
        scores.setVisible(true);
        scores.display();
    }
    
    public static void Menu() {
        board.setVisible(false);
        menu.setVisible(true);
    }
    
    public static void End(int x, int s, Color c) {
        read();
        victory.display(x, s, c);
        victory.setVisible(true);
        board.setVisible(false);
    }
    
    public static void read() {
        try {
            FileReader r = new FileReader(FILE);
            BufferedReader b = new BufferedReader(r);
            for (int x = 0; x < 10; x++) {
                Names[x] = b.readLine();
                HighScores[x] = Integer.parseInt(b.readLine());
            }
        } catch (Exception e){ e.printStackTrace();}
    }
    
    public static String[] getNames() {
        return Names;
    }
    
    public static int[] getScores() {
        return HighScores;
    }
}
