package com.feng.utils.mybatis.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;

/**
 * Hello world!
 */
public class GeneratorSQLmap {
    public GeneratorSQLmap() {
    }

    public void generator() throws Exception {
        ArrayList warnings = new ArrayList();
        boolean overwrite = true;
        // 获取配置文件
        File configFile = new File(getClass().getClassLoader().getResource("generatorConfig.xml").getFile());
        //解析配置文件
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate((ProgressCallback)null);
    }

    public static void main(String[] args) throws Exception {
        try {
            GeneratorSQLmap e = new GeneratorSQLmap();
            e.generator();
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }
}

