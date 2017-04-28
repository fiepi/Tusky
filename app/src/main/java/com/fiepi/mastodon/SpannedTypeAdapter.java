/* Copyright 2017 Andrew Dawson
 *
 * This file is a part of Tusky.
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * Tusky is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Tusky; if not,
 * see <http://www.gnu.org/licenses>. */

package com.fiepi.mastodon;

import android.text.Spanned;

import com.emojione.Emojione;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

class SpannedTypeAdapter implements JsonDeserializer<Spanned> {
    @Override
    public Spanned deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return HtmlUtils.fromHtml(Emojione.shortnameToUnicode(json.getAsString(), false));
    }
}
