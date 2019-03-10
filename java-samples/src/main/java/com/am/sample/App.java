package com.am.sample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        //Sample sample = new Sample();
        //sample = null;
        //System.gc();
    	
    	Sample1 sample = new Sample1();
    	AbstractSample sample2 = new AbstractSample() {
    		public void thisIsNewMethod() {
    			System.out.println("Hello!");
    		}
		};
		sample2.thisIsNewMethod();
		
		
		AbstractSample sample3 = new Sample1();
		sample3.thisIsNewMethod();
    }
}

class Sample {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called!!!");
		super.finalize();
	}
	
}