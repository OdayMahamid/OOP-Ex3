package gameClient;

import utils.Point3D;

/// simple Robot class

public class Robot {
	private int id;
	private double val; 
	private int src; 
	private int dest; 
	private Point3D position;
	private int speed;

	
	
				///////////////////// constructors ///////////////////////
	
	public Robot() {
		this.val=0;
	}
	
	public Robot(int rid, int src, int dest,double value,int s,Point3D pos) {
		this.id=rid;
		this.val=value;
		this.position=pos;
		this.src=src;
		this.dest=dest;
		this.speed=s;
	}
	
	
		////////////////////////// getters || setters //////////////////////////
	public int getID() {
		return this.id; 
		}
	public double getV() {
		return this.val; 
		}
	public void setV(double v) { 
		this.val=v; 
		}
	public Point3D getP() {
		return this.position;
		}
	public void setP(Point3D p) {
		this.position= p;
		}
	public void setP(double x, double y, double z) {
		this.position=new Point3D(x,y,z);
	}
	public int getS() { 
		return this.speed;
		}
	public void incS() {
		this.speed++; 
		} 
	public void setSrc(int src) {
		this.src=src; 
		}
	public int getSrc() { 
		return this.src; 
		}
	public int getDest() { 
		return this.dest; 
		}
	public void setDest(int dest) {
		this.dest=dest; 
		}
}
