package Type;

abstract public class Type {
    public enum Types {
        VOID, INT, BOOL, STRING, CLASS, ARRAY, FUNCTION
    }

    public enum BaseTypes {
        VOID, INT, BOOL, STRING
    }

    private Types type;
}