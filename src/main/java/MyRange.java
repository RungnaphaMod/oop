public class MyRange {

    public static final int ASCII_VALUE_OF_1 = 48;
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }
    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }

    public boolean isStartWithExclude() {
        return this.input.startsWith("(");
    }



    public int getStart() {
        if(isStartWithInclude()) {
            return Integer.parseInt(String.valueOf(this.input.charAt(1)));
        }
        return -1;
    }

    public boolean isEndWithInclude() {
        return this.input.endsWith("]");
    }

    public int getEnd() {
        int inputLength = this.input.length();
        if(isEndWithInclude()) {
            return Integer.parseInt(String.valueOf(this.input.charAt(inputLength - 2)));
        }
        return -1;

    }

    public String getResult() {
        int startNumber = getStart();
        int endNumber = getEnd();
        // TODO
        return "1,2,3,4,5";
    }
}
