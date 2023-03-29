public class Assignment1_08 {

    public static void main(String args[]) {

        // Convert byte value into String
        byte b = 100;
        String str = Byte.toString(b);
        System.out.println("Byte to String: " + str);

        // Convert byte value into Byte instance
        Byte bObj = new Byte(b);
        System.out.println("Byte to Byte instance: " + bObj);

        // Convert String instance into Byte instance
        String str2 = new String("80");
        Byte bObj2 = Byte.valueOf(str2);
        System.out.println("String to Byte instance: " + bObj2);
    
    }
}
