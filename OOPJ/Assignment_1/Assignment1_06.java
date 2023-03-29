class Assignment1_06 {
    public static void main(String arg[]) {
        
        // Convert boolean value into String
        boolean b = true;
        String str = Boolean.toString(b);
        System.out.println("Boolean to String: " + str);

        // Convert boolean value into Boolean instance
        Boolean bObj = new Boolean(b);
        System.out.println("Boolean to Boolean instance: " + bObj);

        // Convert String value into boolean value
        String str2 = "false";
        boolean b2 = Boolean.parseBoolean(str2);
        System.out.println("String to boolean: " + b2);

        // Convert String value into Boolean instance
        Boolean bObj2 = new Boolean(Boolean.valueOf(str2));
        System.out.println("String to Boolean instance: " + bObj2);

    }
}