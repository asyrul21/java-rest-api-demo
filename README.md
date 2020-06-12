# knimeApi

This repo stores the source code for the API which enables external applications to build a workflow using the exposed endpoints. It is written in Java, so that it can include Knime's Java code within it self.

# Setup
## 1. Installing Tom Cat (Mac OS X Catalina)

https://medium.com/@fahimhossain_16989/installing-apache-tomcat-on-macos-mojave-using-homebrew-28ce039b4b2e

ref 2 (no homebrew) : https://wolfpaulus.com/tomcat/

1. Check your java version
```bash
java -version
```

2. Update Brew and Install TomCat
```bash
brew update
brew install tomcat
```

### Some useful commands
1. Start Tomcat automatically at Mac Login:
```bash
brew services start tomcat
```
2. In order to stop Tomcat to start automatically at Mac Login:
```bash
brew services stop tomcat
```

3. Start Tomcat manually:
```bash
catalina start
```

4. In order to stop Tomcat manually:
```bash
catalina stop
```

5. To view available options on Tomcat run:
```bash
catalina -h
```

### Running Tomcat
1. Run
```bash
catalina run
```

2. Check localhost: http://localhost:8080

## 2. Install Jersey
1. Download from https://eclipse-ee4j.github.io/jersey/download.html
 - be sure to add https:// at the beginning of the download link.
 - E.g. : https://repo1.maven.org/maven2/org/glassfish/jersey/bundles/jaxrs-ri/2.25.1/jaxrs-ri-2.25.1.zip


## Downloading Eclipse
1. Download Eclipse Installer
2. *MAKE SURE TO CHOSE ECLIPSE FOR JAVA EE* : the EE is CRUCIAL

## Eclipse Configuration
### Configuring TomCat Server
1. Go to Preferences > server > Runtime Environments > Add
2. Select your installed tomcat version you can check this by running
 ```bash
 catalina version
 ```
 3. notice the path of CATALINA_HOME . e.g. : /usr/local/Cellar/tomcat/9.0.35/libexec
 4. copy and paste this path at the TomCat Installation Directory
 5. Apply and Close


## Create a Maven Project
1. Right Click > New > Others
2. Under Maven select Maven Project
3. In the Catalog menu, type in 'Jersey' and choose : org.glassfish.jersey.archtypes and jersey-quickstart-webapp
4. Insert details and finish.

## Configure Project to Use Tom Cat
1. Right Click project > Properties
2. Targeted Runtimes > Select Tom Cat

## Running the App
1. Right Click project > Run As
2. Run on Server
3. Insert valid URL - view your web.xml to see endpoint



# DEPRECATED, DOES NOT WORK, VERSION CONFLICT
### Configuring Dynamic Web Project and TomCat Runtime Server Environment
1. Create new project. Go to New > Dynamic Web Project

2. If you cannot find DWP, refer [here](https://beginnersbook.com/2017/06/how-to-fix-dynamic-web-project-missing-in-eclipse-issue/) to add it.

3. Check your eclipse version by going to Eclipse > About Eclipse. Then find your eclipse version in https://download.eclipse.org/releases/ , can copy that link into the 'Work with' field in Help > Install New Software.

e.g. : 2020-03 - http://download.eclipse.org/releases/2020-03

4. Select the following three options under “Web, XML, Java EE and OSGI Enterprise Development” (IMPORTANT)
    - Eclipse Java EE Developer Tools
    - Eclipse Java Web Developer Tools
    - Eclipse Web Developer Tools
    - JST Server Adapters
    - JST Server Adapters Extensions

5. Now you need to configure Enclipse Server
 
### Creat Project
1. Restart Exclipse and go to New > Other > Web > Dynamic Web Project

2. Insert Desired project name and specify path to project folder

3. Ensure runtime field has Tomcat selected

4. Click NEXT. 

5. SELECT the 'Generate web.xml deployment descriptor'

6. Click finish

### Adding Java APIs
1. On Eclipse, in project folder> Web Content > WEB INF > lib

2. Now go to the downloaded Jersey folder, copy ALL the .jar files (ONLY) into the WEB INF lib folder.

3. On Eclipse, go to Java Resources > src > right click > create new package - select create package.info

4. Inside test package, create class

4. Begin development




