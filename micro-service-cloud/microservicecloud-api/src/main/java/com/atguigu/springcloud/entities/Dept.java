package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor//无参构造
@AllArgsConstructor//全参构造
@Accessors(chain = true)//链式调用,链式调用是指在一行代码中依次调用多个 setter 方法，连续设置对象的多个属性
/*
EX:Person person = new Person();
person.setName("John").setAge(30).setAddress("123 Main St");
* * */
public class Dept implements Serializable //必须序列化
{
    private Long deptno;   //主键
    private String dname;   //部门名称
    private String db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}
 
 