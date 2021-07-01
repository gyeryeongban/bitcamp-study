# bitcamp-study

## Day 1
- Clone: $ git clone
- Pull: $ git pull
- Write backup list: $ git add .
- Write commit message: $ git commit -m ""
- Backup to server: $ git push

## Day 2
- Mechan language and CPU
	- Diffrent CPU: CPU마다 명령 규칙이 다르기 때문
- Mechan language and OS
	- Diffrent OS: 운영 체제마다 기계어를 배치하는 방법이 다르기 때문
- Compiler vs Interpreter
	- Compiler: 명령문을 기계어로 번역
	- ex) gcc
	- Interpreter: 기계어가 아니기 도우미 프로그램이 필요
	- ex) JavaScript 실행을 위해 node.js 필요

## Day 3
- Filename extension
	- .java <- source
	- .exe <- mechan language
	- .class <- bytecode/ p-code
- Create project
	- bin
		- main <- .class file
	- src
		- main <- application file
			- java <- java source
			- resources <- common file
		- test <- unit test File
			- java <- java source
			- resources <- common file
- Compile
	- $ javac -d bin/main -encoding UTF-8 src/main/···
- Run
	- $ java -cp bin/main ···

## Day 4
- Step 1
	- project
		- source file
		- class file
- Step 2
	- git repo/ project
		- bin
		- src
- Step 3
	- git repo
		- root project
			- sub project
- Step 4
	- git repo
		- project
			- root project
				- sub project
- Build Tool
	- Ant
		- build script file: build.xml
	- Maven
		- build script file: pom.xml
	- Gradle
		- build script file: build.gradle