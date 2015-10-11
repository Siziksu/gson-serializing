package com.demo.object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {

  @SerializedName("id")
  @Expose
  public long id;
  @SerializedName("name")
  @Expose
  public String name;
  @SerializedName("professions")
  @Expose
  public List<String> professions;
}
