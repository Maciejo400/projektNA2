package Projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PanelG {
    public static JFrame widok = new JFrame("POKEMONY");
    public static Projekt.PanelG.Panel PanelG = new PanelG.Panel();
    public static void start() {
        widok.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        widok.setBounds(1000, 1000, 1115, 739);
        widok.add(PanelG);
        widok.addKeyListener(PanelG);
        widok.setVisible(true);
        widok.setLocationRelativeTo(null);
    }


    public static class Panel extends JPanel implements MouseListener, KeyListener, MouseMotionListener {
        ImageIcon biegDol = new ImageIcon("C:\\Users\\Maciek\\IdeaProjects\\main\\src\\PNG\\image (3).png");
        ImageIcon biegPrawo = new ImageIcon("C:\\Users\\Maciek\\IdeaProjects\\main\\src\\PNG\\ruchwLewo (2).png");
        ImageIcon biegGora = new ImageIcon("C:\\Users\\Maciek\\IdeaProjects\\main\\src\\PNG\\gora1.png");
        ImageIcon biegLewo = new ImageIcon("C:\\Users\\Maciek\\IdeaProjects\\main\\src\\PNG\\ruchwLewo1.png");
        int i;
        int x;
        int y;
        int kier;
        int a = 1;
        Image biegWDol;
        Image biegWBoki;
        Image biegwGore;
        Image biegWLewo;



        public Panel() {
            addMouseListener(this);
            addKeyListener(this);
            biegWDol = biegDol.getImage().getScaledInstance((64), (164), Image.SCALE_DEFAULT);
            biegWBoki = biegPrawo.getImage().getScaledInstance((64), (164), Image.SCALE_DEFAULT);
            biegwGore = biegGora.getImage().getScaledInstance((64), (164), Image.SCALE_DEFAULT);
            biegWLewo = biegLewo.getImage().getScaledInstance((64), (164), Image.SCALE_DEFAULT);
        }




        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if(a == 1) {
                ImageIcon tlo = new ImageIcon("C:\\Users\\Maciek\\IdeaProjects\\main\\src\\PNG\\miasto.PNG");
                g.drawImage(tlo.getImage(), 0, 0, 1100, 700, null);
                ImageIcon przyciskStart = new ImageIcon("C:\\Users\\Maciek\\IdeaProjects\\main\\src\\PNG\\przyciskStart (2).PNG");
                ImageIcon przyciskWyjscia = new ImageIcon("C:\\Users\\Maciek\\IdeaProjects\\main\\src\\PNG\\przyciskWyjscia.png");
                g.drawImage(przyciskStart.getImage(), 350, 200, 400, 300, null);
                g.drawImage(przyciskWyjscia.getImage(), 350, 300, 400, 300, null);
            }
            if(a == 0) {
                if (kier == 0) {
                    g.drawImage(biegWBoki, 0 + x, 0, 80 + x, 88, 0, 0 + (i * 88), 80, 88 + (i * 88), null);
                }
                if (kier == 1) {
                    g.drawImage(biegWLewo, 0 + x, 0, 80 + x, 88, 0, 0 + (i * 88), 80, 88 + (i * 88), null);
                }
                if (kier == 2) {
                    g.drawImage(biegwGore, 0 + x, 0, 80 + x, 88, 0, 0 + (i * 88), 80, 88 + (i * 88), null);
                }
                if (kier == 3) {
                    g.drawImage(biegWDol,  0 + x, 0, 80 + x, 88, 0, 0 + (i * 88), 80, 88 + (i * 88), null);
                }
            }
        }


        @Override
        public void mouseClicked(MouseEvent e) {
            ImageIcon tlo2 = new ImageIcon("C:\\Users\\Maciek\\IdeaProjects\\main\\src\\PNG\\czarny.png");
            ImageIcon mapa = new ImageIcon("C:\\Users\\Maciek\\IdeaProjects\\main\\src\\PNG\\map1.png");
            if (e.getX() >= 421 && e.getX() <= 681) {
                if (e.getY() >= 327 && e.getY() <= 370) {
                    getGraphics().drawImage(tlo2.getImage(), 0, 0, 1100, 700, null);
                    getGraphics().drawImage(mapa.getImage(), 250, 0, 600, 700, null);
                    a = 0;

                }
            }
            if (e.getX() >= 421 && e.getX() <= 681) {
                if (e.getY() >= 427 && e.getY() <= 470) {
                    widok.dispose();
                }
            }
        }


        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }


        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if(i < 5)
                i++;
            else
                i=0;
            if(a == 0) {
                if (e.getKeyCode() == 39) {
                    x += 2;
                    kier = 0;
                }
                if (e.getKeyCode() == 37) {
                    x -= 2;
                    kier = 1;
                }
                if (e.getKeyCode() == 38) {
                    y -= 8;
                    kier = 2;
                }
                if (e.getKeyCode() == 40) {
                    y += 8;
                    kier = 3;
                }
                repaint();
            }
        }


        @Override
        public void keyReleased(KeyEvent e) {
            i=0;
            repaint();
        }

    }
}