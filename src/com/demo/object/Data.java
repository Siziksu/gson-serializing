package com.demo.object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

  @SerializedName("data")
  @Expose
  public User data;
}
