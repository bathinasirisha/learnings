sudo yum install java-11-openjdk-devel
java -version
readlink -f $(which java) ====>To check where java installed in centos
 export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-11.0.17.0.8-2.el7_9.x86_64
 export PATH=$JAVA_HOME/bin:$PATH
  echo $PATH

MAVEN
 https://www.youtube.com/watch?v=t8mEwh1ZPww&list=PLbThb-_3v4iPhgSzuiaTIdFylqAXx0Dgf&index=3&ab_channel=TechFarm
To install maven by using
wget https://dlcdn.apache.org/maven/maven-3/3.9.0/binaries/apache-maven-3.9.0-bin.tar.gz
 tar -xfv apache-maven-3.9.0-bin.tar.gz
 mv apache-maven-3.9.0 /usr/share/maven
 mvn -version
  export M2_HOME=/usr/share/maven
[sirisha@instance-1 ~]$ export PATH=$PATH:$M2_HOME/bin
[sirisha@instance-1 ~]$ echo $M2_HOME
/usr/share/maven

 [siri@jenkins ~]$ which java
/usr/lib/jvm/java-11-openjdk-11.0.18.0.10-1.el7_9.x86_64/bin/java
[siri@jenkins ~]$ whereis java
java: /usr/bin/java /usr/lib/java /etc/java /usr/share/java /usr/lib/jvm/java-11-openjdk-11.0.18.0.10-1.el7_9.x86_64/bin/java /usr/share/man/man1/java.1.gz
[siri@jenkins ~]$ echo $PATH
/usr/lib/jvm/java-11-openjdk-11.0.18.0.10-1.el7_9.x86_64/bin:/usr/lib/jvm/java-11-openjdk-11.0.18.0.10-1.el7_9.x86_64/bin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:/usr/share/maven/bin
[siri@jenkins ~]$ echo $JAVA_HOME
/usr/lib/jvm/java-11-openjdk-11.0.18.0.10-1.el7_9.x86_64
[siri@jenkins ~]$ which maven
/usr/bin/which: no maven in (/usr/lib/jvm/java-11-openjdk-11.0.18.0.10-1.el7_9.x86_64/bin:/usr/lib/jvm/java-11-openjdk-11.0.18.0.10-1.el7_9.x86_64/bin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:/usr/share/maven/bin)
[siri@jenkins ~]$ ls
apache-maven-3.9.0-bin.tar.gz  apache-maven-3.9.0-bin.tar.gz.1
[siri@jenkins ~]$ sudo rm -rf /usr/share/maven
[siri@jenkins ~]$ tar -xvf apache-maven-3.9.0-bin.tar.gz
[siri@jenkins ~]$ ls
apache-maven-3.9.0  apache-maven-3.9.0-bin.tar.gz  apache-maven-3.9.0-bin.tar.gz.1
[siri@jenkins ~]$ sudo cp -r apache-maven-3.9.0 /usr/share/maven
[siri@jenkins ~]$ mvn -v
 
  echo $PATH=/usr/lib/jvm/java-11-openjdk-11.0.18.0.10-1.el7_9.x86_64/bin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:/usr/share/maven/bin

cat .bash_profile ====>file
  # .bash_profile

# Get the aliases and functions
if [ -f ~/.bashrc ]; then
        . ~/.bashrc
fi


export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-11.0.18.0.10-1.el7_9.x86_64
export PATH=$JAVA_HOME/bin:$PATH
# User specific environment and startup program

[siri@jenkins ~]$ echo $JAVA_HOME
/usr/lib/jvm/java-11-openjdk-11.0.18.0.10-1.el7_9.x86_64
[siri@jenkins ~]$ echo $M2_HOME
/usr/share/maven
[siri@jenkins ~]$ echo $PATH
/usr/lib/jvm/java-11-openjdk-11.0.18.0.10-1.el7_9.x86_64/bin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:/usr/share/maven/bin
[siri@jenkins ~]$ vi .bash_profile
[siri@jenkins ~]$ sudo vi .bashrc



 Nexus installation in ubuntu
 https://www.fosstechnix.com/how-to-install-nexus-repository-on-ubuntu/

