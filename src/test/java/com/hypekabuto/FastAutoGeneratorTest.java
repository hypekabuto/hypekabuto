package com.hypekabuto;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;

public class FastAutoGeneratorTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hypekabuto?serverTimezone=UTC";
        String username = "root";
        String password = "root";
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("mjy") // 设置作者
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\study\\个人博客\\hypekabuto\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.hypekabuto") // 设置父包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D:\\study\\个人博客\\hypekabuto\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude() // 设置需要生成的表名
                            .addTablePrefix(); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
