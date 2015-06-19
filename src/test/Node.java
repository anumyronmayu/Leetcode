package test;

public class Node {
	
	private double distanceThresholdStep;
	private Cluster cluster;
	
	public double getDistanceThreshold() {
		return distanceThresholdStep;
	}
	public void setDistanceThresholdStep(double distanceThreshold) {
		this.distanceThresholdStep = distanceThreshold;
	}
	public Cluster getCluster() {
		return cluster;
	}
	public void setCluster(Cluster cluster) {
		this.cluster = cluster;
	} 
	

	
}
