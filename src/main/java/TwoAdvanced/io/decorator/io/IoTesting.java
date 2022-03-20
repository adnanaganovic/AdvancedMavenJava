package TwoAdvanced.io.decorator.io;

import TwoAdvanced.exception.Reader;

import java.io.PrintStream;

public class IoTesting {
    public static void main(String[] args) {
        String variable = Reader.name;
        PrintStream printStream = System.out;
        printStream.println("Vozdra raja na drugačiji način");
    }
}
