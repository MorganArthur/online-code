package com.onlinecode.admin.process.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.onlinecode.admin.web.page.PageTable;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SqlRunnerTest {

    @Autowired
    private SqlRunnerFactory sqlRunnerFactory;

    @Test
    public void selectList() {

        DefaultSqlRunner sqlRunner = sqlRunnerFactory.openRunner();
//        Map<String, Object> params = new HashMap<>(8);
//        params.put("biz_tag", "leaf-segment-test");
//        List<Map<String, Object>> list = sqlRunner.selectList("SELECT biz_tag, max_id, step, update_time FROM leaf_alloc WHERE biz_tag=#{biz_tag}", params);
//        Map<String, Object> insertData = new HashMap<>(8);
//        insertData.put("biz_tag", "sys_process_task");
//        insertData.put("max_id", 1);
//        insertData.put("step", 2000);
//        insertData.put("description", "流程表主键1");
//        insertData.put("update_time", new Date());
//        int num = sqlRunner.insert("INSERT INTO leaf_alloc(biz_tag, max_id, step, description, update_time) VALUES (#{biz_tag}, #{max_id}, #{step}, #{description}, #{update_time})", insertData);
//        Map<String, Object> updateData = new HashMap<>(8);
//        updateData.put("biz_tag", "sys_process_task");
//        updateData.put("step", "sys_process_task");
//        insertData.put("update_time", new Date());
//        // 测试报错自动回滚
//        num = sqlRunner.update("UPDATE leaf_alloc SET step = #{step}, update_time = #{update_time} WHERE biz_tag = #{biz_tag}", updateData);

//        Map<String, Object> vars = new HashMap<>(8);
        String sql = "SELECT"
                + " id, user_name, nick_name, email, avatar, password, locked, status, create_time, create_by, update_time, update_by"
                + " FROM sys_user WHERE del_flag='0'";
//        ;
//        if (StringUtils.isNotEmpty(MapUtils.getString(vars, "userName"))) {
//            sql += " AND user_name like concat(\"%\",#{userName},\"%\")";
//        }
//        if (StringUtils.isNotEmpty(MapUtils.getString(vars, "nickName"))) {
//            sql += " AND nick_name like concat(\"%\",#{nickName},\"%\")";
//        }
//        // 分页
//        PageHelper.startPage((int) vars.getOrDefault("pageNum", 1), (int) vars.getOrDefault("pageSize", 0));
//        // 查询
//        List<Map<String, Object>> list = sqlRunner.selectList(sql, vars, true);
//        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(list);
//        sqlRunner.close();
//        // 设置返回结果
//        vars.put("flowRes", PageTable.page(pageInfo.getTotal(), pageInfo.getList()));
        sqlRunner.selectPage(sql, 1, 10);
//        sqlRunner.commit();
//        sqlRunner.close();



    }

}
