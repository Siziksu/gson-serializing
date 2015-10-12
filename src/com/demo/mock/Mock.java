package com.demo.mock;

import com.demo.object.User;

import java.util.ArrayList;
import java.util.List;

public class Mock {

  private static Mock instance;

  public static Mock getInstance() {
    if (instance == null) {
      instance = new Mock();
    }
    return instance;
  }

  private Mock() {
  }

  public User fakeRequest() {
    User r = new User();
    r.id = 1;
    r.name = "Esteban";
    List<String> list = new ArrayList<String>();
    list.add("Professor");
    list.add("Developer");
    r.professions = list;
    return r;
  }

  public String fakeResponse() {
    return "{\"id\":15,\"name\":\"Jane\"}";
  }

  public String fakeDataResponse() {
    return "{\"data\": {\"id\": 27,\"name\": \"Roger\"}}";
  }

  public String fakeArrayResponse() {
    return "[{\"id\":1,\"name\":\"Esteban\",\"professions\":[\"Professor\",\"Developer\"]},{\"id\":2,\"name\":\"Raul\",\"professions\":[\"Chemist\",\"Plant manager\"]}]";
  }

  public String fakeListResponse() {
    return "[{\"id\":78945,\"name\":\"John\"},{\"id\":25897,\"name\":\"Andrew\"},{\"id\":35981,\"name\":\"Joe\"}]";
  }

  public String fakeComplexResponse() {
    return "{\"id\":1001,\"name\":\"Complex Response\",\"tags\": [\"banana\",\"strawberry\",\"chocolate\"],\"friends\":[{\"id\":1,\"name\":\"John\"},{\"id\":2,\"name\":\"Mike\"}]}";
  }

  public String fakeListComplexResponse() {
    return "[{\"id\":2001,\"name\":\"List Complex Response 1\",\"tags\": [\"first\",\"second\",\"third\"],\"friends\":[{\"id\":1,\"name\":\"Joe\"},{\"id\":2,\"name\":\"Mark\"}]},{\"id\":2002,\"name\":\"List Complex Response 2\",\"tags\": [\"forth\",\"fifth\",\"sixth\"],\"friends\":[{\"id\":3,\"name\":\"Tom\"},{\"id\":4,\"name\":\"Axel\"}]}]";
  }
}
