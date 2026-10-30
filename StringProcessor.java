public class StringProcessor {

    public static String processString(
            String str, StringOperation operation) {

        return operation.apply(str);
    }
}
