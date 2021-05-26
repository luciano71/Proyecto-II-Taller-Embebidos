LICENSE = "CLOSED"

LIC_FILES_CHKSUM = ""

SRC_URI = "file://codigo-1.0.tar.xz"


S = "${WORKDIR}"



TARGET_CC_ARCH += "${LDFLAGS}"



do_configure () {

     # Specify any needed configure commands here

     :

}


do_install () {

     install -d ${D}${bindir}
     install -m 0755 emotions.py ${D}${bindir}
     install -m 0755 haarcascade_frontalface_default.xml ${D}${bindir}
     install -m 0755 model.h5 ${D}${bindir}
     install -m 0755 resultados.csv ${D}${bindir}
}
