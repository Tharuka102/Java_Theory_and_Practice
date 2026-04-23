package AccessModifiersDemo.package_A;

public class AccessModifierDemoA {

    private String privateVariable = "This is a private variable";
    protected String protectedVariable = "This is a protected variable";
    public String publicVariable = "This is a public variable";
    String defaultVariable = "This is a default variable";

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    public void publicMethod() {
        System.out.println("This is a public method");
    }

    void defaultMethod() {
        System.out.println("This is a default method");
    }

    //getters and setters for private variable
    public String getPrivateVariable() {
        return privateVariable;
    }

    public void setPrivateVariable(String privateVariable) {
        this.privateVariable = privateVariable;
    }

    //getters and setters for protected variable
    public String getProtectedVariable() {
        return protectedVariable;
    }

    public void setProtectedVariable(String protectedVariable) {
        this.protectedVariable = protectedVariable;
    }

    //getters and setters for default variable
    public String getDefaultVariable() {
        return defaultVariable;
    }

    public void setDefaultVariable(String defaultVariable) {
        this.defaultVariable = defaultVariable;
    }
    
    public static void main(String[] args) {
       
    }

}
