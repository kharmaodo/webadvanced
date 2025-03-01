package edu.sn.master.gl.ds.bambey.tdd;
/**
 * Implements {@link ICalculator}
 */
public class Calculator implements ICalculator {

	@Override
	public MessageInteger division(Integer a, Integer b) {
		
		if(b==0) return new MessageInteger("Impossible la division",0);
		Integer c = a/b ;
		return new MessageInteger("OK",c);
	}


}
