# SpringBoot 快速启动模板 🚀
**简介：**
这是一个自用的SpringBoot快速启动模板，包含了基本的yml配置文件和代码生成器。模板已经集成了MySQL、Redis、Lombok、MyBatis-Plus等常用依赖。🔧
### 特性
- **基本配置**：内置了端口、MySQL、Redis、MyBatis-Plus的yml配置。📝
- **隐私保护**：支持数据库关键信息隐私化。🔐
- **代码生成**：集成代码生成器，方便快速生成代码。⚡
- **热部署**：配置了热部署功能，提高开发效率。🔥
- **异常处理**：配置了全局异常响应。🚧
- **API文档**：配置了springdoc，提供API文档支持。📚
  
### 快速开始
#### 克隆项目
```bash
git clone https://github.com/your-username/springboot-quickstart-template.git
```
#### 配置数据库和Redis
在 `application.yml` 文件中配置您的数据库和Redis信息，或者通过环境变量进行配置。🔧
#### 运行项目
```bash
mvn spring-boot:run
```
#### 使用代码生成器
项目内置了代码生成器，可以快速生成Entity、Mapper、Mapper XML、Service、Controller等文件。运行以下命令以生成代码：⚡
```bash
mvn mybatis-plus:generator
```
**注意：** 在运行代码生成器之前，请确保已正确配置数据库信息。📝
### 使用方法

- **将Quick-Start-Parent添加到本地仓库**:

  - https://github.com/zzy-repo/Quick-Start-Parent

  - 在将 Quick-Start-Parent 项目作为依赖管理之前，需要将其安装到您的本地 Maven 仓库。执行以下命令来安装：

  - ```bash
    mvn install
    ```

  - 这将在本地 Maven 仓库中安装 Quick-Start-Parent。

- **然后在IDEA中找到“将项目另存为模板”的选项：**📝

![image-20240904190250575](https://gitee.com/zzy2401/picbed/raw/master/images/image-20240904190250575.png)
