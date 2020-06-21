inherit upx_compress

EXTRA_OECONF += "--enable-defrag"

do_install_append() {
	if [ -e ${D}${base_sbindir}/e4defrag ]; then
		install -d ${D}${sbindir}
		mv ${D}${base_sbindir}/e4defrag ${D}${sbindir}/e4defrag
	fi
}

PACKAGES =+ "e2fsprogs-e4defrag"
FILES_e2fsprogs-e4defrag = "${sbindir}/e4defrag"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = "file://Revert-mke2fs-enable-the-metadata_csum.patch"
