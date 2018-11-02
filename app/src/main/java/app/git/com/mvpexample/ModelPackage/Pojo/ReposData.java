package app.git.com.mvpexample.ModelPackage.Pojo;

import com.google.gson.annotations.SerializedName;

public class ReposData {


    @SerializedName("RestResponse")
    private Repository restResponse;

    public Repository getRestResponse() {
        return restResponse;
    }


}
