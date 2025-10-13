public class LogLevels {
    
    public static String message(String logLine) {
        String[] split = logLine.split(": ");
        return split[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] split = logLine.split(": ");
        return split[0].replace('[', ' ').replace(']', ' ').trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
