import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener {

  static final int SCREEN_WIDTH = 600;
  static final int SCREEN_HEIGHT = 600;
  static final int UNIT_SIZE = 25;
  // Total number of units available on screen
  static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT)/UNIT_SIZE;
  // Movement speed
  static final int DELAY = 75;
  // X and Y coordinates of the snake
  final int x[] = new int[GAME_UNITS];
  final int y[] = new int[GAME_UNITS];
  // Starting size of the snake
  int bodyParts = 6;
  int applesEaten;
  // Apple coordinates
  int appleX;
  int appleY;
  // Starting direction for the snake
  char direction = 'R';
  boolean running = false;
  Timer timer;
  Random random;

  GamePanel(){
    random = new Random();
    this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
    this.setBackground(Color.black);
    this.setFocusable(true);
    this.addKeyListener(new MyKeyAdapter());
    startGame();
  }
  public void startGame(){
    newApple();
    running = true;
    timer = new Timer(DELAY, this);
    timer.start();
  }
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    draw(g);
  }
  public void draw(Graphics g) {
    for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++) {
      g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
    }
  }
  public void newApple(){

  }
  public void move() {
    
  }
  public void checkApple() {
    
  }
  public void checkCollisions(){

  }
  public void gameOver(Graphics g){

  }
  @Override
  public void actionPerformed(ActionEvent e){

  }
  public class MyKeyAdapter extends KeyAdapter{
    @Override
    public void keyPressed(KeyEvent e){

    }
  }
}
