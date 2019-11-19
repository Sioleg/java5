public class TestFigure
{
	public static void main(String [] args){
		Comparable c1;
		Comparable c2;
		
		PointPlan [] pointsC1 = {new PointPlan(2001,2000),new PointPlan(2000,2001),new PointPlan(2001,2001)};
		PointPlan [] pointsC2 = {new PointPlan(1,1),new PointPlan(1000,1),new PointPlan(1000,1000),new PointPlan(1,1000)};

		try{
			c1 = new Triangle(pointsC1,1);
			c2 = new Quadrilatere(pointsC2,1);
			System.out.println(c1+"\n\n"+c2+"\n\n");
			
			if (c1.compareTo(c2)==1){
			System.out.println("Supérieur strict");
		}
		else {
			System.out.println("Inférieur ou égal");
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		
	}
}
	
