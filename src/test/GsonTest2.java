package test;

import com.google.gson.Gson;

public class GsonTest2 {

	public static void main(String[] args) {

		Gson gson = new Gson();
		
		Node node1 = new Node();
		Cluster cluster1 = new Cluster();
		cluster1.setIndex(0);
		cluster1.setDistanceThreshold(0.0);
		node1.setDistanceThresholdStep(0.02);
		node1.setCluster(cluster1);
		
		String s = gson.toJson(node1);
		System.out.println(s);
		
	}

}
