package Lesson14;

public class BasicallySpeaking {
    public static void main(String[] args) {
        System.out.print("Decimal  ");
        System.out.print("Binary    ");
        System.out.print("Octal  ");
        System.out.print("Hex  ");
        System.out.println("Character");

        for(int i = 65; i <= 90; i++ ) {
            System.out.print(i);
            System.out.print("       ");
            System.out.print(Integer.toBinaryString(i));
            System.out.print("   ");
            System.out.print(Integer.toOctalString(i));
            System.out.print("    ");
            System.out.print(Integer.toHexString(i));
            System.out.print("   ");
            System.out.println((char) i);
        }
    }
}
