package br.com.tests.core;
import io.restassured.http.ContentType;

public class Constant {

    static String APP_BASE_URL = "https://reqres.in/api";
    static Integer APP_PORT = 443; // Porta padrão para "https"
    static String APP_BASE_PATH = "";
    static ContentType APP_CONTENT_TYPE = ContentType.JSON;
    static Long MAX_TIMEOUT = 8000L;
}
