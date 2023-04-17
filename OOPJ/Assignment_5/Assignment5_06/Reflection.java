package assignment5_06;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Reflection {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Fully Qualified class Name : ");
		Class<?> cls = Class.forName(sc.nextLine());
		
		System.out.println("\nName ");
		System.out.println("Class Name : "  + cls.getName());
		
		System.out.println("\nFields");
		Field[] fields = cls.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getName() + " ( " + field.getType().getSimpleName() + " )");
			
			Annotation[] annotation = field.getAnnotations();
			for(Annotation annotations : annotation) 
					System.out.println(" @" + annotations.annotationType().getSimpleName());
		}
		
		System.out.println("\nMethods");
		Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print("- " + method.getName() + " (");
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(parameterTypes[i].getSimpleName());
            }
            System.out.println(")");

            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println("    @" + annotation.annotationType().getSimpleName());
            }
        }
	}

}
