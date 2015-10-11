package com.demo;

import com.demo.mock.Mock;
import com.demo.object.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    new Main().start();
  }

  private String request;

  private String fakeResponse;
  private String fakeDataResponse;
  private String fakeListResponse;
  private String fakeComplexResponse;
  private String fakeListComplexResponse;

  private Response userResponse;
  private Data dataResponse;
  private DataGenerics<User> genericsResponse;
  private List<Response> listResponse;
  private ComplexResponse complexResponse;
  private List<ComplexResponse> listComplexResponse;

  public void start() {
    Gson gson = new GsonBuilder().serializeNulls().create();

    // Java Object to Json String
    request = gson.toJson(Mock.getInstance().fakeRequest());

    // Json Strings
    fakeResponse = Mock.getInstance().fakeResponse();
    fakeDataResponse = Mock.getInstance().fakeDataResponse();
    fakeListResponse = Mock.getInstance().fakeListResponse();
    fakeComplexResponse = Mock.getInstance().fakeComplexResponse();
    fakeListComplexResponse = Mock.getInstance().fakeListComplexResponse();

    // Json Strings to Java Objects
    userResponse = gson.fromJson(fakeResponse, Response.class);
    dataResponse = gson.fromJson(fakeDataResponse, Data.class);
    genericsResponse = gson.fromJson(fakeDataResponse, new TypeToken<DataGenerics<User>>() {}.getType());
    listResponse = gson.fromJson(fakeListResponse, new TypeToken<List<Response>>() {}.getType());
    complexResponse = gson.fromJson(fakeComplexResponse, ComplexResponse.class);
    listComplexResponse = gson.fromJson(fakeListComplexResponse, new TypeToken<List<ComplexResponse>>() {}.getType());

    printRequests();
    printResponses();
    printResults();
  }

  private void printRequests() {
    System.out.println();
    System.out.println("<Request>");
    System.out.println("user: " + request);
    System.out.println("</Request>");
  }

  private void printResponses() {
    System.out.println();
    System.out.println("<Fake Responses>");
    System.out.println("response: " + fakeResponse);
    System.out.println("data response: " + fakeDataResponse);
    System.out.println("list response: " + fakeListResponse);
    System.out.println("complex response: " + fakeComplexResponse);
    System.out.println("list complex response: " + fakeListComplexResponse);
    System.out.println("</Fake Responses>");
  }

  private void printResults() {
    System.out.println();
    System.out.println("<User Response>");
    System.out.println("user id: " + userResponse.id + ", name: " + userResponse.name);
    System.out.println("</User Response>");
    System.out.println();
    System.out.println("<Data Response>");
    System.out.println("user id: " + dataResponse.data.id + ", name: " + dataResponse.data.name);
    System.out.println("</Data Response>");
    System.out.println();
    System.out.println("<Data Generics Response>");
    System.out.println("user id: " + genericsResponse.data.id + ", name: " + genericsResponse.data.name);
    System.out.println("</Data Generics Response>");
    System.out.println();
    System.out.println("<List Response>");
    for (Response lr : listResponse) {
      System.out.println("user id: " + lr.id + ", name: " + lr.name);
    }
    System.out.println("</List Response>");
    System.out.println();
    System.out.println("<Complex Response>");
    System.out.println("user id: " + complexResponse.id + ", name: " + complexResponse.name);
    for (String s : complexResponse.tags) {
      System.out.println("tag: " + s);
    }
    for (User r : complexResponse.friends) {
      System.out.println("friend id: " + r.id + ", name: " + r.name);
    }
    System.out.println("</Complex Response>");
    System.out.println();
    System.out.println("<List Complex Response>");
    for (ComplexResponse cr : listComplexResponse) {
      System.out.println("id: " + cr.id + ", name: " + cr.name);
      for (String s : cr.tags) {
        System.out.println("tag: " + s);
      }
      for (User r : cr.friends) {
        System.out.println("friend id: " + r.id + ", name: " + r.name);
      }
    }
    System.out.println("</List Complex Response>");
  }
}
