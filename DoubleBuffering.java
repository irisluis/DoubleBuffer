package lab;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
public class DoubleBuffering extends JPanel implements ActionListener{

private static final long serialVersionUID = -1529201999013577715L;
final int PANEL_WIDTH = 600;
final int PANEL_HEIGHT = 600;
int boxWidth = 90;
int boxHeight = 90;
int boxa1 = 0, boxb1 = 0;
int boxc2 = 10, boxe2 = 10;
int boxd3 = 30, box3f = 30;

int boxa1Velocity = 5, boxb1Velocity = 3;
int boxc2Velocity = 6, boxe2Velocity = 3;
int boxd3Velocity = 2, box3fVelocity = 6;

Timer timer;
DoubleBuffering(){
this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT)); 
timer = new Timer(1, this);
timer.start(); 
}
public void paint(Graphics g) {
Graphics2D g2D = (Graphics2D) g;
super.paint(g2D); 
g2D.setColor(Color.red); 
g2D.fillRect(boxa1, boxb1, boxWidth, boxHeight); 
g2D.setColor(Color.black); 
g2D.fillRect(boxc2, boxe2, boxWidth, boxHeight); 
g2D.setColor(Color.blue); 
g2D.fillRect(boxd3, box3f, boxWidth, boxHeight); 
}
@Override
public void actionPerformed(ActionEvent e) {
boxa1 = boxa1 + boxa1Velocity; 
boxb1 = boxb1 + boxa1Velocity; 
boxc2 = boxc2 + boxc2Velocity; 
boxe2 = boxe2 + boxe2Velocity; 
boxd3 = boxd3 + boxd3Velocity; 
box3f = box3f + box3fVelocity; 
if(boxa1 + 50 >= PANEL_WIDTH || boxa1 < 0) {
	boxa1Velocity = boxa1Velocity * -1; 
}
if(boxb1 + 50 >= PANEL_HEIGHT || boxb1 < 0) {
	 boxb1Velocity =  boxb1Velocity * -1;
}
if(boxc2 + 50 >= PANEL_WIDTH || boxc2 < 0) {
boxc2Velocity = boxc2Velocity * -1; 
}
if(boxe2 + 50 >= PANEL_HEIGHT || boxe2 < 0) {
	boxe2Velocity = boxe2Velocity * -1;
	}
	if(boxd3 + 50 >= PANEL_WIDTH || boxd3 < 0) {
	boxd3Velocity = boxd3Velocity * -1;
	}
	if(box3f + 50 >= PANEL_HEIGHT || box3f < 0) {
	box3fVelocity = box3fVelocity * -1;
	}
		repaint(); 
		}
		}