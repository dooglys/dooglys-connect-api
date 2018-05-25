# Dooglys Connect API

Данное API предназначено для разработчиков драйверов торгово-кассового оборудования для системы Dooglys Connect

## Создание нового драйвера

Для того, чтобы создать новый проект драйвера, необходимо: 

1. Cоздать Maven проект с файлом **pom.xml** по следующему формату

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <!-- Укажите в полях ниже уникальный идентификатор вашего драйвера artifactId и его текущую версию version -->
    
    <groupId>com.dooglys.drivers</groupId>
    <artifactId>your-driver-artifactId</artifactId>
    <version>your-driver-version</version>

    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>

    <repositories>
        <repository>
            <id>central</id>
            <name>7d36475548ee-releases</name>
            <url>http://jfrog.dooglys.net/artifactory/dooglys-connect-libs</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>com.dooglys.api</groupId>
            <artifactId>dooglys-connect-api</artifactId>
            <version>1.0</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.7.25</version>
        </dependency>
        
        <!-- В этом блоке добавьте требуемые для разработки библиотеки с центрального Maven репозитория, либо с внутреннего репозитория Dooglys -->
        
    </dependencies>

    <distributionManagement>
        <repository>
            <id>central</id>
            <name>7d36475548ee-releases</name>
            <url>http://jfrog.dooglys.net/artifactory/dooglys-connect-libs</url>
        </repository>
        <snapshotRepository>
            <id>snapshots</id>
            <name>7d36475548ee-snapshots</name>
            <url>http://jfrog.dooglys.net/artifactory/dooglys-connect-libs</url>
        </snapshotRepository>
    </distributionManagement>

</project>
```
2. Cоздать в директории проекта **src/main/java** главный файл с реализациией интерфейса API, соответвующего типу драйвера (см. интерфейсы в данном репозитории в src/main/java/devices). Название этого файла должно согласовываться с указанным artifactId и соответствовать общему формату названия классов в Java (например, если artifactId - `your-driver-id`, то название главного файла - `YourDriverId.java`).

При реализации интерфейса вы можете использовать любую удобную для вас структуру файлов приложения

## Сборка драйвера в jar модуль

Для того, чтобы получить упакованный jar файл с драйвером, необходимо выполнить в корне проекта команду 
```
mvn package
```
После заврешения работы команды, в проекте появиться директория **target** с готовым файлом драйвера

## Загрузка драйвера на репозиторий Dooglys

Для того, чтобы загрузить готовую версию драйвера на Maven репозиторий Dooglys, необходимо:

1. Получить у администратора системы логин и пароль к репозиторию с правами разработчика
2. Добавить в папку **.m2** на вашем компьютере файл **settings.xml** cо следующим содержимым
```xml
<?xml version="1.0" encoding="UTF-8"?>
<settings xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.1.0 http://maven.apache.org/xsd/settings-1.1.0.xsd" xmlns="http://maven.apache.org/SETTINGS/1.1.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <servers>
    <server>
      <username>your-username</username>
      <password>your-password</password>
      <id>central</id>
    </server>
    <server>
      <username>your-username</username>
      <password>your-password</password>
      <id>snapshots</id>
    </server>
  </servers>
  <profiles>
    <profile>
      <repositories>
        <repository>
          <snapshots>
            <enabled>false</enabled>
          </snapshots>
          <id>central</id>
          <name>libs-release</name>
          <url>http://jfrog.dooglys.net/artifactory/libs-release</url>
        </repository>
        <repository>
          <snapshots />
          <id>snapshots</id>
          <name>libs-snapshot</name>
          <url>http://jfrog.dooglys.net/artifactory/libs-snapshot</url>
        </repository>
      </repositories>
      <pluginRepositories>
        <pluginRepository>
          <snapshots>
            <enabled>false</enabled>
          </snapshots>
          <id>central</id>
          <name>libs-release</name>
          <url>http://jfrog.dooglys.net/artifactory/libs-release</url>
        </pluginRepository>
        <pluginRepository>
          <snapshots />
          <id>snapshots</id>
          <name>libs-snapshot</name>
          <url>http://jfrog.dooglys.net/artifactory/libs-snapshot</url>
        </pluginRepository>
      </pluginRepositories>
      <id>artifactory</id>
    </profile>
  </profiles>
  <activeProfiles>
    <activeProfile>artifactory</activeProfile>
  </activeProfiles>
</settings>
``` 
3. Указать в полях `username` и `password` (в двух местах), полученные вами от администратора соответственно логин и пароль
4. Выполнить в корне Maven проекта драйвера команду 
```
mvn deploy
```
После окончания выполнения данной команды драйвер будет собран и загружен на Maven репозиторий Dooglys
