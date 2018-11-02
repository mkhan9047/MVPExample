package app.git.com.mvpexample.View.Activity;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.List;

import app.git.com.mvpexample.PresenterPackage.ReposPresenter;
import app.git.com.mvpexample.View.AdaptersPacakge.RepoRecyclerAdapter;
import app.git.com.mvpexample.ModelPackage.Pojo.Repository;
import app.git.com.mvpexample.R;
import app.git.com.mvpexample.View.RepositoryView;

public class MainActivity extends AppCompatActivity implements RepositoryView {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ReposPresenter reposPresenter = new ReposPresenter(this);

        reposPresenter.getRepos("Hello are you got it?");


    }

    private void initView() {

        recyclerView = findViewById(R.id.repos_list);
    }

    @Override
    public void reposReady(List<Repository> repositoryList) {

        RepoRecyclerAdapter adapter = new RepoRecyclerAdapter(repositoryList, this);
        recyclerView.setAdapter(adapter);

    }
}
