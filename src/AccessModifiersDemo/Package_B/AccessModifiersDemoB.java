package AccessModifiersDemo.Package_B;

import AccessModifiersDemo.package_A.AccessModifierDemoA;

public class AccessModifiersDemoB {

        public static void main(String[] args) {

            AccessModifierDemoA demoA = new AccessModifierDemoA();
            
            System.out.println("Accessing public variable: " + demoA.publicVariable);
            // System.out.println("Accessing private variable: " + demoA.privateVariable); // This will cause a compilation error
            // System.out.println("Accessing protected variable: " + demoA.protectedVariable); // This will cause a compilation error because we are in a different package and not a subclass 
            //System.out.println("Accessing default variable: " + demoA.defaultVariable); // This will cause a compilation error because we are in a different package     
        }

}
