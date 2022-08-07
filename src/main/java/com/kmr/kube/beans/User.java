package com.kmr.kube.beans;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class User {

    private String name;
    private String email;
    private String mob;
}
