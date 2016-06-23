require ${PN}.inc

PV = "0.15.0+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.6"

SRCREV = "${AUTOREV}"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
