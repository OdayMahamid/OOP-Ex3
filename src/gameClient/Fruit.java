package gameClient;

import utils.Point3D;

/**
 * fruit class 
 * the fruit can be apple or banana.
 * @author Abodi masariwe, Mohamad assi and Oday shibli. 
 */

public class Fruit {
	private int fruit;
	private Point3D position;
	private double val;
	public int src;
	public int dest;
	
			/////////////////// fruit constructors //////////////////////
	
	
	public Fruit() {
		/// "new" fruit constructor ! 
	}
	
	public Fruit(double value, int f, Point3D pos) {
		this.val=value;
		this.position=pos;
		this.fruit=f;
	}

	public Fruit(Fruit f) {
		this.fruit=f.fruit;
		this.val=f.val;
		this.position=f.position;
		this.src=f.src;
		this.dest=f.dest;
	}

			///////////////////// getters || setters /////////////////////
	
	public int getT() { 
		return this.fruit;
		}
	public double getV() { 
		return this.val;
		}
	public void setV(double val) {
		this.val=val;
		}
	public void setP(Point3D p) { 
		this.position = p; 
		}
	public Point3D getP() {
		return this.position; 
		}
}
