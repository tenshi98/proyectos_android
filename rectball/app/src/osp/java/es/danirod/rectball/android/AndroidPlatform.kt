/*
 * This file is part of Rectball.
 * Copyright (C) 2015-2017 Dani Rodríguez.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package es.danirod.rectball.android

import android.content.Intent
import de.golfgl.gdxgamesvcs.NoGameServiceClient

internal class AndroidPlatform(context: AndroidLauncher) : AbstractPlatform(context) {

    override fun onStart() { }

    override fun onStop() { }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) { }

    override val gameServices: GameServices
        get() = GsvcsGameServices(NoGameServiceClient(), NoConstants())
}