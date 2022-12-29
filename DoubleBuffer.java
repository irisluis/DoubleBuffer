package lab;

import javax.swing.JFrame;
public class DoubleBuffer extends JFrame{
/**
* 
*/
private static final long serialVersionUID = 564384651936200345L;
DoubleBuffering panel; 
DoubleBuffer(){
panel = new DoubleBuffering();
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setTitle("Box Barrage (Without Double-Buffering)");
this.setResizable(false);
this.setVisible(true);
this.add(panel);
this.pack();
}
}