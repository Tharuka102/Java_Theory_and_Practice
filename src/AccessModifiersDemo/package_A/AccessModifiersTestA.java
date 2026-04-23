package AccessModifiersDemo.package_A;


public class AccessModifiersTestA {

    public static void main(String[] args) {   
        AccessModifierDemoA demoA = new AccessModifierDemoA();
        System.out.println("Accessing public variable: " + demoA.publicVariable);
        // System.out.println("Accessing private variable: " + demoA.privateVariable); // This will cause a compilation error
         System.out.println("Accessing protected variable: " + demoA.protectedVariable); // This will work because we are in the same package
         System.out.println("Accessing default variable: " + demoA.defaultVariable); // This will work because we are in the same package

        demoA.publicMethod();
        // demoA.privateMethod(); // This will cause a compilation error
           demoA.protectedMethod(); // This will work because we are in the same package
           demoA.defaultMethod(); // This will work because we are in the same package

    }

}
