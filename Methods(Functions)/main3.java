public class main3 {
    public static void modifyPrimitive(int number){
        number=20;
        System.out.println("Inside method,number:"+number);
    }
    public static void modifyArray(int[] array){
        array[0]=99;
        System.out.println("Inside method,array[0]: "+array[0]);
    }
    public static void changeName(String name){
        name="Frank";
        System.out.println("Name inside the method: "+ name);
    }
    public static void main(String[] args) {
        int originalNUmber=10;
        modifyPrimitive(originalNUmber);
        System.out.println("After Method call,orginalNumebr:"+originalNUmber);

        int[] OriginalArray={1,2,3};
        System.out.println("Before Method call,orginalArray[0] :"+OriginalArray[0]);
        modifyArray(OriginalArray);
        System.out.println("After Method call,orginalArray[0] :"+OriginalArray[0]);

        String name="joe";
        System.out.println("Nmae BEfore  Method:"+name);
        changeName(name);
        System.out.println("Nmae After Method:"+name);
    }    
}
