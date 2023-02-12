sudo yum install java-11-openjdk-devel
java -version
readlink -f $(which java) ====>To check where java installed in centos
 export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-11.0.17.0.8-2.el7_9.x86_64
 export PATH=$JAVA_HOME/bin:$PATH
  echo $PATH

wget https://dlcdn.apache.org/maven/maven-3/3.9.0/binaries/apache-maven-3.9.0-bin.tar.gz
 tar -xfv apache-maven-3.9.0-bin.tar.gz
 mv apache-maven-3.9.0 /usr/share/maven
 
  echo $PATH
/usr/lib/jvm/java-11-openjdk-11.0.18.0.10-1.el7_9.x86_64/bin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:/usr/share/maven/bin

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
