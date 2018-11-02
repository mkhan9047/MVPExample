package app.git.com.mvpexample.ModelPackage.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ReposService {

    public static Retrofit retrofit;

    public ReposAPI getAPI() {

        String BASE_URL = "https://api.github.com/";

        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(ReposAPI.class);
    }
}
