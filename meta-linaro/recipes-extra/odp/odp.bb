DESCRIPTION = "OpenDataPlane (ODP) provides a data plane application programming \
	environment that is easy to use, high performance, and portable between networking SoCs."
HOMEPAGE = "https://wiki.linaro.org/LNG/Engineering/OpenDataPlane"
SECTION = "console/tools"

LICENSE = "BSD | GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dd8b05a36dd5410381ad0679f9151808"
PV = "20140218+git${SRCPV}"

SRC_URI = "git://git.linaro.org/lng/odp.git;name=odp"

SRCREV_odp = "9d3e9afc66895a74d3d54a70fc3284bd11c169cd"
SRCREV_FORMAT = "odp"

S = "${WORKDIR}/git"

PARALLEL_MAKE = ""
EXTRA_OEMAKE = "CC='${CC}'"

do_install() {
	oe_runmake tests_install DESTDIR=${D}${prefix}
}

# ODP
# ODP primary shipped as static library plus some API test and samples/
# Current makefile installs it to /usr/share/odp so use this folder here.
FILES_${PN}-dbg += "${datadir}/odp/.debug"

