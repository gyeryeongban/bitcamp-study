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
			- a. Run 'Java' Plug-in classes
			- b. Run Class Specified in Application setting
		- `$ gradle build`
			- Create Distribution File in build/distributions
			- Create Script File

## Day 5
- Function, Class, Package
	- Function
		- 기능 단위로 문자를 묶어서 관리
		- ↓
	- Class
		- 메서드를 역할이나 용도에 따라 분류하여 묶어서 관리
		- ↓
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
			-  ↓
			- .project
				- Eclipse에게 프로젝트 이름과 유형(Java)에 대한 정보를 제공
				- 이 파일이 없으면 프로젝트 폴더로 간주X
			- .classpath
				- 소스 폴더와 클래스 파일을 두는 폴더에 대한 정보
				- 프로젝트에서 사용하는 외부 라이브러리(.jar)의 경로 정보
				- Java 프로젝트인 경우 이 파일이 있어야 함
			- .settings
				- 기타 설정 정보를 갖고있는 파일을 보관

## Day 6
- literal, Variables, Array
	- Literal
		- 값을 표현한 것
		- ↓
	- Variables
		- 값을 담는 메모리
		- ↓
	- Array
		- 여러 개의 값을 담는 메모리
		- 변수 목록
- Literal
	- 정수
		- 2진수: 0b
		- 16진수: 0x
	- 부동 소수점
		- 3.14 = 31.4e-1 = 314e-2 = 0.314e1 = 0.0314e2
	- 논리
		- 소문자로 표현
	- 문자
		- ''
		-제어 문자
			- \t, \v, \n
	- 문자열
		- ""
- print(), println(), printf()
	- print()
		- 출력
	- println()
		- 출력 + 줄바꿈
		- 값X -> 줄바꿈만 수행
	- printf(출력 형식, 값)
		- 형식 지정X -> print()와 같음
		- 출력 형식
			- %s: 지정한 자리에 문자열을 삽입
			- %d: 정수 값을 10진수 문자열로 만들어 삽입
			- %x: 정수 값을 16진수 문자열로 만들어 삽입
			- %c: 정수 값을 문자로 만들어 삽입
			- %b: true/false 값을 문자열로 만들어 삽입
- 메모리와 값
	- 메모리 종류
		- HDD
		- RAM
	- 값
		- HDD: 값을 자성 방향으로 표현하여 저장
			- N/S극 or S/N극
		- RAM: 값을 전기 신호로 표현하여 저장
			- On or Off
- 값 -> 2진수
	- 어떤 값이든 2진수로 표현 가능하면 HDD/RAM (=저장장치)에 값을 저장할 수 있음
	- But, 규칙 필요 => 규칙이 서로 다르면 값을 주고받을 수 없기 때문
	- 정수 -> 2진수 규칙
		- a. Sign-Magnitude (부호 절대값)
			- 부동 소수점이 가수부를 2진수로 표현할 때 사용
		- b. 1의 보수 (음수 값을 표현할 때)
			- 크기를 넘어가면 버림
				- 1 0000 0001 => 맨 앞 1 버림
		- c. 2의 보수 = 1의 보수 + 1 (음수 값을 표현할 때)
			- 현재 대부분의 컴퓨터가 2의 보수를 음수 표현 방법으로 사용
			- 음수를 2의 보수로 표현 => 빼기를 수행할 때 음수와 양수를 더하면 됨
		- d. Excess-K (지정된 값을 무조건 더함)
			- 음수든 양수든 따지지 않고 무조건 K값을 더해 2진수로 표현
				- 32bit 메모리: K = 127
				- 64bit 메모리: K = 1023
			- 부동 소수점을 2진수로 표현할 때 이 규칙에 따라 지수부를 표현
- 값과 메모리
	- 1byte = 8bit
	-	↓
	- 0~(2^8 - 1)
	-	↓
	- 0~255
	-	↓
	- -128~127

## Day 7
- 명령어 실행 순서
	- HDD -loding-> RAM -> Cache -> CPU
- 값 -> 2진수
	- 전기 비트 (전기 신호)
    	- On, Off
	- 자기 비트 (자기 신호)
    	- N/S극, S/N극
- 정규화
	- IEEE-754: 정규화 규칙을 정의한 문서
	- 정해진 규칙에 따라 정리
	- 가수부와 지수부를 분리
	- 부동 소수점으로 표현하면 앞에 0은 생략 => 앞은 무조건 1
		- 10진수 정규화
			- 변환없이 정규화
		- 2진수 정규화
			- 2진수 -변환-> 정규화
			- 소수점 앞/뒤로 나눠 2진수로 변환
				- 소수점 뒤 => 2진수 변환
					- 1.0이 나올 때까지 * 2
- 문자 -> 2진수 규칙
	- Character Set (문자 집합)
		- ASCII
			- 7bit
		- ISO-8859-1 (ISO-latin-1~15)
			- 8bit
		- EUC-KR (KSC-KR)
			- 16bit
		- 조합형
			- 16bit
		- MS949
			- 16bit
		- Unicode
			- 16bit
		- UTF-8
			- 8~32bit
- 유효 자릿수
	- 32bit: Almost 7~8자리 (Default = 7)
	- 64bit: Almost 16자리
	- ** 유효 자릿수를 넘어가면 잘리거나 반올림 됨
- 폰트
	- a. Raster 폰트 (Bitmap 폰트)
		- 크기를 늘리면 계단현상 발생
		- 폰트를 도트(점) 정보로 저장
		- 출력 속도가 빠름
		- 단순한 그림이나 복잡한 그림이 파일 크기가 같음
		- 왜? 천연색일 경우 각 점을 3바이트로 표현하기 때문
	- b. Vector 폰트 (Truetype 폰트)
		- 크기를 늘려도 깔끔하게 출력
		- 폰트를 명령어로 저장
		- 그릴 때 마다 명령어를 실행해야 하기 때문에 출력 속도가 느림
		- 그림이 복잡할수록 명령어가 복잡하기 때문에 파일 크기가 커짐

## Day 8
- 문자 변수 (UCS-2 문자 코드 값 저장)
	- 해당 코드의 문자를 폰트 파일에서 찾아 출력
- 데이터 타입
	- 정수
		- byte
			- -128 ~ 127
		- short
			- -32768 ~ 32767
		- int
			- 약 -21억 ~ 약 21억
		- long
			- 약 -922경 ~ 약 922경
		-float
			- 유효 자릿수 7자리 (단정도)
		- double
			- 유효 자릿수 16자리 (배정도)
		- char
			- 0 ~ 65535 (유니코드)
- 자바 원시 타입 변수 (Primitive Variable)
	- 정수, 부동소수점, 논리, 문자코드의 값을
- 레퍼런스 변수(Referece Variable)
	- 자바 원시 타입의 값을 제외한 모든 값
- 논리
    - boolean a;
		- 자바 언어 명세서에는 메모리의 크기가 정의되어 있지X
		- 다만, JVM 명세서에는 int로 다룬다고 나와있음
- 레퍼런스 변수
    - String a;
		- 자바 언어 명세서에는 메모리의 크기가 정의되어 있지X
		- 메모리 주소를 저장할 만큼 큰 크기
    - Date a;
		- 자바 언어
- 레퍼런스 -업그레이드-> 스캐너
	- 시스템의 표준 입력 장치인 키보드를 Inputsteam 변수에 저장
	- Inputsteam: 데이터가 들어오는 것
	- Outputsteam: 데이터가 나가는 것
- l-value and r-value
	- l-value은 반드시 메모리여야 함
		- ex) 20 = 30;
	- 리터럴
		- ex) a = 1;
	- 변수
		- ex) int a2 = a;
	- 표현식 (Expreeion)
		- ex) a2 = a + 11;
		- 문장을 실행 후 결과 값을 리턴하는 명령어
- System.in and Scanner
	- String str = keyboard.nextLine();
		- a. 키보드에서 한 줄 입력될 때까지 기다림
		- b. 한 줄이 입력되면 문자열을 뽑아서 리턴
		- c. 저장
- Reference
	- 데이터가 저장된 메모리의 주소를 저장하는 메모리
- 문자열 (주소)
	- String: 문자열이 저장된 메모리의 주소를 저장
- 날짜 (주소)
	- Date: 날짜 값이 저장된 메모리의 주소를 저장
- JVM and Memory
	- a. JVM -사용할 메모리를 요구-> OS
	- b. OS -사용할 수 있는 메모리를 확보하여 JVM에게 할당-> JVM
	- c. JVM -실행하는 동안 사용-> 내부 메모리 (RAM)
- Use Scanner
	- 1개의 토큰(token)을 읽을 때까지 기다림
	- * 토큰: 양쪽에서 공백(White Space)으로 분리된 문자열(단어)
	- 공백 앞까지만 출력
		- next()
		- nextInt()
		- nextFloat()
		- nextBoolean()
- 공백으로 인식
	- Space
	- Tab
	- newline
- nextXXX()를 사용할 때 주의할 점
	- 한 개의 토큰을 읽음
	- 			↓
	- 공백을 만날 때까지 읽음
	- 단어 앞의 공백은 제거
	- 빈 문자열을 읽으려면 nextLine() 사용
- How to use nextXXX()
	- 20 aaa true 입력
		- nextInt(): 20 return
		- next(): aaa
		- nextBoolean(): true
		- => 공백을 만나면 제거
- System.in and Scanner
	- Reference로 Object에 신호를 보냄
	- ex) 리모콘(Reference)로 에어컨(Object)을 켬
	- 	  잔디에 물 뿌리는 기계(Scanner)에 호스(System.in)를 연결해서 물을 뿌림
	- Scanner 스스로 데이터를 읽을 수 없음
	- ex) 잔디에 물 뿌리는 기계가 물을 가져오진 못하는 것과 같이 물은 호스가 가져오고 기계를 호스를 연결시켜 뿌리는 역할만 함
- Scanner() 괄호 안
	- 키보드 입력기
		- System.in
	- 파일
	- 랜카드