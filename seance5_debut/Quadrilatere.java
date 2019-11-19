/**
 * Décrit un quadrilatère dans le plan 2D
 * @version 1.0
 * @author Guillaume Santini
 */
public class Quadrilatere extends Polygone
{	
	public Quadrilatere(PointPlan [] listeDePoints, int niveau) throws QuadrilatereException
	{
		super(listeDePoints, niveau);	
		if ( listeDePoints.length != 4  ) 
			throw new QuadrilatereException( listeDePoints.length ) ; 
	}
	
}
