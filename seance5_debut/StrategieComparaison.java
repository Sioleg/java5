
/**
 * Décrit un polygone dans le plan 2D
 * @version 1.0
 * @author Guillaume Santini
 */
public interface StrategieComparaison
{
	public int compareTo(Object o){
		PointPlan per1 = this.barycentre();
		PointPlan per2 = ((Polygone)o).barycentre();
		if (per1 < per2) return -1;
		if (per1 == per2) return 0;
		return 1;
	}
}
