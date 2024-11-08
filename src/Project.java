import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Project extends JPanel {
    public void paint(Graphics g) {
        int awal =0;
        int mulai = 0;
//Gambar Gunung, jalan ke gunung dan matahari
        g.setColor(Color.gray); //latar
        g.fillRect(0, 320,1020 ,300 );
        g.setColor(Color.blue); //langit
        g.fillRect(0, 0,1020 ,320 ); //langit
        g.setColor(Color.orange); //matahari
        g.fillOval(490,120,170 ,170 ); //matahari
//gunung lingkaran
        g.setColor(Color.darkGray); //gunung
        g.fillArc(200, 150, 400, 400, 0, 180); //gunung
        g.fillArc(0, 175, 600, 350, 90,90 ); //gunung
        g.fillArc(550, 75, 500, 550, 0, 180); //gunung
//Gambar Tanaman
        g.setColor(Color.green);
        g.fillOval(0, 500, 30,30);
        g.fillOval(25, 500, 30,30);
        g.fillOval(50, 500, 30,30);
        g.fillOval(15, 480, 30,30);
        g.fillOval(32, 480, 30,30);
        g.fillOval(90, 500, 30,30);
        g.fillOval(115, 500, 30,30);
        g.fillOval(140, 500, 30,30);
        g.fillOval(105, 480, 30,30);
        g.fillOval(122, 480, 30,30);
        g.fillOval(180, 500, 30,30);
        g.fillOval(205, 500, 30,30);
        g.fillOval(230, 500, 30,30);
        g.fillOval(195, 480, 30,30);
        g.fillOval(212, 480, 30,30);
        g.fillOval(270, 500, 30,30);
        g.fillOval(295, 500, 30,30);

        g.fillOval(320, 500, 30,30);
        g.fillOval(285, 480, 30,30);
        g.fillOval(302, 480, 30,30);
        g.fillOval(510, 500, 30,30);
        g.fillOval(535, 500, 30,30);
        g.fillOval(560, 500, 30,30);
        g.fillOval(525, 480, 30,30);
        g.fillOval(542, 480, 30,30);
        g.fillOval(600, 500, 30,30);
        g.fillOval(625, 500, 30,30);
        g.fillOval(650, 500, 30,30);
        g.fillOval(615, 480, 30,30);
        g.fillOval(632, 480, 30,30);
        g.fillOval(690, 500, 30,30);
        g.fillOval(715, 500, 30,30);
        g.fillOval(740, 500, 30,30);
        g.fillOval(705, 480, 30,30);
        g.fillOval(722, 480, 30,30);
        g.fillOval(780, 500, 30,30);
        g.fillOval(805, 500, 30,30);
        g.fillOval(830, 500, 30,30);
        g.fillOval(795, 480, 30,30);
        g.fillOval(812, 480, 30,30);
        g.fillOval(870, 500, 30,30);
        g.fillOval(895, 500, 30,30);
        g.fillOval(920, 500, 30,30);
        g.fillOval(885, 480, 30,30);
        g.fillOval(902, 480, 30,30);
        g.fillOval(960, 500, 30,30);
        g.fillOval(985, 500, 30,30);
        g.fillOval(1010, 500, 30,30);
        g.fillOval(975, 480, 30,30);
        g.fillOval(992, 480, 30,30);
//pohon
        g.setColor(Color.green);
        g.fillOval(600,220, 30,40);
        g.fillOval(590, 240, 30,30);
        g.fillOval(610, 240, 30,30);
        g.fillRect(610,260,9 ,60 );
        g.setColor(Color.green);
        g.fillOval(660,220, 30,40);
        g.fillOval(650, 240, 30,30);
        g.fillOval(670, 240, 30,30);

        g.fillRect(670,260,9 ,60 );
//Membuat jalan
        g.setColor(Color.black);
        g.fillRect(0, 300, 1020, 50);
//Membuat garis jalan
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.white);
        float[] dash = {20.0f};
        BasicStroke strok = new BasicStroke(3.0f, BasicStroke.CAP_SQUARE,
                BasicStroke.JOIN_MITER, 1.0f, dash, 0.0f);
        g2d.setStroke(strok);
        g2d.draw(new Line2D.Double(10, 320, 1000, 320));
//pohon
        g.setColor(Color.green);
        g.fillOval(720,250, 30,40);
        g.fillOval(710, 270, 30,30);
        g.fillOval(730, 270, 30,30);
        g.fillRect(730,290,9 ,60 );
        g.setColor(Color.green);
        g.fillOval(780,250, 30,40);
        g.fillOval(770, 270, 30,30);
        g.fillOval(790, 270, 30,30);
        g.fillRect(790,290,9 ,60 );
//mobil
        g.setColor(Color.red);
        g.fillRect(205,305,100,30 ); //badan bawah
        g.fillOval(207,278,104,45); //badan atas
        g.setColor(Color.blue);
        g.fillRect(210,305,100,30 ); //badan bawah
        g.fillOval(210,280,100,45); //badan atas
        g.fillArc (180,298,60,70,0,180); //atas ban
        g.fillArc (285,298,60,70,0,180); //atas ban
        g.setColor(Color.yellow);
        g.fillArc (318,301,23,23,0,80); //atas ban
        g.setColor(Color.black); //ban
        g.fillOval(198, 313, 32,32); //ban
        g.fillOval(298, 313, 32,32); //ban
        g.setColor(Color.white); //ban
        g.fillOval(204, 319, 20,20); //ban
        g.fillOval(304, 319, 20,20); //ban

        g.setColor(Color.red);
        g.fillArc (230,285,70,40,0,90); //atas ban
        g.setColor(Color.black);
        g.fillArc (234,286,64,36,0,90); //atas ban
        g.setColor(Color.red);
        g.fillArc (220,285,70,40,90,90); //atas ban
        g.setColor(Color.black);
        g.fillArc (223,286,68,36,90,90); //atas ban
        g.setColor(Color.red);
        g.fillRect(258,286,10,18 );
//awan
        g.setColor(Color.white);
        g.fillOval(30+mulai,70,90,40);
        g.fillOval(70+mulai,70,90,40);
        g.fillOval(40+mulai, 60, 50,50);
        g.fillOval(90+mulai, 60, 50,50);
        g.fillOval(210+awal,90,90,40);
        g.fillOval(250+awal,90,90,40);
        g.fillOval(220+awal, 80, 50,50);
        g.fillOval(270+awal, 80, 50,50);
        g.fillOval(820-awal,50,90,40);
        g.fillOval(860-awal,50,90,40);
        g.fillOval(830-awal,40, 50,50);
        g.fillOval(880-awal,40, 50,50);
//bendera
        g.setColor(Color.red);
        g.fillRect(100,120,100 ,35 );
        g.setColor(Color.white);
        g.fillRect(100,150,100 ,35 );
        g.fillRect(100,150,5 ,150 );
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Naufal");
        Project panel = new Project();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1010, 570);
        frame.add(panel);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}