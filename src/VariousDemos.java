public class VariousDemos {
    public static void main(String[] args) {
        double π = 3.14159265358979323846;
        System.out.println(π);

        System.out.println(0.1 + 0.2 == 0.3);

        System.out.println('\u03c0'); // displays π

        byte number = 42;   // 42 represented as a byte
        short number2 = 42; // 42 represented as a short
        int number3 = 42;   // 42 represented as an int
        long number4 = 42;  // 42 represented as a long

        System.out.println("Hello" + System.lineSeparator() + "world");

        long startTime = System.nanoTime();
        double value = 0;
        for (int i = 0; i < 500; ++i) {
            // try uncommenting the following statements to see what effect
            // they have on the program runtime...
            value = i;
//            value = Math.pow(2, i);
//            value = Math.pow(i,2);
//            value = Math.pow(i, Math.random());
        }
        long endTime = System.nanoTime();

        System.out.print("It took ~");
        double milliseconds = 1.0 * (endTime - startTime) / 1_000_000;
        System.out.print(milliseconds);
        System.out.println(" ms to finish the for loop above");

        int x = 42;
        Math.sqrt(x);
        System.out.println( Math.sqrt(x) ); // Display the square root of x.

        System.out.printf("π ≈ %.2f\n", Math.PI); // approximate value of pi

        System.out.printf("%s%10s!\n","Hello", "world");
        System.out.printf("%d %10d\n", 42, 42);
        System.out.printf("%f %10.2f\n", Math.PI, Math.PI);
        System.out.printf("Your money is $%,.2f\n", 1_000_000.5);

        int count = 10;
        System.out.println("count: " + count);
        ++count;
        System.out.println("count: " + count);
        count++;
        System.out.println("count: " + count);

        int y = ++count;
        System.out.println("y: " + y);
        System.out.println("count: " + count);
        y = count++;
        System.out.println("y: " + y);
        System.out.println("count: " + count);

        double amount = 0;
        --amount;
        System.out.println("amount: " + amount);
        System.out.println("amount: " + amount--);
        System.out.println("amount: " + amount);
        System.out.println("amount: " + ++amount);
        System.out.println("amount: " + amount);

        int age = 17;
        String text = age < 19 ? "kid" : "adult";
        System.out.println(age + " year old " + text);

        int first = 0, second = 0;
        first = second = 42;
        System.out.println("first " + first);
        System.out.println("second " + second);

        System.out.println( (int) 3.14159265358979323846 );
        System.out.println( (int) 'A' );
        System.out.println( (byte) 1000 );

        String information = String.valueOf(3.1415); // creates the String "3.1415"
        int id = Integer.parseInt("12112"); // creates the int 12112
        double cost = Double.parseDouble("19.99"); // creates the double 19.99
    }
}
