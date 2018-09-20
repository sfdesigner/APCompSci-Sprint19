public class Main {

    public static void main(String[] args) {

        // I: Number functions
        double a = Math.floor(1.99); // a = 1
        double b = Math.ceil(1.01);  // b = 2
        double c = Math.round(1.49); // c = 1
        System.out.printf("Rounding >> floor %f >> ceil %f >> round %f \n", a, b, c);

        // II: Algebraic functions
        double d = Math.pow(2,8);    // d = 256.0
        double e = Math.sqrt(256.0); // e = 128.0
        double f = Math.cbrt(27);    // f = 3.0
        double g = Math.PI;          // Represents pi
        double h = Math.E;           // Represents Euclid's number
        double i = Math.log(50);     // Returns the *natural* logarithm
        double j = Math.log10(50);   // Returns the common (base-10) logarithm
        double k = Math.abs(-1);     // k = 1.0

        // III: Trigonometric functions
        double l = Math.sin(2);      // Returns sine (using radians)
        double m = Math.cos(2);      // Returns cosine (using radians)
        double n = Math.tan(2);      // Returns tangent (using radians)
        double o = Math.asin(2);     // Returns arc sine (using radians)
        double p = Math.acos(2);     // Returns arc cosine (using radians)
        double q = Math.atan(2);     // Returns arc tangent (using radians)
        double r = Math.toRadians(90.0);            // Returns radians
        double s = Math.toDegrees(Math.PI * 2);     // Returns degrees
        double t = Math.cos(Math.toRadians(Math.PI * 2)); // Nested method calls

        // IV: Comparison functions
        double max = Math.max(1,2);  // Returns 2
        double min = Math.min(1,2);  // Returns 1
    }
}