package generators;

import hello.HelloWorldTemplate;


public class GridletGenerator 
{
	public static void main(String[] args) 
	{
		HelloWorldTemplate sayHello = new HelloWorldTemplate();
		String result = sayHello.generate("matt");
		System.out.println(result);
	}
}
