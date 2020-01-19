package gui;

import dataStructure.DGraph;
import dataStructure.NodeData;
import dataStructure.graph;
import utils.Point3D;

public class graphFactory {

	public graphFactory () {;}

	public NodeData nodeGenerator() {
		Point3D p = new Point3D((int)(Math.random()*1240)+20, (int)(Math.random()*630)+70);
		NodeData ans = new NodeData(p);
		return ans;
	}

	public graph randomGraphLarge() {
		graph t = new DGraph();
		NodeData p = nodeGenerator();
		t.addNode(p);
		for (int i=1; i<50; i++) {
			NodeData n = nodeGenerator();
			t.addNode(n);
		}
		for (int i=0; i<50; i++) {
			int ran = (int)(Math.random()*50);
			int rat = (int)(Math.random()*50);	
			int rab = (int)(Math.random()*50);	
			int ras = (int)(Math.random()*50);	
			t.connect(ran, rat, ((int)((i/3.43)*100))/100);
			t.connect(rab, ras, ((int)((i/3.43)*100))/100);
		}
		return t;
	}

	public graph randomGraphSmallConnected() {
		graph g = new DGraph();
		NodeData t1 = nodeGenerator();
		NodeData t2 = nodeGenerator();
		NodeData t3 = nodeGenerator();
		NodeData t4 = nodeGenerator();
		NodeData t5 = nodeGenerator();
		NodeData t6 = nodeGenerator();
		NodeData t7 = nodeGenerator();
		NodeData t8 = nodeGenerator();
		NodeData t9 = nodeGenerator();
		NodeData t10 = nodeGenerator();

		g.addNode(t1);
		g.addNode(t2);
		g.addNode(t3);
		g.addNode(t4);
		g.addNode(t5);
		g.addNode(t6);
		g.addNode(t7);
		g.addNode(t8);
		g.addNode(t9);
		g.addNode(t10);
		
		g.connect(t1.getKey(), t9.getKey(), 1.2);
		g.connect(t1.getKey(), t6.getKey(), 1.56);
		g.connect(t2.getKey(), t5.getKey(), 6.4);
		g.connect(t2.getKey(), t1.getKey(), 4.1);
		g.connect(t3.getKey(), t2.getKey(), 42);
		g.connect(t3.getKey(), t5.getKey(), 6.5);
		g.connect(t4.getKey(), t7.getKey(), 2.22);
		g.connect(t4.getKey(), t8.getKey(), 3.23);
		g.connect(t5.getKey(), t9.getKey(), 12.1);
		g.connect(t5.getKey(), t3.getKey(), 6.3);
		g.connect(t6.getKey(), t1.getKey(), 4.28);
		g.connect(t6.getKey(), t3.getKey(), 8.3);
		g.connect(t7.getKey(), t6.getKey(), 1);
		g.connect(t7.getKey(), t2.getKey(), 1);
		g.connect(t8.getKey(), t4.getKey(), 1.22);
		g.connect(t8.getKey(), t10.getKey(), 5.98);
		g.connect(t9.getKey(), t4.getKey(), 7);
		g.connect(t9.getKey(), t10.getKey(), 6.9);
		g.connect(t10.getKey(), t8.getKey(), 7.2);
		g.connect(t10.getKey(), t7.getKey(), 1.88);

		return g;
	}

}
