package com.connorcogged.minigameapi.game

import com.connorcogged.minigameapi.data.Contestant
import com.connorcogged.minigameapi.game.data.GameData

open class Game(
    var gameData: GameData
) {
    var contestants: ArrayList<Contestant>
    var gameName: String = ""

    init {
        this.gameName = gameData.gameName
        this.contestants = gameData.contestants
    }

    var eventHandler = EventHandler();

    fun startGame() {

    }

    fun endGame() {

    }

    fun subscribe(eventHandler: EventHandler) {
        this.eventHandler = eventHandler;
    }

    open class EventHandler {
        fun onGameEnd() {

        }

        fun onGameStart() {

        }
    }
}