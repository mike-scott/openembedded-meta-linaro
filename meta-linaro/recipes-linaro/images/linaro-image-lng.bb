require linaro-image-common.inc

IMAGE_INSTALL += " \
    arndale-pre-boot \
    ltp \
    netperf \
    procps \
    rt-tests \
    systemtap \
    valgrind \
    "

IMAGE_FEATURES += "\
	dev-pkgs \
	staticdev-pkgs \
	tools-debug \
	tools-sdk \
	"