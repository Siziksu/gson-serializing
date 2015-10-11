package com.demo.object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ComplexResponse {

  @SerializedName("id")
  @Expose
  public long id;
  @SerializedName("name")
  @Expose
  public String name;
  @SerializedName("tags")
  @Expose
  public List<String> tags;
  @SerializedName("friends")
  @Expose
  public List<User> friends;
}
