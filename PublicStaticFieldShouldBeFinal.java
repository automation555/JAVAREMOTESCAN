package javacodechecker;

public class PublicStaticFieldShouldBeFinal {
    // EMB-ISSUE: CodeIssueNames.PUBLIC_STATIC_FIELD_SHOULD_BE_FINAL
    public static String appPropertiesFile = "app/Application.properties";
    // EMB-ISSUE: CodeIssueNames.PUBLIC_STATIC_FIELD_SHOULD_BE_FINAL
    public static String DEFAULT_ERROR = "The value you entered was not understood. Please try again.";
    // EMB-ISSUE: CodeIssueNames.PUBLIC_STATIC_FIELD_SHOULD_BE_FINAL/no-detect
    public static final String appProperties = "app/Application.properties";
    
    public static String appPropertiesFile2 = "app/Application.properties";
    public static String appPropertiesFile3 = "app/Application.properties";
    public static String appPropertiesFile4 = "app/Application.properties";
    public static String appPropertiesFile6 = "app/Application.properties";
    public static String appPropertiesFile7 = "app/Application.properties";
    public static String appPropertiesFile8 = "app/Application.properties";
    public static String appPropertiesFile9 = "app/Application.properties";
}
