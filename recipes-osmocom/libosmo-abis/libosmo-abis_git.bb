require ${PN}.inc

DEPENDS += "libtalloc"

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.3.2+gitr${SRCPV}"
PR = "${INC_PR}.1"
