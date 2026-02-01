package FirstProjectDemo;

public class FirstPrgm {
    public static void main(String[] args) {
        
        int a=10;
        float b=5.897f;
        char c='$';
        double d=123.1234567;
        long l=234123456;

        String str="Hello World!";
        int [] arr={10,20,30,40,50,60};

        System.out.println("Printing The Variable Values\n ");
        System.out.println("Integer value a= "+ a);
        System.out.println("Float value b= "+ b);
        System.out.println("Character value c= "+ c);
        System.out.println("Double value d= "+ d);
        System.out.println("long value l= "+ l);

        System.out.println("\nString value = "+ str);
        System.out.println("\nArray value = "+ arr);
        System.out.println("Above Given output for Array elements , it shows the location of the array");

        System.out.println("\n4th Value in array is: " +arr[3]);
        System.out.println("2th Value in array is: " +arr[1]);

        System.out.println("\nArray Values Are:");
        for(int i=0;i<6;i++){
            System.out.println(arr[i]);
        }

    }
}
