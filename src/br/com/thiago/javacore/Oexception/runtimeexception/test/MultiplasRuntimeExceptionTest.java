package br.com.thiago.javacore.Oexception.runtimeexception.test;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (ArithmeticException | IllegalArgumentException | IndexOutOfBoundsException e) {
            System.out.println("DENTRO DO ArrayIndexOutOfBoundsException");
        }
        System.out.println("FINAL DO PROGRAMA");

        try {
            talvezLanceException();
        } catch (Exception e) {

        }
    }


    private static void talvezLanceException() throws SQLException, AWTException, IOException {

    }
}

