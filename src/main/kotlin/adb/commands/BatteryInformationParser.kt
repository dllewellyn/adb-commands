/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package adb.commands

import adb.commands.model.BatteryInformation

class BatteryInformationParser(device : AdbDevice) {

    /**
     * Collect battery information from the device
     *
     * @return battery information from the device
     */
    fun gatherBatteryInformation() =
        BatteryInformation()


    fun someLibraryMethod(): Boolean {
        return true
    }
}
