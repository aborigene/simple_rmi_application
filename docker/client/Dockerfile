FROM disco-20181112
RUN apt-get update
RUN apt-get upgrade
RUN apt-get install software-properties-common
RUN add-apt-repository ppa:webupd8team/java
RUN apt-get update
RUN apt-get install oracle-java8-installer
RUN mkidr /opt/simple_rmi_application
ADD bin.tar.gz /opt/simple_rmi_application/

