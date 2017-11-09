
class VariablesinJava {

	
		// TODO Auto-generated method stub

			public String pageName;
			// instance variable with public access
			private int pageNumber;
			// instance variable with private access
			}
			
			/*
			 * Declaration of class
			 */
			public class InstanceLocalVar {
			  /*
			   Instance variable declaration
			   */
			  int instanceField;
			  /*
			  Static variable declaration
			   */
			  static String staticField;
			  public void method() {
			    /*
			     
			     */
			    final String localVariable = "Initial Value";
			    System.out.println(localVariable);
			  }
			  public static void main(String args[]) {
				  InstanceLocalVar obj = new InstanceLocalVar();
			    /*
			     * Instance variable can be accessed by Object of the class
			     */
			    System.out.println(obj.instanceField);
			    /*
			     * Static field accessing
			     */
			    System.out.println(obj.staticField);
			    System.out.println(InstanceLocalVar.staticField);
			                System.out.println(new InstanceLocalVar().instanceField);
			  }
			}


