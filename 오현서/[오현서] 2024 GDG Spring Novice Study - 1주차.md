## 📒 개요

#### 1장

###### SpringBoot 기본설정

https://start.spring.io/
Spring Initializr를 사용해서 파일 다운 후 압축 해제하였고,

- Projec - Gradle : Groovy
- Language - Java
- Spring Boot - 3.3.4
  를 사용하여 제작함

책과 노션에 적혀있는 것들을 고려하여 코드 작성

그러나 오류 발생하여 원인 찾아보니 버전 오류였고, 이를 해결함

그 결과

```
buildscript {
	ext{
		springBootVersion = '2.6.7'
	}
	repositories{
		mavenCentral()
	}
	dependencies{
		classpath("org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}")
	}
}


plugins {
	id 'org.springframework.boot' version '2.6.7'
	id 'io.spring.dependency-management' version '1.0.12.RELEASE'
	id 'java'
	id 'eclipse'
}


group = 'com.jojoldu.book'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = 1.8


repositories {
	mavenCentral()
}

dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-web'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'

}

tasks.named('test') {
	useJUnitPlatform()
}

```

이와 같은 코드가 완성되었다.

#### 2장

###### SpringBoot 간단 출력

- test 파일에서 서버를 실행시키지 않고 테스트를 해볼 수 있는 시스템을 갖고 있음
- import 해야 할 내용들이 많고, import 오류를 해결하는 과정이 중요하다는 것을 알았다.

## 👀 새롭게 배운 점

- 테스트를 통해 결과를 미리 확인 할 수 있다는 것이 신기했습니다.

## 📍 추가적인 질문

- 버전에 따라 import 내용이 달라지는데 이거를 다른 설명 없이 어떻게 찾는지 알고싶어요
