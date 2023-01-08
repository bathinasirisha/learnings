sudo yum install java-11-openjdk-devel
java -version
readlink -f $(which java) ====>To check where java installed in centos
 export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-11.0.17.0.8-2.el7_9.x86_64
 export PATH=$JAVA_HOME/bin:$PATH
  echo $PATH
