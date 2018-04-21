package AST_Node;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class Location {
    private final int line, column;

    public Location(int line, int column) {
        this.line = line;
        this.column = column;
    }

    static public Location ctx(ParserRuleContext ctx){
        Token tmp_token = ctx.getStart();
        return new Location(tmp_token.getLine(),tmp_token.getCharPositionInLine());
    }

    public int getLine() { return line; }

    public int getColumn() { return column; }

    @Override
    public String toString() {
        return String.format("(Line:%d, Colume:%d",line,column);
    }
}
