package cl.telematica.basicconnectionexample.connection;
import retrofit2.Retrofit;

public class MyApiAdapter {

    private static MyApiService API_SERVICE;

    public static MyApiService getApiService() {

        String baseUrl = "http://www.mocky.io/v2/";

        if (API_SERVICE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .build();
            API_SERVICE = retrofit.create(MyApiService.class);
        }

        return API_SERVICE;
    }

}