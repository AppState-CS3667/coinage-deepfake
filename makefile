JUNIT5_JAR = junit-platform-console-standalone-1.2.0.jar 
JUNIT5_RUNNER = org.junit.platform.console.ConsoleLauncher
JFLAGS = -d bin -sourcepath src

SOURCEDIR = src/

default: 
	@echo "usage: make target"
	@echo "5 available targets: clean - removes editor tmpfiles and .class files"
	@echo "____________________ compile - builds codebase"
	@echo "____________________ test - runs JUnit5 tests"
	@echo "____________________ demo - compiles and runs our demo"

compile: 
	@echo "Compiling..."
	javac -cp .:$(JUNIT5_JAR)$(JFLAGS) ./src/*.java

clean:
	rm -f src/*~
	rm -f /*~
	rm -f bin/*.class
	rm -f src/*.class

test: $(JUNIT5_JAR)
	java -cp .:$(JUNIT5_JAR) $(JUNIT5_RUNNER) --scan-class-path 

demo: compile
	javac -cp .:$(JUNIT5_JAR)$(JFLAGS) Demo.java
	java -cp ./bin/ Demo