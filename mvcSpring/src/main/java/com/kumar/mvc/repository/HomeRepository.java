package com.kumar.mvc.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HomeRepository {

    public String getData() {
        return "Data from the Repository Layer.";
    }
}
