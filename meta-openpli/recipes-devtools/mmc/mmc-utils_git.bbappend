FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRCREV_vuduo4k = "b4fe0c8c0e57a74c01755fa9362703b60d7ee49d"

SRC_URI_vuduo4k = "git://git.kernel.org/pub/scm/linux/kernel/git/cjb/mmc-utils.git;branch=${SRCBRANCH} \
           file://0001-lsmmc-replace-strncpy-with-memmove-on-overlapping-me.patch \
           "
