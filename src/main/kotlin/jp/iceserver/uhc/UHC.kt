package jp.iceserver.uhc

class UHC : AbstractUHC()
{
    companion object
    {
        lateinit var plugin: UHC
    }

    override fun onEnable()
    {
        plugin = this
    }
}