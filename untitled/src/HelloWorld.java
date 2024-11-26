public class HelloWorld {
    public static void main(String [] args){
        float a = 10f;
        float c = 25f;
        float d = 45f;

        System.out.println(a);
        System.out.println(c);
        System.out.println(d);

        float sum = a + c;
        float sub = a -c;
        float mul = a * c;
        float div = a / c;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        String str1 = "Hello ";
        String str2 = "World!";
        String str3 = str1 + str2;
        System.out.println(a + " " + str3);

        int calculation = (1 + 2) * 3 * (4 + 8);
        System.out.println(calculation);



    }
}
