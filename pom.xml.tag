<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>com.autentia</groupId>
	<artifactId>spring-boot-mybatis-demo</artifactId>
	<version>0.0.1</version>
	<packaging>jar</packaging>

	<name>spring-boot-mybatis-demo</name>
	<description>Demo de la integracion de MyBatis con Spring Boot</description>

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.3.5.RELEASE</version>
		<relativePath />
	</parent>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<java.version>1.8</java.version>
	</properties>
	<scm>
	  <connection>scm:git:https://github.com/jorgepacheco/spring-boot-mybatis-demo.git</connection>
	  <developerConnection>scm:git:git@github.com:jpacheco/spring-boot-mybatis-demo</developerConnection>
	  <url>https://github.com/jpacheco/spring-boot-mybatis-demo.git</url>
	  <tag>spring-boot-mybatis-demo-0.0.1</tag>
	</scm>


	<distributionManagement>
			<repository>
					<id>nexus</id>
					<name>Vocento releases nexus repository</name>
					<url>http://192.168.99.100:18081/repository/maven-releases/</url>
			</repository>
			<snapshotRepository>
					<id>nexus</id>
					<name>Vocento snapshots nexus repository</name>
					<url>http://192.168.99.100:18081/repository/maven-snapshots/</url>
			</snapshotRepository>
	</distributionManagement>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<!-- Starter MyBatis -->
		<dependency>
			<groupId>org.mybatis.spring.boot</groupId>
			<artifactId>mybatis-spring-boot-starter</artifactId>
			<version>1.1.1</version>
		</dependency>
		<!-- Mybatis Redis Cache -->
		<dependency>
			<groupId>org.mybatis.caches</groupId>
			<artifactId>mybatis-redis</artifactId>
			<version>1.0.0-beta2</version>
		</dependency>
        <!-- H2 BBDD -->
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
        <!-- Test-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.hamcrest</groupId>
			<artifactId>hamcrest-all</artifactId>
			<version>1.3</version>
		</dependency>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
			<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-release-plugin</artifactId>
	<version>2.5.3</version>
</plugin>
		</plugins>
	</build>

</project>
