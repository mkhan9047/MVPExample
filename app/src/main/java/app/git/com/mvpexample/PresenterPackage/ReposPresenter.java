package app.git.com.mvpexample.PresenterPackage;

import android.support.annotation.NonNull;
import android.widget.Toast;

import java.util.List;

import app.git.com.mvpexample.ModelPackage.Pojo.Repository;
import app.git.com.mvpexample.ModelPackage.Service.ReposService;
import app.git.com.mvpexample.View.RepositoryView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ReposPresenter {

    private RepositoryView repositoryView;
    private ReposService reposService;

    public ReposPresenter(RepositoryView repositoryView) {
        this.repositoryView = repositoryView;

        if(reposService == null){
            reposService = new ReposService();
        }
    }


   public void getRepos(){
        reposService.getAPI()
                .getRepos()
                .enqueue(new Callback<List<Repository>>() {
                    @Override
                    public void onResponse(@NonNull Call<List<Repository>> call, @NonNull Response<List<Repository>> response) {
                        if(response.body()!= null){

                            List<Repository> repositoryList = response.body();

                            repositoryView.reposReady(repositoryList);


                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<List<Repository>> call, @NonNull Throwable t) {
                        try {
                            throw new InterruptedException("Something went wrong!");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
   }
}
