FROM provisdom/clojure:7aa1e3c9e98980ee00c30a9bb4d948033c5c254e
MAINTAINER Kenny Williams <kenny@provisdom.com>

RUN /usr/bin/boot -d s3-wagon-private:1.2.0
ADD profile.boot $BOOT_HOME