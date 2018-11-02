package app.git.com.mvpexample.View.AdaptersPacakge;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import app.git.com.mvpexample.ModelPackage.Pojo.Repository;
import app.git.com.mvpexample.R;


public class RepoRecyclerAdapter extends RecyclerView.Adapter<RepoRecyclerAdapter.ReposHolder> {

    private List<Repository> repositories;
    private Context context;

    public RepoRecyclerAdapter(List<Repository> repositories, Context context) {
        this.repositories = repositories;
        this.context = context;
    }


    @NonNull
    @Override
    public ReposHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.show_repos_row, parent, false);
        return new ReposHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReposHolder holder, int position) {

        holder.repoName.setText(repositories.get(position).getName());
        holder.repoUrl.setText(repositories.get(position).getOwner().getUrl());
        holder.repoSize.setText(String.valueOf(repositories.get(position).getSize()));
        holder.usedLanguage.setText(repositories.get(position).getLanguage());

    }

    @Override
    public int getItemCount() {
        return repositories.size();
    }


    class ReposHolder extends RecyclerView.ViewHolder{

        TextView repoName, usedLanguage, repoSize, repoUrl;

        public ReposHolder(View itemView) {

            super(itemView);
            repoName = itemView.findViewById(R.id.repo_name);
            usedLanguage = itemView.findViewById(R.id.repo_language);
            repoSize = itemView.findViewById(R.id.repo_size);
            repoUrl = itemView.findViewById(R.id.repo_url);
        }
    }
}
