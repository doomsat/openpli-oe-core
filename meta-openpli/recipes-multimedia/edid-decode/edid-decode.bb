SUMMARY = "EDID decoder and conformance tester"
DESCRIPTION = "edid-decode decodes EDID monitor description data in human-readable format"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://edid-decode.cpp;beginline=1;endline=8;md5=2193df34747fd1a150135ed8b90f3b4e"

inherit gitpkgv autotools-brokensep pkgconfig

PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"

SRC_URI = "git://linuxtv.org/edid-decode.git"
#SRC_URI[md5sum] = "47b54e49dd2681986e4cd0a372fa07c7"
#SRC_URI[sha256sum] = "774480b40ee765a6210d123878cb94f85643ed7f34f816c3149d584b60ea86db"

S = "${WORKDIR}/git" 

CFLAGS_sh4 += "-std=c++11"


