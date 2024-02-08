
// import com.appdev.gaming.sprite.Alien; 
// import com.appdev.gaming.sprite.Player; 
// import com.appdev.gaming.sprite.Shot;

import java.util.Iterator; 
import java.util.List; 
import java.util.Random;
import javax.swing.ImageIcon; 
import javax.swing.JPanel;
import javax.swing.Timer; 
import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Font; 
import java.awt.Graphics; 
import java.awt.Toolkit;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent; 
import java.util.ArrayList;

public class game{
    public class Board extends JPanel {
        private Dimension d;
        private List<Alien> aliens;
        private Player player;
        private Shot shot;

        private int direction = -1; 
private int deaths = 0;  
  
private boolean inGame = true;  private String explImg = "src/com/appdev/gaming/images/explosion.png"; 
private String message = "Game Over";  
  
private Timer timer;  
  
  
  
public Board() {  
  
  
initBoard(); 
gameInit();  
}
private void initBoard() {  
  
  
    addKeyListener(new TAdapter()); setFocusable(true);  
    d = new Dimension(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT); setBackground(Color.black);  
      
    timer = new Timer(Commons.DELAY, new GameCycle()); timer.start();  
      
    gameInit();  
    }  
      
      
      
      
    private void gameInit() {  
      
      
    aliens = new ArrayList<>();  
      
     for (int i = 0; i < 4; i++) { for (int j = 0; j < 6; j++) {  
       
    var alien = new Alien(Commons.ALIEN_INIT_X + 18 * j,Commons.ALIEN_INIT_Y  
    + 18 * i);  
      
          aliens.add(alien);  
    } 
    }  
      
      
    player = new Player(); 
    shot = new Shot();  
    }  
      
    


    }

}
    

