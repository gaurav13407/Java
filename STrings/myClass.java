public class myClass {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java";
        String str3=new String("java");
    // Comparing "Refreneces" using == operator
        System.out.println("Comparing "+ str1+" and "+ str2+" using == operator: " + (str1 == str2)); // true
        System.out.println("Comparing "+ str1+" and "+str3+" using == operator: " + (str1 == str3)); // false
        //Comparing the vaues using equals() method
        // The equals() method compares the actual content of the strings
        System.out.println("Comparing " +str1 +" and "+ str2+" Using equals() "+str1.equals(str2));
        System.out.println("Comparing " +str1 +" and "+ str3+" Using equals() "+str1.equals(str3));

        //Comparing the values using equalsIgnoreCase() method to avoid case sensitivity
         System.out.println("Comparing " +str1 +" and "+ str2+" Using equals() "+str1.equalsIgnoreCase(str2));
         System.out.println("Comparing " +str1 +" and "+ str3+" Using equals() "+str1.equalsIgnoreCase(str3));
    }

}
