package a5;

import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CallGraphTest {

    @Test
    public void callGraphRec() throws Exception {
        String[] content = {"C:\\Users\\Arne\\Documents\\Intellij_Projekte\\Antlr_pc\\src\\a5\\rec.cymbol"};
        CallGraph.main(content);
        String result = readFile("C:\\Users\\Arne\\Documents\\Intellij_Projekte\\Antlr_pc\\newDot.txt", StandardCharsets.UTF_8);
        List<String> resultList = Arrays.asList(result.split(";"));
        String compare = readFile("C:\\Users\\Arne\\Documents\\Intellij_Projekte\\Antlr_pc\\src\\a5\\testCymbolRec.txt", StandardCharsets.UTF_8);
        List<String> objectsList = Arrays.asList(compare.split(";"));

        assertEquals(resultList.size(), objectsList.size());

        resultList.forEach(x -> {
            if (objectsList.stream().anyMatch(y -> y.equals(x)) == false) {
                System.out.println("Failure at: [" + x + "]");
            }
        } );

        resultList.forEach(x -> assertTrue(objectsList.stream().anyMatch(y -> y.equals(x))));
    }


    private static String readFile(String path, Charset encoding) throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}

