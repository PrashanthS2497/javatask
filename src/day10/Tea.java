package day10;

public class Tea {
	public void prepareTea() {
			System.out.println("Preparing basic tea");
			System.out.println("Add hotwater and tea leaves");
			addmilk();
			addSugar();
		}
		
		public void addmilk() {
			System.out.println("Add milk");
		}
		public void addSugar(){
			System.out.println("Add sugar");
			System.out.println("Bring it to boil");
		}
		
		public static void main(String[] args) {
			Tea obj=new Tea();		
			obj.prepareTea();
			System.out.println("***********************");
			BlackTea bt=new BlackTea();
			bt.prepareTea();
			System.out.println("***********************");
			GreenTea gt=new GreenTea();
			gt.prepareTea();
			System.out.println("***********************");
			HerbalTea ht=new HerbalTea();
			ht.prepareTea();
			
			System.out.println("***** Printing Using Array of tea objects ******");
			Tea objArr[]=new Tea[4];
			objArr[0]= obj;
			objArr[1]=bt;
			objArr[2]=ht;
			objArr[3]=gt;
			for(Tea obj1 :objArr) {
				obj1.prepareTea();
				System.out.println("--------------------------");
			}
			
		}
		
}
