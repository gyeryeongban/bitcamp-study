# bitcamp-study

## Day 1
- Clone: `$ git clone`
- Pull: `$ git pull`
- Write Backup List: `$ git add .`
- Write Commit Message: `$ git commit -m ""`
- Backup to Server: `$ git push`

## Day 2
- Mechan Language and CPU
	- Diffrent CPU: CPU마다 명령 규칙이 다르기 때문
- Mechan Language and OS
	- Diffrent OS: 운영 체제마다 기계어를 배치하는 방법이 다르기 때문
- Compiler vs Interpreter
	- Compiler: 명령문을 기계어로 번역
	- ex) gcc
	- Interpreter: 기계어가 아니기 때문에 도우미 프로그램이 필요
	- ex) JavaScript 실행을 위해 node.js 필요

## Day 3
- Filename Extension
	- .java <- Source
	- .exe <- Mechan Language
	- .class <- Bytecode/ P-code
- Create Project
	- bin
		- main <- .class file
	- src
		- main <- application file
			- java <- java source
			- resources <- common file
		- test <- unit test file
			- java <- java source
			- resources <- common file
- Compile
	- `$ javac -d bin/main -encoding UTF-8 src/main/···`
- Run
	- `$ java -cp bin/main ···`

## Day 4
- Create Project
	- Step 1
		- Project
			- Source File
			- Class File
	- Step 2
		- Git Repo/ Project
			- bin
			- src
	- Step 3
		- Git Repo
			- Root Project
				- Sub Project
	- Step 4
		- Git Repo
			- Project
				- Root Project
					- Sub Project
- Build Tool
	- Ant
		- Build Script File: build.xml
	- Maven
		- Build Script File: pom.xml
	- Gradle
		- Build Script File: build.gradle
- How to Use Gradle Build Tool
	- Gradle Basic Task
		- `$ gradle init` : Prepare Project File
		- `$ gradlew` : Install Gradle and Create File
	- 'Java' Gradle Plug-in
		- `$ gradle compileJava`
			- Compile src/main/java
			- Copy .class File in build/classes/java/main
		- `$ gradle compileTestJava`
			- Compile src/test/java
			- Copy .class File in build/classes/java/test
		- `$ gradle processResources`
			- Copy src/main/resources -> build/resources/main
		- `$ gradle processTestResources`
			- Copy src/test/resources -> build/resources/test
		- `$ gradle clean`
			- Delete Build Folder
		- `$ gradle classes`
			- Run compileJava + processResources
		- `$ gradle testClasses`
			- Run classes + compileTestJava + processTestResources
		- `$ gradle check`
			- Run test + unit test
		- `$ gradle javadoc`
			- Create API Document.html
		- `$ gradle build`
			- Run check + assemble
	- 'Application' Gradle Plug-in
		- `$ gradle run`
			- 1. Run 'Java' Plug-in classes
			- 2. Run Class Specified in Application setting
		- `$ gradle build`
			- Create Distribution File in build/distributions
			- Create Script File

## Day 5
- Function, Class, Package
	- Function
		- 기능 단위로 문자를 묶어서 관리
		↓
	- Class
		- 메서드를 역할이나 용도에 따라 분류하여 묶어서 관리
		↓
	- Package
		- 클래스를 쓰임새(역할)에 따라 디렉토리로 분류하여 관리
- Javadoc
	- Create HTML Document
		- Description of Code in /** */ → Run Javadoc → HTML Document
	- `$ javadoc -encoding utf-8 -charset utf-8 ···`
- Pulg-in
	- Create Eclipse Project
		- Add 'Eclipse' Plug-in
			- [build.gradle]
			  plugins {
			  id 'eclipse'
			  }
			  ↓
			- .project
				- Eclipse에게 프로젝트 이름과 유형(Java)에 대한 정보를 제공
				- 이 파일이 없으면 프로젝트 폴더로 간주X
			- .classpath
				- 소스 폴더와 클래스 파일을 두는 폴더에 대한 정보
				- 프로젝트에서 사용하는 외부 라이브러리(.jar)의 경로 정보
				- Java 프로젝트인 경우 이 파일이 있어야 함
			- .settings
				- 기타 설정 정보를 갖고있는 파일을 보관