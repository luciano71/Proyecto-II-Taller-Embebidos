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
     install -m 0755 FingerDetection_new.py ${D}${bindir}
     install -m 0755 img0.jpg ${D}${bindir}
     install -m 0755 img1.jpg ${D}${bindir}
     install -m 0755 img2.jpg ${D}${bindir}
     install -m 0755 img3.jpg ${D}${bindir}
     install -m 0755 img4.jpg ${D}${bindir}
     install -m 0755 img5.jpg ${D}${bindir}
     install -m 0755 img6.jpg ${D}${bindir}
     install -m 0755 img7.jpg ${D}${bindir}
     install -m 0755 img8.jpg ${D}${bindir}
     install -m 0755 img9.jpg ${D}${bindir}
     install -m 0755 img10.jpg ${D}${bindir}
     install -m 0755 img11.jpg ${D}${bindir}
     install -m 0755 img12.jpg ${D}${bindir}
     install -m 0755 img13.jpg ${D}${bindir}
     install -m 0755 img14.jpg ${D}${bindir}
     install -m 0755 img15.jpg ${D}${bindir}
     install -m 0755 img16.jpg ${D}${bindir}
     install -m 0755 img17.jpg ${D}${bindir}
     install -m 0755 img18.jpg ${D}${bindir}
     install -m 0755 img19.jpg ${D}${bindir}
     install -m 0755 img20.jpg ${D}${bindir}
     install -m 0755 img21.jpg ${D}${bindir}
     install -m 0755 img22.jpg ${D}${bindir}
     install -m 0755 img23.jpg ${D}${bindir}
     install -m 0755 img24.jpg ${D}${bindir}
     install -m 0755 img25.jpg ${D}${bindir}
     install -m 0755 img26.jpg ${D}${bindir}
     install -m 0755 img27.jpg ${D}${bindir}
     install -m 0755 img28.jpg ${D}${bindir}
     install -m 0755 img29.jpg ${D}${bindir}
     install -m 0755 img30.jpg ${D}${bindir}
     install -m 0755 img31.jpg ${D}${bindir}
     install -m 0755 img32.jpg ${D}${bindir}
     install -m 0755 img33.jpg ${D}${bindir}
     install -m 0755 img34.jpg ${D}${bindir}
     install -m 0755 img35.jpg ${D}${bindir}
     install -m 0755 img36.jpg ${D}${bindir}
     install -m 0755 img37.jpg ${D}${bindir}
     install -m 0755 img38.jpg ${D}${bindir}
     install -m 0755 img39.jpg ${D}${bindir}
     install -m 0755 img40.jpg ${D}${bindir}
     install -m 0755 img41.jpg ${D}${bindir}
     install -m 0755 img42.jpg ${D}${bindir}
     install -m 0755 img43.jpg ${D}${bindir}
     install -m 0755 img44.jpg ${D}${bindir}
     install -m 0755 img45.jpg ${D}${bindir}
     install -m 0755 img46.jpg ${D}${bindir}
     install -m 0755 img47.jpg ${D}${bindir}
     install -m 0755 img48.jpg ${D}${bindir}
     install -m 0755 img49.jpg ${D}${bindir}
     install -m 0755 img50.jpg ${D}${bindir}
     install -m 0755 img51.jpg ${D}${bindir}
     install -m 0755 img52.jpg ${D}${bindir}
}
