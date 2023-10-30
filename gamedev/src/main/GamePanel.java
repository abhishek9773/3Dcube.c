package main;


public class GamePanel extends JPanel{

	public GamePanel(){
	}

	/** We need paintComponent 
	 * we need a graphics object as input
	 * we can now draw 
	 * */
	public void paintComponent(Graphics q){
		super.paintComponent(g);
		g.drawRect(100, 100, 200, 50);
		

