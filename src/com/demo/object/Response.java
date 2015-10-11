package com.demo.object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

  @SerializedName("id")
  @Expose
  public long id;
  @SerializedName("name")
  @Expose
  public String name;
}
