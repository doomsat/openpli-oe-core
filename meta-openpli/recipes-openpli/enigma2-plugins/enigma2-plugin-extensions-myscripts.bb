DESCRIPTION = "Run custom made shell scripts, directory is in the same plugin folder"
MAINTAINER = "DooMSaT"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://LICENSE;md5=edcc081e800a045ce649e0d29f1c0a44"

inherit allarch gitpkgv

SRC_URI = "git://git@github.com:/doomsat/myscripts-plugin.git;protocol=ssh"



PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"

SRCREV = "${AUTOREV}"



PACKAGES = "${PN}"

S = "${WORKDIR}/git"
PLUGIN = "${S}/src/MyScripts"
SCRIPTS = "${S}/src/MyScripts/scripts"

FILES_${PN} = "/"

do_install() {
	install -d ${D}${libdir}/enigma2/python/Plugins/Extensions/MyScripts/
	install -m 0644 ${PLUGIN}/*.py ${D}${libdir}/enigma2/python/Plugins/Extensions/MyScripts/

	install -d ${D}${libdir}/enigma2/python/Plugins/Extensions/MyScripts/scripts/
	install -m 0777 ${SCRIPTS}/*.sh ${D}${libdir}/enigma2/python/Plugins/Extensions/MyScripts/scripts/
}
