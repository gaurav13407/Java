public class RELATIONAL {
    public static void main(String[] args) {
        //Ealtional; operators
        int a=5;
        int b=5;
        //Eqyal operator
        boolean isEqual = (a == b); // Equal to operator
        System.out.println("Is a equal to b?: " + isEqual); // true
        //Not equal operator
        boolean isNotEqual = (a != b); // Not equal to operator
        System.out.println("Is a not equal to b?: " + isNotEqual); // false
        //Greater than operator
        boolean isGreaterThan = (a > b); // Greater than operator
        System.out.println("Is a greater than b?: " + isGreaterThan); // false
        //Less than operator
        boolean isLessThan = (a < b); // Less than operator
        System.out.println("Is a less than b?: " + isLessThan); // false
        //Greater than or equal to operator
        boolean isGreaterThanOrEqual = (a >= b); // Greater than or equal to operator
        System.out.println("Is a greater than or equal to b?: " + isGreaterThanOrEqual); // true
        //Less than or equal to operator
        boolean isLessThanOrEqual = (a <= b); // Less than or equal to operator
        System.out.println("Is a less than or equal to b?: " + isLessThanOrEqual); // true
        //Logical operators
        boolean c = true;
        boolean d = false;
        //Logical AND operator
        boolean andResult = (c && d); // Logical AND operator
        System.out.println("Logical AND of c and d: " + andResult); // false
        //Logical OR operator
        boolean orResult = (c || d); // Logical OR operator
        System.out.println("Logical OR of c and d: " + orResult); // true
        //Logical NOT operator
        boolean notResult = !c; // Logical NOT operator
        System.out.println("Logical NOT of c: " + notResult); // false
        //Ternary operator
        int max = (a > b) ? a : b; // Ternary operator
        System.out.println("Maximum of a and b: " + max); // 5

        //Compounnd Operator
        int x = 10;
        x+=3; // Compound assignment operator (equivalent to x = x + 3)
        System.out.println("Value of x after compound assignment: " + x); // 13
        int y = 20;
        y-=5; // Compound assignment operator (equivalent to y = y - 5)
        System.out.println("Value of y after compound assignment: " + y); // 15
        int z = 30;
        z*=2; // Compound assignment operator (equivalent to z = z * 2)
        System.out.println("Value of z after compound assignment: " + z); // 60
        int w = 40;
        w/=4; // Compound assignment operator (equivalent to w = w / 4)
        System.out.println("Value of w after compound assignment: " + w); // 10
        int v = 50;
        v%=6; // Compound assignment operator (equivalent to v = v % 6)
        System.out.println("Value of v after compound assignment: " + v); // 2
    }
    
}
