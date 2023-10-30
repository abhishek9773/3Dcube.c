package main;

public class GameWindow {
	private JFrame jframe;
	public GameWidow(){
		jframe = new JFrame();

		jframe.setSize(400, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		jframe.add(gamepanel);
		jframe.setVisible(true);

		
	}
}
