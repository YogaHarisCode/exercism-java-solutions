public enum LogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);

    private final int encoded;

    LogLevel(int encoded) {
        this.encoded = encoded;
    }

    public int getEncoded() {
        return encoded;
    }
}
