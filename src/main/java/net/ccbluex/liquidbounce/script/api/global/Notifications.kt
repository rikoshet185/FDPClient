/*
 * FDPClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by LiquidBounce.
 * https://github.com/SkidderMC/FDPClient/
 */
package net.ccbluex.liquidbounce.script.api.global

import net.ccbluex.liquidbounce.LiquidBounce
import net.ccbluex.liquidbounce.ui.client.hud.element.elements.Notification
import net.ccbluex.liquidbounce.ui.client.hud.element.elements.NotifyType

/**
 * Object used by the script API to provide an easier way of calling chat-related methods.
 */
object Notifications {

    @Suppress("unused")
    @JvmStatic
    fun create(name: String, content: String, notify: String, time: Int) {
        var notifytype = NotifyType.INFO
        when(notify.lowercase()) {
            "success" -> notifytype = NotifyType.SUCCESS

            "info" -> notifytype = NotifyType.INFO

            "error" -> notifytype = NotifyType.ERROR

            "warning" -> notifytype = NotifyType.WARNING
        }
        LiquidBounce.hud.addNotification(Notification(name ?: "Invalid String", content ?: "Invalid String", notifytype?: NotifyType.WARNING, time?: 1000))
    }
}