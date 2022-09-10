package ma.maneo.kosc.security.common;

public interface SecurityParams {
    public static final String JWT_HEADER_NAME = "Authorization";
    public static final String SECRET = "8321549b-09e3-490b-9a67-aa8a14864803";
    public static final long EXPIRATION = 86400000;
    public static final String HEADER_PREFIX = "Bearer ";
}
