package app.git.com.mvpexample.View;

import java.util.List;

import app.git.com.mvpexample.ModelPackage.Pojo.Repository;

public interface RepositoryView {

    void reposReady(List<Repository> repositoryList);

}
