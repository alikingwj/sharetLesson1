package com.pdsu.service;

import com.pdsu.pojo.Classify;
import com.pdsu.pojo.Lesson;
import com.pdsu.pojo.User;

import java.util.List;

/**
 * @Auther: http://wangjie
 * @Date: 2019/3/17
 * @Description: com.pdsu.service
 * @version: 1.0
 */
public interface LessonService {

    /**
     * 根据老师id 查询他发布的课程
     * @param tid
     * @return
     */
    List<Lesson> getLessonByTeacherId(String tid);

    /**
     * 根据课程id 查询课程
     * @param lid
     * @return
     */
    Lesson selectByLid(String lid);

    /**
     * 查询所有审核通过且没有通知过开课结果，现在时间在截止时间之后（已经报名截止）
     * @return
     */
    List<Lesson> taskSelect();

    /**
     * 根据课程id，查询已经报名该课程的学生
     * @param lid
     * @return
     */
    List<String> selectUserByLesson(String lid);

    /**
     * 查询报名课程的人数
     * @param lesson
     * @return
     */
    int selectSignNum(Lesson lesson);

}
