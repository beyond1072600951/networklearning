package com.example.demo.pojo;

import java.util.Date;

public class CourseRecord {
    private Integer id;
    private Integer userId;
    private Integer courseBaseId;
    private Integer coursePlanId;
    private Date recordTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCourseBaseId() {
        return courseBaseId;
    }

    public void setCourseBaseId(Integer courseBaseId) {
        this.courseBaseId = courseBaseId;
    }

    public Integer getCoursePlanId() {
        return coursePlanId;
    }

    public void setCoursePlanId(Integer coursePlanId) {
        this.coursePlanId = coursePlanId;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}
