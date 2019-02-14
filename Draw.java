import javax.swing.JComponent;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Draw extends JComponent{

	private BufferedImage image;
	private BufferedImage backgroundImage;
	public URL resource = getClass().getResource("run0.png");

	// circle's position
	public int x = 30;
	public int y = 30;

	// animation states
	public int state = 0;

	Monster monster1;
	Monster monster2;
	Monster monster3;
	Monster monster4;
	Monster monster5;
	Monster monster6;
 	
 	Player player;

	public Draw(){
		monster1 = new Monster(200, 200);
		monster2 = new Monster(300, 200);
		monster3 = new Monster(100, 150);
		monster4 = new Monster(400, 300);
		monster5 = new Monster(500, 400);
		monster6 = new Monster(500, 100);

		try{
			image = ImageIO.read(resource);
			backgroundImage = ImageIO.read(getClass().getResource("background.jpg"));
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	public void attack(){
		player.attack();
	}

	public void moveUp(){
		player.moveUp();
	}

	public void moveDown(){
		player.moveDown();
	}

	public void moveLeft(){
		player.moveLeft();
	}

	public void moveRight(){
		player.moveRight();
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.drawImage(backgroundImage, 0, 0, this);
		g.drawImage(image, x, y, this);

		g.drawImage(monster1.image, monster1.xPos, monster1.yPos, this);
		g.drawImage(monster2.image, monster2.xPos, monster2.yPos, this);
		g.drawImage(monster3.image, monster1.xPos, monster3.yPos, this);
		g.drawImage(monster4.image, monster2.xPos, monster4.yPos, this);
		g.drawImage(monster5.image, monster1.xPos, monster5.yPos, this);
		g.drawImage(monster6.image, monster2.xPos, monster6.yPos, this);
	}
}