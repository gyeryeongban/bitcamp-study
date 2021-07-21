# bitcamp-study

## :pushpin: Day 1
- Clone: `$ git clone`
- Pull: `$ git pull`
- Write Backup List: `$ git add .`
- Write Commit Message: `$ git commit -m " "`
- Backup to Server: `$ git push`

## :pushpin: Day 2
### Mechan Language and CPU
#### Diffrent CPU
- CPU마다 명령 규칙이 다르기 때문
### Mechan Language and OS
#### Diffrent OS
- 운영 체제마다 기계어를 배치하는 방법이 다르기 때문
### Compiler vs Interpreter
- Compiler: 명령문을 기계어로 번역
	- ex) gcc
- Interpreter: 기계어가 아니기 때문에 도우미 프로그램이 필요
	- ex) JavaScript 실행을 위해 node.js 필요

## :pushpin: Day 3
- Compile: `$ javac -d bin/main -encoding UTF-8 src/main/···`
- Run: `$ java -cp bin/main ···`
### Filename Extension
- .java <- Source
- .exe <- Mechan Language
- .class <- Bytecode/P-code
### Create Project
#### bin
- main <- .class file
#### src
- main <- application file
	- java <- java source
	- resources <- common file
- test <- unit test file
	- java <- java source
	- resources <- common file

## :pushpin: Day 4
### Create Project
#### Step 1
- Project
	- Source File
	- Class File
#### Step 2
- Git Repo/Project
	- bin
	- src
#### Step 3
- Git Repo
	- Root Project
		- Sub Project
#### Step 4
- Git Repo
	- Project
		- Root Project
			- Sub Project
### Build Tool
#### Ant
- Build Script File: build.xml
#### Maven
- Build Script File: pom.xml
#### Gradle
- Build Script File: build.gradle
### How to Use Gradle Build Tool
#### Gradle Basic Task
- `$ gradle init`
	- Prepare Project File
- `$ gradlew`
	- Install Gradle and Create File
#### 'Java' Gradle Plug-in
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
#### 'Application' Gradle Plug-in
- `$ gradle run`
	- Run 'Java' Plug-in classes
	- Run Class Specified in Application setting
- `$ gradle build`
	- Create Distribution File in build/distributions
	- Create Script File

## :pushpin: Day 5
### Function, Class, Package
#### Function
- 기능 단위로 문자를 묶어서 관리
#### Class
- 메서드를 역할이나 용도에 따라 분류하여 묶어서 관리
#### Package
- 클래스를 쓰임새(역할)에 따라 디렉토리로 분류하여 관리
### Javadoc
#### Create HTML Document
- Description of Code in /** */ -> Run Javadoc -> HTML Document
- `$ javadoc -encoding utf-8 -charset utf-8 ···`
### Pulg-in
#### Create Eclipse Project
- Add 'Eclipse' Plug-in
	- [build.gradle]
	```
	plugins {
	id 'eclipse'
	}
	```
	- .project
		- Eclipse에게 프로젝트 이름과 유형(Java)에 대한 정보를 제공
		- 이 파일이 없으면 프로젝트 폴더로 간주X
	- .classpath
		- 소스 폴더와 클래스 파일을 두는 폴더에 대한 정보
		- 프로젝트에서 사용하는 외부 라이브러리(.jar)의 경로 정보
		- Java 프로젝트인 경우 이 파일이 있어야 함
	- .settings
		- 기타 설정 정보를 갖고있는 파일을 보관

## :pushpin: Day 6
### literal, Variables, Array
#### Literal
- 값을 표현한 것
#### Variables
- 값을 담는 메모리
#### Array
- 여러 개의 값을 담는 메모리
- 변수 목록
### Literal
#### 정수
- 2진수: 0b
- 16진수: 0x
#### 부동 소수점
- 3.14 = 31.4e-1 = 314e-2 = 0.314e1 = 0.0314e2
#### 논리
- 소문자로 표현
#### 문자
- ' '
- 제어 문자
	- \t, \v, \n
#### 문자열
- " "
### print(), println(), printf()
#### print()
- 출력
#### println()
- 출력 + 줄바꿈
- 값X -> 줄바꿈만 수행
#### printf(출력 형식, 값)
- 형식 지정X -> print()와 같음
- 출력 형식
	- %s: 지정한 자리에 문자열을 삽입
	- %d: 정수 값을 10진수 문자열로 만들어 삽입
	- %x: 정수 값을 16진수 문자열로 만들어 삽입
	- %c: 정수 값을 문자로 만들어 삽입
	- %b: true/false 값을 문자열로 만들어 삽입
### 메모리와 값
#### 메모리 종류
- HDD
- RAM
#### 값
- HDD: 값을 자성 방향으로 표현하여 저장
	- N/S극 or S/N극
- RAM: 값을 전기 신호로 표현하여 저장
	- On or Off
### 값 -> 2진수
- 어떤 값이든 2진수로 표현 가능하면 HDD/RAM (=저장장치)에 값을 저장할 수 있음
- But, 규칙 필요 => 규칙이 서로 다르면 값을 주고받을 수 없기 때문
#### 정수 -> 2진수 규칙
- Sign-Magnitude (부호 절대값)
	- 부동 소수점이 가수부를 2진수로 표현할 때 사용
- 1의 보수 (음수 값을 표현할 때)
	- 크기를 넘어가면 버림
		- 1 0000 0001 => 맨 앞 1 버림
- 2의 보수 = 1의 보수 + 1 (음수 값을 표현할 때)
	- 현재 대부분의 컴퓨터가 2의 보수를 음수 표현 방법으로 사용
	- 음수를 2의 보수로 표현 => 빼기를 수행할 때 음수와 양수를 더하면 됨
- Excess-K (지정된 값을 무조건 더함)
	- 음수든 양수든 따지지 않고 무조건 K값을 더해 2진수로 표현
		- 32bit 메모리: K = 127
		- 64bit 메모리: K = 1023
	- 부동 소수점을 2진수로 표현할 때 이 규칙에 따라 지수부를 표현
### 값과 메모리
- 1byte = 8bit
- 0 ~ (2^8 - 1)
- 0 ~ 255
- -128 ~ 127

## :pushpin: Day 7
### 명령어 실행 순서
- HDD -loding-> RAM -> Cache -> CPU
### 값 -> 2진수
#### 전기 비트 (전기 신호)
- On, Off
#### 자기 비트 (자기 신호)
- N/S극, S/N극
### 정규화
- IEEE-754: 정규화 규칙을 정의한 문서
- 정해진 규칙에 따라 정리
- 가수부와 지수부를 분리
- 부동 소수점으로 표현하면 앞에 0은 생략 => 앞은 무조건 1
#### 10진수 정규화
- 변환없이 정규화
#### 2진수 정규화
- 2진수 -변환-> 정규화
- 소수점 앞/뒤로 나눠 2진수로 변환
	- 소수점 뒤 => 2진수 변환
	- 1.0이 나올 때까지 * 2
### 문자 -> 2진수 규칙
#### Character Set (문자 집합)
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
	- 8 ~ 32bit
### 유효 자릿수
- 유효 자릿수를 넘어가면 잘리거나 반올림 됨
#### 32bit
- Almost 7 ~ 8자리 (Default = 7)
#### 64bit
- Almost 16자리
### 폰트
- Raster 폰트 (Bitmap 폰트)
	- 크기를 늘리면 계단현상 발생
	- 폰트를 도트(점) 정보로 저장
	- 출력 속도가 빠름
	- 단순한 그림이나 복잡한 그림이 파일 크기가 같음
	- 왜? 천연색일 경우 각 점을 3바이트로 표현하기 때문
- Vector 폰트 (Truetype 폰트)
	- 크기를 늘려도 깔끔하게 출력
	- 폰트를 명령어로 저장
	- 그릴 때 마다 명령어를 실행해야 하기 때문에 출력 속도가 느림
	- 그림이 복잡할수록 명령어가 복잡하기 때문에 파일 크기가 커짐

## :pushpin: Day 8
### 문자 변수 (UCS-2 문자 코드 값 저장)
- 해당 코드의 문자를 폰트 파일에서 찾아 출력
### 자바 원시 타입 변수 (Primitive Variable)
#### 정수
- byte
	- -128 ~ 127
- short
	- -32768 ~ 32767
- int
	- 약 -21억 ~ 약 21억
- long
	- 약 -922경 ~ 약 922경
#### 부동 소수점
- float
	- 유효 자릿수 7자리 (단정도)
- double
	- 유효 자릿수 16자리 (배정도)
#### 논리
- boolean
	- int 타입의 메모리 사용 (4byte)
	- 배열은 byte 타입의 메모리 사용 (1byte)
	- 자바 언어 명세서에는 메모리의 크기가 정의되어 있지 X
	- 다만, JVM 명세서에는 int로 다룬다고 나와있음
#### 문자
- char
	- 0 ~ 65535 (유니코드)
### 레퍼런스 변수(Referece Variable)
- 자바 원시 타입의 값을 제외한 모든 값
#### String
- 자바 언어 명세서에는 메모리의 크기가 정의되어 있지 X
- 메모리 주소를 저장할 만큼 큰 크기
#### Date
- 자바 언어 명세서에는 메모리의 크기가 정의되어 있지 X
- 메모리 주소를 저장할 만큼 큰 크기
### Scanner
- 레퍼런스를 업그레이드한 것
- 시스템의 표준 입력 장치인 키보드를 Inputsteam 변수에 저장
#### Inputsteam
- 데이터가 들어오는 것
#### Outputsteam
- 데이터가 나가는 것
### l-value and r-value
- l-value은 반드시 메모리여야 함
```
20 = 30;
```
#### 리터럴
```
a = 1;
```
#### 변수
```
int a2 = a;
```
#### 표현식 (Expreeion)
- 문장을 실행 후 결과 값을 리턴하는 명령어
```
a2 = a + 11;
```
### System.in and Scanner
```
String str = keyboard.nextLine();
```
- 1. 키보드에서 한 줄 입력될 때까지 기다림
- 2. 한 줄이 입력되면 문자열을 뽑아서 리턴
- 3. 저장
### Reference
- 데이터가 저장된 메모리의 주소를 저장하는 메모리
#### 문자열 (주소)
- String: 문자열이 저장된 메모리의 주소를 저장
- 프로그래밍 입문 단계 => 문자열을 저장하는 메모리
#### 날짜 (주소)
- Date: 날짜 값이 저장된 메모리의 주소를 저장
- 프로그래밍 입문 단계 => 날짜를 저장하는 메모리
### JVM and Memory
- 1. JVM -사용할 메모리를 요구-> OS
- 2. OS -사용할 수 있는 메모리를 확보하여 JVM에게 할당-> JVM
- 3. JVM -실행하는 동안 사용-> 내부 메모리 (RAM)
### Use Scanner
- 1개의 토큰(token)을 읽을 때까지 기다림
	- 토큰: 양쪽에서 공백(White Space)으로 분리된 문자열(단어)
- 공백 앞까지만 출력
	- `next()`
	- `nextInt()`
	- `nextFloat()`
	- `nextBoolean()`
### 공백으로 인식
- Space
- Tab
- newline
### `nextXXX()`를 사용할 때 주의할 점
- 한 개의 토큰을 읽음
- 공백을 만날 때까지 읽음
- 단어 앞의 공백은 제거
- 빈 문자열을 읽으려면 `nextLine()` 사용
### How to use `nextXXX()`
- 20 aaa true 입력
- `nextInt()` -> 20 return
- `next()` -> aaa
- `nextBoolean()` -> true
- => 공백을 만나면 제거
### System.in and Scanner
- Reference로 Object에 신호를 보냄
	- ex) 리모콘(Reference)로 에어컨(Object)을 켬
	- ex) 잔디에 물 뿌리는 기계(Scanner)에 호스(System.in)를 연결해서 물을 뿌림
- Scanner 스스로 데이터를 읽을 수 없음
	- ex) 잔디에 물 뿌리는 기계가 물을 가져오진 못하는 것과 같이 물은 호스가 가져오고 기계를 호스를 연결시켜 뿌리는 역할만 함
### Scanner() 괄호 안
- 키보드 입력기
	- ex) `System.in`
- 파일
- 랜카드

## :pushpin: Day 9
### Array
- 같은 종류의 메모리를 쉽게 만드는 방법
#### 문법
```
메모리종류[] 메모리이름 = new 메모리종류[개수];
데이터타입[] 변수명 = new 데이터타입[개수];

// 정수를 담을 메모리를 5개 만들고 배열의 이름을 arr로 하자
int[] arr = new int[5];
```
#### 개수
- int 타입의 최대 값과 같음
- 2147483647개
#### 크기
- int 타입의 최대 값에서 2를 뺀 값
- Integer.MAX_VALUE - 2
#### 메모리에 접근
- 문법
```
배열변수[인덱스] = 값;
arr1[0] = 100;
```
- 배열의 인덱스는 0부터 시작
- 인덱스의 범위는 0 ~ (배열개수 - 1)
#### 선언문 분석
- `arr1`
	- 배열 메모리의 주소를 담는 변수
	- 이렇게 메모리의 주소를 보관하는 변수 => 레퍼런스
- `new int[5]`
	- 연속된 5개의 int 타입 메모리를 준비하라는 명령
	- 사용할 메모리를 확보한 후 그 메모리의 찾아 갈 수 있도록 시작 주소를 리턴
	- 이렇게 값을 저장하기 위해 확보된 메모리 => 인스턴스
- `new`
	- 사용할 메모리를 확보하는 명령
	- 리턴 값은 확보된 메모리의 시작 주소
#### 초기화
- 정수 배열 (`byte[ ]`, `short[ ]`, `int[ ]`, `long[ ]`)
	- 0
- 부동 소수점 배열 (`float[ ]`, `double[ ]`)
	- 0.0
- 논리 배열 (`boolean[ ]`)
	- false
- 문자 배열 (`char[ ]`)
	- '\u0000'
- 주소 변수 (`Object[ ]`)
	- null
### 조회용으로만 사용할 변수라면 상수로 선언
#### 상수
- 변경할 수 없는 값
- final이라는 한정자를 변수타입 앞에 붙여주면 그 변수는 변경할 수 없는 값이 됨
```
final 변수타입 변수명 = 값;
```
#### 변수명
- 전체 다 대문자
- 구분을 위해 중간에 _를 사용
### 클래스
#### java.util.Date
- 날짜 정보를 다루는 물건을 생성
```
new java.sql.Date(밀리초)
java.sql.Date.valueOf(날짜 문자열)
java.util.Date()
```
#### java.lang.Integer
```
Integer.parseInt(Scanner.nextLine())
```
### 반복문
```
for (변수 초기화; 조건; 증감문) {}
```
#### 순서
- 변수 초기화 -> 조건 -> {} -> 증감문 -> ···
- 변수 초기화는 1번만 실행
### 연산자(operator) and 피연산자(operand)
```
i = i + 1;
```
#### 연산자(operator)
- =, +
#### 피연산자(operand)
- i, 1
### 비교
#### 변수명.equals(" ")
- 입력 받은 값이 " " 안에 들어가는 값과 같을 때
- " " 안을 비워두면 공백으로 인식
#### 변수명.equalsIgnoreCase("알파벳")
- 입력 받은 알파벳이 " " 안에 들어가는 값과 같을 때
- 대소문자를 구분하지 않음

## :pushpin: Day 10
### 배열
```
int[] arr = new int[5];
배열타입[] 레퍼런스 = 메모리준비명령 DataType[개수];
```
### 오프셋 주소 (Offset)
- Application이 할당 받은 메모리의 시작점을 0으로 하여 계산된 주소
- 어떤 기준점에서 얼마만큼 떨어졌는가
### 메모리 종류
- Primitive: Data Type 변수
- Reference: 주소 변수
	- 배열 레퍼런스, String 포함
### 상수
- 값을 오직 한 번만 저장할 수 있음
- 변수 앞에 final을 붙임
- 만약, final로 선언된 변수의 값을 두 번째로 바꾸려 한다면?
- => 컴파일 오류 발생
- 변수와 상수를 구분하기 위해서
	- 상수인 경우 이름을 보통 모두 대문자로 작성
	- 변수를 선언하는 문장에서 바로 값을 초기화시킴
### 변수의 종류
#### 인스턴스 변수(instance variable)
- new 명령을 사용하여 인스턴스를 생성할 때 준비되는 변수
```
int 변수명;
```
#### 클래스 변수(class variable = static variable)
- 클래스가 로딩될 때 준비되는 변수
```
static int 변수명;
```
#### 로컬 변수(local variable)
- 블록을 실행할 때 준비되는 변수
```
public static void main(String[] args /*로컬변수 = 파라미터*/) {
int 변수명; // 로컬 변수
}
```
### static type binding vs dynamic type binding
#### Java
- 변수의 타입이 한번 정해지면 변경되지 않음
#### JavaScript
- 변수에 값을 저장하는 순간 데이터 타입이 결정됨 (변경됨)
### 연산자
- 정수의 산술 연산의 최소 단위 = int
- 데이터 타입에 따라 사용할 수 있는 연산자가 정해져 있음
- 연산의 결과 타입은 피연산자와 같음
#### 우선 순위
- 1. ()
- 2. ++, --
- 3. *, /, %
- 4. +, -
- 5. =
#### &&, || vs &, |
- &&, ||
	- 첫번째 피연산자로 결과를 예측할 수 있다면 두 번째 피연산자로 실행되지 않음
- &, |
	- 앞의 피연산자 값에 상관없이 끝까지 실행
#### 논리 연산자
- AND: &&
- OR: ||
- NOT: !
- XOR: ^
	- 배타적 비교 연산자
	- 두 개의 값이 다를 때 true
	- ^ 연산자를 정수 값에 대해 수행하면 비트 단위로 연산을 수행
- 정수 값에 사용 불가
#### 비트 연산자
- &, |, ^, ~
- 이미지 및 영상 처리에 사용
- ex) 마스킹, 오버레이 기법에 사용
- ex) 색조 변경에 사용
#### 증감 연산자
- 전위 (Prefix)
```
// 실행
System.out.println(i++);

// 연산 과정
int temp = i; <- 임시 변수를 만들어 현재 i 값을 저장
i = i + 1;
System.out.println(temp);
```
- 후위 (Postfix)
```
// 실행
System.out.println(i--);

// 연산 과정
int temp = i;
i = i - 1;
System.out.println(temp);
```
#### 할당 (배정, 대입) 연산자
- +=, -=, *=, /=, %=
- &=, |=, ^=
- <<=, >>=, >>>=
#### 산술 연산자
- +, -, *, /, %
### 논리 & 비트 연산자
#### &&, ||, !의 피연산자 (operand)
- 반드시 boolean이어야 함
- 계산 결과 = boolean
#### &, |, ^, ~(not)의 피연산자
- 반드시 정수여야 함
- 계산 결과 = 정수
### 비트 연산자 & 활용
- **특정 값 차단 및 특정 값만 통과**
	- 특정 비트의 값만 추출하고 싶을 때 사용
	```
	int a = 0b1111_1001_0111_1111;
	System.out.println(Integer.toBinaryString(a & 0b0000_1111_1100_0000));
	```
- **그림의 한 픽셀에서 특정 색 제거 및 강화**
	```
	// 빨간색 제거
	int pixel = 0x003f4478; // 각 바이트의 값 = '00RRGGBB'로 가정
	System.out.println(pixel & 0x0000ffff);

	// 파란색 강화
	int pixel = 0x003f4478; // 각 바이트의 값 = '00RRGGBB'로 가정
	System.out.println(pixel | 0x00000057);
	```
- **% 연산 구현**
	- % 연산 -> 여러 번
	- & 연산 -> 한 번
	- 짝수 or 홀수
	```
	System.out.println((값 & 0x1) == 0 ? "짝수" : "홀수");
	```
	- 2, 4, 8, 16으로 나눈 나머지
	```
	// 2로 나눈 나머지
	System.out.println(값 % 2);
	System.out.println(값 & 0b0000_0001);
	System.out.println(값 & 1);

	// 4로 나눈 나머지
	System.out.println(값 % 4);
	System.out.println(값 & 0b11);
	
	// 8로 나눈 나머지
	System.out.println(값 % 8);
	System.out.println(값 & 0b111);

	// 16으로 나눈 나머지
	System.out.println(값 % 16);
	System.out.println(값 & 0b1111);
	```
#### 결론
- 짝수 or 홀수, 2 or 2의 제곱수로 나눈 나머지
- % 대신 &를 사용하면 연산 수행이 빠름
- 어떤 값에 대해 2로 나눈 나머지 값을 구하고 싶다면,
- => & 연산자를 이용하여 그 값의 하위 1비트 값만 추출
- 어떤 값에 대해 4로 나눈 나머지 값을 구하고 싶다면,
- => & 연산자를 이용하여 그 값의 하위 2비트 값만 추출
### Pre-fix/Post-fix 증감 연산자
- 리터럴에 적용 불가
```
int a = ++100;
```
- 변수에 동시에 적용 불가
```
int a = 100;
++y++;
(++y)++;
++(y++);
```
### 파라미터(parameter)
- 메서드의 아규먼트를 받는 로컬 변수
	- ex) main()의 args 로컬 변수
- static이 붙은 블록(스태틱 메서드 = 클래스 메서드)에서는
- 그 블록 바깥 쪽에 있는 스태틱 변수(클래스 변수)를 사용 가능
- But, static 붙지 않은 인스턴스 변수는 사용할 수 없음
### 부동소수점 메모리의 값을 정수 메모리에 저장
- a. 값이 짤릴 수 있음을 알면서도 정수 메모리에 저장해야 할 때
- b. 큰 메모리의 값을 작은 메모리에 저장해야 할 때
	- 컴파일러에게 강제로 값을 넣을 것을 명시
	- => 명시적 형변환 (explicit type conversion)
	- 큰 값을 작은 메모리에 넣는 것은 아무런 의미가 없음
	- => 해서는 안됨
	- 다만, 큰 메모리의 값을 바이트 단위로 쪼개고 싶을 때 유용
#### 가능
- 정수 메모리끼리 형변환
- 부동소수점을 정수로 형변환
- 형변환 없이 정수는 부동소수점 메모리에 저장
- 숫자를 문자 코드로 형변환
- 그 외에는 형변환 불가
### 암시적 형변환
- byte, short, char -> int -> long -> float -> double
### 형변환
- 명시적 형변환이 불가능한 경우 특별한 메서드를 사용하면 가능함
```
boolean v1 = Boolean.valueOf("true");

char v2 = "가".charAt(0);

int v3 = Integer.valueOf("123");

float v4 = Float.valueOf("3.14f");
```
### 표현식(expression)
- 작업을 수행한 후 결과를 리턴하는 문장
### 문장(statement)
- 작업을 수행시키는 명령
### 문장과 표현식의 관계
- statement 중에서 결과를 리턴하는 statement를 expression이라 부름

## :pushpin: Day 11
### if ~ else 문
- else if 라는 문법은 없음
```
// 1
else {
if (age < 14)
System.out.println("어린이입니다.");
}

// 2
else
if (age < 14)
System.out.println("어린이입니다.");

// 3
else if (age < 14)
System.out.println("어린이입니다.");
```
### nextInt()
- 사용자가 콘솔 창에 입력할 수 있도록 커서를 대기시키고 싶다면 `nextInt()`를 실행
- => `nextInt()`는 사용자가 숫자를 입력하고 엔터를 칠 때까지 기다림
### if vs switch
- 복잡한 조건으로 프로그램 흐름을 제어해야 하는 상황이라면, if 문을 사용
- int나 문자열처럼 단순한 값으로 프로그램을 제어할 수 있다면, switch문을 사용하는 게 나음
### 연산자
```
// a-1
a++;
b += a;

// a-2
b += ++a;

// b-1
count++;
sum += count;

// b-2
sum += ++count;
```
### 짝수/홀수
```
// 짝수
(count & 0x01) == 0
count & 1
count & 0x01
count % 2

// 홀수
count % 2 == 1
```
### 흐름 제어문
#### switch 문법
```
switch (값) {}
```
- 값으로 가능한 데이터 타입은?
	- int 정수 (byte, short, int, char), 문자열, 특별한 상수 Enum 타입
- case 값으로 변수 사용 불가 => 리터럴만 가능
- 4바이트를 넘어가는 정수는 사용 불가
- 부동소수점 사용 불가
- boolean 값은 switch와 case에 사용 불가
- 상수를 사용하면 주석없이 바로 이해 가능
	- case 문자의 값으로 변수를 사용할 수 없음
	- 단 값이 변경되지 않는 final 변수는 사용 가능
#### switch 문법 II
- 상수를 좀 더 조직적으로 관리하는 방법
	- enum을 사용하여 상수를 정의
	- nested enum은 기본이 static
	- => static은 생략 가능
#### break와 continue 활용
- continue
	- 다음 문장을 실행하지 않고 즉시 조건 검사로 이동
	- 다음 줄로 가지 않고 변수 증가문으로 이동
- break
	- 본인이 소속된 가장 가까운 반복문을 나감
	- use) for 문, switch 문
#### 중첩된 반복문 탈출
- 라벨명: 반복문1 { 반복문2 {break 라벨명;} }
	```
	라벨 문법:
	라벨: 문장;
	라벨: {문장1, 문장2, ...}
	```
	- `break 라벨명;`: 라벨에 소속된 문장을 나감
#### do ~ while 반복문
- 최소 한 번은 반복
- 한 번 이상 반복: do ~ while
- 0번 이상 반복: while
```
do
문장1;
while (조건);

do {
문장1;
문장2;
문장3;
} while (조건);
```
#### for 반복문의 초기화 변수
- 변수 초기화 시키는 문장에 여러 개의 변수 선언 가능
- 변수 증가문에 여러 개의 문장 작성 가능
#### for (;;)와 배열
- 제거 가능
```
// 변수 선언 및 초기화 문장
for (; i < 0;)

// 조건문
for (;;)
```
- 배열 변수 선언과 동시에 배열 초기화를 실행할 때 new String[] 을 생략 가능
```
String[] names = {"배타미", "송가경", "차현"};
```
#### for (:)와 배열
- for (:)
	- 배열 전체를 반복하거나 컬렉션(collection) 객체 전체를 반복할 때 유용
	- 배열의 일부만 반복할 수 없음
	- 배열의 값을 다룰 때 인덱스를 사용할 필요가 없어 편리
- 문법
	```
	for (변수 선언 : 배열, Iterable 구현체) 문장1;
	for (변수 선언 : 배열, Iterable 구현체) { 문장1; 문장2; ...}
	```
	- 변수의 타입은 배열이나 Iterable 구현체의 항목 타입과 같아야 함
	- 반복문을 돌 때 마다 항목을 값을 꺼내 변수에 담음
	```
	for (배열에서 꺼낸 값을 저장할 변수 선언 : 배열주소) 문장;
	```
	- 배열의 처음부터 끝까지 값을 꺼낼 때 사용
	- 변수 선언을 바깥에 둘 수 없음
### 비트 이동 연산자
#### How to use <<
- 왼쪽으로 비트를 이동시킴
- 오른쪽 빈자리는 0으로 채움
- 왼쪽 경계를 넘어간 비트는 자름
- 왼쪽 이동
	- 값 * (2 ^ 이동 비트)
#### How to use >>
- 왼쪽 쪽 빈자리를 원래 숫자와 같은 부호 값으로 채움
- 양수라면 0, 음수라면 1을 채움
- 오른쪽 경계를 넘어간 비트는 자름
- 오른쪽 이동
	- 값 / (2 ^ 이동 비트)
#### How to use >>>
- 오른쪽으로 비트를 이동시킴
- 왼쪽 빈자리를 음수 양수 상관없이 무조건 0으로 채움
- 오른쪽 경계를 넘어간 비트는 자름
- 오른쪽 이동
#### 비트 이동의 유효 범위
- int 타입: 0 ~ 31까지 유효
- long 타입: 0 ~ 63까지 유효

## :pushpin: Day 12
### main() 메서드의 활용
#### 문자열 입력
- int로 변환
```
Integer.parseInt()
Integer.valueOf()
```
- Date로 변환
```
Date.valueOf()
```
### 메서드 사용법: 메서드 활용
#### 장점
- 기능 단위로 관리하기 쉽게 묶음
- 재사용하기 쉬움
#### 리팩토링 (refactoring)
- 기존 코드를 유지 보수하기 쉬운 구조로 재작성하는 것
### 클래스 변수와 로컬 변수
```
// 클래스 변수
static int a = 10;

// 로컬 변수
int b = 20;
```
#### 사용 여부
- 다른 메서드의 로컬 변수는 접근 불가
- 로컬 변수는 클래스 변수 사용 가능
### prompt()
#### 파라미터 (Parameter)
- 아규먼트를 받는 변수
#### 아규먼트 (Argument)
- 프롬프트 제목
- 메서드를 실행할 때 넘겨주는 값
- 아규먼트 (= 인자값)
### prompt() 기능을 더 세분화
#### prompt()
- `promptString()`: String
- `promptInt()`: Int
- `promptDate()`: Date

## :pushpin: Day 13
### 메서드 문법
- 1. 명령어 블록을 실행할 때 값을 넘겨주지 않고 결과도 받지 않음
```
void 메서드명() {
문장1;
문장2;
}
```
- 2. 명령어 블록을 실행할 때 값을 넘겨주고 결과는 받지 않음
```
void 메서드명(변수선언1, 변수선언2, ...) {
문장1;
문장2;
}
```
- 3. 명령어 블록을 실행할 때 값을 넘겨주지 않고 결과는 받음
```
리턴타입 메서드명() {
문장1;
문장2;
}
```
- 4. 명령어 블록을 실행할 때 값을 넘겨주고 결과를 받음
```
리턴타입 메서드명(변수선언1, 변수선언2, ...) {
문장1;
문장2;
}
```
### 메서드(method) = 함수(function)
#### 메서드 정의(method definition)
```
int plus(int a, int b) {
int sum = a + b;
return sum;
}

// 의미
int: 리턴 타입
plus: 메서드명
a, b: 파라미터 (parameter)
{}: 메서드 몸체 (method body)
```
#### 메서드 호출(method call)
```
int result = plus(100, 200);

// 의미
result: 리턴 값을 받는 변수
plus: 메서드명
100, 200: 아규먼트 (argument)
```
### 메서드
#### 메서드 호출과 메모리
- 1. 클래스 로딩
- 2. `main()` 호출
- 3. 로컬 변수 생성
- 4. `swap()` 호출
- 5. `swap()`이 사용할 로컬 변수 준비
- 6. 아규먼트 저장
- 종료. JVM이 OS로 부터 받아서 쓴 모든 메모리를 OS가 회수
#### Call by reference
- 1. 클래스 로딩
- 2. `main()` 호출
- 3. 로컬 변수 준비
- 4. 배열 인스턴스 생성
#### 클래스와 메모리
- 1. 클래스 로딩
- 2. `main()` 호출
- 3. `main()`에서 사용할 로컬 변수 준비
- 4. 클래스 로딩
- 5. MyObject 설계도에 따라 변수 생성
- 6. `swap(주소)`
- 7. `swap()`을 실행하는 동안 사용할 로컬 변수 준비
### 메서드 블록의 명령 실행
#### 과정
- 1. `hello()` 메서드의 블록으로 이동
- 2. 메서드 바디를 실행
- 3. 다시 원래 위치로 돌아옴
- 4. 다음 줄을 실행
### 가변 파라미터 vs 배열 파라미터
#### 가변 파라미터
- 낱개의 값을 여러 개 줄 수 있음
- 배열에 담아서 전달할 수 있음
- 반드시 맨 뒤에 와야 함 => 복잡한 사용 방지
#### 배열 파라미터
- 낱개의 값을 여러 개 줄 수 없음
- 오직 배열에 담아서 전달해야 함
- 순서는 상관 없음
### JVM의 메모리 구조
#### Method Area
- 자바 코드를 두는 영역
	- 클래스 코드
	- 상수
	- 클래스 변수
#### JVM Stack
- 메서드를 호출할 때 생성되는 로컬 변수를 둠
#### Heap
- new 명령으로 생성하는 변수(= 인스턴스 변수)를 둠

## :pushpin: Day 14
### 메서드: JVM 메모리
#### 실행 순서와 메모리
- 1. `$ java -classpath bin ···`
	- JVM은 클래스 정보를 Method Area 영역에 로드
- 2. `main()` 호출
	- JVM Stack 영역에 `main()` 메서드가 사용할 로컬 변수를 준비
- 3. `swap()` 호출
	- JVM Stack 영역에 `swap()` 메서드가 사용할 로컬 변수를 준비
- 4. `swap()` 실행 완료
	- JVM Stack 영역에 있던 `swap()`이 사용한 메모리를 제거
- 5. `main()` 실행 완료
	- JVM Stack 영역에 있던 `main()`이 사용한 메모리를 제거
- 6. JVM 실행 종료
	- OS가 JVM에게 사용하라고 빌려줬던 모든 메모리를 회수
#### JVM이 메모리를 다루는 방법
- Method Area
	- 클래스 명령 코드
	- static 변수
- Heap
	- new 명령으로 만든 메모리 (인스턴스 = 객체)
	- Garbage Collector(GC)가 관리하는 영역
- JVM Stack
	- 메서드의 로컬 변수
	- 스레드 별로 JVM Stack 메모리를 따로 관리
	- 각 메서드마다 프레임 단위로 관리
	- 메서드 호출이 끝나면 그 메서드가 사용한 프레임 메모리 제거
	- 스택(Stack) 메모리
	- 스택 방식 => Last In First Out (LIFO; 후입선출)
	- ex) 접시 쌓기
	- 메서드가 호출될 때 로컬 변수가 준비
	- 맨 마지막에 호출한 메서드가 먼저 삭제
	- JVM이 종료하면 JVM이 사용했던 모든 메모리를 OS가 회수
### 메서드: Heap 메모리 영역
- 1. `main()` 호출
	- JVM Stack: args, arr 변수 생성
- 2. `getArray()` 호출
	- JVM Stack: arr 변수 생성
	- Heap: `new int[]` 배열 생성
- 3. `getArray()` 호출 끝
	- JVM Stack: `getArray()` 관련 메모리(arr 변수) 제거
	- `new int[]` 배열 주소 리턴
- 4. `main()` 호출 끝
	- JVM Stack: `main()` 관련 메모리 제거
- 5. JVM 종료
	- JVM이 사용한 모든 메모리(Method Area, JVM Stack, Heap 등)를 OS 반납
### 배열의 생성
- 호출하는 쪽에서 결과를 담을 배열을 주는 경우
- 메서드 쪽에서 결과를 담을 배열을 만들어 리턴하는 경우
### 메서드: 인스턴스와 Heap 메모리 영역
- Heap 메모리에 어떤 변수를 만들어야 하는지 적어 놓은 설계도
- new 명령을 사용하여 메모리를 만들라고 하면 => MyObject
- 1. `main()` 호출
	- JVM Stack: args, ref 변수 생성
- 2. `getMyObject()` 호출
	- JVM Stack: ref 변수 생성
	- Method Area: MyObject 클래스를 로딩
	- Heap: MyObject 설계도에 따라 인스턴스 생성
- 3. `getMyObject()` 호출 끝
	- JVM Stack: `getMyObject()` 관련 메모리(ref 변수) 제거
	- MyObject의 인스턴스의 주소 리턴
- 4. `main()` 호출 끝
	- JVM Stack: `main()` 관련 메모리 제거
- 5. JVM 종료
	- JVM이 사용한 모든 메모리(Method Area, JVM Stack, Heap 등)를 OS 반납
### 메서드: 스택 메모리 응용 I
#### JVM Stack 메모리의 사용
- 1. main()
- 2. main() -> m1()
- 3. main() -> m1() -> m2()
- 4. main() -> m1()
- 5. main() -> m1() -> m3()
- 6. main() -> m1()
- 7. main()
- 8. 종료
### 메서드: 스택 메모리 응용 II - 재귀호출
- 작은 수를 계산 할 때는 재귀호출을 사용
- => 코드도 간단하고 이해하기도 쉬움
#### JVM Stack 메모리의 사용
- 1. main()
- 2. main() => sum(5)
- => 5 + sum(4)
- => 4 + sum(3)
- => 3 + sum(2)
- => 2 + sum(1)
- => 1
- 3. main()
- 4. 종료
#### 재귀호출 (Recursive Call)
- 메서드가 호출 => 스택에 그 메소드가 사용할 변수가 생성
- 수학식을 코드를 표현하기가 편함
- 코드가 간결
- 반복문을 사용하는 경우보다 메모리를 많이 사용
- 메서드 호출이 너무 깊게 들어가지 않는 상황에서 사용
### 메서드: 스택 오버플로우 오류
#### 스택 오버플로우(Stack Overflow)
> JVM 스택 메모리가 꽉 차서 더이상 메서드 실행을 위해 로컬 변수를 만들 수 없는 상태
- 멈춰야 할 조건 누락 -> 스택 메모리 극한으로 증가 -> 메모리 부족 사태
- 호출하는 메서드의 로컬 변수가 클 때 스택 메모리가 빨리 참
- 호출 단계가 많은 큰 수를 다룰 때는 재귀호출 대신 반복문을 사용
- 메서드 호출 회수에 영향 X
- 메서드에서 생성하는 로컬 변수의 크기에 영향 O

## :pushpin: Day 15
### 클래스 문법
#### 용도
- 서로 관련된 일을 하는 메서드들을 관리하기 쉽게 한 클래스에 모아둠
- => 역할에 따라 메서드 분류
- 복합 데이터를 저장하는 메모리를 설계
- => 사용자 정의 데이터 타입(User-defined data type) 만들 때
#### 복합 구조의 변수 설계
- 낱개의 변수로 여러 사람의 정보를 다룸
- -회원 정보를 관리하기 쉽게 한 묶음으로 묶기->
- 여러 개의 변수로 구성된 새로운 구조의 복합 데이터 타입을 정의
### Member 인스턴스 생성
```
Member member = new Member();

/* Member: 클래스명 (변수의 데이터 타입)
   member: Member 인스턴스의 주소를 저장하는 변수 = "Member의 레퍼런스"
   new: 클래스 설계도에 따라 Heap 영역에 변수를 만들라는 명령
   Member: 클래스명 */
```

## :pushpin: Day 16
### 인스턴스 사용법: 인스턴스 필드가 필요한 이유와 사용법
- static 변수(필드) = 클래스 변수(필드)
	- .class 파일이 Method Area 영역에 로딩될 때 생성
	- 클래스 당 한 번만 생성
	- 여러 개의 게시판을 다룰 수가 없음
#### 해결책
- static 필드를 인스턴스 필드로 전환
	- new 명령으로 필요할 때마다 생성 가능

## :pushpin: Day 17
### 스태틱 변수 = 클래스 변수
#### where
- Method Area
#### when
- 클래스 로딩 -> 생성
- 언로드 될 때 -> 제거
#### load
- 클래스를 최소 사용할 때
#### unload
- JVM 종료 or 클래스 로더가 강제 언로드
#### 저장
- 특정 인스턴스에 상관없이 공유할 값을 저장할 때 사용
### 논 스태틱 변수 = 인스턴스 변수
#### where
- Heap
#### when
- new 명령 실행 시마다 생성
- 가비지가 된 후 가비지 컬렉터가 수집할 때 제거
#### 저장
- 인스턴스 마다 구분해서 관리해야 할 데이터를 저장
### 클래스 문법
- 1. 메서드 분류
	- 소스 코드를 유지 보수하기 쉬움
	- 재사용성이 높아짐
- 2. 새 데이터 타입 설계

## :pushpin: Day 18
### Static Field
#### 영역
- Method Area
#### Lifecycle
##### 생성
- 클래스가 로딩
##### 소멸
- 클래스가 언로드
- JVM 종료
### Non-Static Field
#### 영역
- Heap
#### Lifecycle
##### 생성
- new App() 실행
##### 소멸
- 가비지 컬렉터가 수집
- JVM 종료
### Local Field
#### 영역
- JVM Stack
#### Lifecycle
##### 생성
- 메서드가 호출
##### 소멸
- 메서드 호출 끝