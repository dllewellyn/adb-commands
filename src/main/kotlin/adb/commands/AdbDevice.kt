package adb.commands

interface AdbDevice {
    fun executeShell(cmd : String, args : Array<String>)
}