package com.example.hackmatch;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {

   @JsonProperty("greeting")
   public String greeting = "hi";

}
