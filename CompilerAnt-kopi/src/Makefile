antlrjar = antlr-4.13.0-complete.jar

###### FOR LINUX AND MAC -- comment the following line if you use Windows:
classpath = '$(antlrjar):.'

###### FOR WINDOWS -- uncomment the following line if you use Windows:
#classpath = '$(antlrjar);.'

antlr4 = java -cp $(classpath) org.antlr.v4.Tool
grun = java -cp $(classpath) org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = ccListener.java ccBaseListener.java ccParser.java ccLexer.java

all:    
	make run

ccLexer.java:    cc.g4
	$(antlr4) -visitor cc.g4

main.class:    ccLexer.java main.java
	javac -cp $(classpath) $(GENERATED) main.java

ccLexer.class:    ccLexer.java
	javac -cp $(classpath) $(GENERATED)

run:    main.class
	java -cp $(classpath) main 01-hello-world.hw 02-trafiklys-minimal.hw 03-trafiklys.hw


grun:    ccLexer.class 01-hello-world.hw 02-trafiklys-minimal.hw 03-trafiklys.hw
	$(grun) cc start -gui -tokens 01-hello-world.hw 02-trafiklys-minimal.hw 03-trafiklys.hw