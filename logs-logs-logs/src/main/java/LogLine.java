public class LogLine {

    private final String message;

    private final LogLevel logLevel;



    public LogLine(String logLine) {
        String[] split = logLine.split(": ");
        message = split[1].trim();

        var log = split[0]
                .replace('[',' ')
                .replace(']', ' ')
                .trim();

        switch (log){
            case "TRC" -> logLevel = LogLevel.TRACE;
            case "DBG" -> logLevel = LogLevel.DEBUG;
            case "INF" -> logLevel = LogLevel.INFO;
            case "WRN" -> logLevel = LogLevel.WARNING;
            case "ERR" -> logLevel = LogLevel.ERROR;
            case "FTL" -> logLevel = LogLevel.FATAL;
            default -> logLevel = LogLevel.UNKNOWN;
        }

    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getOutputForShortLog() {
        return getLogLevel().getEncoded() + ":" + message;
    }
}
