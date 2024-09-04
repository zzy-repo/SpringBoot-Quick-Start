# SpringBoot 快速启动模板
这是一个自用的SpringBoot的快速启动模板,模板已配置了基本的yml配置文件和代码生成器，集成了MySQL、Redis、Lombok、MyBatis-Plus等常用依赖。
## 特性
- 内置基本的yml配置（端口、MySQL、Redis、MyBatis-Plus）
- 集成代码生成器，支持数据库关键信息隐私化
## 依赖
以下是本项目所依赖的组件：
- Spring Boot Starter Web
- Lombok
- MySQL Connector/J
- MyBatis-Plus Spring Boot Starter
- MyBatis-Plus Generator
- Spring Boot Starter Data Redis
- Druid Spring Boot Starter
- Velocity Engine Core
## 快速开始
### 克隆项目
```bash
git clone https://github.com/your-username/springboot-quickstart-template.git
```
### 配置数据库和Redis
在`application.yml`中配置您的数据库和Redis信息,也可以直接引入环境变量
### 运行项目
```bash
mvn spring-boot:run
```
### 使用代码生成器
在项目中，已内置代码生成器，可快速生成Entity、Mapper、Mapper XML、Service、Controller等文件。运行以下命令即可生成代码：
```bash
mvn mybatis-plus:generator
```
**请确保在运行代码生成器前，已正确配置数据库信息。**
