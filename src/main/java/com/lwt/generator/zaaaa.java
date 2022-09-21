package com.lwt.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;

public class zaaaa {

    public static void main(String[] args) {

        /*DataSourceConfig.Builder dataSource = new DataSourceConfig.Builder
                ("jdbc:mysql://localhost:3306/student?useSSL=false","root","root");

        AutoGenerator autoGenerator = new AutoGenerator(dataSource.build());
        GlobalConfig globalConfig = autoGenerator.getGlobalConfig();


        autoGenerator.execute();*/

        AutoGenerator autoGenerator = new AutoGenerator();
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/student?useSSL=false");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("root");

        autoGenerator.setDataSource(dataSourceConfig);

        autoGenerator.execute();


    }
}
