package com.lwt.generator;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

public class MyGenerator {

    public static void main(String[] args) {


        AutoGenerator autoGenerator = new AutoGenerator();
        //设置数据库的连接信息
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/student?useSSL=false");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("root");
        autoGenerator.setDataSource(dataSourceConfig);

        //设置全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        String s = System.getProperty("user.dir");//创建项目的原因导致工程目录为D:\java-study\study\mybatis_plus
        String s1 = s.substring(0, s.lastIndexOf('\\'));//而模块不在mybatis_plus下，故要切割后面的文件夹名
        globalConfig.setOutputDir(s1+"/generator/src/main/java");//设置代码的输出位置
        globalConfig.setOpen(false);//设置代码生成完毕后是否打开代码所在的目录
        globalConfig.setAuthor("涛");//设置作者
        globalConfig.setFileOverride(true);//设置是否覆盖原始生成的文件
        globalConfig.setMapperName("%sDao");//设置数据层接口名，%为占位符，指代模块名称
        globalConfig.setIdType(IdType.ASSIGN_ID);//设置id生成策略
        autoGenerator.setGlobalConfig(globalConfig);

        //设置报名相关配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.lwt");//设置生成包名，与代码所在位置不冲突，二者叠加组成完整路径
        packageConfig.setEntity("domain");//设置实体包类名
        packageConfig.setMapper("dao");//设置数据层包名
        autoGenerator.setPackageInfo(packageConfig);

        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("student");//设置当前参与生成的表名，参数为可变参数
        //strategyConfig.setTablePrefix("")//设置数据库表名前缀名称，模块名=数据库表名-前缀名 。如tb_user的tb_
        strategyConfig.setRestControllerStyle(true);//设置是都启用Rest风格
        strategyConfig.setVersionFieldName("version");//设置乐观锁字段名
        strategyConfig.setLogicDeleteFieldName("deleted");//设置逻辑字段名
        strategyConfig.setEntityLombokModel(true);//设置是否启用lombok
        autoGenerator.setStrategy(strategyConfig);

        autoGenerator.execute();


    }
}
