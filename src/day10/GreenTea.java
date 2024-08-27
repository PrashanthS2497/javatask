package day10;

public class GreenTea extends Tea
{
	public void prepareTea()
	{
		System.out.println("Green tea");
		System.out.println("Add hotwater");
		System.out.println("Add green tea leaves");
		addSugar();
	}
}