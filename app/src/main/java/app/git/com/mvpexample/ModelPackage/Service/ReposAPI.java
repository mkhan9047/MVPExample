package app.git.com.mvpexample.ModelPackage.Service;

import java.util.List;

import app.git.com.mvpexample.ModelPackage.Pojo.Repository;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ReposAPI {

    @GET("users/mkhan9047/repos")
    Call<List<Repository>> getRepos();

}
