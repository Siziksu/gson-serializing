package com.demo.object;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataGenerics<O> {

  @SerializedName("data")
  @Expose
  public O data;
}
