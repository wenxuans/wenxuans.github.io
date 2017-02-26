package com.example.hackmatch;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class Text {

    public Text() {

    }

    public Text(long id, String content) {
 	this.id = id;
	this.content = content;
    }

}
