package io.rsbox.server.engine.model.entity.movement

import io.rsbox.server.engine.model.coord.Tile

data class Step(val tile: Tile, val type: StepType)