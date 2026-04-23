package Primitive_Types_Demo.src;

import java.math.BigDecimal;

public class precisionDemo {

    // Integers → exact precision
    // float → ~7 digits precision
    // double → ~15 digits precision
    // Decimal math → may have rounding errors

    public static void main(String[] args) {
        float floatValue = 0.1f; // 32-bit floating-point
        double doubleValue = 0.1; // 64-bit floating-point

       float f = 123.456789f;
       System.out.println(f); // 123.45679 (rounded)

       double d = 123.456789123456789;
       System.out.println(d); // 123.45678912345679

       double x = 0.1 + 0.2;
       System.out.println(x); // 0.30000000000000004
//..................................................................................................
        BigDecimal a = new BigDecimal("0.1");// Using string constructor to avoid precision issues
        BigDecimal b = new BigDecimal("0.2");// Using string constructor to avoid precision issues
        BigDecimal result = a.add(b);// This will give an exact result of 0.3
        System.out.println(result); // 0.3 
//..................................................................................................
//Accumulation Error (Loop)
         double sum = 0.0;

        for (int i = 0; i < 10; i++) {
            sum += 0.1;
        }

        System.out.println(sum); // ❌ 0.9999999999999999
//....................................................................................................

            BigDecimal sumBD = BigDecimal.ZERO;
        for (int i = 0; i < 10; i++) {
            sumBD = sumBD.add(new BigDecimal("0.1"));
        }

        System.out.println(sumBD); // ✅ 1.0
//...................................................................................................
//Float vs Double Precision Difference

        float f1 = 1.123456789f;
        double d1 = 1.123456789;

        System.out.println(f1); // ❌ 1.1234568
        System.out.println(d1); // ✅ 1.123456789

//...................................................................................................

        double d2 = 1.0 / 3.0;
        System.out.println(d2); // ❌ 0.3333333333333333

        BigDecimal d3 = new BigDecimal("1.0").divide(new BigDecimal("3.0"), 20, BigDecimal.ROUND_HALF_UP);
        System.out.println(d3); // ✅ 0.33333333333333333333

//...................................................................................................

        double d4 = 0.1 + 0.2;
        System.out.println(d4); // ❌ 0.30000000000000004

        BigDecimal d5 = new BigDecimal("0.1").add(new BigDecimal("0.2"));
        System.out.println(d5); // ✅ 0.3

//...................................................................................................

        double d6 = 1.0 / 7.0;
        System.out.println(d6); // ❌ 0.14285714285714285

        BigDecimal d7 = new BigDecimal("1.0").divide(new BigDecimal("7.0"), 20, BigDecimal.ROUND_HALF_UP);
        System.out.println(d7); // ✅ 0.14285714285714285714

//...................................................................................................

        double d8 = 0.1 * 0.1;
        System.out.println(d8); // ❌ 0.010000000000000002

        BigDecimal d9 = new BigDecimal("0.1").multiply(new BigDecimal("0.1"));
        System.out.println(d9); // ✅ 0.01

//...................................................................................................

        double d10 = 1.0 / 3.0 * 3.0;
        System.out.println(d10); // ❌ 0.9999999999999999

        BigDecimal d11 = new BigDecimal("1.0").divide(new BigDecimal("3.0"), 20, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("3.0"));
        System.out.println(d11); // ✅ 1.0

//...................................................................................................

        double d12 = 0.1 + 0.2 - 0.3;
        System.out.println(d12); // ❌ 5.551115123125783E-17

        BigDecimal d13 = new BigDecimal("0.1").add(new BigDecimal("0.2")).subtract(new BigDecimal("0.3"));
        System.out.println(d13); // ✅ 0.0

//...................................................................................................

        double d14 = 1.0 / 3.0 * 3.0 - 1.0;
        System.out.println(d14); // ❌ -1.1102230246251565E-16

        BigDecimal d15 = new BigDecimal("1.0").divide(new BigDecimal("3.0"), 20, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("3.0")).subtract(new BigDecimal("1.0"));
        System.out.println(d15); // ✅ 0.0

//...................................................................................................
        //Equality Comparison Problem 
        double d16 = 0.1 + 0.2;
        System.out.println(d16 == 0.3); // ❌ false

        BigDecimal d17 = new BigDecimal("0.1").add(new BigDecimal("0.2"));
        System.out.println(d17.equals(new BigDecimal("0.3"))); // ✅ true

    }
//..................................................................................................


}
