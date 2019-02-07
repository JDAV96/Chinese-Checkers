/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chinese.checkers;

import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author david
 */
public class GameBoard extends javax.swing.JFrame {
   HighScores scores = new HighScores();
   ArrayList<JButton> temp = new ArrayList<JButton>();
   final static String FILE = "C:\\Users\\david\\Documents\\NetBeansProjects\\Chinese Checkers\\Save.txt";
   static int count = 0;
   int I = 0;
   int J = 0;
   int total = 1;
    ArrayList<ArrayList<JButton>> Board = new ArrayList<>();
        ArrayList<JButton> Row1 = new ArrayList<>();
        ArrayList<JButton> Row2 = new ArrayList<>();
        ArrayList<JButton> Row3 = new ArrayList<>();
        ArrayList<JButton> Row4 = new ArrayList<>();
        ArrayList<JButton> Row5 = new ArrayList<>();
        ArrayList<JButton> Row6 = new ArrayList<>();
        ArrayList<JButton> Row7 = new ArrayList<>();
        ArrayList<JButton> Row8 = new ArrayList<>();
        ArrayList<JButton> Row9 = new ArrayList<>();
        ArrayList<JButton> Row10 = new ArrayList<>();
        ArrayList<JButton> Row11 = new ArrayList<>();
        ArrayList<JButton> Row12 = new ArrayList<>();
        ArrayList<JButton> Row13 = new ArrayList<>();
        ArrayList<JButton> Row14 = new ArrayList<>();
        ArrayList<JButton> Row15 = new ArrayList<>();
        ArrayList<JButton> Row16 = new ArrayList<>();
        ArrayList<JButton> Row17 = new ArrayList<>();
        Color Cyan = new Color(240, 240, 240);
        Color Green = new Color(0, 153, 0);
        Color Purple = new Color(51, 0 ,102);
        Color Blue = new Color(0, 0, 204);
        Color Orange = new Color(255, 128, 0);
        Color Red =  new Color(255, 0, 0);
        Color Yellow =  new Color(255, 255, 0);
        boolean state = false;
        static ArrayList<Color> turns = new ArrayList<>();
        boolean hop = false;
        ArrayList<JButton> GVictory = new ArrayList<>();
        ArrayList<JButton> PVictory = new ArrayList<>();
        ArrayList<JButton> BVictory = new ArrayList<>();
        ArrayList<JButton> OVictory = new ArrayList<>();
        ArrayList<JButton> RVictory = new ArrayList<>();
        ArrayList<JButton> YVictory = new ArrayList<>();
        static ArrayList<ArrayList<JButton>> Victories = new ArrayList<>();
        int Tcounter = 0;
     
    public GameBoard() {
        count = 0;
        Victories.add(OVictory);
        Victories.add(PVictory);
        Victories.add(RVictory);
        Victories.add(GVictory);
        Victories.add(BVictory);
        Victories.add(YVictory);
        turns.add(Orange);
        turns.add(Purple);
        turns.add(Red);
        turns.add(Green);
        turns.add(Blue);
        turns.add(Yellow);
        initComponents();
        
        OVictory.add(b121);
        OVictory.add(b119);
        OVictory.add(b120);
        OVictory.add(b116);
        OVictory.add(b117);
        OVictory.add(b118);
        OVictory.add(b112);
        OVictory.add(b113);
        OVictory.add(b114);
        OVictory.add(b115);
        
        PVictory.add(b99);
        PVictory.add(b87);
        PVictory.add(b100);
        PVictory.add(b76);
        PVictory.add(b88);
        PVictory.add(b101);
        PVictory.add(b66);
        PVictory.add(b77);
        PVictory.add(b89);
        PVictory.add(b102);
        
        RVictory.add(b11);
        RVictory.add(b12);
        RVictory.add(b24);
        RVictory.add(b13);
        RVictory.add(b25);
        RVictory.add(b36);
        RVictory.add(b14);
        RVictory.add(b26);
        RVictory.add(b37);
        RVictory.add(b47);
        
        GVictory.add(b1);
        GVictory.add(b2);
        GVictory.add(b3);
        GVictory.add(b4);
        GVictory.add(b5);
        GVictory.add(b6);
        GVictory.add(b7);
        GVictory.add(b8);
        GVictory.add(b9);
        GVictory.add(b10);
        
        BVictory.add(b23);
        BVictory.add(b22);
        BVictory.add(b35);
        BVictory.add(b21);
        BVictory.add(b34);
        BVictory.add(b46);
        BVictory.add(b20);
        BVictory.add(b33);
        BVictory.add(b45);
        BVictory.add(b56);
        
        YVictory.add(b111);
        YVictory.add(b110);
        YVictory.add(b98);
        YVictory.add(b109);
        YVictory.add(b97);
        YVictory.add(b86);
        YVictory.add(b108);
        YVictory.add(b96);
        YVictory.add(b85);
        YVictory.add(b75);
        
        Board.add(Row1);
        Board.add(Row2);
        Board.add(Row3);
        Board.add(Row4);
        Board.add(Row5);
        Board.add(Row6);
        Board.add(Row7);
        Board.add(Row8);
        Board.add(Row9);
        Board.add(Row10);
        Board.add(Row11);
        Board.add(Row12);
        Board.add(Row13);
        Board.add(Row14);
        Board.add(Row15);
        Board.add(Row16);
        Board.add(Row17);
        
        
        for (int i = 0; i < 6; i++) {
            Row1.add(null);
        }
        Row1.add(6, b121);
        for (int i = 7; i < 13; i++) {
            Row1.add(null);
        }
        
        for (int i = 0; i < 5; i++) {
            Row2.add(null);
        }
        Row2.add(5, b119);
        Row2.add(6, b120);
        for (int i = 7; i < 13; i++) {
            Row2.add(null);
        }
        
        for (int i = 0; i < 5; i++) {
            Row3.add(null);
        }
        temp.add(b116);
        temp.add(b117);
        temp.add(b118);
        for (int i = 5; i < 8; i++) {
            Row3.add(i, temp.get(count));
            count = count + 1;
        }
        for (int i = 8; i < 13; i++) {
            Row3.add(null);
        }
        clear();
        
        for (int i = 0; i < 4; i++) {
            Row4.add(null);
        }
        temp.add(b112);
        temp.add(b113);
        temp.add(b114);
        temp.add(b115);
        for (int i = 4; i < 8; i ++) {
            Row4.add(i, temp.get(count));
            count = count + 1;
        }
        for (int i = 8; i < 13; i++) {
            Row4.add(null);
        }
        clear();
        
        temp.add(b99);
        temp.add(b100);
        temp.add(b101);
        temp.add(b102);
        temp.add(b103);
        temp.add(b104);
        temp.add(b105);
        temp.add(b106);
        temp.add(b107);
        temp.add(b108);
        temp.add(b109);
        temp.add(b110);
        temp.add(b111);
        for (int i = 0; i < 13; i ++) {
            Row5.add(i, temp.get(count));
            count = count + 1;
        }
        clear();
        
        temp.add(b87);
        temp.add(b88);
        temp.add(b89);
        temp.add(b90);
        temp.add(b91);
        temp.add(b92);
        temp.add(b93);
        temp.add(b94);
        temp.add(b95);
        temp.add(b96);
        temp.add(b97);
        temp.add(b98);
        for (int i = 0; i < 12; i ++) {
            Row6.add(i, temp.get(count));
            count = count + 1;
        }
        Row6.add(null);
        clear();
        
        Row7.add(null);
        temp.add(b76);
        temp.add(b77);
        temp.add(b78);
        temp.add(b79);
        temp.add(b80);
        temp.add(b81);
        temp.add(b82);
        temp.add(b83);
        temp.add(b84);
        temp.add(b85);
        temp.add(b86);
        for(int i = 1; i < 12; i ++) {
            Row7.add(i, temp.get(count));
            count = count + 1;
        }
        Row7.add(null);
        clear();
        
        Row8.add(null);
        temp.add(b66);
        temp.add(b67);
        temp.add(b68);
        temp.add(b69);
        temp.add(b70);
        temp.add(b71);
        temp.add(b72);
        temp.add(b73);
        temp.add(b74);
        temp.add(b75);
        for(int i = 1; i < 11; i ++) {
            Row8.add(i, temp.get(count));
            count = count + 1;
        }
        Row8.add(null);
        Row8.add(null);
        clear();
        
        Row9.add(null);
        Row9.add(null);
        temp.add(b57);
        temp.add(b58);
        temp.add(b59);
        temp.add(b60);
        temp.add(b61);
        temp.add(b62);
        temp.add(b63);
        temp.add(b64);
        temp.add(b65);
        for(int i = 2; i < 11; i ++) {
            Row9.add(i, temp.get(count));
            count = count + 1;
        }
        Row9.add(null);
        Row9.add(null);
        clear();
        
        Row10.add(null);
        temp.add(b47);
        temp.add(b48);
        temp.add(b49);
        temp.add(b50);
        temp.add(b51);
        temp.add(b52);
        temp.add(b53);
        temp.add(b54);
        temp.add(b55);
        temp.add(b56);
        for(int i = 1; i < 11; i ++) {
            Row10.add(i, temp.get(count));
            count = count + 1;
        }
        Row10.add(null);
        Row10.add(null);
        clear();
        
        Row11.add(null);
        temp.add(b36);
        temp.add(b37);
        temp.add(b38);
        temp.add(b39);
        temp.add(b40);
        temp.add(b41);
        temp.add(b42);
        temp.add(b43);
        temp.add(b44);
        temp.add(b45);
        temp.add(b46);
        for(int i = 1; i < 12; i++) {
            Row11.add(i, temp.get(count));
            count = count + 1;
        }
        Row11.add(null);
        clear();
        
        temp.add(b24);
        temp.add(b25);
        temp.add(b26);
        temp.add(b27);
        temp.add(b28);
        temp.add(b29);
        temp.add(b30);
        temp.add(b31);
        temp.add(b32);
        temp.add(b33);
        temp.add(b34);
        temp.add(b35);
        for (int i = 0; i < 12; i++) {
            Row12.add(i, temp.get(count));
            count = count + 1;
        }
        Row12.add(null);
        clear();
        
        temp.add(b11);
        temp.add(b12);
        temp.add(b13);
        temp.add(b14);
        temp.add(b15);
        temp.add(b16);
        temp.add(b17);
        temp.add(b18);
        temp.add(b19);
        temp.add(b20);
        temp.add(b21);
        temp.add(b22);
        temp.add(b23);
        for (int i = 0; i < 13; i++) {
            Row13.add(i, temp.get(count));
            count = count + 1;
        }
        clear();
        
        for (int i = 0; i < 4; i++) {
            Row14.add(null);
        }
        temp.add(b7);
        temp.add(b8);
        temp.add(b9);
        temp.add(b10);
        for (int i = 4; i < 8; i++) {
            Row14.add(i, temp.get(count));
            count = count + 1;
        }
        for (int i = 8; i < 13; i++) {
            Row14.add(null);
        }
        clear();
        
        for(int i = 0; i < 5; i++) {
            Row15.add(null);
        }
        temp.add(b4);
        temp.add(b5);
        temp.add(b6);
        for (int i = 5; i < 8; i++) {
            Row15.add(i, temp.get(count));
            count = count + 1;
        }
        for (int i = 8; i < 13; i++) {
            Row15.add(null);
        }
        clear();
        
        for(int i = 0; i < 5; i++) {
            Row16.add(null);
        }
        Row16.add(5, b2);
        Row16.add(6, b3);
        for(int i = 7; i < 13; i++) {
            Row16.add(null);
        }
        
        for(int i = 0; i < 6; i++) {
            Row17.add(null);
        }
        Row17.add(6, b1);
        for(int i = 7; i < 13; i++) {
            Row17.add(null);
        }
        this.setSize(998,655);
    }
    
    private void clear() {
        temp.clear();
        count = 0;
    }
    
    public void InitializeBoard() { //Fills the board with the standard game arrangement
        DisplayTurn3.setBackground(Orange); //Displays the first player's (orange) turn.
        int disp = 4;
        int empty = 9 - Math.abs(disp);
        count = 0; 
        Color color1 = Blue;
        Color color2 = Red;
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 13; j++) {
                if ((Board.get(i).get(j) != null )&&(i >= 0)&&(i < 4)) {
                    Board.get(i).get(j).setBackground(Green);
                    Board.get(i).get(j).setVisible(true);
                } else if ((Board.get(i).get(j) != null )&&(i >= 13)&&(i < 17)) {
                    Board.get(i).get(j).setBackground(Orange);
                    Board.get(i).get(j).setVisible(true);
                } else if ((Board.get(i).get(j) != null )) {
                    if (count < Math.abs(disp)) {
                        count = count + 1;
                        Board.get(i).get(j).setBackground(color1);
                        Board.get(i).get(j).setVisible(true);
                    }
                       else if (count- 4 < empty) {
                            count = count + 1;
                            Board.get(i).get(j).setBackground(Cyan);
                            Board.get(i).get(j).setVisible(false);
                    } else {
                           Board.get(i).get(j).setBackground(color2);
                           Board.get(i).get(j).setVisible(true);
                       }
                }
            } if (i >= 4) {disp = disp - 1; clear();}
            if (disp == 0) {
                color1 = Yellow;
                color2 = Purple;
            }
        }
        Tcounter = 0; //resets the run counter
        DisplayTurn.setText("Turns Taken: " + Tcounter); //resets the turn counter display
        
    }
    
    public void LoadBoard() {
        String tempname = "";
        try {
            FileReader r = new FileReader(FILE);
            BufferedReader b = new BufferedReader(r);
            for (int i = 0; i < 17; i++) {
                for (int j = 0; j < 13; j++) {
                    if (Board.get(i).get(j) != null) {
                        tempname = b.readLine();
                        if (tempname.equals("Cyan")) {
                            Board.get(i).get(j).setBackground(Cyan);
                            Board.get(i).get(j).setVisible(false);
                        }if (tempname.equals("Orange")) {
                            Board.get(i).get(j).setBackground(Orange);
                            Board.get(i).get(j).setVisible(true);
                        }if (tempname.equals("Purple")) {
                            Board.get(i).get(j).setBackground(Purple);
                            Board.get(i).get(j).setVisible(true);
                        }if (tempname.equals("Red")) {
                            Board.get(i).get(j).setBackground(Red);
                            Board.get(i).get(j).setVisible(true);
                        }if (tempname.equals("Green")) {
                            Board.get(i).get(j).setBackground(Green);
                            Board.get(i).get(j).setVisible(true);
                        }if (tempname.equals("Blue")) {
                            Board.get(i).get(j).setBackground(Blue);
                            Board.get(i).get(j).setVisible(true);
                        }if (tempname.equals("Yellow")) {
                            Board.get(i).get(j).setBackground(Yellow);
                            Board.get(i).get(j).setVisible(true);
                        }
                    }
                }   
            } Tcounter = Integer.parseInt(b.readLine()); count = Integer.parseInt(b.readLine());
            DisplayTurn3.setBackground(turns.get(count)); 
            r.close(); DisplayTurn.setText("Turns Taken: " + Tcounter);
        } catch (Exception e){ e.printStackTrace();}
    }
    
    private void movement() {
        if (turns.get(count) == Board.get(I).get(J).getBackground()) { // Check if button clicked matches the current player's turn
        for (int n = I-1; n < (I + 2); n++) {
            for (int m = J-1; m < (J + 2); m++) {
                if ((n >= 0) && (n < 17) && (m >= 0) && (m < 13) && (I%2 == 0)) { //Check if button belongs to an even numbered row
                    if ((Board.get(n).get(m) != null) && ((m != (J + 1)) || (n == I))) { //Mapping available moves
                        if (hop == false) {
                        Board.get(n).get(m).setVisible(true);
                        }
                        if (Board.get(n).get(m).getBackground() != Cyan) { //extending moves for hops
                            int b = n;
                            int v = m;
                            if (n == I + 1) {
                                b = b+1;
                                if (m == J) {
                                    v = v + 1;
                                }
                            }
                            else if (n == I - 1) {
                                b = b-1;
                                if (m == J) {
                                    v = v + 1;
                                }
                            } else {
                                if (m == J - 1) {
                                    v = v - 1;
                                } else if (m == J + 1) {
                                    v = v + 1;
                                }
                            }
                            if ((b >= 0) && (b < 17) && (v >= 0) && (v < 13)) {
                                if (Board.get(b).get(v)!= null){
                                    Board.get(b).get(v).setVisible(true);
                                }
                            } 
                        }
                    }
                }
                else if ((n >= 0) && (n < 17) && (m >= 0) && (m < 13)) {
                    if ((Board.get(n).get(m) != null) && ((m != (J - 1)) || (n == I))) {
                        if (hop == false) {
                        Board.get(n).get(m).setVisible(true);
                        }
                        if (Board.get(n).get(m).getBackground() != Cyan) { //extending moves for hops
                            int b = n;
                            int v = m;
                            if (n == I + 1) {
                                b = b+1;
                                if (m == J) {
                                    v = v - 1;
                                }
                            }
                            else if (n == I - 1) {
                                b = b-1;
                                if (m == J) {
                                    v = v - 1;
                                }
                            } else {
                                if (m == J - 1) {
                                    v = v - 1;
                                } else if (m == J + 1) {
                                    v = v + 1;
                                }
                            }
                            if ((b >= 0) && (b < 17) && (v >= 0) && (v < 13)) {
                                if (Board.get(b).get(v)!= null){
                                    Board.get(b).get(v).setVisible(true);
                                }
                            } 
                        }
                    }
                }
            }
        }
    }
    }
    
    private void sweep() {
        for (int n = I-1; n < (I + 2); n++) {
            for (int m = J-1; m < (J + 2); m++) {
                if ((n >= 0) && (n < 17) && (m >= 0) && (m < 13) && (I%2 == 0)) {
                    if ((Board.get(n).get(m) != null) && ((m != (J + 1)) || (n == I))) {
                        if (Board.get(n).get(m).getBackground() == Cyan) {
                            Board.get(n).get(m).setVisible(false);
                        }
                        if (Board.get(n).get(m).getBackground() != Cyan) {
                            int b = n;
                            int v = m;
                            if (n == I + 1) {
                                b = b+1;
                                if (m == J) {
                                    v = v + 1;
                                }
                            }
                            else if (n == I - 1) {
                                b = b-1;
                                if (m == J) {
                                    v = v + 1;
                                }
                            } else {
                                if (m == J - 1) {
                                    v = v - 1;
                                } else if (m == J + 1) {
                                    v = v + 1;
                                }
                            }
                            if ((b >= 0) && (b < 17) && (v >= 0) && (v < 13)) {
                                if (Board.get(b).get(v)!= null && Board.get(b).get(v).getBackground() == Cyan){
                                    Board.get(b).get(v).setVisible(false);
                                }
                            }
                        } 
                    }
                }
                else if ((n >= 0) && (n < 17) && (m >= 0) && (m < 13)) {
                    if ((Board.get(n).get(m) != null) && ((m != (J - 1)) || (n == I))) {
                        if (Board.get(n).get(m).getBackground() == Cyan) {
                        Board.get(n).get(m).setVisible(false);
                        }
                        if (Board.get(n).get(m).getBackground() != Cyan) {
                            int b = n;
                            int v = m;
                            if (n == I + 1) {
                                b = b+1;
                                if (m == J) {
                                    v = v - 1;
                                }
                            }
                            else if (n == I - 1) {
                                b = b-1;
                                if (m == J) {
                                    v = v - 1;
                                }
                            } else {
                                if (m == J - 1) {
                                    v = v - 1;
                                } else if (m == J + 1) {
                                    v = v + 1;
                                }
                            }
                            if ((b >= 0) && (b < 17) && (v >= 0) && (v < 13)) {
                                if (Board.get(b).get(v)!= null && Board.get(b).get(v).getBackground() == Cyan){
                                    Board.get(b).get(v).setVisible(false);
                                }
                            }
                        }
                    }
                }
            }    
        }
    }
    
    private void moved(int p, int b) {
        Board.get(p).get(b).setBackground(Board.get(I).get(J).getBackground());
        Board.get(I).get(J).setBackground(Cyan);
        Board.get(I).get(J).setVisible(false);
        boolean check = false;
        for (int n = I-1; n < (I + 2); n++) {
            for (int m = J-1; m < (J + 2); m++) {
                if (n == p && m == b) { //Check if single movement
                    check = true;
                    sweep();
                    nextTurn();
                }
            }
        }
        if (check == false) { //Case if it hops
            sweep();
            I = p;
            J = b;
            hop = true;
            movement();
        }
        
    }
    
    private void nextTurn() {
        boolean win = true;
        for (int x = 0; x < 10; x++) {
            if (Victories.get(count).get(x).getBackground() != turns.get(count)) {
                win = false;
            }
        } 
        if (win == false) {
            count = count + 1;
            if (count == 6) {
                count = 0;
            } if (count == 1) {
                Tcounter = Tcounter + 1;
                DisplayTurn.setText("Turns Taken: " + Tcounter);
            } DisplayTurn3.setBackground(turns.get(count));
        }
        if (win == true) {
            Main.End(count, Tcounter, turns.get(count));
        }
    }
    
    private void action(int i, int j) {
        if ((I == i && J == j) && hop == true) { //Hop Ending
            sweep();
            nextTurn();
            hop = false;
        }
        if ((state == false || Board.get(i).get(j).getBackground() != Cyan) && (hop == false)) {//Start
            sweep();
            I = i;
            J = j;
            movement();
            state = true;
        } if (state == true && Board.get(i).get(j).getBackground() == Cyan) {//Movement
            moved(i,j);
            if (hop == false){
            state = false;
            }
        } 
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        b2 = new javax.swing.JButton();
        b121 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        b28 = new javax.swing.JButton();
        b29 = new javax.swing.JButton();
        b30 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        b34 = new javax.swing.JButton();
        b35 = new javax.swing.JButton();
        b36 = new javax.swing.JButton();
        b37 = new javax.swing.JButton();
        b38 = new javax.swing.JButton();
        b39 = new javax.swing.JButton();
        b40 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b42 = new javax.swing.JButton();
        b43 = new javax.swing.JButton();
        b44 = new javax.swing.JButton();
        b45 = new javax.swing.JButton();
        b46 = new javax.swing.JButton();
        b47 = new javax.swing.JButton();
        b48 = new javax.swing.JButton();
        b49 = new javax.swing.JButton();
        b50 = new javax.swing.JButton();
        b51 = new javax.swing.JButton();
        b52 = new javax.swing.JButton();
        b53 = new javax.swing.JButton();
        b54 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b56 = new javax.swing.JButton();
        b57 = new javax.swing.JButton();
        b58 = new javax.swing.JButton();
        b59 = new javax.swing.JButton();
        b60 = new javax.swing.JButton();
        b61 = new javax.swing.JButton();
        b62 = new javax.swing.JButton();
        b63 = new javax.swing.JButton();
        b64 = new javax.swing.JButton();
        b65 = new javax.swing.JButton();
        b66 = new javax.swing.JButton();
        b67 = new javax.swing.JButton();
        b68 = new javax.swing.JButton();
        b69 = new javax.swing.JButton();
        b70 = new javax.swing.JButton();
        b71 = new javax.swing.JButton();
        b72 = new javax.swing.JButton();
        b73 = new javax.swing.JButton();
        b74 = new javax.swing.JButton();
        b75 = new javax.swing.JButton();
        b76 = new javax.swing.JButton();
        b77 = new javax.swing.JButton();
        b78 = new javax.swing.JButton();
        b41 = new javax.swing.JButton();
        b80 = new javax.swing.JButton();
        b81 = new javax.swing.JButton();
        b82 = new javax.swing.JButton();
        b83 = new javax.swing.JButton();
        b84 = new javax.swing.JButton();
        b85 = new javax.swing.JButton();
        b86 = new javax.swing.JButton();
        b87 = new javax.swing.JButton();
        b88 = new javax.swing.JButton();
        b89 = new javax.swing.JButton();
        b90 = new javax.swing.JButton();
        b91 = new javax.swing.JButton();
        b92 = new javax.swing.JButton();
        b93 = new javax.swing.JButton();
        b94 = new javax.swing.JButton();
        b95 = new javax.swing.JButton();
        b96 = new javax.swing.JButton();
        b97 = new javax.swing.JButton();
        b98 = new javax.swing.JButton();
        b99 = new javax.swing.JButton();
        b55 = new javax.swing.JButton();
        b101 = new javax.swing.JButton();
        b102 = new javax.swing.JButton();
        b103 = new javax.swing.JButton();
        b104 = new javax.swing.JButton();
        b105 = new javax.swing.JButton();
        b106 = new javax.swing.JButton();
        b107 = new javax.swing.JButton();
        b108 = new javax.swing.JButton();
        b109 = new javax.swing.JButton();
        b110 = new javax.swing.JButton();
        b111 = new javax.swing.JButton();
        b112 = new javax.swing.JButton();
        b79 = new javax.swing.JButton();
        b114 = new javax.swing.JButton();
        b115 = new javax.swing.JButton();
        b116 = new javax.swing.JButton();
        b117 = new javax.swing.JButton();
        b118 = new javax.swing.JButton();
        b119 = new javax.swing.JButton();
        b120 = new javax.swing.JButton();
        b100 = new javax.swing.JButton();
        b113 = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        DisplayTurn = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        DisplayTurn2 = new javax.swing.JLabel();
        DisplayTurn3 = new javax.swing.JButton();
        Restart = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b2);
        b2.setBounds(430, 530, 50, 20);

        b121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b121ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b121);
        b121.setBounds(470, 30, 50, 20);

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b4);
        b4.setBounds(400, 500, 50, 20);

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b5);
        b5.setBounds(470, 500, 50, 20);

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b6);
        b6.setBounds(540, 500, 50, 20);

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b7);
        b7.setBounds(360, 460, 50, 20);

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b1);
        b1.setBounds(470, 560, 50, 20);

        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b9);
        b9.setBounds(500, 460, 50, 20);

        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b10);
        b10.setBounds(580, 460, 50, 20);

        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b11);
        b11.setBounds(40, 430, 50, 20);

        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b12);
        b12.setBounds(110, 430, 50, 20);

        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b13);
        b13.setBounds(180, 430, 50, 20);

        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b14);
        b14.setBounds(250, 430, 50, 20);

        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b15);
        b15.setBounds(320, 430, 50, 20);

        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b16);
        b16.setBounds(390, 430, 50, 20);

        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b17);
        b17.setBounds(470, 430, 50, 20);

        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b18);
        b18.setBounds(540, 430, 50, 20);

        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b19);
        b19.setBounds(610, 430, 50, 20);

        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b20);
        b20.setBounds(680, 430, 50, 20);

        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b21);
        b21.setBounds(750, 430, 50, 20);

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b3);
        b3.setBounds(500, 530, 50, 20);

        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b23);
        b23.setBounds(890, 430, 50, 20);

        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b24);
        b24.setBounds(70, 400, 50, 20);

        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b25);
        b25.setBounds(150, 400, 50, 20);

        b26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b26ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b26);
        b26.setBounds(220, 400, 50, 20);

        b27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b27ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b27);
        b27.setBounds(290, 400, 50, 20);

        b28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b28ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b28);
        b28.setBounds(360, 400, 50, 20);

        b29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b29ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b29);
        b29.setBounds(430, 400, 50, 20);

        b30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b30ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b30);
        b30.setBounds(500, 400, 50, 20);

        b31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b31ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b31);
        b31.setBounds(570, 400, 50, 20);

        b32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b32ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b32);
        b32.setBounds(650, 400, 50, 20);

        b33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b33ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b33);
        b33.setBounds(720, 400, 50, 20);

        b34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b34ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b34);
        b34.setBounds(790, 400, 50, 20);

        b35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b35ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b35);
        b35.setBounds(860, 400, 50, 20);

        b36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b36ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b36);
        b36.setBounds(110, 360, 50, 20);

        b37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b37ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b37);
        b37.setBounds(180, 360, 50, 20);

        b38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b38ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b38);
        b38.setBounds(250, 360, 50, 20);

        b39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b39ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b39);
        b39.setBounds(320, 360, 50, 20);

        b40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b40ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b40);
        b40.setBounds(400, 360, 50, 20);

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b8);
        b8.setBounds(430, 460, 50, 20);

        b42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b42ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b42);
        b42.setBounds(540, 360, 50, 20);

        b43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b43ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b43);
        b43.setBounds(610, 360, 50, 20);

        b44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b44ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b44);
        b44.setBounds(680, 360, 50, 20);

        b45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b45ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b45);
        b45.setBounds(750, 360, 50, 20);

        b46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b46ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b46);
        b46.setBounds(820, 360, 50, 20);

        b47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b47ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b47);
        b47.setBounds(150, 330, 50, 20);

        b48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b48ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b48);
        b48.setBounds(220, 330, 50, 20);

        b49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b49ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b49);
        b49.setBounds(290, 330, 50, 20);

        b50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b50ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b50);
        b50.setBounds(360, 330, 50, 20);

        b51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b51ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b51);
        b51.setBounds(430, 330, 50, 20);

        b52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b52ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b52);
        b52.setBounds(500, 330, 50, 20);

        b53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b53ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b53);
        b53.setBounds(570, 330, 50, 20);

        b54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b54ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b54);
        b54.setBounds(640, 330, 50, 20);

        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b22);
        b22.setBounds(820, 430, 50, 20);

        b56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b56ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b56);
        b56.setBounds(790, 330, 50, 20);

        b57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b57ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b57);
        b57.setBounds(180, 300, 50, 20);

        b58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b58ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b58);
        b58.setBounds(250, 300, 50, 20);

        b59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b59ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b59);
        b59.setBounds(320, 300, 50, 20);

        b60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b60ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b60);
        b60.setBounds(400, 300, 50, 20);

        b61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b61ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b61);
        b61.setBounds(470, 300, 50, 20);

        b62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b62ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b62);
        b62.setBounds(540, 300, 50, 20);

        b63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b63ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b63);
        b63.setBounds(610, 300, 50, 20);

        b64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b64ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b64);
        b64.setBounds(680, 300, 50, 20);

        b65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b65ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b65);
        b65.setBounds(750, 300, 50, 20);

        b66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b66ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b66);
        b66.setBounds(140, 260, 50, 20);

        b67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b67ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b67);
        b67.setBounds(220, 260, 50, 20);

        b68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b68ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b68);
        b68.setBounds(290, 260, 50, 20);

        b69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b69ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b69);
        b69.setBounds(360, 260, 50, 20);

        b70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b70ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b70);
        b70.setBounds(430, 260, 50, 20);

        b71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b71ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b71);
        b71.setBounds(500, 260, 50, 20);

        b72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b72ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b72);
        b72.setBounds(570, 260, 50, 20);

        b73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b73ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b73);
        b73.setBounds(650, 260, 50, 20);

        b74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b74ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b74);
        b74.setBounds(720, 260, 50, 20);

        b75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b75ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b75);
        b75.setBounds(790, 260, 50, 20);

        b76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b76ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b76);
        b76.setBounds(110, 230, 50, 20);

        b77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b77ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b77);
        b77.setBounds(180, 230, 50, 20);

        b78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b78ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b78);
        b78.setBounds(250, 230, 50, 20);

        b41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b41ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b41);
        b41.setBounds(470, 360, 50, 20);

        b80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b80ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b80);
        b80.setBounds(390, 230, 50, 20);

        b81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b81ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b81);
        b81.setBounds(470, 230, 50, 20);

        b82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b82ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b82);
        b82.setBounds(540, 230, 50, 20);

        b83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b83ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b83);
        b83.setBounds(610, 230, 50, 20);

        b84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b84ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b84);
        b84.setBounds(680, 230, 50, 20);

        b85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b85ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b85);
        b85.setBounds(750, 230, 50, 20);

        b86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b86ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b86);
        b86.setBounds(830, 230, 50, 20);

        b87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b87ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b87);
        b87.setBounds(70, 200, 50, 20);

        b88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b88ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b88);
        b88.setBounds(140, 200, 50, 20);

        b89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b89ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b89);
        b89.setBounds(220, 200, 50, 20);

        b90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b90ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b90);
        b90.setBounds(290, 200, 50, 20);

        b91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b91ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b91);
        b91.setBounds(360, 200, 50, 20);

        b92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b92ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b92);
        b92.setBounds(430, 200, 50, 20);

        b93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b93ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b93);
        b93.setBounds(500, 200, 50, 20);

        b94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b94ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b94);
        b94.setBounds(580, 200, 50, 20);

        b95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b95ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b95);
        b95.setBounds(650, 200, 50, 20);

        b96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b96ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b96);
        b96.setBounds(720, 200, 50, 20);

        b97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b97ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b97);
        b97.setBounds(790, 200, 50, 20);

        b98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b98ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b98);
        b98.setBounds(860, 200, 50, 20);

        b99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b99ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b99);
        b99.setBounds(40, 160, 50, 20);

        b55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b55ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b55);
        b55.setBounds(720, 330, 50, 20);

        b101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b101ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b101);
        b101.setBounds(180, 160, 50, 20);

        b102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b102ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b102);
        b102.setBounds(250, 160, 50, 20);

        b103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b103ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b103);
        b103.setBounds(320, 160, 50, 20);

        b104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b104ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b104);
        b104.setBounds(390, 160, 50, 20);

        b105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b105ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b105);
        b105.setBounds(470, 160, 50, 20);

        b106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b106ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b106);
        b106.setBounds(540, 160, 50, 20);

        b107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b107ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b107);
        b107.setBounds(610, 160, 50, 20);

        b108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b108ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b108);
        b108.setBounds(680, 160, 50, 20);

        b109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b109ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b109);
        b109.setBounds(750, 160, 50, 20);

        b110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b110ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b110);
        b110.setBounds(820, 160, 50, 20);

        b111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b111ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b111);
        b111.setBounds(900, 160, 50, 20);

        b112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b112ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b112);
        b112.setBounds(360, 130, 50, 20);

        b79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b79ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b79);
        b79.setBounds(320, 230, 50, 20);

        b114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b114ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b114);
        b114.setBounds(500, 130, 50, 20);

        b115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b115ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b115);
        b115.setBounds(580, 130, 50, 20);

        b116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b116ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b116);
        b116.setBounds(390, 100, 50, 20);

        b117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b117ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b117);
        b117.setBounds(470, 100, 50, 20);

        b118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b118ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b118);
        b118.setBounds(540, 100, 50, 20);

        b119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b119ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b119);
        b119.setBounds(430, 60, 50, 20);

        b120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b120ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b120);
        b120.setBounds(500, 60, 50, 20);

        b100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b100ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b100);
        b100.setBounds(110, 160, 50, 20);

        b113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b113ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(b113);
        b113.setBounds(430, 130, 50, 20);

        SaveButton.setBackground(new java.awt.Color(108, 0, 0));
        SaveButton.setFont(new java.awt.Font("Script MT Bold", 3, 36)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(153, 153, 153));
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(SaveButton);
        SaveButton.setBounds(700, 40, 180, 80);

        DisplayTurn.setBackground(new java.awt.Color(108, 0, 0));
        DisplayTurn.setFont(new java.awt.Font("Script MT Bold", 3, 24)); // NOI18N
        DisplayTurn.setText("Tcounter");
        jLayeredPane1.add(DisplayTurn);
        DisplayTurn.setBounds(30, 0, 220, 80);

        BackButton.setBackground(new java.awt.Color(108, 0, 0));
        BackButton.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(153, 153, 153));
        BackButton.setText("Main Menu");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(BackButton);
        BackButton.setBounds(10, 80, 150, 50);

        ExitButton.setBackground(new java.awt.Color(108, 0, 0));
        ExitButton.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(153, 153, 153));
        ExitButton.setText("Exit Game");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(ExitButton);
        ExitButton.setBounds(170, 80, 150, 50);

        DisplayTurn2.setBackground(new java.awt.Color(108, 0, 0));
        DisplayTurn2.setFont(new java.awt.Font("Script MT Bold", 3, 24)); // NOI18N
        DisplayTurn2.setText("Current Turn: ");
        jLayeredPane1.add(DisplayTurn2);
        DisplayTurn2.setBounds(30, 520, 160, 80);
        jLayeredPane1.add(DisplayTurn3);
        DisplayTurn3.setBounds(200, 540, 140, 50);

        Restart.setBackground(new java.awt.Color(108, 0, 0));
        Restart.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        Restart.setForeground(new java.awt.Color(153, 153, 153));
        Restart.setText("Restart");
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Restart);
        Restart.setBounds(110, 480, 150, 50);

        jButton1.setBackground(new java.awt.Color(108, 0, 0));
        jButton1.setFont(new java.awt.Font("Script MT Bold", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 153));
        jButton1.setText("High Scores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(690, 510, 160, 60);

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\david\\Documents\\NetBeansProjects\\Chinese Checkers\\Board.gif")); // NOI18N
        jLayeredPane1.add(background);
        background.setBounds(0, 0, 980, 617);

        getContentPane().add(jLayeredPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b119ActionPerformed
        int i = 1;
        int j = 5;
        action(i,j);// TODO add your handling code here:
    }//GEN-LAST:event_b119ActionPerformed

    private void b120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b120ActionPerformed
        int i = 1;
        int j = 6;
        action(i,j);     // TODO add your handling code here:
    }//GEN-LAST:event_b120ActionPerformed

    private void b116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b116ActionPerformed
        int i = 2;
        int j = 5;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b116ActionPerformed

    private void b117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b117ActionPerformed
        int i = 2;
        int j = 6;
        action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b117ActionPerformed

    private void b118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b118ActionPerformed
        int i = 2;
        int j = 7;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b118ActionPerformed

    private void b112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b112ActionPerformed
        int i = 3;
        int j = 4;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b112ActionPerformed

    private void b113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b113ActionPerformed
        int i = 3;
        int j = 5;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b113ActionPerformed

    private void b114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b114ActionPerformed
        int i = 3;
        int j = 6;
        action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b114ActionPerformed

    private void b121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b121ActionPerformed
        int i = 0;
        int j = 6;
        action(i,j);
    }//GEN-LAST:event_b121ActionPerformed

    private void b115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b115ActionPerformed
        int i = 3;
        int j = 7;
        action(i,j);          // TODO add your handling code here:
    }//GEN-LAST:event_b115ActionPerformed

    private void b99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b99ActionPerformed
        int i = 4;
        int j = 0;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b99ActionPerformed

    private void b100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b100ActionPerformed
        int i = 4;
        int j = 1;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b100ActionPerformed

    private void b101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b101ActionPerformed
        int i = 4;
        int j = 2;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b101ActionPerformed

    private void b102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b102ActionPerformed
        int i = 4;
        int j = 3;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b102ActionPerformed

    private void b103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b103ActionPerformed
        int i = 4;
        int j = 4;
        action(i,j);// TODO add your handling code here:
    }//GEN-LAST:event_b103ActionPerformed

    private void b104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b104ActionPerformed
        int i = 4;
        int j = 5;
        action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b104ActionPerformed

    private void b105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b105ActionPerformed
        int i = 4;
        int j = 6;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b105ActionPerformed

    private void b106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b106ActionPerformed
        int i = 4;
        int j = 7;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b106ActionPerformed

    private void b107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b107ActionPerformed
        int i = 4;
        int j = 8;
        action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b107ActionPerformed

    private void b108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b108ActionPerformed
        int i = 4;
        int j = 9;
        action(i,j);  // TODO add your handling code here:
    }//GEN-LAST:event_b108ActionPerformed

    private void b109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b109ActionPerformed
        int i = 4;
        int j = 10;
        action(i,j);   // TODO add your handling code here:
    }//GEN-LAST:event_b109ActionPerformed

    private void b110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b110ActionPerformed
        int i = 4;
        int j = 11;
        action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b110ActionPerformed

    private void b111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b111ActionPerformed
        int i = 4;
        int j = 12;
       action(i,j);  // TODO add your handling code here:
    }//GEN-LAST:event_b111ActionPerformed

    private void b92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b92ActionPerformed
        int i = 5;
        int j = 5;
        action(i,j);              // TODO add your handling code here:
    }//GEN-LAST:event_b92ActionPerformed

    private void b87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b87ActionPerformed
        int i = 5;
        int j = 0;
        action(i,j); // TODO add your handling code here:
    }//GEN-LAST:event_b87ActionPerformed

    private void b88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b88ActionPerformed
        int i = 5;
        int j = 1;
       action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b88ActionPerformed

    private void b89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b89ActionPerformed
        int i = 5;
        int j = 2;
       action(i,j);   // TODO add your handling code here:
    }//GEN-LAST:event_b89ActionPerformed

    private void b90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b90ActionPerformed
        int i = 5;
        int j = 3;
      action(i,j);   // TODO add your handling code here:
    }//GEN-LAST:event_b90ActionPerformed

    private void b91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b91ActionPerformed
        int i = 5;
        int j = 4;
      action(i,j);  // TODO add your handling code here:
    }//GEN-LAST:event_b91ActionPerformed

    private void b93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b93ActionPerformed
        int i = 5;
        int j = 6;
        action(i,j);  // TODO add your handling code here:
    }//GEN-LAST:event_b93ActionPerformed

    private void b94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b94ActionPerformed
        int i = 5;
        int j = 7;
        action(i,j);      // TODO add your handling code here:
    }//GEN-LAST:event_b94ActionPerformed

    private void b95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b95ActionPerformed
        int i = 5;
        int j = 8;
        action(i,j);     // TODO add your handling code here:
    }//GEN-LAST:event_b95ActionPerformed

    private void b96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b96ActionPerformed
        int i = 5;
        int j = 9;
       action(i,j);     // TODO add your handling code here:
    }//GEN-LAST:event_b96ActionPerformed

    private void b97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b97ActionPerformed
        int i = 5;
        int j = 10;
        action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b97ActionPerformed

    private void b98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b98ActionPerformed
        int i = 5;
        int j = 11;
       action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b98ActionPerformed

    private void b76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b76ActionPerformed
        int i = 6;
        int j = 1;
        action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b76ActionPerformed

    private void b77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b77ActionPerformed
        int i = 6;
        int j = 2;
       action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b77ActionPerformed

    private void b78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b78ActionPerformed
        int i = 6;
        int j = 3;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b78ActionPerformed

    private void b79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b79ActionPerformed
        int i = 6;
        int j = 4;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b79ActionPerformed

    private void b80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b80ActionPerformed
        int i = 6;
        int j = 5;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b80ActionPerformed

    private void b81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b81ActionPerformed
        int i = 6;
        int j = 6;
       action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b81ActionPerformed

    private void b82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b82ActionPerformed
        int i = 6;
        int j = 7;
       action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b82ActionPerformed

    private void b83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b83ActionPerformed
        int i = 6;
        int j = 8;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b83ActionPerformed

    private void b84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b84ActionPerformed
        int i = 6;
        int j = 9;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b84ActionPerformed

    private void b85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b85ActionPerformed
        int i = 6;
        int j = 10;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b85ActionPerformed

    private void b86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b86ActionPerformed
        int i = 6;
        int j = 11;
        action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b86ActionPerformed

    private void b66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b66ActionPerformed
        int i = 7;
        int j = 1;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b66ActionPerformed

    private void b67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b67ActionPerformed
        int i = 7;
        int j = 2;
       action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b67ActionPerformed

    private void b68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b68ActionPerformed
        int i = 7;
        int j = 3;
        action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b68ActionPerformed

    private void b69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b69ActionPerformed
        int i = 7;
        int j = 4;
        action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b69ActionPerformed

    private void b70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b70ActionPerformed
        int i = 7;
        int j = 5;
       action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b70ActionPerformed

    private void b71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b71ActionPerformed
        int i = 7;
        int j = 6;
       action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b71ActionPerformed

    private void b72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b72ActionPerformed
        int i = 7;
        int j = 7;
       action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b72ActionPerformed

    private void b73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b73ActionPerformed
        int i = 7;
        int j = 8;
       action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b73ActionPerformed

    private void b74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b74ActionPerformed
        int i = 7;
        int j = 9;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b74ActionPerformed

    private void b75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b75ActionPerformed
        int i = 7;
        int j = 10;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b75ActionPerformed

    private void b57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b57ActionPerformed
        int i = 8;
        int j = 2;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b57ActionPerformed

    private void b58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b58ActionPerformed
        int i = 8;
        int j = 3;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b58ActionPerformed

    private void b59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b59ActionPerformed
        int i = 8;
        int j = 4;
       action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b59ActionPerformed

    private void b60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b60ActionPerformed
        int i = 8;
        int j = 5;
        action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b60ActionPerformed

    private void b61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b61ActionPerformed
        int i = 8;
        int j = 6;
        action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b61ActionPerformed

    private void b62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b62ActionPerformed
        int i = 8;
        int j = 7;
        action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b62ActionPerformed

    private void b63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b63ActionPerformed
        int i = 8;
        int j = 8;
        action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b63ActionPerformed

    private void b64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b64ActionPerformed
        int i = 8;
        int j = 9;
        action(i,j);       // TODO add your handling code here:
    }//GEN-LAST:event_b64ActionPerformed

    private void b65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b65ActionPerformed
        int i = 8;
        int j = 10;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b65ActionPerformed

    private void b47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b47ActionPerformed
        int i = 9;
        int j = 1;
        action(i,j);          // TODO add your handling code here:
    }//GEN-LAST:event_b47ActionPerformed

    private void b48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b48ActionPerformed
        int i = 9;
        int j = 2;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b48ActionPerformed

    private void b49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b49ActionPerformed
        int i = 9;
        int j = 3;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b49ActionPerformed

    private void b50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b50ActionPerformed
        int i = 9;
        int j = 4;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b50ActionPerformed

    private void b51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b51ActionPerformed
        int i = 9;
        int j = 5;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b51ActionPerformed

    private void b52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b52ActionPerformed
        int i = 9;
        int j = 6;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b52ActionPerformed

    private void b53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b53ActionPerformed
        int i = 9;
        int j = 7;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b53ActionPerformed

    private void b54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b54ActionPerformed
        int i = 9;
        int j = 8;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b54ActionPerformed

    private void b55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b55ActionPerformed
        int i = 9;
        int j = 9;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b55ActionPerformed

    private void b56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b56ActionPerformed
        int i = 9;
        int j = 10;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b56ActionPerformed

    private void b36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b36ActionPerformed
        int i = 10;
        int j = 1;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b36ActionPerformed

    private void b37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b37ActionPerformed
        int i = 10;
        int j = 2;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b37ActionPerformed

    private void b38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b38ActionPerformed
        int i = 10;
        int j = 3;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b38ActionPerformed

    private void b39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b39ActionPerformed
        int i = 10;
        int j = 4;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b39ActionPerformed

    private void b40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b40ActionPerformed
        int i = 10;
        int j = 5;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b40ActionPerformed

    private void b41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b41ActionPerformed
        int i = 10;
        int j = 6;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b41ActionPerformed

    private void b42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b42ActionPerformed
        int i = 10;
        int j = 7;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b42ActionPerformed

    private void b43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b43ActionPerformed
        int i = 10;
        int j = 8;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b43ActionPerformed

    private void b44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b44ActionPerformed
        int i = 10;
        int j = 9;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b44ActionPerformed

    private void b45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b45ActionPerformed
        int i = 10;
        int j = 10;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b45ActionPerformed

    private void b46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b46ActionPerformed
        int i = 10;
        int j = 11;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b46ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
        int i = 11;
        int j = 0;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b24ActionPerformed

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25ActionPerformed
        int i = 11;
        int j = 1;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b25ActionPerformed

    private void b26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b26ActionPerformed
        int i = 11;
        int j = 2;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b26ActionPerformed

    private void b27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b27ActionPerformed
        int i = 11;
        int j = 3;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b27ActionPerformed

    private void b28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b28ActionPerformed
        int i = 11;
        int j = 4;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b28ActionPerformed

    private void b29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b29ActionPerformed
        int i = 11;
        int j = 5;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b29ActionPerformed

    private void b30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b30ActionPerformed
        int i = 11;
        int j = 6;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b30ActionPerformed

    private void b31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b31ActionPerformed
        int i = 11;
        int j = 7;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b31ActionPerformed

    private void b32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b32ActionPerformed
        int i = 11;
        int j = 8;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b32ActionPerformed

    private void b33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b33ActionPerformed
        int i = 11;
        int j = 9;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b33ActionPerformed

    private void b34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b34ActionPerformed
        int i = 11;
        int j = 10;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b34ActionPerformed

    private void b35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b35ActionPerformed
        int i = 11;
        int j = 11;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b35ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        int i = 12;
        int j = 0;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        int i = 12;
        int j = 1;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b12ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        int i = 12;
        int j = 2;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b13ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        int i = 12;
        int j = 3;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        int i = 12;
        int j = 4;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b15ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        int i = 12;
        int j = 5;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b16ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        int i = 12;
        int j = 6;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b17ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        int i = 12;
        int j = 7;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b18ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        int i = 12;
        int j = 8;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b19ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        int i = 12;
        int j = 9;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b20ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        int i = 12;
        int j = 10;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b21ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        int i = 12;
        int j = 11;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b22ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
        int i = 12;
        int j = 12;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b23ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        int i = 13;
        int j = 4;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        int i = 13;
        int j = 5;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        int i = 13;
        int j = 6;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        int i = 13;
        int j = 7;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b10ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        int i = 14;
        int j = 5;
        action(i,j);         // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        int i = 14;
        int j = 6;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        int i = 14;
        int j = 7;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        int i = 15;
        int j = 5;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        int i = 15;
        int j = 6;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        int i = 16;
        int j = 6;
        action(i,j);        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        Color tempcolor = new Color(0,0,0);
        try { 
            PrintWriter p = new PrintWriter(FILE);
            for (int i = 0; i < 17; i++) {
                for (int j = 0; j < 13; j++) {
                    if (Board.get(i).get(j) != null) {
                        tempcolor = Board.get(i).get(j).getBackground();
                        if (tempcolor == Cyan) {
                            p.println("Cyan");
                        }if (tempcolor == Orange) {
                            p.println("Orange");
                        }if (tempcolor == Purple) {
                            p.println("Purple");
                        }if (tempcolor == Red) {
                            p.println("Red");
                        }if (tempcolor == Green) {
                            p.println("Green");
                        }if (tempcolor == Blue) {
                            p.println("Blue");
                        }if (tempcolor == Yellow) {
                            p.println("Yellow");
                        }
                    }
                }
            } p.println(Tcounter);p.println(count); p.close();
        }
        catch (Exception e) {
            System.out.println("no file");
        }// TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        Main.Menu(); // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartActionPerformed
        Main.NewGame();        // TODO add your handling code here:
    }//GEN-LAST:event_RestartActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main.DisplayScores();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel DisplayTurn;
    private javax.swing.JLabel DisplayTurn2;
    private javax.swing.JButton DisplayTurn3;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton Restart;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b100;
    private javax.swing.JButton b101;
    private javax.swing.JButton b102;
    private javax.swing.JButton b103;
    private javax.swing.JButton b104;
    private javax.swing.JButton b105;
    private javax.swing.JButton b106;
    private javax.swing.JButton b107;
    private javax.swing.JButton b108;
    private javax.swing.JButton b109;
    private javax.swing.JButton b11;
    private javax.swing.JButton b110;
    private javax.swing.JButton b111;
    private javax.swing.JButton b112;
    private javax.swing.JButton b113;
    private javax.swing.JButton b114;
    private javax.swing.JButton b115;
    private javax.swing.JButton b116;
    private javax.swing.JButton b117;
    private javax.swing.JButton b118;
    private javax.swing.JButton b119;
    private javax.swing.JButton b12;
    private javax.swing.JButton b120;
    private javax.swing.JButton b121;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b26;
    private javax.swing.JButton b27;
    private javax.swing.JButton b28;
    private javax.swing.JButton b29;
    private javax.swing.JButton b3;
    private javax.swing.JButton b30;
    private javax.swing.JButton b31;
    private javax.swing.JButton b32;
    private javax.swing.JButton b33;
    private javax.swing.JButton b34;
    private javax.swing.JButton b35;
    private javax.swing.JButton b36;
    private javax.swing.JButton b37;
    private javax.swing.JButton b38;
    private javax.swing.JButton b39;
    private javax.swing.JButton b4;
    private javax.swing.JButton b40;
    private javax.swing.JButton b41;
    private javax.swing.JButton b42;
    private javax.swing.JButton b43;
    private javax.swing.JButton b44;
    private javax.swing.JButton b45;
    private javax.swing.JButton b46;
    private javax.swing.JButton b47;
    private javax.swing.JButton b48;
    private javax.swing.JButton b49;
    private javax.swing.JButton b5;
    private javax.swing.JButton b50;
    private javax.swing.JButton b51;
    private javax.swing.JButton b52;
    private javax.swing.JButton b53;
    private javax.swing.JButton b54;
    private javax.swing.JButton b55;
    private javax.swing.JButton b56;
    private javax.swing.JButton b57;
    private javax.swing.JButton b58;
    private javax.swing.JButton b59;
    private javax.swing.JButton b6;
    private javax.swing.JButton b60;
    private javax.swing.JButton b61;
    private javax.swing.JButton b62;
    private javax.swing.JButton b63;
    private javax.swing.JButton b64;
    private javax.swing.JButton b65;
    private javax.swing.JButton b66;
    private javax.swing.JButton b67;
    private javax.swing.JButton b68;
    private javax.swing.JButton b69;
    private javax.swing.JButton b7;
    private javax.swing.JButton b70;
    private javax.swing.JButton b71;
    private javax.swing.JButton b72;
    private javax.swing.JButton b73;
    private javax.swing.JButton b74;
    private javax.swing.JButton b75;
    private javax.swing.JButton b76;
    private javax.swing.JButton b77;
    private javax.swing.JButton b78;
    private javax.swing.JButton b79;
    private javax.swing.JButton b8;
    private javax.swing.JButton b80;
    private javax.swing.JButton b81;
    private javax.swing.JButton b82;
    private javax.swing.JButton b83;
    private javax.swing.JButton b84;
    private javax.swing.JButton b85;
    private javax.swing.JButton b86;
    private javax.swing.JButton b87;
    private javax.swing.JButton b88;
    private javax.swing.JButton b89;
    private javax.swing.JButton b9;
    private javax.swing.JButton b90;
    private javax.swing.JButton b91;
    private javax.swing.JButton b92;
    private javax.swing.JButton b93;
    private javax.swing.JButton b94;
    private javax.swing.JButton b95;
    private javax.swing.JButton b96;
    private javax.swing.JButton b97;
    private javax.swing.JButton b98;
    private javax.swing.JButton b99;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}