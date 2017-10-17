package com.shopping.query;

import java.util.ArrayList;
import java.util.List;

//查询的基类
public class QueryObject {
    protected List<String> conditions = new ArrayList<>();
    protected List<Object> parameters = new ArrayList<>();
    
    public String getQuery() {
        StringBuilder sql = new StringBuilder();
        this.customizedQuery();
        for(int i = 0;i<conditions.size();i++){
            if (i == 0) {
                sql.append("WHERE");
            } else {
                sql.append("AND");
            }
            sql.append(conditions.get(i));
        }
        return sql.toString();
    }

    public List<Object> getParameters() {
        return this.parameters;
    }
//专门用来暴露给子类,添加自身的信息的方法
protected void customizedQuery() {

    }
//判断是否有长度
    protected static boolean hasLength(String str) {
        return str != null && !"".equals(str.trim());
    }
}
