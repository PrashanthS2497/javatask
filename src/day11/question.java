package day11;

public class question {
	Difference Between Exception and Error
	Exception:

	Represents issues that occur during the execution of a program and disrupt its normal flow.
	Can be handled programmatically using try, catch, finally blocks.
	Examples: IOException, SQLException, NullPointerException.
	Error:

	Represents serious problems that are usually not recoverable and indicate issues with the environment or JVM.
	Generally, not handled by applications.
	Examples: OutOfMemoryError, StackOverflowError.




	Difference Between Checked Exception and Unchecked Exception
	Checked Exception:

	Checked at compile-time.
	Must be either caught or declared in the method's throws clause.
	Examples: IOException, ClassNotFoundException.
	Unchecked Exception:

	Not checked at compile-time.
	These are subclasses of RuntimeException and do not need to be declared or caught.
	Examples: NullPointerException, ArithmeticException.
	
	
	
	Four Access Modifiers in Java
	public: The member is accessible from any other class.

	Class: Can be accessed from any other class.
	Method/Variable: Can be accessed from any other class.
	protected: The member is accessible within its own package and by subclasses.

	Class: Cannot be protected. Only package-private and public are allowed.
	Method/Variable: Accessible within the same package and by subclasses in other packages.
	default (no modifier): The member is accessible only within its own package.

	Class: Accessible only within the same package.
	Method/Variable: Accessible only within the same package.
	private: The member is accessible only within its own class.

	Class: Cannot be private. Only package-private and public are allowed.
	Method/Variable: Accessible only within the same class.




}
