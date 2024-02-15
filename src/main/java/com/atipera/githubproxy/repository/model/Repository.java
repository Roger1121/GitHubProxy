package com.atipera.githubproxy.repository.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(value = {"fork"}, allowSetters = true)
public class Repository {
    private String name;
    private boolean fork;
    private Owner owner;
    private List<Branch> branches;
}
