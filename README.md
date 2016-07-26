##关于网上书店
叮当网在线书店是一个小型专业的电子商务网站项目，用户可以在线浏览、选购图书。  
本项目使用Eclipse Java EE IDE创建，若您使用的IDE不是Eclipse，请参考相关文档将其导入。  
本电子商务网站基于目前流行的Java Web三大框架（Struts, Spring 和 Hibernate）开发，严格遵循模型-视图-控制器，即MVC设计模式。  
其中利用Struts框架及其标签库实现了控制器和视图，而模型则分为三层，分别为业务(Service)层（即业务模型）、数据访问(DAO)层（即数据访问模型）和持久层(由Hibernate框架实现)， 项目代码结构清晰，整洁易读，对于学习Java Web开发是非常值得参考的。  
本项目实现了一个电子商务网站前端面向互联网用户的基本功能，目前版本尚未提供后台图书发布和管理、订单管理和货物派送等功能，下个版本将提供这些功能。  
本项目的源代码完全开放，遵循MIT许可，可以任意修改，只是希望获得此源码的人能够将此项目做得更加完善，并能就不足和改进之处与我交流，我的QQ号是：53517099  
##使用帮助
###【数据库及其表的创建】
1. 安装后MySQL后，使用其命令行工具输入“create database book_store” 命令创建空的数据库 book_store
2. 使用Eclipse打开项目目录下的src子目录的hibernate.cfg.xml文件，将含有“hbm2ddl”那一项的值改为create
3. 启动（或重启）tomcat服务器，tomcat在加载本项目时，本项目的Hibernate的会话工厂对象创建时，将自动根据映射文件重建所有数据表
4. 将hibernate.cfg.xml文件中“hbm2ddl"配置项的值改为validate  

###【填充样本数据】
1. 使用浏览器访问项目首页：http://localhost:8080/bookstore/
2. 访问feed.jsp页：http://localhost:8080/bookstore/feed.jsp
3. 输入填充码“123456”,点“确定”后，即可完成样本数据的填充
