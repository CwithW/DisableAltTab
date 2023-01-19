package pub.chara.disablealttab.hook

abstract class BaseHook {
    var isInit: Boolean = false
    abstract fun init()
}