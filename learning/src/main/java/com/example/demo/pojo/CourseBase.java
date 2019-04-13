package com.example.demo.pojo;

public class CourseBase {
    private Integer id;
    private String name;
    private String description;
    private String studyModel;
    private Integer status;
    private String picPath;
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStudyModel() {
        return studyModel;
    }

    public void setStudyModel(String studyModel) {
        this.studyModel = studyModel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "CourseBase{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", studyModel='" + studyModel + '\'' +
                ", status='" + status + '\'' +
                ", picPath='" + picPath + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
