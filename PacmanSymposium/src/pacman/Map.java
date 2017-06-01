package pacman;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import gui.components.Component;

public class Map extends Component{
	
	private ArrayList<int[]> coordinates;
	private int width;
	private int height;
	private final int  size = 30;
	
//	private final int _SPACE = 0;
//	private final int _FOOD = 1;
//	private final int _WALL = 2;
	
	public Map(int x, int y, int w, int h) {
		super(x, y, w, h);
		this.width = w;
		this.height = h;
	}

	@Override
	public void update(Graphics2D g) {
		coordinates = new ArrayList<int[]>();
		//remember to add coordinates and label 1, 2, 3
		g.setColor(Color.black);
		
		int x;
		int y;
		
		for(int i = 0; i < 25; i++){
			//top
			if(i != 12){
				x = size*i;
				y = 0;
				g.drawRect(x, y, size, size);
				
				coordinates.add(new int[] {x, y, size});
			}
			
			//make an else statement add on the coordinates for the space so that player knows its a space that
			//can go to the other side
		}
		
		for(int i = 1; i < 20; i++){
			//left
			if(i != 10){
				x = 0;
				y = size*i;
				g.drawRect(x, y , size, size);
				
				coordinates.add(new int[] {x, y, size});
				
			}		
		}
		
		for(int i = 0; i < 25; i++){
			//bottom
			if(i != 12){
				x = size*i;
				y = size * 20;
				g.drawRect(x, y, size, size);
				
				coordinates.add(new int[] {x, y, size});
			}		
		}
		
		for(int i = 1; i < 20; i++){
			//right
			if(i != 10){
				x = size * 24;
				y = size*i;
				g.drawRect(x, y, size, size);
				
				coordinates.add(new int[] {x, y, size});
			}	
		}
		
		//g.drawRect(60, 60, size, size);
		//coordinates.add(new int[] {});
		
	}
	
	public ArrayList<int[]> getCoordinates(){
		return coordinates;
	}

}
