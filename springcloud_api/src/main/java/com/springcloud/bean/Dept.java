package com.springcloud.bean;

import java.io.Serializable;


public class Dept implements Serializable {

    private Integer dept_no;    //主键
    private String dept_name;   //部门名称
    private String db_source;   //来自哪个数据库

    public Dept() {
    }

    public Dept(Integer dept_no, String dept_name, String db_source) {
        this.dept_no = dept_no;
        this.dept_name = dept_name;
        this.db_source = db_source;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dept_no=" + dept_no +
                ", dept_name='" + dept_name + '\'' +
                ", db_source='" + db_source + '\'' +
                '}';
    }

    public Integer getDept_no() {
        return dept_no;
    }

    public void setDept_no(Integer dept_no) {
        this.dept_no = dept_no;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }
}
