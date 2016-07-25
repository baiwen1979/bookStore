<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>使用帮助</h2>
<div id="help">
  <h3>【数据库及其表的创建】</h3>
  <ol>
    <li>安装后MySQL后，使用其命令行工具输入 [create database book_store;]命令创建空的数据库book_store</li>
    <li>使用Eclipse打开项目目录下的src子目录的hibernate.cfg.xml文件，将含有“hbm2ddl”那一项的值改为create</li>
    <li>启动（或重启）tomcat服务器，tomcat在加载本项目时，本项目的Hibernate的会话工厂对象创建时，将自动根据映射文件重建所有数据表</li>
    <li>将hibernate.cfg.xml文件中“hbm2ddl"配置项的值改为validate</li>
  </ol>
  <h3>【填充样本数据】</h3>
  <ol>
    <li>使用浏览器访问项目首页：http://localhost:8080/bookstore/</li>
    <li>访问feed.jsp页：http://localhost:8080/bookstore/feed.jsp</li>
    <li>输入填充码“123456”,点“确定”后，即可完成样本数据的填充</li>
  </ol>
</div>