package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMain() {
        String input = "2\n1\nJohn Doe\n123456789\n5000\n10\n2\nJane Doe\n987654321\n40\n50\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[]{});

    }
}