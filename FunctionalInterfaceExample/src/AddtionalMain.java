
public class AddtionalMain {

	public void print() {
		System.out.println("Print");
	}

	public static void sum() {
		System.out.println("Print");
	}

	public static void main(String[] args) {

		Additionalmpl additionalmpl = new Additionalmpl();
		additionalmpl.add();

		Addition addition = new Additionalmpl();
		addition.add();

		Addition add = () -> System.out.println("Add Method");
		add.add();

		AddtionalMain additional = new AddtionalMain();
		additional.print();

		Calculator cc = additional::print;
		cc.display();
		
		
		Calculator cc1 = System.out::println;
		cc1.display();

		/*
		 * Calculator calc = (a, b) -> { System.out.println("Calc method" + (a + b)); };
		 * calc.sum(2, 3);
		 */
	}
}
