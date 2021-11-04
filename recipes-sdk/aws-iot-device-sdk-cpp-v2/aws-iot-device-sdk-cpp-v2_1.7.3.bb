inherit cmake
require aws-iot-device-sdk-cpp-v2.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=f91e61641e7a96835dea6926a65f4702"

BRANCH ?= "main"

SRC_URI = "git://github.com/aws/aws-iot-device-sdk-cpp-v2.git;protocol=https;branch=${BRANCH};name=aws-iot-device-sdk-cpp-v2"
SRCREV = "8daf749ca958aa9c69a821f821adea8abc7f53fe"
