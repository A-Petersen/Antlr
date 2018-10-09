
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.stringtemplate.v4.*;

public class TestRig {
    public static void main(String[] args) throws Exception {
        CharStream input;
        if (args.length>0) input = new ANTLRFileStream(args[0]);
        else input = new ANTLRInputStream(System.in);
        TimeLexer lex = new TimeLexer(input);
        Token t;
        do {
            t = lex.nextToken();
            ST templateText = new ST("<Line>\t<CharPos>\t<Type>\t<Name>\t<Text>");
            templateText.add("Line", t.getLine());
            templateText.add("CharPos", t.getCharPositionInLine());
            templateText.add("Type", t.getType());
            templateText.add("Text", t.getText());
            System.out.println(templateText.render());
        } while ( t.getType()!= Token.EOF );
    }
}
