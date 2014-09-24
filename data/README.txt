// 生成Mybatis配置文件
generatorConfig_Mysql.xml 为mysql配置文件
generatorConfig_Oracle.xml 为Oracle配置文件

targetProject路径必须为存在的路径
table必须逐个配置

// 生成Bean，Dao，Service
首先配置src/main/resources/spring/table_config.xml
表名可以使用TablesServiceTest，UserTablesServiceTest辅助生成

以下两个类用于生成
com.palm.generator.mysql.core.MysqlGeneratorTest
com.palm.generator.oracle.core.OracleGeneratorTest

src/test/java-com.palm.generator.mysql.service.TablesServiceTest
src/test/java-com.palm.generator.oracle.service.UserTablesServiceTest