package com.softserve.ezn4.praktyki.subject;

public class SubjectDTO {
    public static final String ID = "id";
    public static final String NAME = "namesubject";
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
