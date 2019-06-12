SUMMARY = "sdbus-c++ native tools"
DESCRIPTION = "Native interface code generator for development with sdbus-c++"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git-tools/COPYING;md5=1803fa9c2c3ce8cb06b4861d75310742"

inherit cmake native

DEPENDS_${PN} = "expat"
RDEPENDS_${PN} = "expat"

BRANCH = "master"
TAG = "v${PV}"

SRC_URI = "git://github.com/Kistler-Group/sdbus-cpp.git;protocol=https;destsuffix=git-tools;branch=${BRANCH};tag=${TAG};subpath=tools"

S = "${WORKDIR}/git-tools"
