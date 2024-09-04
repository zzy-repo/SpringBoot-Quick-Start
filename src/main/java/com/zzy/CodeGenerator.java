package com.zzy;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.fill.Column;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Scanner;

@Component
public class CodeGenerator {

    private static final String DB_HOST = System.getenv("DB_HOST") != null ? System.getenv("DB_HOST") : "localhost";
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "my_blog";
    private static final String username = System.getenv("DB_USERNAME") != null ? System.getenv("DB_USERNAME") : "root";
    private static final String password = System.getenv("DB_PASSWORD") != null ? System.getenv("DB_PASSWORD") : "YOUR_PASSWORD";

    private static final String url = String.format(
            "jdbc:mysql://%s:%s/%s?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC",
            DB_HOST,
            DB_PORT,
            DB_NAME
    );
    private static final String projectPath = System.getProperty("user.dir");
    private static final String parentPackageName = "com.zzy";
    private static final String author = "zzy";
    private static final String outPath = projectPath + "/src/main/java/";
    private static final String mapperPath = projectPath + "/src/main/java/com/zzy/mapper/xml/";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the database table names (separated by commas for multiple table names):");
        String tablesInput = scanner.nextLine();
        System.out.println("Please fill in the prefix to remove (if none, leave it blank):");
        String prefix = scanner.nextLine();
        scanner.close();
        String[] tableNames = tablesInput.split(",");
        execute(tableNames, prefix);
    }

    public static void execute(String[] tableNames, String prefix) {
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> builder.author(author).outputDir(outPath).disableOpenDir())
                .packageConfig(builder -> builder.parent(parentPackageName).pathInfo(Collections.singletonMap(OutputFile.xml, mapperPath)))
                .strategyConfig(builder -> {
                    builder.addInclude(tableNames)
                            .addTablePrefix(prefix)
                            .serviceBuilder().formatServiceFileName("%sService").formatServiceImplFileName("%sServiceImpl")
                            .entityBuilder()
                            .enableChainModel()
                            .enableLombok()
                            .enableTableFieldAnnotation()
                            .logicDeleteColumnName("deleted").logicDeletePropertyName("deleted")
                            .versionColumnName("version").versionPropertyName("version")
                            .addTableFills(new Column("create_time", FieldFill.INSERT))
                            .addTableFills(new Column("update_time", FieldFill.INSERT_UPDATE))
                            .controllerBuilder().enableRestStyle()
                            .mapperBuilder();
                })
                .execute();
    }
}
