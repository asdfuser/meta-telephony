TOOLCHAIN_TARGET_OSMOTASK ?= "packagegroup-core-standalone-osmo-sdk-target"
TOOLCHAIN_TARGET_TASK = "${TOOLCHAIN_TARGET_OSMOTASK}"
TOOLCHAIN_OUTPUT_BASENAME = "${SDK_NAME}-toolchain-osmo-${DISTRO_VERSION}"
TOOLCHAIN_OUTPUTNAME = "${TOOLCHAIN_OUTPUT_BASENAME}-${DATETIME}"
TOOLCHAIN_OUTPUTNAME[vardepsexclude] = "DATETIME"
PROVIDES = "meta-toolchain-sdk"
require recipes-core/meta/meta-toolchain.bb

do_populate_sdk_append() {
    bb.build.exec_func("create_symlink", d)
}


create_symlink() {
        cd ${SDK_DEPLOY}/
        rm -f ${TOOLCHAIN_OUTPUT_BASENAME}.sh
        ln -s ${TOOLCHAIN_OUTPUTNAME}.sh ${TOOLCHAIN_OUTPUT_BASENAME}.sh
}
